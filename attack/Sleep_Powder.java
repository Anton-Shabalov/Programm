package attack;
import ru.ifmo.se.pokemon.*;

public class Sleep_Powder extends StatusMove {
    @Override
    protected void applyOppEffects(Pokemon p) {
        int a = (int) (Math.random() * (4-1) )+1;
        Effect e = new Effect().condition(Status.SLEEP).attack(0).turns(a);
        p.setCondition(e);
    }

    @Override
    protected String describe() {
        return "использует: Sleep Powder усыпляет противника на 1-3 хода";
    }
    public Sleep_Powder() {
        super(Type.GRASS, 0, 75);
    }


}