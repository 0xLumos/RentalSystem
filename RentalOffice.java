import java.util.ArrayList;
import java.util.List;


class RentalOffice implements Reportable {
        /* A class that represents a rental office, it implements the interface Reportable 
        it contains a list of inventories, and a history of rental orders at this office*/

        private int officeID;      // ID of the office     
        private String locationZip;     // Location ZIP code
        private List<Inventory> inventoryList = new ArrayList<>();      // List of inventories in the office
        private List<RentalOrder> orderHistory = new ArrayList<>();     // List of past orders
        
        // Constructor 
        public RentalOffice(int id, String zipCode){
            this.officeID = id;
            this.locationZip = zipCode;

        }


        /* Return a string containing the office information, including the list of inventories and vehicles
        and the order history of the office*/
        @Override
        public String generateReport(){
                return toString();
        }



        /* This method takes an object of type Inventory, checks if it's type matches the type of the list of inventory 
         if not, it adds the inventory to the list of inventories */
        public boolean addInventory(Inventory inventory) {
                for (Inventory inv : inventoryList) {
                        if (inv.getType().equals(inventory.getType())) {    //return false if inventory not unique
                            return false; 
                        }
                }
                inventoryList.add(inventory);
                return true;
        }

        // A methods that removes an inventory from the list
        public boolean removeInventory(Inventory inventory){
                inventoryList.remove(inventory);
                return true;
        }

        // Takes an object of class rental order, and add it to the order history list
        public void addOrder(RentalOrder order){
                this.orderHistory.add(order);

        }
        
        // Returns a list of orders associated with the office
        public List<RentalOrder> getOrderHistory(){
                return this.orderHistory;
        }

        // Overriding the default toString() method to give useful info about the class! instead of memory information
        @Override
        public String toString() {
                return """
                    Office Details:  
                    Office ID: """ + officeID + " ZIP: " + locationZip + "\n"+ inventoryList +
                    "\nOffice's Order History: \n" + orderHistory ;

        }


}
