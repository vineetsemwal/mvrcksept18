package innerdemo;

public class Form {

    private ISubmitListener submitListener;
    public void add(ISubmitListener listener){
        this.submitListener=listener;
    }

    public  void submit(){
        submitListener.onSubmit();
    }

}
