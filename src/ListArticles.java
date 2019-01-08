import java.util.ArrayList;
import java.util.List;

/**
 * this class for storage articles
 */
public class ListArticles {

    List<Article> articleList = new ArrayList<>();

    /**
     * this method add new article to list
     * @param article added article
     */
    public void addArticle(Article article){
        articleList.add(article);
    }

    /**
     * this method return article from index
     * @param index index of article
     * @return article from index
     */
    public Article getArticle(int index){
        return articleList.get(index);
    }

    /**
     * this method return all articles in list
     * @return list of articles
     */
    public List<Article> getArticleList(){
        return this.articleList;
    }

    /**
     * this method return int number of articles in list
     * @return
     */
    public int getNumberOfArticles(){
        return this.articleList.size();
    }

    /**
     * this method clear list
     */
    public void clear(){
        this.articleList.clear();
    }


}
