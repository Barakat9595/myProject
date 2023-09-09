class deposit_rollback implements Rollback{
     public double amount;
    public deposit_rollback(double amount) {
        this.amount = amount;
    }
     @Override
     public double cancelTran(account acc)
     {
         double balance = acc.getBalance();
         balance -= amount;
         acc.setBalance(balance);
         return balance;
     }
       
 }