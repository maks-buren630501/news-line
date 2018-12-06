import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {
    public static void main (String[] args) throws IOException {
        Application.launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        ControllerMain controllerMain = new ControllerMain();

        controllerMain.start();






    }
}
