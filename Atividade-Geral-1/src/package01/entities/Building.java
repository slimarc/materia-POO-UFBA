package package01.entities;

import package01.interfaces.ICarbonFootprint;

public class Building implements ICarbonFootprint{
    private int num_peoples;
    private boolean use_renewable_energy;
    private int num_lamps;
    private boolean use_air_conditioning;

    public Building(int num_peoples, boolean use_renewable_energy, int  num_lamps, boolean use_air_conditioning){
        this.num_peoples = num_peoples;
        this.use_renewable_energy = use_renewable_energy;
        this.num_lamps = num_lamps;
        this.use_air_conditioning = use_air_conditioning;
    }

    public int getNum_peoples() {
        return num_peoples;
    }

    public void setNum_peoples(int num_peoples) {
        this.num_peoples = num_peoples;
    }

    public boolean isUse_renewable_energy() {
        return use_renewable_energy;
    }

    public void setUse_renewable_energy(boolean use_renewable_energy) {
        this.use_renewable_energy = use_renewable_energy;
    }

    public int getNum_lamps() {
        return num_lamps;
    }

    public void setNum_lamps(int num_lamps) {
        this.num_lamps = num_lamps;
    }

    public boolean isUse_air_conditioning() {
        return use_air_conditioning;
    }

    public void setUse_air_conditioning(boolean use_air_conditioning) {
        this.use_air_conditioning = use_air_conditioning;
    }

    public float getCarbonFootprint(){
        float ton_carbono;

        float consumption_lamps = 100*num_lamps;
        float consumption_peoples = 300*num_peoples;

        ton_carbono = consumption_lamps + consumption_peoples;
        
        if (use_renewable_energy == false) {
            ton_carbono *= 20;
        }else if (use_renewable_energy == true){
            ton_carbono *= 100;
        }else if(use_air_conditioning == false){
            ton_carbono *= 20;
        }else if(use_air_conditioning == true){
            ton_carbono *= 100;
        }

        return ton_carbono;
    }
    
}
