public class HashMap<K,V> {


    private List<Pair<K,V>>[] values;
    private int firstFreeIndex;

    public HashMap(){
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    //Let's implement a method called public V get(K key). It can be used to search for a value based on a key.
    /*
    The method begins by calculating a hash value for the key, and using it to figure out which is the relevant index of the internal array of the hash map. 
    The hash value is calculated with the hashCode method that each object has. Then modulo (remainder of division operation) is used for ensuring that the index stays within the size boundaries of the internal array.

    If there is no list in the calculated index, no key-value pairs have been added to that index. This means that there are no key-value pairs with this key that have been stored. 
    In this case we'll return the null reference. Otherwise, the program goes through the list at the index, and we compare the parameter key to the key of every key-value pair on that list. 
    If some of the keys matches the parameter key, the method returns the value of that key-value pair. Otherwise we cannot find a suitable key (and related value), so the method returns the value null.
     */
    public V get(K key){
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if(this.values[hashValue] == null){
            return null;
        }

        List<Pair<K,V>> valuesAtIndex = this.values[hashValue];

        for(int i = 0; i < valuesAtIndex.size(); i++){
            if(valuesAtIndex.value(i).getKey().equals(key)){
                return valuesAtIndex.value(i).getValue();
            }
        }
        return null;
    }

    /*
    public void add(K key, V value){
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if(values[hashValue] == null){
            values[hashValue] = new List<>();
        }

        List<Pair<K,V>> valuesAtIndex = values[hashValue];

        int index = -1;
        for(int i = 0; i < valuesAtIndex.size(); i++){
            if(valuesAtIndex.value(i).getKey().equals(key)){
                index = i;
                break;
            }
        }

        if(index < 0){
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        }else{
            valuesAtIndex.value(index).setValue(value);
        }
    }
    */

    //The method is quite complex, so let's divide it into smaller parts. The first part is responsible for finding the list related to the key, and the second part is responsible for finding the key on that list.
    private List<Pair<K,V>> getListBasedOnKey(K key){
        int hashValue = Math.abs(key.hashCode() % values.length);
        if(values[hashValue] == null){
            values[hashValue] = new List<>();
        }

        return values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K,V>> myList, K key){
        for(int i = 0; i < myList.size(); i++){
            if(myList.value(i).getKey().equals(key)){
                return i;
            }
        }
        return -1;
    }

    /*
    Then let's begin to create a method that copies the list of values at one index of the old array into the new one. 
    When copying, the location of each key-value pair is recalculated for the new array — this is done because the size of the internal array grows, 
    and we want to distribute all the key-value pairs in that array as evenly as possible.
     */

    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            Pair<K, V> value = this.values[fromIdx].value(i);
    
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if(newArray[hashValue] == null) {
                newArray[hashValue] = new List<>();
            }
    
            newArray[hashValue].add(value);
        }
    }

    private void grow() {
        // create a new array
        List<Pair<K, V>>[] newArray = new List[this.values.length * 2];
    
        for (int i = 0; i < this.values.length; i++) {
            // copy the values of the old array into the new one
            copy(newArray, i);
        }
    
        // replace the old array with the new
        this.values = newArray;
    }

    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
    
        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }
    
        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    /*
    Let's give the hash map the functionality to remove a key-value pair based on key. The removal functionality returns null if the value cannot be found, and otherwise it will remove the value that is paired with the key to be removed.

    We can take advantage of the method we've already implemented in the removing method. Explain to yourself (out loud) how the method described below concretely works.
     */
    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }
    
        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }
    
        Pair<K, V> pair = valuesAtIndex.value(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }



}
