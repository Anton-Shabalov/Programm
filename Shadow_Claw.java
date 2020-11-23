import ru.ifmo.se.pokemon.*;

class Shadow_Claw extends PhysicalMove {
    @Override
    protected String describe() {
        return "использует: Shadow_Claw с увеличением критического удара на 12.5%";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().chance(1).turns(0).stat(Stat.SPECIAL_ATTACK, (int) (p.getStat(Stat.SPECIAL_ATTACK) * 1.125));
        p.addEffect(e);

    }
    public Shadow_Claw(){
        super(Type.GHOST,70,100);
    }

}