public class FeedbackApp {
    Feedback feedbackStore[]=new Feedback[10];
    Customer customerStore[]=new Customer[10];
    int nextCustomerIndex, nextFeedbackIndex;

    int generatedCustomerId;
    int generateCustomerId(){
        return ++generatedCustomerId;
    }

    int generatedFeedbackId;

    int generateFeedbackId(){
    return ++generatedFeedbackId;
    }

    void register1(Customer customer){
        customerStore[nextCustomerIndex]=customer;
        nextCustomerIndex++;
    }


    Customer register2(String customerName){
        int newId= generateCustomerId();
        Customer customer=new Customer(newId,customerName);
        customer.name=customerName;
        register1(customer);
        return customer;
    }

    void addFeedback1(Feedback feedback){
        feedbackStore[nextFeedbackIndex]=feedback;
        nextFeedbackIndex++;
    }

    Feedback addFeedback2(String description, Customer customer){
        int newId=generateFeedbackId();
        Feedback feedback=new Feedback(newId,description,customer);
        addFeedback1(feedback);
        return feedback;
    }

    Feedback[] findFeedbacksByCustomerId(int customerId){
        Feedback desired[]=new Feedback[nextFeedbackIndex];
        int index=0;
        for (int i = 0; i< nextFeedbackIndex; i++){
            Feedback iterated=feedbackStore[i];
            System.out.println("iterated="+iterated);
            Customer iteratedFeedbackCustomer=iterated.customer;
            if(customerId==iteratedFeedbackCustomer.id){
                desired[index]=iterated;
                index++;
            }
        }
        return desired;
    }





}
