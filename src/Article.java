/**
 * this class for working with Article
 */
public class Article {

    private String url;
    private String name;
    private String text;
    private Type type;
    private Localization localization;

    /**
     * this constructor with params
     * @param url is url of news
     * @param name is title of news
     * @param text is the main text of news
     * @param type is a type of news
     * @param localization is the localization of news
     */
    public Article(String url,String name,String text, Type type, Localization localization){
        this.url = url;
        this.name = name;
        this.text = text;
        this.type = type;
        this.localization = localization;
    }


    /**
     * is simple getter for url
     * @return url news
     */
    public String getUrl() {
        return url;
    }

    /**
     * is simple setter  for url
     * @param url is news url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * is simple getter for name
     * @return title of news
     */
    public String getName() {
        return name;
    }

    /**
     * is simple setter of title
     * @param name is title of news
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * is simple getter for main text
     * @return main text of news
     */
    public String getText() {
        return text;
    }

    /**
     * is simple setter of the main text
     * @param text is news main text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * is simple getter for type
     * @return type of news
     */
    public Type getType() {
        return type;
    }

    /**
     * is simple setter of news type
     * @param type of news
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * is simple getter for news localization
     * @return news localization
     */
    public Localization getLocalization() {
        return localization;
    }


    /**
     * is simple setter for news localization
     * @param localization is news localization
     */
    public void setLocalization(Localization localization) {
        this.localization = localization;
    }



}
