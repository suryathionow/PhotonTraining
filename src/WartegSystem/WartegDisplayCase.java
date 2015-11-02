package WartegSystem;

/**
 * Created by STW on 11/1/2015.
 */
public class WartegDisplayCase{

    String menu1;
    String menu2;
    String menu3;
    boolean emptyDisplayCase;

    public WartegDisplayCase(String menu1, String menu2, String menu3){
        System.out.println("Today menu are "+menu1+", "+menu2+", and "+ menu3+".");
        this.menu1 = menu1;
        this.menu2 = menu2;
        this.menu3 = menu3;
    }

    public void wartegDisplayCaseEmpty(){
        System.out.println("You can choose your foods!");
        this.emptyDisplayCase = false;
    }

    public void wartegDisplayCaseFull() {
        System.out.println("Just wait a minute! The foods ar still on the process!");
        this.emptyDisplayCase = true;
    }

}
