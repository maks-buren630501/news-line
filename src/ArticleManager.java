import java.io.IOException;


/**
 * is the main class for parsing site
 */
public class ArticleManager {
   protected ListArticles listArticles = new ListArticles();

    /**
     * is method for parsing politic news
     * @throws IOException
     */
   public void getArticlePolitic()throws IOException {

   }
    /**
     * is method for parsing economic news
     * @throws IOException
     */
    public void getArticleEconomic()throws IOException {

    }
    /**
     * is method for parsing culture news
     * @throws IOException
     */
    public void getArticleCulture()throws IOException {

    }
    /**
     * is method for parsing sport news
     * @throws IOException
     */
    public void getArticleSport()throws IOException {

    }

    /**
     * is function for get number of articles in list
     * @return
     */
    public int getNumberOfArticles(){
       return this.listArticles.getNumberOfArticles();
    }

    /**
     * is function for get article from list by index
     * @param index index of article
     * @return object of class Article from list
     */
    public Article getArticle(int index){
       return this.listArticles.getArticle(index);
    }


}
