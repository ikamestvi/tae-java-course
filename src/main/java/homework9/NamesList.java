package homework9;

import java.util.ArrayList;

public class NamesList {
    private ArrayList<String> names;


    public NamesList(){
        this.names=new ArrayList<>();
    }


    public void addName(String name){
        names.add(name);
    }


    public int getSize(){
        return names.size();
    }


    public String getFirst(){
        return names.get(0);
    }


    public String getlast(){
        return names.get(names.size()-1);
    }


    public boolean contains(String name){
        return names.contains(name);
    }


    public void removeName(int index){
        names.remove(index);
    }


    public void printAllNames(){
        for(String name : names){
            System.out.println(name);
        }
    }
}
