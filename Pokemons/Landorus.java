package Pokemons;

import ru.ifmo.se.pokemon.*;
import attack.*;


public class Landorus extends Pokemon {
    public Landorus(String name,int level ){
        super(name, level);
        setStats(89,125,90,115,80,101);
        setType(Type.GROUND.FLYING);
        setMove(new Stone_Edge(), new Confide(), new Mud_Shot(),new Bulldoze());
    }
}
