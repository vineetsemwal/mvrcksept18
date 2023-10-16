package innerdemo;

public class AnonymousDemo {
    public static void main(String[] args) {
        ISubmitListener listener=new ISubmitListener() {
            public  String getClassName(){
                return  "anonymous";
            }
            @Override
            public void onSubmit() {
                System.out.println("inside submit");
            }
        };
        /*
        Form form=new Form();
        form.add(new ISubmitListener() {
            @Override
            public void onSubmit() {
                System.out.println("form getting submitted");
            }
        });
        form.submit();
        */

    }
}
