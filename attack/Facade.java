package attack;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 100); }
    @Override
    protected String describe() {
        return "использует: Facade, если на противнике есть эффект BURN или POISON или PARALYZE, удар становится в двоя сильнее ";
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        Status PokCon = p.getCondition();
        if (PokCon.equals(Status.BURN) || PokCon.equals(Status.POISON) ||
                PokCon.equals(Status.PARALYZE)) {
            p.setMod(Stat.HP, (int) Math.round(damage) * 2);
        } }
}