package attack;
import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove{
    @Override
    protected String describe() {
        return "использует: Bulldoze и понижает значение скорости на 1";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }
    public Bulldoze(){
        super(Type.NORMAL,60,100);
    }

}
