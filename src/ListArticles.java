import java.util.ArrayList;
import java.util.List;

public class ListArticles {

    List<Article> articleList = new ArrayList<>();

    public void addArticle(Article article){
        articleList.add(article);
    }

    public Article getArticle(int index){
        return articleList.get(index);
    }

    public List<Article> getArticleList(){
        return this.articleList;
    }

    public int getNumberOfArticles(){
        return this.articleList.size();
    }

    public void clear(){
        this.articleList.clear();
    }


}
