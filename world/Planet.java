package world;

import population.Trolls;
import tools.*;

 import java.util.Random;

 public class Planet extends Nature {
     private int  wind;
     private String nameWind;



public Planet(String name){
    this.setName(name);
    setTemperature(randomsi.random(-10,10));
    if (getTemperature()<=0){
        setSound("слышен шорох снега,создаваемый животными. Реки еще не замерли.");
    }else{
        setSound("слышно щебетание птиц");
    }
    wind=randomsi.random(0,30);
    if (wind>20 ){
        nameWind="cильный ветер";

    }else if (wind>10){
        nameWind="cредний ветер";
    }else {
        nameWind="cлабый ветер";
    }
    System.out.println("На планете: "+ getName()+ " Температура: "+getTemperature()+" и "+nameWind+" на улице "+getSound());
    River river=new River(getTemperature(),"Трольская речушка ",wind);
    River river1=new River(getTemperature(),"Продолжение реки",wind);
    Trolls.MOOMIN.getWater(river,river1);

    Trolls.description();
    Trolls.SMUS.question();
    System.out.println("Опасная шляпа упала в реку и грозит испортить ее. Муми-троль бросается в реку, чтоб вытащить ее от туда ");

    if (river1.hashCode()<river.hashCode()){
        Trolls.MOOMIN.startSwim(8);
    }else{
        Trolls.MOOMIN.startSwim(10);
    }

}


}





