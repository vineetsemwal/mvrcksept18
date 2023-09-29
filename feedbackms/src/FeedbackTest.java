// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FeedbackTest {
    public static void main(String[] args) {
        FeedbackTest test = new FeedbackTest();
        test.runApp();

    }

    void runApp() {
        FeedbackApp feedbackApp = new FeedbackApp();
        Customer customer1 = feedbackApp.register2("archana");
        int customer1Id = customer1.id;
        Customer customer2 = feedbackApp.register2("anjali");
        Feedback feedback1 = feedbackApp.addFeedback2("very good", customer1);
        Feedback feedback2 = feedbackApp.addFeedback2("average", customer1);
        Feedback feedback3 = feedbackApp.addFeedback2("poor", customer2);
        Feedback customer1Feedbacks[] = feedbackApp.findFeedbacksByCustomerId(customer1Id);
        for (int i = 0; i < customer1Feedbacks.length; i++) {
            Feedback iterated = customer1Feedbacks[i];
            if(iterated!=null) {
                display(iterated);
            }
        }

    }

    void display(Feedback feedback) {
        System.out.println(feedback.id + "-" + feedback.description + "-cid" + feedback.customer.id + "-cname=" + feedback.customer.name);
    }


}