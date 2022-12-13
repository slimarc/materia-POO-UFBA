package package01.entities;

import package01.interfaces.ICarbonFootprint;

public class Car implements ICarbonFootprint{
    private String fuel;
    private float engine_capacity;

    public Car(String fuel, float engine_capacity){
        this.fuel = fuel;
        this.engine_capacity = engine_capacity;
    }

    public void setFuel(String fuel){
        this.fuel = fuel;
    }

    public String getFuel(){
        return fuel;
    }

    public void setEngine_capacity(float engine_capacity){
        this.engine_capacity = engine_capacity;
    }
    
    public float getEngine_capacity(){
        return engine_capacity;
    }

    public float getCarbonFootprint(){
        float ton_carbono;

        float consumption_engine = engine_capacity * 80;
        ton_carbono = consumption_engine;

        if (fuel.equals("Gasolina") || fuel.equals("gasolina")){
            ton_carbono *= 100;
        }else if (fuel.equals("Etanol") || fuel.equals("etanol")){
            ton_carbono *= 80;
        }else if(fuel.equals("GNV") || fuel.equals("gnv")){
            ton_carbono *= 60;
        }

        return ton_carbono;
    }
}
