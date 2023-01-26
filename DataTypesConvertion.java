import java.io.*;
import java.util.*;
import java.lang.*;

public class DataTypesConvertion {
    public static void main(String[] args) {
        int a = 12345;
        System.out.println("Int -> String ");
        String intStr = Integer.toString(a);
        // String intStr1 = String.valueOf(intStr);
        System.out.println("---------------------");
        System.out.println(intStr + " " + intStr.length());

    }

}
