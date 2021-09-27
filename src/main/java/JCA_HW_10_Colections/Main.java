package JCA_HW_10_Colections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Ялоко", "Киви","Банан","Авто","Мотоцикл","Кот","Ялоко","Кот","Собака","Кот","Собака");

        Map<String,Integer> uniqeWords = new HashMap<>();
        for(String s:words){

            uniqeWords.put(s,uniqeWords.getOrDefault(s,0)+1);
        }
        System.out.println(uniqeWords);
        Contacts contacts = new Contacts();
        contacts.add("Вася","+380954479600");
        contacts.add("Петя","+69995544");
        contacts.add("Коля","+66999877741");
        contacts.add("Жора","+21444477777");
        contacts.add("Вася","+111111111");
        contacts.add("Никита","+41777777744");
        contacts.add("Гриша","+697774488888");
        contacts.add("Петя","+125558888777");
        contacts.get("Вася");
        contacts.get("Никита");
    }
}
