package world;

import enums.*;
import population.Trolls;
import tools.*;

 import java.util.Random;

 public class Planet extends Nature {
     private int  wind;
     private String nameWind;
     private River river,river1;



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
   getInfoPlanet();

    createRive(name);
    startPlotHat();


}
private void createRive(String namePlanet){
    River river=new River(getTemperature(),"Трольская речушка ",wind,namePlanet);
    River river1=new River(namePlanet,wind);
    this.river=river;
    this.river1=river1;

     }
     private void getInfoPlanet(){
    System.out.println("");
    System.out.println("На планете: "+ getName()+ " Температура: "+getTemperature()+" и "+nameWind+" на улице "+getSound());
     }
     private  void startPlotHat(){

         Trolls.description();
         Trolls.SMUS.Say(SaySmusPlot.QUESTIONSTAST.getContent(),false);
         Trolls.MOOMIN.Say(SayMumiPlot.PONDER.getContent(),false);
         System.out.println("Опасная шляпа упала в реку и грозит испортить ее. Муми-троль бросается в реку, чтоб вытащить ее от туда ");



         if (river1.hashCode()<river.hashCode()){
             if(Trolls.MOOMIN.startSwim(8,river, LoginType.SLIPPED, TypeOfSwimming.DOG, SayGeneral.BEDSTARTSWIM)){
                 System.out.println("Ура, Муми-троль смог достать шляпу планета будет спасена");
                 checkWater();
             }else {
                 System.out.println("К сожалению, Муми-троль утонул, мир теперь не будет прежним");
             }


         }else{

             if(Trolls.MOOMIN.startSwim(10,river,LoginType.SLIPPED,TypeOfSwimming.DOG, SayGeneral.BEDSTARTSWIM)){
                 river.setClear(false);
                 System.out.println("Ура, Муми-троль смог достать шляпу планета будет спасена");
                 checkWater();
             }else {
                 System.out.println("К сожалению, Муми-троль утонул, мир теперь не будет прежним");
             }

         }



     }
     private void checkWater(){
        if (river.equals(this.river1)){
            System.out.println("Муми-троль успел достать шляпу прежде чем она заглязинила воду");
        }else {
            System.out.println("К сожалению, Муми-троль достал шляпу не так быстро и часть зараженной воды попала в продолжение реки, но к счастью, благодаря течению вода скоро востановиться ");
        }

     }


}





