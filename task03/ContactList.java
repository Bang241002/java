package java.task03;

import java.util.ArrayList;
import java.util.List;


public class ContactList {
    private List<Contact> listContact;

    public ContactList() {
        listContact = new ArrayList<>();
    }

    public void addContact(Contact contact){
        listContact.add(contact);
    }

    public void updateContact(Contact contactOld,Contact contactNew){
        for (Contact contact:listContact) {
            if(contact.equals(contactOld)){
                listContact.set(listContact.indexOf(contactOld),contactNew);
            }
        }
    }

    public void removeContact(Contact contact){
        listContact.remove(contact);
    }

    public void searchContact(String key){
        for (Contact contact: listContact) {
            if(contact.getName().contains(key)){
                System.out.println(contact);
            }
        }
    }

    public void getListContact() {
        for (Contact contact:listContact) {
            System.out.println(contact);
        }
    }
}
