package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{

    private boolean state;

    public TemperatureSensor(){
        this.state = false;
    }

    public boolean isOn(){
        
        return this.state;
    }

    public void setOn(){
        this.state = true;
    }

    public void setOff(){
        this.state = false;
    }

    public int read(){

        int randomNumber =0;

        if(!this.state){
            throw new IllegalStateException("Sensor is off");
        }
        if(this.state){
            //Use the ready-made Java class Random to choose the random number. You'll get an integer in the range 0...60 by calling new Random().nextInt(61); 
            //— to get a random integer in the range -30...30 you'll have to subtract a suitable number from the random number in the range 0...60.
            randomNumber = new Random().nextInt(61)-30;
        }

        return randomNumber;
        

    }

}
