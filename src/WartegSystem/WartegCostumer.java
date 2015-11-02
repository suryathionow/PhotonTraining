package WartegSystem;

/**
 * Created by STW on 11/1/2015.
 */
public class WartegCostumer {

    int costumerMoney;
    int totalPrice;

    public WartegCostumer(String foodName, String foodName1, String foodName2, int costumerMoney){
        System.out.println("Customer: I just ate "+foodName+", "+foodName1+", and "+ foodName2+". (Give the payment Rp. "+costumerMoney+")");
        this.costumerMoney = costumerMoney;
    }
}
