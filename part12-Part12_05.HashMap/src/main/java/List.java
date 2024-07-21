public class List<Type> {

    private Type[] values;
    private int firstFreeIndex;

    /*
     * Let's create class List. The List has a generic array — the type of the elements in the array is defined on run time using type parameters.
     * Let's set the size of the array to 10. The array is created as type object, and changed to type generic with (A[]) new Object[10]; — this is done because Java does not support the call new A[10]; for now.
     */

    public List(){
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    //Let's add the method public void add(A value), which enables adding values to the list. We have to add an int variable to keep track of the first empty index in the array.
    public void add(Type value){
        //Let's modify the add method so that the size of the array grows when needed.
        if(this.firstFreeIndex == this.values.length){
            grow();
        }

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    private void grow(){
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        //for loop to copy contents of old values to newValues with larger size
        for(int i = 0; i< this.values.length; i++){
            newValues[i] = this.values[i];
        }

        //restore old values with newValues
        this.values = newValues;
    }

    /*
    Next we'll create the method public boolean contains(Type value), which we use to check whether the List contains a value or not. We will make use of the fact that each Java object — no matter its type — inherits the Object class (or is type Object). 
    Due to this, each object has the method public boolean equals(Object object), which we can use to check equality.

    The variable firstFreeIndex contains the number of elements in the array. We can implement the contains method so, that it only checks the indexes in the array which contain a value.
     */
    public boolean contains(Type value){

        //similar code to indextOfValue ... modify to reduce
        /*
        for(int i = 0; i< this.firstFreeIndex; i++){
            if(this.values[i].equals(value)){
                return true;
            }
        }
        
        return false;
        */

        //return true if it's not -1, else return false
        return indexOfValue(value) >=0;
    }

    //Now we will implement the functionality for removing a value from the List. Let's implement the method public void remove(Type value), which removes one value type value.
    //Simple implementation which can be problematic, because it leaves "empty" slot to the list.
    /*
    public void remove(Type value){
        for(int i = 0; i < this.firstFreeIndex; i++){
            if(value == this.values[i] || this.values[i].equals(value)){
                //remove using null, and decrement firstFreeIndex by one and return to end the loop
                this.values[i] = null;
                this.firstFreeIndex--;
                return;
            }
        }
    }
    
    //Alterative method, but too complex

    public void remove(Type value){
        boolean found = false;
        for(int i = 0; i < this.firstFreeIndex; i++){
            //if found from last index, replace last index content with current index content
            if(found){
                this.values[i-1] = this.values[i];
            }else if(value == this.values[i] || this.values[i].equals(value)){
                this.firstFreeIndex--;
                found = true;
            }
        }
    }
    */

    //The method looks for an element and moves elements around. We will split the functionality into two methods: private int indexOfValue(Type value), which searches for the index of the value given to it as a parameter, and private void moveToTheLeft(int fromIndex), which moves the elements above the given index to the left.
    public int indexOfValue(Type value){
        for(int i = 0; i < this.firstFreeIndex; i++){
            if(this.values[i].equals(value)){
                return i;
            }
        }

        return -1;
    }

    private void moveToTheLeft(int fromIndex){
        for(int i = fromIndex; i < this.firstFreeIndex-1; i++){
            //replace value found based on index and replace it with the next value
            this.values[i] = this.values[i+1];
        }
    }

    public void remove(Type value){
        int indexOfValue = indexOfValue(value);
        if(indexOfValue < 0){
            return; // not found
        }
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    public Type value(int index){
        if(index < 0 || index >= this.firstFreeIndex){
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }

        return this.values[index];
    }

    public int size(){
        return this.firstFreeIndex;
    }


    

}
