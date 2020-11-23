import ru.ifmo.se.pokemon.*;


public class Ambipom extends Aipom {
    public Ambipom(String name,int level ){
        super(name, level);
        setStats(75,100,66,60,66,115);
        setType(Type.NORMAL);
        addMove(new Dual_Chop());
    }
}
