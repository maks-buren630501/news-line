import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;


/**
 * is class for observing article in main window
 */
public class ArticleWindow {
    Button button = new Button();
    TextArea textArea = new TextArea();
    VBox vBox = new VBox();
    String url;
    Group group = new Group();

    /**
     * this function for create group with article interface
     * @param title is title of article
     * @param text is main text of article
     * @param url is url of article
     * @return group with one button and one text area for observer and work with title
     */
    public Group getGroup(String title, String text, String url){
        this.url = url;
        this.button.setMaxSize(600,200);
        textArea.setWrapText(true);
        textArea.setEditable(false);

        this.button.setText(title);
        this.button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                NewsWindow newsWindow = new NewsWindow();
                newsWindow.setUrl(url);
                try {
                    newsWindow.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        this.textArea.setText(text);
        this.vBox.getChildren().addAll(this.button,this.textArea);
        this.group.getChildren().addAll(this.vBox);
        return this.group;
    }

    /**
     * this function for create error window
     * @return group with special button and text area with "error" text
     */
    public Group getErrorGroup(){
        this.url = "404";
        this.button.setMaxSize(600,200);
        textArea.setWrapText(true);
        textArea.setEditable(false);

        this.button.setText("Ошибка 404");

        this.textArea.setText("Проверте подключение к интернету и включен ли хоть один сайт");
        this.vBox.getChildren().addAll(this.button,this.textArea);
        this.group.getChildren().addAll(this.vBox);
        return this.group;

    }

}
