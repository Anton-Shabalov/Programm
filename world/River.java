package world;
import tools.*;

public class River extends Nature {
    private int waves;
    private String wavesName;
    private boolean clear;
    public River(int temperature,String name, int wind){
        clear=true;
        setTemperature(randomsi.random(temperature-5,temperature+5));
        setName(name);

        if (wind>20 ){
            waves=3;
            wavesName="сильными волнами";
            setSound("сильный грохот");

        }else if (wind>10){
            waves=2;
            wavesName="средними волнами";
            setSound("небольшой шум");
        }else {
            waves=1;
            wavesName="слабыми волнами";
            setSound("слабый звук характерный течению");
        }
        System.out.println("На этой планете есть река под названием "+name+" c "+wavesName+".Температура ее " +getTemperature()+" градусов"+". От реки исходит "+getSound());
    }
    public int getCondition(){
        if (randomsi.random(0,10)+waves<6){
            return 0;
        }else {
            return 1;
        }

    }

    public void setClear(boolean clear) {
        this.clear = clear;
    }

    @Override
    public boolean equals(Object obj){
        return clear==((River) obj).clear;
    }

    @Override
    public int hashCode() {
        return waves;
    }
}
