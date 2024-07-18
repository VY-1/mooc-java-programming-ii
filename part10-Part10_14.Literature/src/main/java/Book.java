
public class Book {

    private String name;
    private int ageRecommended;

    public Book(String name, int ageRecommended){
        this.name = name;
        this.ageRecommended = ageRecommended;
    }

    public String getName() {
        return name;
    }

    public int getAgeRecommended() {
        return ageRecommended;
    }

    public String toString(){
        return this.name + " (recommended for "+ this.ageRecommended +" year-olds or older)";
    }

    
    
}
