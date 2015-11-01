package WartegSystem;

/**
 * Created by STW on 11/1/2015.
 */
public class WartegDisplayCase{

    boolean emptyDisplayCase;

    public void wartegDisplayCaseEmpty(){
        System.out.println("You can choose your foods!");
        this.emptyDisplayCase = false;
    }

    public void wartegDisplayCaseFull() {
        System.out.println("Just wait a minute! The foods ar still on the process!");
        this.emptyDisplayCase = true;
    }

}
