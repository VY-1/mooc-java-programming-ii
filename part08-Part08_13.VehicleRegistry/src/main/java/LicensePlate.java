
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object object){
        // if the variables are located in the same place, they're the same
        if(this == object){
            return true;
        }

        // if comparedObject is not of type LicensePlate, the objects aren't the same
        if(!(object instanceof LicensePlate)){
            return false;
        }

        //Let's convert the object ot a LicensePlate object
        LicensePlate comparedLicensePlate = (LicensePlate) object;

        //if the instance variables of object are the same, so are the objects
        if(this.liNumber.equals(comparedLicensePlate.liNumber) && this.country.equals(comparedLicensePlate.country)){
            return true;
        }

        //otherwise, the object aren't the same
        return false;


    }

    @Override
    public int hashCode(){
        int hash = 77;
        hash += 34 * Objects.hashCode(liNumber);
        hash += 11 * Objects.hashCode(country);
        return Integer.hashCode(hash);
    } 

}
