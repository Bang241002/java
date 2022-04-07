package book;

public class testAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah teck", "teck@nowhere.com", 'm');
        System.out.println(ahTeck);

        ahTeck.setEmail("teck@somewhere.com");
        System.out.println(ahTeck);

        System.out.println("name is:" + ahTeck.GetName());

        System.out.println("gender is:" + ahTeck.GetGender());

        System.out.println("email is :" + ahTeck.GetEmail());
    }
}