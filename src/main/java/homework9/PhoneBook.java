package homework9;

import java.util.HashMap;

public class PhoneBook {
    HashMap<String, String> phones = new HashMap<>();

    public void putPhone(String name, String phone){
        phones.put(name, phone);
    }


    public String findPhone(String name){
        if(phones.containsKey(name)){
            return phones.get(name);
        }else return "არ მოიძებნა";
    }
}
