import java.util.ArrayList;
import java.util.List;

abstract class Customer implements Reportable{
        /* This class represents the customer, it can be either a corporate or an individual*/
        private int customerID;         // ID of the customer
        private String customerName;    // Name of the customer
        private double discountRate;    // Discount rate
        private List<RentalOrder> orderHistory = new ArrayList<>();     // History of purchases


        // Constructor
        public Customer(int id, String name, double discountrate){
                    this.customerID = id;
                    this.customerName = name;
                    this.discountRate = discountrate;

        }

        /* This method will return details of the cutomer object, showing their id, name
         discout rate, and their order history*/
        @Override
        public String generateReport() {
                return " Customer: " + getName() + ",  ID: " + customerID +
                         ", Discount Rate"+ discountRate +  "\n" + getName() + "'s History:\n" + getOrderHistory();
        }

        // Takes an object of class rental order, and add it to the order history list
        public void addOrder(RentalOrder order){
                this.orderHistory.add(order);

        }
        
        // Takes an object of class rental order, and remove it from the order history list
        public void removeOrder(RentalOrder order){
                this.orderHistory.remove(order);
        }

        // Returns the list of orders for this customer
        public List<RentalOrder> getOrderHistory(){
                return this.orderHistory;
        }

        // Overriding the default toString() method to give useful info about the class! instead of memory information
        @Override
        public String toString() {
                return "Customer ID: "+this.customerID + " Name: " + this.customerName ;
        }

        public int getID(){
                return this.customerID;
        }

        public String getName (){
                return this.customerName;
        }

        public double getDiscountRate(){
                return this.discountRate;
        }


    
}