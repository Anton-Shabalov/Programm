package attack;
import ru.ifmo.se.pokemon.*;

public class Stone_Edge extends PhysicalMove {
    @Override
    protected String describe() {
        return "использует: Stone Edge с увеличением критического удара на 12.5%";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().chance(1).turns(0).stat(Stat.SPECIAL_ATTACK, (int) (p.getStat(Stat.SPECIAL_ATTACK) * 1.125));
        p.addEffect(e);
    }
    public Stone_Edge(){
        super(Type.ROCK,100,80);
    }

}
