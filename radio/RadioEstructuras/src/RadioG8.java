public class RadioG8 implements Radio{

    private boolean on = false;
    private boolean frequency = true;
    private double am_station = 530.0;
    private double fm_station = 87.9;
    private double[] am_savedStations = new double[12];
    private double[] fm_savedStations = new double[12];

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void turnOnOff() {
        on = !on;
    }

    @Override
    public void nextStation(boolean frequency) {
        if (frequency) {
            if (am_station < 1610) {
                am_station += 10.0;
            }
        } else{
            if (fm_station < 107.9){
                fm_station += 0.2;
            }
        }
        
    }

    @Override
    public void prevStation(boolean frequency) {
        if (frequency) {
            if (am_station > 530.0) {
                am_station -= 10.0;
            }
        } else{
            if (fm_station > 87.9){
                fm_station -= 0.2;
            }
        }
        
    }

    @Override
    public double getStation() {
        if (frequency) {
            return am_station;
        }
        return fm_station;
    }

    @Override
    public void saveStation(int position, double station) {
        if (frequency) {
            am_savedStations[position] = station;
        } else {
            fm_savedStations[position] = station;
        }
        
    }

    @Override
    public double getSavedStation(int position) {
        if (frequency) {
            return am_savedStations[position];
        }
        return fm_savedStations[position];
    }

    @Override
    public boolean getFrequency() {
        return frequency;
    }

    @Override
    public void switchAMFM() {
        frequency = !frequency;
    }
    
}
