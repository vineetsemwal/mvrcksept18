package localeResources;

import java.util.Locale;

public class LocaleEx1 {
    public static void main(String[] args) {
        Locale locale=Locale.getDefault();
        System.out.println("display name="+locale.getDisplayName());
        System.out.println("country="+locale.getCountry());
        System.out.println("language="+locale.getLanguage());
        System.out.println(locale);

        Locale tamilIndiaLocale=new Locale("tamil","in");
        System.out.println("language="+tamilIndiaLocale.getLanguage());
        System.out.println("country="+tamilIndiaLocale.getCountry());
        System.out.println(tamilIndiaLocale);
    }
}
