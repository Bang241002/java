package java.task03;


public class TestContact {
    public static void main(String[] args) {

        ContactList contactList = new ContactList();
        Contact contact1 = new Contact("Dinh Cong Bang","0942205431");
        Contact contact2 = new Contact("Dinh Cong Bang","0353992397");

        contactList.addContact(contact1);
        contactList.addContact(contact2);

        contactList.updateContact(contact1,contact2);
        contactList.getListContact();

    }
}