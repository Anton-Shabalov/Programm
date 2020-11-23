import ru.ifmo.se.pokemon.*;

class Energy_Ball extends SpecialMove {
    @Override
    protected String describe() {
        return "использует: Energy Ball, которая с вероятностью 10% понижает специальную защиту противника на 1";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1){
            p.setMod(Stat.HP,  -1);
        }
    }

    public Energy_Ball() {
        super(Type.GRASS, 90, 100);
    }
}