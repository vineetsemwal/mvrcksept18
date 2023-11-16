package com.maveric.designpatterns.observer;

public class StockComponent implements IStockObserver{
    private Stock stock;

    private IStockObservable observable;
    private String componentName;

    public StockComponent(String componentName,IStockObservable observable){
        this.observable=observable;
        this.componentName=componentName;
        observable.subscribe(this);
    }

    public void display() {
        if(stock==null){
            System.out.println("no stock info");
        }
        System.out.println(componentName+"-stock ="+stock.getName()+"-"+stock.getPrice());
    }


    public void update(Stock stock) {
        this.stock=stock;
      display();
    }
}
