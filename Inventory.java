import java.util.ArrayList;
import java.util.List;


class Inventory {
        /* This class represents the inventory which will store vehicles of the same type, 
        it has an ID, and a type that represents the vehicles type, it adds vehicles to it's list
        and can remove them as well*/
        
        private int inventoryID;
        private VehicleType type;
        private List<Vehicle> vehicleList = new ArrayList<>();

        // Constructor 
        public Inventory(int id, VehicleType type ){
            this.inventoryID = id;
            this.type = type;
            
        }
        
        /* This method takes an object of type Vehicle, checks if it's type matches the type of the vehicle 
        and add the vehicle to the list of vehicles if true */
        public boolean  addVehicle (Vehicle vehicle){
                if (vehicle.getType().equals(this.type)) {
                        vehicleList.add(vehicle);
                        return true;
            }
                return false;
                

            
        }
        // This method removes a vehicle from the list
        public boolean removeVehicle(Vehicle vehicle){
                vehicleList.remove(vehicle);
                return true ;
        }

        // Overriding the default toString() method to give useful info about the class!
        @Override
        public String toString() {
                StringBuilder result = new StringBuilder();
                result.append("\nInventory ID: ").append(this.inventoryID)
                    .append(", Type: ").append(this.type)
                    .append(", Vehicles in Inventory: ");

                if (vehicleList.isEmpty()) {
                        result.append("No vehicles in the inventory");
                } 
                else {
                        for (Vehicle vehicle : vehicleList) {
                            result.append("\n").append(vehicle); 
                        }
                }

                return result.toString();
        }


        // Getters
        public VehicleType getType(){
                return this.type;

        }
        public List<Vehicle> getVehicles() {
            return this.vehicleList;
        }
        public int getID () { 
            return this.inventoryID;
        }

}