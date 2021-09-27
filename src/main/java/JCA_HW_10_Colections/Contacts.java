package JCA_HW_10_Colections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Contacts {
    private Map<String, ArrayList<String>> Contacts;
    Contacts(){
        this.Contacts= new HashMap<>();
    }
    public void add(String name, String number){
        ArrayList<String> list = Contacts.computeIfAbsent(name, k->new ArrayList<>());
        list.add(number);
    }
    public void get(String name){
        ArrayList<String> list=Contacts.get(name);
        if(list==null) System.out.println("Контакт" + name + "отсутствует");
        else System.out.println(name + ":" + list);


    }


}
