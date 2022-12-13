package package01.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import package01.interfaces.ICarbonFootprint;

public class TestaObjects {
    public static void main(String[] args){
        Building building1 = new Building(20, false, 300, true);
        Building building2 = new Building(40,true, 520, true);

        Car car1 = new Car("Gasolina", 250);
        Car car2 = new Car("Etanol", 300);

        Bicycle bicycle1 = new Bicycle(false, 24);
        Bicycle bicycle2 = new Bicycle(true, 29);
        
        List objects = new ArrayList<>();

        objects.add(building1);
        objects.add(building2);
        objects.add(car1);
        objects.add(car2);
        objects.add(bicycle1);
        objects.add(bicycle2);

        Iterator<ICarbonFootprint> itr = objects.iterator();

        System.out.println("========PEGADA DE CARBONO========");
        while(itr.hasNext()){
            System.out.println("\n==========================");
            System.out.printf("CABORNO-KG: %.2f\n", itr.next().getCarbonFootprint());
            System.out.println("==========================");
        }
        
    }
}
