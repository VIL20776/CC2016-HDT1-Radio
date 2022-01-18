public class RadioG8 implements Radio{

    private boolean on;
    private boolean frequency; //true = AM; false = FM
    private double am_station;
    private double fm_station;
    private double[] am_savedStations;
    private double[] fm_savedStations;
    
    public RadioG8() {
        this.on = false;
        this.frequency = true;
        this.am_station = 530.0;
        this.fm_station = 87.9;
        this.am_savedStations = new double[12];
        this.fm_savedStations = new double[12];
        
    }

    @Override //Determina si esta encendida la radio
    public boolean isOn() {
        return on;
    }

    @Override //Cambia el estado de la radio entre encendido y apagado
    public void turnOnOff() {
        on = !on;
    }

    @Override //Avanza la estacion segun la frecuencia
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

    @Override //Retrocede en la estacion segun la frecuencia
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

    @Override //Obtiene el valor de la estacion actual segun la frecuencia
    public double getStation() {
        if (this.frequency) {
            return am_station;
        }
        return fm_station;
    }

    @Override //Guarda una estacion en uno de los 12 espacios posibles segun la frecuencia
    public void saveStation(int position, double station) {
        if (this.frequency) {
            am_savedStations[position] = station;
        } else {
            fm_savedStations[position] = station;
        }
        
    }

    @Override //Obtiene una estacion en la posision indicada segun la frecuencia
    public double getSavedStation(int position) {
        if (this.frequency) {
            return am_savedStations[position];
        }
        return fm_savedStations[position];
    }

    @Override //Obtiene la frecuencia actual
    public boolean getFrequency() {
        return this.frequency;
    }

    @Override //Cambia entre AM y FM
    public void switchAMFM() {
        this.frequency = !this.frequency;
    }
    
}
