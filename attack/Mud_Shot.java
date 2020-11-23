package attack;
import ru.ifmo.se.pokemon.*;

public class Mud_Shot extends SpecialMove {
    @Override
    protected String describe() {
        return "использует: Mud Shot и понижает значение скорости на 1 у противника";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }
    public Mud_Shot(){
        super(Type.NORMAL,55,95);
    }

}