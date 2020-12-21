package enums;

public enum SayMumiPlot {ANSWER("О нет, это ужасно. Мы должны сделать все чтоб спасти эту планету. Я готов пожертвовать собой и отправиться в плавь зе ней "),PONDER("Задумался над вопросом, что делать дальше."),STARTSWIM("Вода холодная, я чувствую себя неуверенно, боюсь утонуть") ;

    private String content;
    SayMumiPlot(String str){
        content=str;

    }
    public String getContent(){
        return content;
    }
}
