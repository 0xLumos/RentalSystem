
class Vehicle{
        // This is a vehicle class which will represent the actual vehicles and their properties

        private int vehicleID;      // Unique identifier for each vehicle
        private String make;        // Brand 
        private String model;       // Specific model of the vehicle
        private int year;           // Year of manufacture
        private int mileage;        // Total distance the vehicle has traveled in miles
        private VehicleType type;   // Vehicle type (Car, SUV ,Truck)
        private boolean available;  // true if the vehicle is available for rent
        private int dailyRate;      // Daily rental rate

        // Constructor defined with some data related to the vehicle
        public Vehicle(int id, String make, String model, int year, int mileage, VehicleType type, int dailyRate){
                this.vehicleID = id;
                this.make = make;
                this.model = model;
                this.year = year;
                this.mileage = mileage;
                this.type = type;
                this.available = true;
                this.dailyRate = dailyRate;
        }
        
        // Overriding the default toString() method to give useful info about the class! instead of memory information
        @Override
        public String toString() {
                return "Vehicle ID: " + vehicleID +  ", Make: " + make +
                         ", Model: " + model + ", Year: " + year + ", Available: " +available;
        }




        // Getters 
        public int getId(){
            return this.vehicleID;

        }
        public String getMake(){
            return this.make;
        }

        public String getModel(){
            return this.model;
        }
        public int getYear(){
            return this.year;
        }

        public int getMileage(){
            return this.mileage;
        }

        public VehicleType getType(){
            return this.type;
        }

        public boolean getAvailability(){
            return this.available;
        }

        public int getDailyRate(){
            return this.dailyRate;
        }

        // Setters

        public void setId(int value){
            this.vehicleID = value;

        }
        public void setMake(String value){
            this.make = value;

        }

        public void setModel(String value){
            this.model = value;

        }   
        public void setYear(int value){
            this.year = value;

        }
        public void setMileage(int value){
            this.mileage = value;

        }

        public void setType(VehicleType value){
            this.type = value;
        }

        public void setAvailability(boolean  value){
            this.available = value;
        }
        public void setDailyRate(int value){
            this.dailyRate = value;
        }

    
}       
  
  
