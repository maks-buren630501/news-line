import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ArticleManagerTutby extends ArticleManager{

    @Override
    public void getArticlePolitic() throws IOException {
        this.listArticles.clear();
        Document document = Jsoup.connect("https://news.tut.by/geonews/minsk/").get();
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

    @Override
    public void getArticleEconomic() throws IOException {
        this.listArticles.clear();
        Document document = Jsoup.connect("https://news.tut.by/economics/").get();
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

    @Override
    public void getArticleCulture() throws IOException {
        this.listArticles.clear();
        Document document = Jsoup.connect("https://news.tut.by/society/").get();
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

    @Override
    public void getArticleSport() throws IOException {
        this.listArticles.clear();
        Document document = Jsoup.connect("https://sport.tut.by/rubric/football/").get();
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
