package ss6;

import java.util.ArrayList;

public class vidu9 {
    ArrayList myCart = new ArrayList();

    public void createList(){
        myCart.add("Doll");
        myCart.add("Bus");
        myCart.add("teddy");

        System.out.println("cart contents are:" + myCart);
    }
    public static void main(String[]args){

        UserClass objUser = new userclass();
        objUser.createList();
        vidu7.StaticMembers objStatic = new StaticMembers();
        objStatic.displaCount();
    }

}
