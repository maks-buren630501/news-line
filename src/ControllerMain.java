import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

/**
 * this class for work with main window
 */
public class ControllerMain implements Initializable{

    private MainWindow mainWindow;
    private ControllerSetting controllerSetting;
    private ArticleManagerTutby articleManagerTutby;
    private ArticleManagerBBC articleManagerBBC;
    private ArticleManagerOnliner articleManagerOnliner;
    private Boolean tutBy;
    private Boolean bbcRu;
    private Boolean onliner;

    @FXML
    VBox vbox;

    @FXML
    HBox hbox;

    @FXML
    ListView centerListView;

    /**
     * is default constructor for ControllerMain
     */
    public ControllerMain(){
        mainWindow = new MainWindow();
        controllerSetting = new ControllerSetting();
        articleManagerTutby = new ArticleManagerTutby();
        articleManagerBBC = new ArticleManagerBBC();
        articleManagerOnliner = new ArticleManagerOnliner();
        tutBy = false;
        bbcRu = false;
        onliner = false;
    }

    Observer observer = new Observer("Main") {
        /**
         * override method of Observer class with new reaction for notify observers
         */
        @Override
        public void update(){
            if(observer.status==10)
            {
            if(observer.getId()==3){
                changeBackgroundColor();
                observer.setId(0);

            }
            else {}
            if(observer.getId()==1) {
                changeTut();
                observer.setId(0);
            }
            if(observer.getId()==2) {
                changeBbcRu();
                observer.setId(0);
            }
                if(observer.getId()==4) {
                    changeOnliner();
                    observer.setId(0);
                }
        }
        }
    };

    /**
     * this override method for observer, than changes status
     * @param location
     * @param resources
     */
     @Override
    public void initialize(URL location, ResourceBundle resources) {
         this.observer.setStatus(10);
    }

    /**
     * this method displays articles an main window
     * @param type type of displays news
     * @throws IOException
     */
    public void showArticle(Type type) throws IOException {

         this.centerListView.getSelectionModel().clearSelection();
         if(this.onliner==false&&this.bbcRu==false&&this.tutBy==false){

             ObservableList articles = FXCollections.observableArrayList();
             ArticleWindow articleWindow = new ArticleWindow();
             Group group = articleWindow.getErrorGroup();
             articles.addAll(group);
             this.centerListView.setItems(articles);
             return;

         }
         int n = 0;
         int m = 0;
         int d = 0;
         int s = 0;

         switch (type){
             case Politic:{
                 if(this.tutBy){this.articleManagerTutby.getArticlePolitic();}else{}
                 if(this.bbcRu){this.articleManagerBBC.getArticlePolitic();}else{}
                 if(this.onliner){this.articleManagerOnliner.getArticlePolitic();}else{}

             }break;
             case Economic:{
                 if(this.tutBy){this.articleManagerTutby.getArticleEconomic();}else{}
                 if(this.bbcRu){this.articleManagerBBC.getArticleEconomic();}else{}
                 if(this.onliner){this.articleManagerOnliner.getArticleEconomic();}else{}

             }break;
             case Sport:{
                 if(this.tutBy){this.articleManagerTutby.getArticleSport();}else{}
                 if(this.bbcRu){this.articleManagerBBC.getArticleSport();}else{}
                 if(this.onliner){this.articleManagerOnliner.getArticleSport();}else{}

             }break;
             case Culture:{
                 if(this.tutBy){this.articleManagerTutby.getArticleCulture();}else{}
                 if(this.bbcRu){this.articleManagerBBC.getArticleCulture();}else{}
                 if(this.onliner){this.articleManagerOnliner.getArticleCulture();}else{}

             }break;
         }

         ObservableList articles = FXCollections.observableArrayList();
         if(this.bbcRu) n+=this.articleManagerBBC.getNumberOfArticles();else{}
         if(this.tutBy) m+=this.articleManagerTutby.getNumberOfArticles();else{}
        if(this.onliner) d+=this.articleManagerOnliner.getNumberOfArticles();else{}
         if(m<n){
             if(m<d) s = m;
             else {
                 if(d<m) {
                     s = d;
                 }
             }
         }
         else {
             if(n<d){
             s = n;
             }
             else {
                 s = d;
             }
         }

         if(s==0) {
             if(n!=0) s=n;
             if(m!=0) s=m;
             if(d!=0) s=d;
         }
        if(s==0){
            ObservableList articles2 = FXCollections.observableArrayList();
            ArticleWindow articleWindow = new ArticleWindow();
            Group group = articleWindow.getErrorGroup();
            articles.addAll(group);
            this.centerListView.setItems(articles);
            return;

        }
         for(int i =0;i<s;i++){
             ArticleWindow articleWindow1 = new ArticleWindow();
             ArticleWindow articleWindow2 = new ArticleWindow();
             ArticleWindow articleWindow3 = new ArticleWindow();
             Group group;
             if(this.tutBy) {
                Article article1 = this.articleManagerTutby.getArticle(i);
                Group group1 = articleWindow1.getGroup(article1.getName(),article1.getText(),article1.getUrl());
                 articles.addAll(group1);
             }else {}
             if(this.bbcRu) {
                 Article article2 = this.articleManagerBBC.getArticle(i);
                 Group group2 = articleWindow2.getGroup(article2.getName(),article2.getText(),article2.getUrl());
                 articles.addAll(group2);
             }else {}
             if(this.onliner) {
                 Article article3 = this.articleManagerOnliner.getArticle(i);
                 Group group3 = articleWindow3.getGroup(article3.getName(),article3.getText(),article3.getUrl());
                 articles.addAll(group3);
             }else {}

         }
         this.centerListView.setItems(articles);
    }


