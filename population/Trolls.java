package population;
import inter.swim;
import inter.talk;
import tools.randomsi;
import world.River;


public enum Trolls implements swim,talk {
    MOOMIN("Муми-тролль",6,1) ,SMUS("Снусмумрик",2);
    private String name;
    private int hp;
    private static River river;
    private static River river2;
    private int id;

    Trolls(String name,int hp,int id){
        this.name=name;
        this.hp=hp;
        this.id=id;

    }

    @Override
    public String toString() {
        if(id==1){
            return "Муми-троль";
        }else {
            return "Смусмурик";
        }

    }

    Trolls(String name,int id){
        this.name=name;
        this.id=id;
    }
    public static void description(){
        System.out.println("На этой планете рядом с рекой живут два троля. "+Trolls.MOOMIN.name+" и "+Trolls.SMUS.name);
    }


    @Override
    public boolean saveAir() {
        if (randomsi.random(0,10)<=3){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean rowing() {
        if (river.getCondition()==1){

            if(saveAir()){
                System.out.println("На "+this.name+" нахлынула вода, но он успел задержать дыхание");
                return true;
            }else {
                if(this.hp>1){
                    Trolls.SMUS.badEmotion();
                    hp=hp-1;
                    return true;
                }else {
                    System.out.println("На Муми-тролля нахлынула вода и он утонул");
                    return false;
                }
            }

        }else {
            SMUS.goodEmotion();
            return true;
        }


    }

    @Override
    public void getWater(River river,River river2) {
        this.river=river;
        this.river2=river2;

    }

    @Override
    public void startSwim(int k) {
        for(int i=0; i<k;++i){
            if (randomsi.random(0,30)<=1){
                river2.setClear(false);
            }
            if (rowing()){
                if (i==k-1){
                    System.out.println("Муми-троль смог достать шляпу из воды");
                    if (Trolls.SMUS.chekWater()){
                        System.out.println("Смусмурик: Ура. Муми-троль ты успел достать шляпу прежде чем она заразила реку");
                    }else {
                        System.out.println("Смусмурик: К сожалению другая река была заражена, но поскольку шляпу удалось достать вскоре загрзненую воду смоет течение");
                    }



                }
            }else {
                System.out.println("Теперь река будет заражена и вероятно на планете больше не будет жизни");
                break;
            }

        }
    }

    @Override
    public void question() {
        if(toString()=="Смусмурик"){
            System.out.println("Смусмурик: Муми-троль, случилось ужасное. Волшебная шляпа упала в реку, если ее не достать мир не будет прежним.Что будем делать ? ");
            Trolls.MOOMIN.ansver();
        }else{

        }

    }

    @Override
    public void ansver() {
        if(toString()=="Муми-троль"){
            System.out.println("Муми-троль: О нет, это ужасно. Мы должны сделать все чтоб спасти эту планету. Я готов пожертвовать собой и отправиться в плавь зе ней ");

        }

    }

    @Override
    public void badEmotion() {
        if(toString()=="Смусмурик"){
            System.out.println("Смусмурик: О нет, на Муми-троля нахлынула вода, он може  утонуть");
            Trolls.MOOMIN.badEmotion();
        }else {
            System.out.println("Муми-троль: у меня осталось "+ Trolls.MOOMIN.hp+" жизней");
        }



    }

    @Override
    public void goodEmotion() {
        if(toString()=="Смусмурик"){
            System.out.println("Смусмурик: Ура, Муми-троль подбирается все ближе к шляпе");
        }


    }
    private boolean chekWater(){
        return this.river.equals(this.river2);

    }







}
