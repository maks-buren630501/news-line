import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * this class is extend from basic ArticleManager for parsing Onliner.by
  */

public class ArticleManagerTutby extends ArticleManager{

    /**
     * is override function of get politic news
     */
    @Override
    public void getArticlePolitic() throws IOException {
        this.listArticles.clear();
        Document document;
        try {
            document = Jsoup.connect("https://news.tut.by/geonews/minsk/").get();
        }
        catch (Throwable throwable){
            return;
        }
        Elements elements = document.getElementsByAttributeValue("class","news-entry big annoticed time ni");
        elements.forEach(element -> {
            Element element1 = element.child(0);
            Element element2 = element.child(1).child(0).child(0);
            Element element3 = element.child(1).child(0).child(2);
            String url = element1.attr("href");
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
    public void getArticleEconomic() throws IOException {
        this.listArticles.clear();
        Document document;
        try {
            document = Jsoup.connect("https://news.tut.by/economics/").get();
        }
        catch (Throwable throwable){
            return;
        }
        Elements elements = document.getElementsByAttributeValue("class","news-entry big annoticed time ni");
        elements.forEach(element -> {
            Element element1 = element.child(0);
            Element element2 = element.child(1).child(0).child(0);
            Element element3 = element.child(1).child(0).child(2);
            String url = element1.attr("href");
            String title = element2.text();
            String text = element3.text();
            Article article = new Article(url,title,text,Type.Economic,Localization.Belarus);

            listArticles.addArticle(article);
        });
   }

    /**
     * is override function of get culture news
     */
    @Override
    public void getArticleCulture() throws IOException {
        this.listArticles.clear();
        Document document;
        try {
            document = Jsoup.connect("https://news.tut.by/society/").get();
        }
        catch (Throwable throwable){
            return;
        }
        Elements elements = document.getElementsByAttributeValue("class","news-entry big annoticed time ni");
        elements.forEach(element -> {
            Element element1 = element.child(0);
            Element element2 = element.child(1).child(0).child(0);
            Element element3 = element.child(1).child(0).child(2);
            String url = element1.attr("href");
            String title = element2.text();
            String text = element3.text();
            Article article = new Article(url,title,text,Type.Culture,Localization.Belarus);
            listArticles.addArticle(article);
        });
    }

    /**
     * is override function of get sport news
     */
    @Override
    public void getArticleSport() throws IOException {
        this.listArticles.clear();
        Document document;
        try {
            document = Jsoup.connect("https://sport.tut.by/rubric/football/").get();
        }
        catch (Throwable throwable){
            return;
        }
        Elements elements = document.getElementsByAttributeValue("class","news-entry big annoticed time ni");
        elements.forEach(element -> {
            Element element1 = element.child(0);
            Element element2 = element.child(1).child(0).child(0);
            Element element3 = element.child(1).child(0).child(2);
            String url = element1.attr("href");
            String title = element2.text();
            String text = element3.text();
            //System.out.println(url);
            Article article = new Article(url,title,text,Type.Sport,Localization.Belarus);
            listArticles.addArticle(article);
        });

    }
}
