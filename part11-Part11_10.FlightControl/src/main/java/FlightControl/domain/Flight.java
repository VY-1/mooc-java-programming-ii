package FlightControl.domain;

public class Flight {

    //Flight class contains information about airplane and places for departure and destination.
    private Airplane airplane;
    private Place departureAirport;
    private Place targetAirport;

    public Flight(Airplane airplane,Place departureAirport, Place targetAirport){
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public Place getDepartureAirport() {
        return this.departureAirport;
    }

    public Place getTargetAirport() {
        return this.targetAirport;
    }

    @Override
    public String toString(){
        return this.airplane.toString() + " (" + this.departureAirport.toString() + "-" + this.targetAirport.toString()+ ")";
    }
    

}
