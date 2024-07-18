public class CD implements Packable{

    private String artist;
    private String cdName;
    private int year;
    private double weight;

    public CD(String artist, String cdName, int year){
        this.artist = artist;
        this.cdName = cdName;
        this.year = year;
        this.weight = 0.1;
    }

    @Override
    public double weight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return this.artist + ": " + this.cdName + " (" + this.year + ")";
    }
}
