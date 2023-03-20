package task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Map<String, String>> personPhones = new ArrayList<>();
        Map<String, String> personName = new HashMap<>();
        personPhones.add(new HashMap<String, String>() {{
            put("Number", "+7(132) 123-123-123");
            put("Comment", "work");
        }});
        personPhones.add(new HashMap<String, String>() {{
            put("Number", "+7(132) 321-312-321");
            put("Comment", "home");
        }});


        Map< Map<String, String>, ArrayList<Map<String, String>>> phoneCatalog = new HashMap<>();

        phoneCatalog.put(new HashMap<String, String>() {{
            put("Name", "John");
            put("Surname", "Connor");
        }}, (ArrayList<Map<String, String>>)personPhones.clone());

        personPhones.clear();
        personPhones.add(new HashMap<String, String>() {{
            put("Number", "+7(132) 999-123-123");
            put("Comment", "work");
        }});
        personPhones.add(new HashMap<String, String>() {{
            put("Number", "+7(132) 888-312-321");
            put("Comment", "home");
        }});
        phoneCatalog.put(new HashMap<String, String>() {{
            put("Name", "Sarah");
            put("Surname", "Connor");
        }}, (ArrayList<Map<String, String>>)personPhones.clone());

        System.out.println(phoneCatalog);

    }
}