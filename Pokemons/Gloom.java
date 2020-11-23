package Pokemons;
import ru.ifmo.se.pokemon.*;
import attack.*;

public class Gloom extends Oddish {
    public Gloom(String name,int level ){
        super(name, level);
        setStats(60,65,70,85,75,40);
        setType(Type.GRASS.POISON);
        addMove(new Sleep_Powder());
    }
}
