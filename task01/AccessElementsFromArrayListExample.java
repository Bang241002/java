package task01;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[]args){
        List<String> topCompanies = new ArrayList<>();

        System.out.println("IS the topCompanies List empty? :" + topCompanies.isEmpty());



        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Mirosoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");


        System.out.println("here are the top " + topCompanies.size() + "companies in th world");
        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String LastCompany = topCompanies.get(topCompanies.size() - 1);


        System.out.println("Best Comany: " + bestCompany);
        System.out.println("Second Best Company :" + secondBestCompany);
        System.out.println("Last Company in the list:" + LastCompany);

        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list:" + topCompanies);

    }
}
