class Customer {
    long id;
    String name;
    double balance;

    Customer(long id, String name, double balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    Customer(){
      this(-1,"not init",-1);
    }

    void increaseBalanceBy(double amount) {
        this.balance = balance + amount;
    }
    void  changeNameToBlock(){
        name=name.toUpperCase();
    }

}
