import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;

import java.net.URL;

import java.util.ResourceBundle;

/**
 * this class for work with setting window
 */
public class ControllerSetting implements Initializable {

    SettingWindow settingWindow = new SettingWindow();
    Observer observer;


    @FXML
    ChoiceBox  styleChoiceBox;
    @FXML
    ChoiceBox  locationChoiceBox;
    @FXML
    AnchorPane anchorPane;
    @FXML
    AnchorPane anchorPane1;
    @FXML
    CheckBox tutby;
    @FXML
    CheckBox bbcru;


    /**
     * this default constructor for ControllerSetting class
     */
    public ControllerSetting(){
        observer = new Observer("preSetting");
        observer.setStatus(5);
    }


    /**
     * this start method for ControllerSetting class
     * @throws Exception
     */
    public void start() throws Exception {
        this.settingWindow.start();
    }


    /**
     * this initialize method for Observer in this class
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.bbcru.setSelected(this.settingWindow.getBbc_ru());
        this.tutby.setSelected(this.settingWindow.getTut_by());
        System.out.println(this.settingWindow.getBbc_ru());
        System.out.println(this.settingWindow.getTut_by());



        styleChoiceBox.getItems().add("белый");
        styleChoiceBox.getItems().add("темный");
        styleChoiceBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if(styleChoiceBox.getItems().get((Integer) newValue)=="белый") {
                    anchorPane.setStyle("-fx-background-color: white;");
                    anchorPane1.setStyle("-fx-background-color: white;");
                    observer.notifyAllObservers(3);



                }
                else{
                    anchorPane.setStyle("-fx-background-color: blue;");
                    anchorPane1.setStyle("-fx-background-color: blue;");
                    observer.notifyAllObservers(3);

                }
            }
        });
        locationChoiceBox.getItems().add("Беларусь");
        locationChoiceBox.getItems().add("Мир");
    }

    /**
     * this method notify all Observers about press to button tut by
     */
    @FXML
    public void pressTut_by(){
        observer.notifyAllObservers(1);
        settingWindow.change_tut_by();

    }

    /**
     * this method notify all Observers about press to button bbc ru
     */
    @FXML
    public void pressBbc_ru(){
        observer.notifyAllObservers(2);
        settingWindow.change_bbc_ru();

    }

    /**
     * this method notify all Observers about press to button tut by
     */
    @FXML
    public void pressAp_pro(){
        observer.notifyAllObservers(4);
        settingWindow.change_ap_pro();

    }

}
