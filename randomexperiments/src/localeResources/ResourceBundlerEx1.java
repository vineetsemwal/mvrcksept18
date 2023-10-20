package localeResources;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundlerEx1 {
    public static void main(String[] args) {
        ResourceBundlerEx1 demo=new ResourceBundlerEx1();
        demo.displayGreetings(Locale.ITALIAN);
        demo.displayGreetings(Locale.getDefault());

    }
    void  displayGreetings(Locale locale){
        System.out.println("displaying for user with locale="+locale);
        ResourceBundle bundle=ResourceBundle.getBundle("localeResources.greeting",locale);
        String welcomeGreeting=bundle.getString("welcome");
        String departGreeting=bundle.getString("depart");
        System.out.println(welcomeGreeting);
        System.out.println(departGreeting);

    }

}
