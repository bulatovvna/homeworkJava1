
import java.lang.*;
import java.util.*;
public class ScannerExample
{
    public static void main(String[] args) {

        System.out.println("please write your words ");

        Scanner word = new Scanner(System.in);
        String txt = word.nextLine();
        int len = txt.length();
        System.out.println(len);

        int middle = len/2;
        String firstPart, secondPart;

        firstPart = txt.substring(0,middle);
        secondPart = txt.substring(middle,len);
        System.out.println(firstPart);
        System.out.println(secondPart);


    }

    }





