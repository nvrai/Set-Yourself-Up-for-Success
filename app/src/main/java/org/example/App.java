package org.example;
import java.util.HashSet;
import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Welcome to my Set Yourself Up for Success Lab!";
    }
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> inputList){
        HashSet<T> outputSet = new HashSet<>(); // HashSet doesnt allow duplicates!
        for(T items : inputList){ 
            outputSet.add(items);
        }
        return new ArrayList<>(outputSet);
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(1);
        intList.add(2);
        System.out.println(removeDuplicates(intList));
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Apple");
        System.out.println(removeDuplicates(stringList));

    }
}
