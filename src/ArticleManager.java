import java.io.IOException;

public class ArticleManager {
   protected ListArticles listArticles = new ListArticles();

   public void getArticlePolitic()throws IOException {

   }

    public void getArticleEconomic()throws IOException {

    }

    public void getArticleCulture()throws IOException {

    }

    public void getArticleSport()throws IOException {

    }

    public int getNumberOfArticles(){
       return this.listArticles.getNumberOfArticles();
    }

    public Article getArticle(int index){
       return this.listArticles.getArticle(index);
    }


}
