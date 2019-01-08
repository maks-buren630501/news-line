import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * this class for storage status of news window
 */
public class NewsWindow {

    private String url;


    /**
     * this start method for news window
     * @throws Exception
     */
    public void start() throws Exception {
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
        webEngine.load(url);

        Stage primaryStage = new Stage();

        System.out.println(url);

        Group group = new Group();
        group.getChildren().addAll(webView);
        Scene scene = new Scene(group, 800, 600);
        primaryStage.setTitle("news");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * this getter for url of news
     * @return url news
     */
    public String getUrl() {
        return url;
    }

    /**
     * this wetter for url of news
     * @param url url news
     */
    public void setUrl(String url) {
        this.url = url;
    }
}