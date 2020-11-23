
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle fight = new Battle();
        Landorus Landorus=new Landorus("Ландорус", 12);
        Aipom Aipom=new Aipom("Айпом",10);
        Ambipom Ambipom=new Ambipom("Амбипом",11);
        Oddish Oddish=new Oddish("Одишь",9);
        Gloom Gloom=new Gloom("Глум",10);
        Vileplume Vileplume=new Vileplume("Виеплуме",13);

        fight.addAlly(Landorus);
        fight.addAlly(Aipom);
        fight.addAlly(Ambipom);
        fight.addFoe(Oddish);
        fight.addFoe(Gloom);
        fight.addFoe(Vileplume);

        fight.go();



    }

}
