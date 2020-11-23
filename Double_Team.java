import ru.ifmo.se.pokemon.*;

class Double_Team extends StatusMove {
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, +1);
    }

    @Override
    protected String describe() {
        return "использует: Double Team и повышает себе уклонение на 1";
    }
    public Double_Team() {
        super(Type.NORMAL, 0, 100);
    }


}