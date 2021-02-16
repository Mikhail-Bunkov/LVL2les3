package homework;

import java.util.*;

public class Phonebook {
    private String name;
    private String number;
    public HashMap<String, Set<String>> people = new HashMap<>();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void add(String name, String number) {
        Set<String> telephoneNumber = people.getOrDefault(name, new HashSet<>());
        telephoneNumber.add(number);
        people.put(name, telephoneNumber);
    }
    public Set<String> get(String name){
        return people.get(name);
    }
}
