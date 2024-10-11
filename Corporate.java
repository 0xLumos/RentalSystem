class Corporate extends Customer {
        /* The corporate subclass that inherits from the Customer, and implemnts all abstract methods 
        Represents corporate customers, along with their names, tax id, and country */

        private String country;         // What country is the corporate from
        private String taxID;           // Tax ID of the coporate

        // Constructor 
        public Corporate(int id, String name, double discountRate, String country, String taxid) {
                super(id, name, discountRate);          // Call the Customer class, initalize it's variables
                this.country = country;
                this.taxID = taxid;
        }
        
        /* This method will return details of the Corporate Cutomer object,
         showing their Name, country, tax ID, discout rate, and their order history*/      
        @Override
        public String generateReport(){
                return toString();
        }

        // Overriding the default toString() method to give useful info about the class! instead of memory information
        @Override
        public String toString() {
                return "Corporate Customer: "+ getID() + "Name: " + getName() +
                         ", Country: " + country + ", tax ID: "
                                 + taxID + "'s History:\n" + super.getOrderHistory();
        }
}