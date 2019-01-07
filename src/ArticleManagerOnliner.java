import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * this class is extend from basic ArticleManager for parsing Onliner.by
 */
public class ArticleManagerOnliner extends ArticleManager {

    /**
     * is override function of get politic news
     */
    @Override
    public void getArticlePolitic()throws IOException {
        this.listArticles.clear();
        Document document;

        try {
            document = Jsoup.connect("https://realt.onliner.by/").get();
        }
        catch (Throwable throwable){
            return;
        }
        Elements elements = document.getElementsByAttributeValue("class","news-tidings__item news-tidings__item_1of3 news-tidings__item_condensed ");
        elements.forEach(element -> {
            Element element1 = element.child(0);
            Element element2 = element.child(2).child(0).child(0).child(0);
            Element element3 = element.child(2).child(1);
            String url = "https://realt.onliner.by"+element1.attr("href");
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
           document = Jsoup.connect("https://tech.onliner.by/").get();
       }
       catch (Throwable throwable){
           return;
       }
        Elements elements = document.getElementsByAttributeValue("class","news-tidings__item news-tidings__item_1of3 news-tidings__item_condensed ");
        elements.forEach(element -> {
            Element element1 = element.child(0);
            Element element2 = element.child(2).child(0).child(0).child(0);
            Element element3 = element.child(2).child(1);
            String url = "https://tech.onliner.by"+element1.attr("href");
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
            document = Jsoup.connect("https://people.onliner.by/").get();
        }
        catch (Throwable throwable){
            return;
        }
        Elements elements = document.getElementsByAttributeValue("class","news-tidings__item news-tidings__item_1of3 news-tidings__item_condensed ");
        elements.forEach(element -> {
            Element element1 = element.child(0);
            Element element2 = element.child(2).child(0).child(0).child(0);
            Element element3 = element.child(2).child(1);
            String url = "https://people.onliner.by"+element1.attr("href");
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
            document = Jsoup.connect("https://www.belnovosti.by/sport").get();
        }
        catch (Throwable throwable){
            return;
        }
        Elements elements = document.getElementsByAttributeValue("class","views-field views-field-title-1");
        elements.forEach(element -> {
            Element element1 = element.child(0).child(1).child(0).child(0);
            Element element2 = element.child(0).child(1).child(0).child(0);
            Element element3 = element.child(0).child(1).child(1);
            String url = "https://people.onliner.by"+element1.attr("href");
            String title = element2.text();
            String text = element3.text();
            Article article = new Article(url,title,text,Type.Politic,Localization.Belarus);
            listArticles.addArticle(article);
        });
    }
}
