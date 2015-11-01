package WartegSystem;

/**
 * Created by STW on 11/1/2015.
 */
public class WartegOwner {

    int changeMoney;
    int amountDue;

    public WartegOwner(int costumerMoney, int totalCostumerPrice) {
        if(costumerMoney > totalCostumerPrice){
            this.changeMoney = costumerMoney - totalCostumerPrice;
            System.out.println("Your change is Rp. "+ changeMoney +". Thank you!");
        }else if(costumerMoney < totalCostumerPrice){
            this.amountDue = costumerMoney - totalCostumerPrice;
            System.out.println("You still have amount due Rp. " + Math.abs(amountDue) +".");
        }else{
            System.out.println("Thank you!");
        }

    }

}