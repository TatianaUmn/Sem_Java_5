import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


// Задача 1. Реализуйте структуру телефонной книги с помощью HashMap,
//  учитывая, что 1 человек может иметь несколько телефонов.


public class SemFiveTaskOneDz {

    public HashMap<String, String> fillMap() {
        
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("926-125-0054", "Иванов");
        phoneBook.put("903-954-1724", "Васильев");
        phoneBook.put("916-183-1850", "Петрова");
        phoneBook.put("916-018-2425", "Иванов");
        phoneBook.put("499-150-1801", "Петрова");
        phoneBook.put("495-180-6533", "Иванов");
        return phoneBook;
    }

    public void findInPhoneBook(){
        HashMap<String, String> phoneBook = fillMap();

        System.out.print("Введите фамилию для поиска телефонов: ");

        Scanner in = new Scanner(System.in, "Cp866");
        String surname = in.nextLine();
        in.close();

        for(Map.Entry<String, String> phoneNumber : phoneBook.entrySet()) {
            if (phoneNumber.getValue().equals(surname)) {
                System.out.println(phoneNumber.getKey());
            }
        }
    }
}