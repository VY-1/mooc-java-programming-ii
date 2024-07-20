package application;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readingsOfValues;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readingsOfValues = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return this.readingsOfValues;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.sensors) {
            if (sensor.isOn() == false) {
                sensor.setOn();
            }
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            if (sensor.isOn() == true) {
                sensor.setOff();
            }
        }
    }

    @Override
    public int read() {
        int result = 0;

        for (Sensor sensor : this.sensors) {
            if (sensor.isOn() == false) {
                throw new IllegalStateException();
            }
            result += sensor.read();
        }

        int average = result / this.sensors.size();

        this.readingsOfValues.add(average);

        return average;
    }

}