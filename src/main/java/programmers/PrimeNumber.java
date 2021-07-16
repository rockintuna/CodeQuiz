package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

    public int solution(String numbers) {
        int count = 0;

        Character[] numbersCharArr = new Character[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            numbersCharArr[i] = numbers.charAt(i);
        }


        int cycle = 1;
        for (int i = 0; i < numbers.length(); i++) {
            List<Character> list = Arrays.asList(numbersCharArr);
            Character[] chars = new Character[numbers.length()];
            chars[0] = list.get(i);
            list.remove(i);

            while ( cycle < numbers.length() ) {
                //chars[cycle]
                cycle++;
            }
        }
        return count;
    }


    public int arrayToInt(Character[] chars) {
        String text = "";
        for (int i = 0; i < chars.length; i++) {
            if ( chars[i] != null ) {
                text = text.concat(String.valueOf(chars[i]));
            }
        }
        return Integer.parseInt(text);
    }

    public boolean isPrime(int num) {
        if ( num < 2 ) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if ( num%i == 0 ) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "1";
        String b = "2";
        String z = "0";

        Character[] chars = new Character[8];
        chars[0] = '1';
        chars[1] = '2';
        chars[2] = '8';

        String c = "4826";



        PrimeNumber primeNumber = new PrimeNumber();
//        System.out.println(primeNumber.arrayToInt(chars));
        System.out.println(chars[4]!=null);
        System.out.println(primeNumber.isPrime(7));
        System.out.println(primeNumber.isPrime(14));
    }
}
