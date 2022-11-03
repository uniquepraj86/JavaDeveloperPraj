package oops.encapsulation;

public class BankTransaction implements Bank{
    @Override
    public String withdrawMoney(Account account ,double withdrawAmount) {
        if (withdrawAmount> 0 && account.getTotalAmount() > withdrawAmount ){
            account.setTotalAmount(account.getTotalAmount() - withdrawAmount);
            return "Current Balance "+account.getTotalAmount();
        }else {
            return  "In Sufficient Balance";
        }
    }

    @Override
    public String depositMoney(Account account,double amount) {
        if (amount > 0) {
            account.setTotalAmount(account.getTotalAmount() + amount);
            return "Amount after deposit Rs."+account.getTotalAmount();
        }
        else
            return "Invalid amount";
    }

    @Override
    public void userDetails(User user) {

    }
}
