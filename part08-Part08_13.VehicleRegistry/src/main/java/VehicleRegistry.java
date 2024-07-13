import java.util.HashMap;

public class VehicleRegistry {

    private final HashMap<LicensePlate, String> ownerData;

    public VehicleRegistry(){
        this.ownerData = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        //If the license plate doesn't have an owner, the method returns true. If the license already has an owner attached, the method returns false and does nothing.
        if(ownerData.keySet().stream().anyMatch(plate -> plate.equals(licensePlate))){
            return false;
        }
        else{
            ownerData.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate){
        //returns the owner of the car corresponding to the license plate received as a parameter. If the car isn't in the registry, the method returns null.
        return ownerData.containsKey(licensePlate) ? ownerData.get(licensePlate) : null;
    }

    public boolean remove(LicensePlate licensePlate){
        if(ownerData.containsKey(licensePlate)){
            ownerData.remove(licensePlate);
            return true;
        }
        
        return false;
        
    }

    public void printLicensePlates(){
        ownerData.keySet().stream().forEach(System.out::println);
        // for(LicensePlate licensePlate: ownerData.keySet()){
        //     System.out.println(licensePlate);
        // }
    }

    public void printOwners(){
        ownerData.values().stream().distinct().forEach(System.out::println);
        // for(String owner: ownerData.values()){
        //     System.out.println(owner);
        // }
    }

}
