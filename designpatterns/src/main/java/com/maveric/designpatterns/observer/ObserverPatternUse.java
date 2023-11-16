package com.maveric.designpatterns.observer;

public class ObserverPatternUse {
    public static void main(String[] args) {
        IStockObservable observable=new StockObservable();
        IStockObserver observer1=new StockComponent("window1",observable);
        IStockObserver observer2=new StockComponent("window2",observable);
        observable.send(new Stock("samsung",1000));
        observable.send(new Stock("samsung",2000));
    }
}
