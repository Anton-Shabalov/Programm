package Pokemons;
import ru.ifmo.se.pokemon.*;
import attack.*;

public class Vileplume extends Gloom {
    public Vileplume(String name,int level ){
        super(name, level);
        setStats(75,80,85,110,90,50);
        setType(Type.GRASS.POISON);
        addMove(new Facade());

    }
}