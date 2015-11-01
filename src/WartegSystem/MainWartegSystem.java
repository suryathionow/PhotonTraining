package WartegSystem;

/**
 * Created by STW on 11/1/2015.
 */
public class MainWartegSystem {

    public static void main(String[] args){
        Warteg photonTraining = new Warteg("Photon");
        WartegTable table = new WartegTable("1");
        WartegFood foodFriedChicken = new WartegFood("Ayam Goreng", 7000);
        WartegFood foodRice = new WartegFood("Nasi", 2000);

        photonTraining.wartegClose();
        table.wartegTableFull();

        if (photonTraining.ready == false){
            System.out.println("Warteg "+ photonTraining.wartegName +" currently closed!");
        }

        int jumlah = foodFriedChicken.foodPrice + foodRice.foodPrice;

        System.out.println("Total semua makanan adalah Rp "+ jumlah);

    }

}
