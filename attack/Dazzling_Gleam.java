package attack;
import ru.ifmo.se.pokemon.*;

public class Dazzling_Gleam extends SpecialMove {
    @Override
    protected String describe() {
        return "использует: Dazzling Gleam";
    }



    public Dazzling_Gleam() {
        super(Type.FAIRY, 80, 100);
    }
}