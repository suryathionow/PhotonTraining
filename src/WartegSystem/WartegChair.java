package WartegSystem;

/**
 * Created by STW on 11/1/2015.
 */
public class WartegChair {

    boolean emptyChair;

    public void wartegChairFull(){
        System.out.println("Sorry, currently our chairs are full! :<");
        this.emptyChair = false;
    }

    public void wartegChairEmpty(){
        System.out.println("You can sit on empty chair! :>");
        this.emptyChair = true;
    }
}
