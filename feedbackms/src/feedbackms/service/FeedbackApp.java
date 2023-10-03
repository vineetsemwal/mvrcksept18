package feedbackms.service;

import feedbackms.domain.Customer;
import feedbackms.domain.Feedback;

public class FeedbackApp {
    private Feedback feedbackStore[] = new Feedback[10];
    private Customer customerStore[] = new Customer[10];
    private int nextCustomerIndex, nextFeedbackIndex;
    private int generatedFeedbackId;
    private int generatedCustomerId;

    private int generateCustomerId() {
        return ++generatedCustomerId;
    }

    private int generateFeedbackId() {
        return ++generatedFeedbackId;
    }

    public void register1(final Customer customer) {
        customerStore[nextCustomerIndex] = customer;
        nextCustomerIndex++;
    }

    public Customer register2(final String customerName) {
        int newId = generateCustomerId();
        Customer customer = new Customer(newId, customerName);
        register1(customer);
        return customer;
    }

    public void addFeedback1(final Feedback feedback) {
        feedbackStore[nextFeedbackIndex] = feedback;
        nextFeedbackIndex++;
    }

    public Feedback addFeedback2(final String description,final Customer customer) {
        int newId = generateFeedbackId();
        Feedback feedback = new Feedback(newId, description, customer);
        addFeedback1(feedback);
        return feedback;
    }

    public Feedback[] findFeedbacksByCustomerId(final int customerId) {
        Feedback desired[] = new Feedback[nextFeedbackIndex];
        int index = 0;
        for (int i = 0; i < nextFeedbackIndex; i++) {
            Feedback iterated = feedbackStore[i];
            System.out.println("iterated=" + iterated);
            Customer iteratedFeedbackCustomer = iterated.getCustomer();
            if (customerId == iteratedFeedbackCustomer.getId()) {
                desired[index] = iterated;
                index++;
            }
        }
        return desired;
    }


}
