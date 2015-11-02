package WartegSystem;

/**
 * Created by STW on 11/1/2015.
 */
public class MainWartegSystem {

    public static void main(String[] args){
        Warteg photonTraining = new Warteg("Testing");

        photonTraining.wartegOpen();

        WartegTable table = new WartegTable("1");

        table.wartegTableEmpty();

        WartegFood foodFriedChicken = new WartegFood("Ayam Goreng", 7000);
        WartegFood foodRice = new WartegFood("Nasi", 2000);
        WartegFood foodTofu = new WartegFood("Tahu", 1000);

        WartegDisplayCase displayCaseMenu = new WartegDisplayCase(foodFriedChicken.foodName, foodRice.foodName, foodTofu.foodName);

        //WartegCostumer Andi = new WartegCostumer(foodFriedChicken.foodName, foodRice.foodName, foodTofu.foodName, 5000);
        //WartegCostumer Andi = new WartegCostumer(foodFriedChicken.foodName, foodRice.foodName, foodTofu.foodName, 10000);
        WartegCostumer Andi = new WartegCostumer(foodFriedChicken.foodName, foodRice.foodName, foodTofu.foodName, 15000);

        int andiTotal = foodFriedChicken.foodPrice + foodRice.foodPrice + foodTofu.foodPrice;

        WartegOwner andiPayment = new WartegOwner(Andi.costumerMoney, andiTotal);
    }

}
