import java.util.ArrayList;
import java.util.List;

public class Observer {
    static List<Observer> observers = new ArrayList<>();
    static int id;
    String name;
    int status;

    public Observer(String name){
        this.name = name;
        observers.add(this);

    }

    public void setStatus(int status){
        this.status = status;

    }

    public void setId(int status){
        this.id = status;

    }

    public int getId(){
        return id;
    }

    public void notifyAllObservers(){
        for(Observer observer : observers){
             observer.update();
        }
    }

    public void notifyAllObservers(int id){
        this.setId(id);
        for(Observer observer : observers){
            observer.update();
        }
    }

    void update(){

    }
}
