package WartegSystem;

/**
 * Created by STW on 11/1/2015.
 */
public class WartegTable {

    String tableNumber;
    boolean emptyTable;

    public WartegTable(String tableNumber){
        this.tableNumber = tableNumber;
    }

    public void wartegTableFull(){
        System.out.println("Sorry, currently our tables are full! :<");
        this.emptyTable = false;
    }

    public void wartegTableEmpty(){
        System.out.println("Table number "+tableNumber+" is available! :>");
        this.emptyTable = true;
    }

}
