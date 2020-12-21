package enums;

public enum SayGeneral {GOODEMOTIONS("Ура, Муми-троль  приближется все ближе к шляпе"),BEDEMOTIONS("О нет, на Муми-троля нахлынула вода, он может утонуть"),GOODEMOTIONSFINISH("Ура, мой друг доплыл до шляпы "),GOODSTARTSWIM("Вода теплая, я себя чувствую очень кофортно в ней"),BEDSTARTSWIM("Вода очень холадная, мне не комфортно"),Midstream("Я вижу берег и черный силуэт на нем"),ENDSWIM("Я подрулил хвостом и нащумал дно");
private String content;
SayGeneral(String content){
    this.content=content;
}

    public String getContent() {
        return content;
    }
}
