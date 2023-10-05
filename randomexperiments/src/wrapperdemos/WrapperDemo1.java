package wrapperdemos;

public class WrapperDemo1 {
    public static void main(String[] args) {
        WrapperDemo1 demo=new WrapperDemo1();
        int i1=2;
        Integer num1=i1;//autoboxing

        Integer num2=Integer.valueOf(10);
        Integer customerId= demo.getCustomerIdByName("santosh");
        if(customerId==null){
            System.out.println("customer not found");
        }else{
            System.out.println("custo,er found with id="+customerId);
        }
    }

    Integer getCustomerIdByName(String name){
        return null;
    }
}
