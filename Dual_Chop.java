import ru.ifmo.se.pokemon.*;

class Dual_Chop extends PhysicalMove {
    @Override
    protected String describe() {
        return "использует: Dual Chop, который атакует 2 раза ";
    }

    public Dual_Chop(){
        super(Type.DRAGON,40,90,0,2);
    }


}