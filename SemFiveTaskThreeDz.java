
import java.util.HashMap;
import java.util.Scanner;

// Задача 3. Написать метод, который переведет число из римского формата записи в арабский.


public class SemFiveTaskThreeDz {
    
    public void result() {
        System.out.print("Введите римское число: ");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        System.out.println(romanArabian(s));

    }

    public int romanArabian(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
    
        int end = s.length()-1;
        char[] arr = s.toCharArray();
        int arabian;
        int result = map.get(arr[end]);
        for (int i = end-1; i >=0; i--) {
            arabian = map.get(arr[i]);
    
            if (arabian < map.get(arr[i + 1])) {
                result -= arabian;
            } else {
                result += arabian;
            }
    
        }
        return result;
    
    }
}
