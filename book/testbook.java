package book;

public class testbook {
    public static void main(String[] args) {
        Author ahTeck = new Author("tan ah Teck", "ahteck@somewhere.com", 'm');
        System.out.println(ahTeck);


        Book dummyBook = new Book("java of dummies", ahTeck, 9.99, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(8.88);
        dummyBook.setQty(88);
        System.out.println("name is :" + dummyBook.getName());

        System.out.println("price is :" +dummyBook.getPrice());

        System.out.println("qty is:" + dummyBook.getQty());

        System.out.println("author is:" + dummyBook.getAuthor());

        System.out.println("author's name is:" + dummyBook.getAuthor().GetName());

        System.out.println("author's email is:" + dummyBook.getAuthor().GetEmail());

        System.out.println("author's gender is:" + dummyBook.getAuthor().GetGender());

        Book moreDummyBook = new Book("java for more dummies", new Author("Peter lee", "pêtr@nơhere.com", 'm') 19.99,8);

        System.out.println(moreDummyBook);

    }
}
