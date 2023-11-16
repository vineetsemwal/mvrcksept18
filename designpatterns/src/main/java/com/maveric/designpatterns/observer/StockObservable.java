package com.maveric.designpatterns.observer;

import java.util.HashSet;
import java.util.Set;

public class StockObservable implements IStockObservable{
    private Set<IStockObserver> observers=new HashSet<>();

    @Override
    public void subscribe(IStockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void send(Stock stock) {
        for (IStockObserver observer:observers){
            observer.update(stock);
        }
    }
}
