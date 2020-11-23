import ru.ifmo.se.pokemon.*;

class Confide extends StatusMove {
    @Override
    protected String describe() {
        return "использует: Confide и понижает значение специальной аттаки на 1 у противника";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    public Confide(){
        super(Type.NORMAL,0,80);
    }

}




