

import ru.ifmo.se.pokemon.*;

public class Oddish extends Pokemon {
    public Oddish(String name,int level ){
        super(name, level);
        setStats(45,50,55,75,65,30);
        setType(Type.GRASS.POISON);
        setMove(new Energy_Ball(),new Dazzling_Gleam());

    }
}
