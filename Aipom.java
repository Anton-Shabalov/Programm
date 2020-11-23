import ru.ifmo.se.pokemon.*;

public class Aipom extends Pokemon{
    public Aipom(String name,int level ){
        super(name, level);
        setStats(55,70,55,40,55,85);
        setType(Type.NORMAL);
        setMove(new ThunderWave(), new Double_Team(), new Shadow_Claw());
    }
}
