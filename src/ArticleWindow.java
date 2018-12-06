import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class ArticleWindow {
    Button button = new Button();
    TextArea textArea = new TextArea();
    VBox vBox = new VBox();
    String url;
    Group group = new Group();

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

    public Group getErrorGroup(){
        this.url = "404";
        this.button.setMaxSize(600,200);
        textArea.setWrapText(true);
        textArea.setEditable(false);

        this.button.setText("Ошибка 404");

        this.textArea.setText("Проверте подключение к интернету");
        this.vBox.getChildren().addAll(this.button,this.textArea);
        this.group.getChildren().addAll(this.vBox);
        return this.group;

    }

}
