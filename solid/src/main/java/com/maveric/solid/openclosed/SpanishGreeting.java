package com.maveric.solid.openclosed;

import com.maveric.solid.openclosed.Greeting;

public class SpanishGreeting implements Greeting {
    @Override
    public void greet() {
        System.out.println("Hola");
    }
}
