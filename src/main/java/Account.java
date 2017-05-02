/**
 * Created by RobertoAngelPachecoR on 5/1/2017.
 */
public class Account {
   public Integer balance;

    public Account(Integer initialValue){
     balance = initialValue;
    }

    public void deposit(Integer dollars){
        balance = balance + dollars;
    }
}
