import java.util.ArrayList;
import java.util.List;


/**
 * this Observer class for interaction classes
 */
public class Observer {
    static List<Observer> observers = new ArrayList<>();
    static int id;
    String name;
    int status;

    /**
     * this constructor with one par
     * @param name name of observer
     */
    public Observer(String name){
        this.name = name;
        observers.add(this);

    }

    /**
     * this setter for status
     * @param status of observer
     */
    public void setStatus(int status){
        this.status = status;

    }

    /**
     * his setter for id
     * @param status is id
     */
    public void setId(int status){
        this.id = status;

    }

    /**
     * this is getter for id
     * @return id of observer
     */
    public int getId(){
        return id;
    }

    /**
     * this func notify all observers about changing
     */
    public void notifyAllObservers(){
        for(Observer observer : observers){
             observer.update();
        }
    }

    /**
     * this func notify observers by id
     * @param id id of notified observer
     */
    public void notifyAllObservers(int id){
        this.setId(id);
        for(Observer observer : observers){
            observer.update();
        }
    }

    /**
     * is abstract method for update in observer
     */
    void update(){

    }
}