    /**
     * this start method for main window
     * @throws Exception
     */
    public void start() throws Exception {
        mainWindow.start();
    }


    /**
     * this method displays setting window
     * @throws Exception
     */
    @FXML
    public void showSettingWindow() throws Exception {

        this.controllerSetting.start();
    }

    /**
     * this method change background color
     */
    public void changeBackgroundColor() {
        StyleMain styleMain = mainWindow.getStyleMain();

        if (styleMain == StyleMain.White) {
            mainWindow.setStyleMain(StyleMain.Blue);
            vbox.setStyle("-fx-background-color: blue;");
            hbox.setStyle("-fx-background-color: blue;");
        } else {
            mainWindow.setStyleMain(StyleMain.White);
            vbox.setStyle("-fx-background-color: white;");
            hbox.setStyle("-fx-background-color: white;");
        }
    }

    /**
     * this method set news range to today
     */
    @FXML
    public void setDayToday(){
       mainWindow.setDay(1);
    }
    /**
     * this method set news range to week
     */
    @FXML
    public void setDayWeek(){
        mainWindow.setDay(2);
    }
    /**
     * this method set news range to twitter
     */
    @FXML
    public void setDayTwitter(){
        mainWindow.setDay(3);
    }
    /**
     * this method set news range to today
     */
    @FXML
    public void setTypePolitic() throws IOException {
        mainWindow.setType(1);
        this.showArticle(Type.Politic);

    }
    /**
     * this method set type to sport
     */
    @FXML
    public void setTypeSport() throws IOException {
        mainWindow.setType(2);
        this.showArticle(Type.Sport);

    }
    /**
     * this method set type to economic
     */
    @FXML
    public void setTypeEconomic() throws IOException {
        mainWindow.setType(3);
        this.showArticle(Type.Economic);
     }
    /**
     * this method set type to culture
     */
    @FXML
    public void setTypeCulture() throws IOException {
        mainWindow.setType(4);
        this.showArticle(Type.Culture);
    }
    /**
     * this method change tut by to opposite state
     */
    public void changeTut(){
        if(this.tutBy == true) this.tutBy = false;
        else this.tutBy = true;
    }
    /**
     * this method change bbc ru to opposite state
     */
    public void changeBbcRu(){
        if(this.bbcRu == true) this.bbcRu = false;
        else this.bbcRu = true;
     }
    /**
     * this method change Onliner to opposite state
     */
    public void changeOnliner(){
        if(this.onliner == true) this.onliner = false;
        else this.onliner = true;
    }



}
