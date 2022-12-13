package package01.entities;

import package01.interfaces.ICarbonFootprint;

public class Bicycle implements ICarbonFootprint{
    private boolean use_engine;
    private float rim_bicycle;

    public Bicycle(boolean use_engine, float rim_bicycle){
        this.use_engine = use_engine;
        this.rim_bicycle = rim_bicycle;
    }

    public void setUse_engine(boolean use_engine){
        this.use_engine = use_engine;
    }

    public boolean getUse_engine(){
        return use_engine;
    }
    
    public void setRim_bicycle(float rim_bicycle){
        this.rim_bicycle = rim_bicycle;
    }
    
    public float getRim_bicycle(){
        return rim_bicycle;
    }

    public float getCarbonFootprint(){
        float ton_carbono;

        float consumption_rim_bicycle;
        consumption_rim_bicycle = rim_bicycle * 1;
        
        if(rim_bicycle == 26){
            consumption_rim_bicycle *= 20;
        }else if(rim_bicycle == 29){
            consumption_rim_bicycle *= 30;
        }else{
            consumption_rim_bicycle *= 15;
        }

        ton_carbono = consumption_rim_bicycle;

        if(use_engine == false){
            ton_carbono *= 100;
        }else{
            ton_carbono += 0;
        }

        return ton_carbono;     
    }
}
