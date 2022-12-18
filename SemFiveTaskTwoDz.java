import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Пусть дан список сотрудников:Иван Иванов 
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
 * Отсортировать по убыванию популярности.
 */


public class SemFiveTaskTwoDz {

    public  Map<String, Integer> fillNameMap() {
        Map<String, Integer> nameMap = new HashMap<>();
        String staff = "Виктор Смирнов " +
                "Мария Третьякова " +
                "Дарья Кочеткова " +
                "Дарья Макарова " +
                "Мария Васильева " +
                "Дарья Крутова "; 
        String[] listOfNamesAndSurnames = staff.split(" ");
        for (int i = 0; i < listOfNamesAndSurnames.length; i += 2) {
            if (nameMap.containsKey(listOfNamesAndSurnames[i])) {
                nameMap.replace(listOfNamesAndSurnames[i], nameMap.get(listOfNamesAndSurnames[i]) + 1);
            } else {
                nameMap.put(listOfNamesAndSurnames[i], 1);
            }
        }
        return nameMap;
    }

    public void sortedNameMap(Map<String, Integer> nameMap){
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println(sortedNameMap);
    }
    
}
