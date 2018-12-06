

public class Article {

    private String url;
    private String name;
    private String text;
    private Type type;
    private Localization localization;

    public Article(String url,String name,String text, Type type, Localization localization){
        this.url = url;
        this.name = name;
        this.text = text;
        this.type = type;
        this.localization = localization;
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Localization getLocalization() {
        return localization;
    }

    public void setLocalization(Localization localization) {
        this.localization = localization;
    }



}
