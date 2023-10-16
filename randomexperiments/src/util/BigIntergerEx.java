package util;

import java.math.BigInteger;

public class BigIntergerEx {
    public static void main(String[] args) {
        String inputText1="56457678667878878777887987";
        BigInteger biggie1=new BigInteger(inputText1);
        String inputText2="762367237623";
        BigInteger biggie2=new BigInteger(inputText2);
        BigInteger result =biggie1.add(biggie2);
        System.out.println(result);
        String resultText=result.toString();
    }

}
