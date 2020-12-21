package enums;

public enum SaySmusPlot {GOODEMOTIONSSMUS("Ура, Муми-троль  приближется все ближе к шляпе"),BEDEMOTIONSSMUS("О нет, на Муми-троля нахлынула вода, он может утонуть"),GOODEMOTIONSFINISSMUS("Ура, Муми-троль доплыл до шляпы"),QUESTIONSTAST("Муми-троль, случилось ужасное. Волшебная шляпа упала в реку, если ее не достать мир не будет прежним.Что будем делать ? ");
    private String content;
    SaySmusPlot(String str){
        content=str;

    }
    public String getContent(){
        return content;
    }

}
