package task2;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();
        employees.add("Иван Иванов");
        employees.add("Светлана Петрова");
        employees.add("Кристина Белова");
        employees.add("Анна Мусина");
        employees.add("Анна Крутова");
        employees.add("Иван Юрин");
        employees.add("Петр Лыков");
        employees.add("Павел Чернов");
        employees.add("Петр Чернышов");
        employees.add("Мария Федорова");
        employees.add("Марина Светлова");
        employees.add("Мария Савина");
        employees.add("Мария Рыкова");
        employees.add("Марина Лугова");
        employees.add("Анна Владимирова");
        employees.add("Иван Мечников");
        employees.add("Петр Петин");
        employees.add("Иван Ежов");

        Map<String, Integer> namesCount = new HashMap<>();
        String[] nameParts;
        Integer counter = 0;
        String key;

        for (String employee: employees) {
            nameParts = employee.split(" ");
            key = nameParts[0];
            if (namesCount.containsKey(key)) {
                counter = namesCount.get(key);
                namesCount.put(key, counter + 1);
            } else {
                namesCount.put(key, 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(namesCount.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        printEntryList(list);

    }

    private static void printEntryList(List<Map.Entry<String, Integer>> list)
    {
        for (Map.Entry<String, Integer> entry: list) {
            System.out.println("Name: " + entry.getKey() + "\t Count: " + entry.getValue());
        }
    }
}