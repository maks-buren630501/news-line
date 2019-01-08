
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

enum Day{
    Today,
    Week,
    Twitter
}

enum Type{
    Politic,
    Sport,
    Economic,
    Culture
}

enum StyleMain{
    White,
    Blue
}


/**
 * this class for storage status of main window
 */
public class MainWindow {
    private Day day = Day.Today;
    private Type type = Type.Politic;
    private StyleMain styleMain = StyleMain.White;

    /**
     * this start method for main window
     * @throws Exception
     */
    public void start() throws Exception {
        Stage primaryStage = new Stage();
        Parent content = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        Group group = new Group();
        group.getChildren().addAll(content);
        Scene scene = new Scene(group,800,600);
        primaryStage.setTitle("newsline");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * this method for set day
     * @param day index of setting day
     */
    public void setDay(int day){
        switch (day){
            case 1: this.day = Day.Today; break;
            case 2: this.day = Day.Week; break;
            case 3: this.day = Day.Twitter; break;
        }
    }
    /**
     * this method for set type
     * @param type index of setting day
     */
    public void setType(int type){
        switch (type){
            case 1: this.type = Type.Politic; break;
            case 2: this.type = Type.Sport; break;
            case 3: this.type = Type.Economic; break;
            case 4: this.type = Type.Culture; break;
        }
    }


    /**
     * this method return style of main window
     * @return style main window
     */
    public StyleMain getStyleMain() {
        return styleMain;
    }

    /**
     * this setter method for style
     * @param styleMain type of style
     */
    public void setStyleMain(StyleMain styleMain) {
        this.styleMain = styleMain;
    }
}
