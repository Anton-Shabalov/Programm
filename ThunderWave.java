import ru.ifmo.se.pokemon.*;

class ThunderWave extends StatusMove {
    @Override
    protected void applyOppEffects(Pokemon p){
        if(!p.hasType(Type.GROUND)) {
            Effect.paralyze(p);
        }

    }

    @Override
    protected String describe() {
        return "использует: Thunder Wave и парализует противника,если он не земляного типа  ";
    }
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 90);
    }




}