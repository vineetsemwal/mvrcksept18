package wrapperdemos;

public class StringDemo {
    public static void main(String[] args) {
        String city = "bangalorebangalore";
        char ch = city.charAt(3);
        //byte[]byteArrayRepres=city.getBytes();
        boolean endCheck = city.endsWith("ore");
        System.out.println("check ends at ore=" + endCheck);
        boolean prefixCheck = city.startsWith("ban");
        System.out.println("prefix check=" + prefixCheck);
        int galIndex = city.indexOf("gal");
        System.out.println("gal index=" + galIndex);
        //indexof(*) returns index of position of first time substring encountered
        //lastIndexof(*) returns index of position of last time substring encountered
        String substr1 = city.substring(3);//sustring starting at index 3
        System.out.println("substring starts at index 3=" + substr1);
        //substring starting at index 3 and ending at index 7(char at index 7 excluded)
        //String substr2=city.substring(3,7);
        String replacedResult = city.replace('a', 'c');
        System.out.println("replace all a=" + replacedResult);
        int aIndex = city.indexOf('a');
        //replacing only first occurence
        StringBuilder stringBuilder = new StringBuilder(city);
        stringBuilder.setCharAt(aIndex, 'c');
        String resultWithFirstAChanged = stringBuilder.toString();
        System.out.println("replace first occurence of a="+resultWithFirstAChanged);
        //replace only first occurence with replaceFirst(*) method
        String replaceWithFirstAChanged2=city.replaceFirst("a","c");
        System.out.println("replace first occurence of a="+replaceWithFirstAChanged2);

    }
}
