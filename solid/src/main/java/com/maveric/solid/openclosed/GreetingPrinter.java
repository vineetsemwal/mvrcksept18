package com.maveric.solid.openclosed;

import com.maveric.solid.openclosed.Greeting;

public class GreetingPrinter {
    private Greeting greeting;
    public GreetingPrinter(Greeting greeting){
        this.greeting=greeting;
    }

    public void print(){
        greeting.greet();
    }
}
