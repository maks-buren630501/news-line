import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

enum Localization{
    Belarus,
    World
}

enum Style{
    White,
    Black
}


/**
 * this class for storage status of setting window
 */
public class SettingWindow {
    private Localization localization = Localization.Belarus;
    private Style style = Style.White;
    private Boolean notifications = false;
    private Boolean tut_by = false;
    private Boolean bbc_ru = false;
    private Boolean ap_pro = false;

    /**
     * this start method for setting window
     * @throws Exception
     */
    public void  start() throws Exception{
        Stage setting = new Stage();
        Group group = new Group();
        Parent content = FXMLLoader.load(getClass().getResource("SettingWindow.fxml"));
        group.getChildren().addAll(content);
        Scene scene = new Scene(group,500,400);
        setting.setTitle("Setting");
        setting.setScene(scene);
        setting.show();
    }


    /**
     * this setter for localization
     * @param localization of displays news
     */
    public void setLocalization(int localization){
        switch (localization) {
            case 1:this.localization = Localization.Belarus; break;
            case 2:this.localization = Localization.World; break;
        }
    }
    /**
     * this setter for style
     * @param style of background news
     */
    public void setStyle(int style){
        switch (style) {
            case 1:this.style = Style.Black; break;
            case 2:this.style = Style.White; break;
        }
    }

    /**
     * this method change notify to opposite
     */
    public void change_notify(){
        if(this.notifications == true) this.notifications = false;
        else this.notifications = true;
    }
    /**
     * this method change tut by status to opposite
     */
    public void change_tut_by(){
        if(this.tut_by == true) this.tut_by = false;
        else this.tut_by = true;
    }
    /**
     * this method change bbc ru status to opposite
     */
    public void change_bbc_ru(){
        if(this.bbc_ru == true) this.bbc_ru = false;
        else this.bbc_ru = true;
    }
    /**
     * this method change onliner status to opposite
     */
    public void change_ap_pro(){
        if(this.ap_pro == true) this.ap_pro = false;
        else this.ap_pro = true;
    }

    /**
     * this method return status of tut by
     * @return status of tut by
     */
    public Boolean getTut_by(){
        return this.tut_by;
    }
    /**
     * this method return status of bbc ru
     * @return status of bbc ru
     */
    public Boolean getBbc_ru(){
        return this.bbc_ru;
    }

}
