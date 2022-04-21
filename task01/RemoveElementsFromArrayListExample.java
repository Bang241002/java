package task01;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[]args){
        List<String> programmingLangusges = new ArrayList<>();
        programmingLangusges.add("C");
        programmingLangusges.add("C++");
        programmingLangusges.add("Java");
        programmingLangusges.add("KotLin");
        programmingLangusges.add("python");
        programmingLangusges.add("Perl");
        programmingLangusges.add("Ruby");

        System.out.println("Initial List:" + programmingLangusges);

        programmingLangusges.remove(5);
        System.out.println("After remove(5):" + programmingLangusges);

        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLangusges.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages):" + programmingLangusges);

        programmingLangusges.removeIf(n -> (n.charAt(0) == 'T'));


        System.out.println("After Removing all elements that start with \"C\" :" + programmingLangusges);

        programmingLangusges.clear();
        System.out.println("After clear():" + programmingLangusges);
    }
}
