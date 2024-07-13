import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageFacility;

    public StorageFacility(){
        this.storageFacility = new HashMap<>();
    }

    //adds the parameter item to the storage unit that is also given as a parameter.
    public void add(String unit, String item){
        //store an empty array if not present or has no item
        this.storageFacility.putIfAbsent(unit,new ArrayList<>());

        //create an array of itemList and assign based on key unit
        ArrayList<String> itemList = this.storageFacility.get(unit);
        itemList.add(item);

        //can be done with a single line
        //this.storageUnit.get(unit).add(item);
    }

    //returns a list that contains all the items in the storage unit indicated by the parameter. 
    //If there is no such storage unit or it contains no items, the method should return an empty list.
    public ArrayList<String> contents(String storageUnit){
        return this.storageFacility.getOrDefault(storageUnit, new ArrayList<>());
    }

    //removes the given item from the given storage unit. NB! Only removes one item — if there are several items with the same name, the rest still remain.
    //If the storage unit would be empty after the removal, the method also removes the unit.
    public void remove(String storageUnit, String item){
        if(this.storageFacility.containsKey(storageUnit)){
            ArrayList<String> listOfItems = contents(storageUnit);
            if(listOfItems.contains(item)){
                int itemIndexToRemove = listOfItems.indexOf(item);
                listOfItems.remove(itemIndexToRemove);
                
            }
        }
        if(storageFacility.get(storageUnit).isEmpty()){
            storageFacility.remove(storageUnit);
        }
    }

    //returns the names of the storage units as a list. NB! Only the units that contain items are listed.
    public ArrayList<String> storageUnits(){
        ArrayList<String> unitWithItem = new ArrayList<>();
        for(String unit: this.storageFacility.keySet()){
            unitWithItem.add(unit);
        }

        return unitWithItem;
    }


}
