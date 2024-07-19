/*
 * The user interface is separate from the application logic and the classes that represent the problem domain. 
 * In this example, the user interface is stored in the package ui
 */

package FlightControl.ui;

import java.util.Scanner;

import FlightControl.domain.Airplane;
import FlightControl.logic.FlightControl;

public class TextUI {

    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(FlightControl flightControl, Scanner scanner){
        this.flightControl = flightControl;
        this.scanner =scanner;
    }

    public void start(){
        // let's start in two parts -- first start the asset control,
        // then the flight control
        
        startAssetControl();
        System.out.println();

        // then startFlightControl
        startFlightControl();
        System.out.println();

    }


    // helper methods startAssetControl and startFlightControl
    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        while(true){
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String answer = scanner.nextLine();

            if(answer.equals("1")){
                addAirplane();
            }
            else if(answer.equals("2")){
                addFlight();
            }else if(answer.equals("x")){
                break;
            }
        }
    }

    private void addAirplane(){
        System.out.print("Give the airplane id: ");
        String airplaneID = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        //add airplane to flightControl object
        this.flightControl.addAirplane(airplaneID, capacity);

    }

    private void addFlight(){
        System.out.print("Give the airplane id: ");
        Airplane airplane = askForAirplane();
        System.out.print("Give the departure airport id: ");
        String departureID = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String targetID = scanner.nextLine();

        //add flight to flightControl object
        this.flightControl.addFlight(airplane , departureID, targetID);

    }

    private Airplane askForAirplane() {
        Airplane airplane = null;
        while(airplane == null){
            String airplaneID = scanner.nextLine();
            airplane = flightControl.getAirplane(airplaneID);
            if(airplane == null){
                System.out.println("No airplane with the id " + airplaneID + ".");
            }
        }
        return airplane;
    }

    //---------------------------------Part 2: Flight Control--------------------------
    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        while(true){

            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String answer = scanner.nextLine();
            
            if(answer.equals("1")){
                printAirplanes();
            }
            else if(answer.equals("2")){
                printFlights();
            }
            else if(answer.equals("3")){
                printAirplaneDetails();
            }
            else if(answer.equals("x")){
                break;
            }

        }

    }

    private void printAirplanes(){
        this.flightControl.getAirplanes().forEach(airplane -> System.out.println(airplane.toString()));
    }

    private void printFlights(){
        this.flightControl.getFlights().forEach(flight -> System.out.println(flight.toString()));
    }

    private void printAirplaneDetails(){
        System.out.print("Give the airplane id:");
        Airplane plane = askForAirplane();
        System.out.println(plane.toString());
    }



}
