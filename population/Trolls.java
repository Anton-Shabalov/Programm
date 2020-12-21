package population;
import inter.swim;
import inter.talk;
import tools.randomsi;
import world.River;
import enums.*;


public enum Trolls implements swim,talk {
    MOOMIN("Муми-тролль",6,1) ,SMUS("Снусмумрик",2);
    private String name;
    private int hp;
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
    public boolean rowing(River river) {
        if (river.getCondition()==1){

            if(saveAir()){
                System.out.println("На "+this.name+" нахлынула вода, но он успел задержать дыхание");
                return true;
            }else {
                if(this.hp>1){
                    Say(SayGeneral.BEDEMOTIONS.getContent(),true);
                    hp=hp-1;
                    return true;
                }else {
                    Say(SayGeneral.BEDEMOTIONS.getContent(),true);
                    return false;

                }
            }

        }else {
            Say(SayGeneral.GOODEMOTIONS.getContent(),true);
            return true;
        }


    }

    @Override
    public boolean startSwim(int k,River river,LoginType loginType, TypeOfSwimming typeOfSwimming,SayGeneral swimmerCondition) {
        int liveTrol=1;
        System.out.println(toString()+" "+loginType.getContent()+ " и поплыл "+ typeOfSwimming.getName());
        Say(swimmerCondition.getContent(),false);
        for(int i=0; i<k;++i){
            if (this.rowing(river)){
                if (i==k-1){
                    Say(SayGeneral.ENDSWIM.getContent(), false);
                }else if(i==k/2){
                    Say(SayGeneral.Midstream.getContent(),false);
                }
            }else {
                liveTrol=0;
                break;
            }
        }
        if (liveTrol==1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void Say(String content, boolean revers) {
        if (revers==false){
            System.out.println(this.toString()+": "+content);
        }else{
            if(this==Trolls.SMUS){
                System.out.println(Trolls.MOOMIN.toString()+": "+ content);

            }else {
                System.out.println(Trolls.SMUS.toString()+": "+ content);
            }
        }

    }
}
