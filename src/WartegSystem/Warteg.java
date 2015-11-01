package WartegSystem;

/**
 * Created by STW on 11/1/2015.
 */
public class Warteg {

    String wartegName;
    boolean ready;

    public Warteg(String wartegName){
        this.wartegName = wartegName;
    }

    public void wartegOpen(){
        System.out.println("Warteg "+ wartegName +" is ready to serve you! :)");
        this.ready = true;
    }

    public void wartegClose(){
        System.out.println("Warteg "+ wartegName +" is not ready to serve you! :(");
        this.ready = false;
    }

}