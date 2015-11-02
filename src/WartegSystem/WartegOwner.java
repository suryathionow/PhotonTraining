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
            System.out.println("Owner: Total price is "+ totalCostumerPrice +". Your change is Rp. "+ changeMoney +". Thank you!");
        }else if(costumerMoney < totalCostumerPrice){
            this.amountDue = costumerMoney - totalCostumerPrice;
            System.out.println("Owner: Total price is "+ totalCostumerPrice +". You still have amount due Rp. " + Math.abs(amountDue) +".");
        }else{
            System.out.println("Owner: Total price is "+ totalCostumerPrice +". Thank you!");
        }

    }

}