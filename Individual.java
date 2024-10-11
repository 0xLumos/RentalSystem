class Individual extends Customer {
        /* The individual subclass that inherits from the Customer, and implemnts all abstract methods 
        Represents individual customers, along with their names, ages, and ZIP code */
        private int customerAge;        // Age of individual
        private String customerState;   // Country State 
        private String customerZIP;     // ZIP Code

        // Constructor 
        public Individual(int id, String name, double discountRate, int age, String state, String zip) {
                super(id, name, discountRate);          // Call the Customer class, initalize it's variables
                this.customerAge = age;
                this.customerState= state;
                this.customerZIP = zip;
        }

        /* This method will return details of the Individual Cutomer object,
         showing their name, age, state, ZIP code, discout rate, and their order history*/ 
        @Override
        public String generateReport(){
                return toString();
        }

        // Overriding the default toString() method to give useful info about the class! instead of memory information
        @Override
        public String toString() {
                return "Individual Customer: " + getName() + ", Age: "
                        + this.customerAge + ", State: " + this.customerState + 
                                ", Zip: " + this.customerZIP + "\n" + "Order History for " 
                                        + getName() + "\n" + super.getOrderHistory();
        }
}