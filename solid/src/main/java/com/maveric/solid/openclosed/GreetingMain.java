package com.maveric.solid.openclosed;

public class GreetingMain {
    public static void main(String[] args) {
        SpanishGreeting spanishGreeting=new SpanishGreeting();
        GreetingPrinter spanishPrinter=new GreetingPrinter(spanishGreeting);
        spanishPrinter.print();

        EnglishGreeting englishGreeting=new EnglishGreeting();
        GreetingPrinter englishPrinter=new GreetingPrinter(englishGreeting);
        englishPrinter.print();
    }
}
