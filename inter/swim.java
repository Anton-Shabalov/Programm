package inter;

import enums.LoginType;
import enums.SayGeneral;
import enums.TypeOfSwimming;
import world.River;

public interface swim {
    boolean saveAir();
    boolean rowing(River river);
    boolean startSwim(int k, River river, LoginType loginType, TypeOfSwimming typeOfSwimming, SayGeneral swimmerСondition);



}
