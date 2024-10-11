class RentalOrder  {
        /* This class represents the rental order, it contains data such as the total cost,
        period of rental, details about the customer and the rented vehicle */

        private int totalCost;                  // Total cost of the order, with discount rate included
        private int rentalLength;               // Period of rental DAYS
        private Customer listedCustomer;        // Renting customer
        private Vehicle listedVehicle;          // Rented vehicle


        // Constructor that takes a customer and a vehicle, the number of rent days
        public RentalOrder(Customer customerName, Vehicle VehicleName, int rentalPeriod) {
                this.listedCustomer = customerName;
                this.listedVehicle = VehicleName;
                this.rentalLength = rentalPeriod;
        
        }

        // Constructor overloading, a vehicle is rented for 1 day by default
        public RentalOrder(Customer customerName, Vehicle VehicleName){

                this(customerName, VehicleName, 1);     
                

        }
        

        // Calculates the total cost of the order, multiples the number of days, with daily rate 
        public int calculateTotalCost(){
                this.totalCost =  (int) ((this.rentalLength * listedVehicle.getDailyRate()) 
                        * ( listedCustomer.getDiscountRate()) / 100);
                return this.totalCost;
        }


        // Makes the vehicle unavailable, adds the order to the order history
        public void completeOrder(){
                this.listedVehicle.setAvailability(false);
                this.listedCustomer.addOrder(this);
        }

        // Overriding the default toString() method to give useful info about the class! instead of memory information
        @Override
        public String toString(){
                return "Name: " + listedCustomer.getName() + 
                    ", Vehicle rented: " + listedVehicle.getMake() + " " +  listedVehicle.getModel() +
                    ", Total cost : $" + calculateTotalCost() + "\n" ;
        }
        
    
    }

