package com.maveric.designpatterns.observer;

import java.util.HashSet;
import java.util.Set;

public interface IStockObservable {

   void subscribe(IStockObserver observer);
    void send(Stock stock);
}
