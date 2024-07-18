public class Student extends Person {

    private int credit;
    
    public Student(String name, String location){
        super(name, location);
        this.credit = 0;
    }

    public int credits(){
        return this.credit;
    }

    public void study(){
        credit ++;
    }

    @Override
    public String toString(){
        return super.toString() + "\n  Study credits " + credits();
    }

    

}
