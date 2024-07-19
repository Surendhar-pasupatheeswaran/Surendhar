package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        // Fill the map
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int n = s.length();
        
        System.out.println(n);
        int num = romanMap.get(s.charAt(n - 1));
        System.out.println(num);
        for (int i = n - 2; i >= 0; i--) {
           
            if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
                num += romanMap.get(s.charAt(i));
            } else {
                num -= romanMap.get(s.charAt(i));
            }
        }
        return num;
    }

    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(romanToInt(str));
    }
}