import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * this class is extend from basic ArticleManager for parsing BBC.com
 */
public class ArticleManagerBBC extends ArticleManager {
    @Override

    /**
     * is override function of get politic news
     */
    public void getArticlePolitic()throws IOException {
        this.listArticles.clear();
        Document document;
        try {
            document = Jsoup.connect("https://www.bbc.com/russian/news").get();
        }
        catch (Throwable throwable){
            return;
        }

        Elements elements = document.getElementsByAttributeValue("class","eagle-item faux-block-link");
        elements.forEach(element -> {
            Element element1 = element.child(1).child(0);
            Element element2 = element.child(1).child(0).child(0);
            Element element3 = element.child(1).child(1);
            String url = "https://www.bbc.com"+element1.attr("href");
            String title = element2.text();
            String text = element3.text();
            Article article = new Article(url,title,text,Type.Politic,Localization.Belarus);
            listArticles.addArticle(article);
        });

    }
    /**
     * is override function of get economic news
     */
    @Override
    public void getArticleEconomic()throws IOException {
        this.listArticles.clear();
        Document document;
        try {
            document = Jsoup.connect("https://www.bbc.com/russian/topics/2f2db234-3c2d-40a4-b4ac-eea661faadd0").get();
        }
        catch (Throwable throwable){
            return;
        }

        Elements elements = document.getElementsByAttributeValue("class","eagle-item faux-block-link");
        elements.forEach(element -> {
            Element element1 = element.child(1).child(0);
            Element element2 = element.child(1).child(0).child(0);
            Element element3 = element.child(1).child(1);
            String url = "https://www.bbc.com"+element1.attr("href");
            String title = element2.text();
            String text = element3.text();
            Article article = new Article(url,title,text,Type.Politic,Localization.Belarus);
            listArticles.addArticle(article);
        });

    }

    /**
     * is override function of get culture news
     */
    @Override
    public void getArticleCulture()throws IOException {
        this.listArticles.clear();
        Document document;
        try {
            document = Jsoup.connect("https://www.bbc.com/russian/topics/0f469e6a-d4a6-46f2-b727-2bd039cb6b53").get();
        }
        catch (Throwable throwable){
            return;
        }
        Elements elements = document.getElementsByAttributeValue("class","eagle-item faux-block-link");
        elements.forEach(element -> {
            Element element1 = element.child(1).child(0);
            Element element2 = element.child(1).child(0).child(0);
            Element element3 = element.child(1).child(1);
            String url = "https://www.bbc.com"+element1.attr("href");
            String title = element2.text();
            String text = element3.text();
            Article article = new Article(url,title,text,Type.Politic,Localization.Belarus);
            listArticles.addArticle(article);
        });

    }


    /**
     * is override function of get sport news
     */
    @Override
    public void getArticleSport()throws IOException {
        this.listArticles.clear();
        Document document;
        try {
            document = Jsoup.connect("https://www.pressball.by/").get();
        }
        catch (Throwable throwable){
            return;
        }
        Elements elements = document.getElementsByAttributeValue("class","lenta-item-text-content");
        elements.forEach(element -> {
            Element element1 = element.child(1);
            Element element2 = element.child(1);
            Element element3 = element.child(1);
            String url = element1.attr("href");
            String title = element2.text();
            String text = element3.text();
            Article article = new Article(url,title,text,Type.Politic,Localization.Belarus);
            listArticles.addArticle(article);
        });
    }
}
