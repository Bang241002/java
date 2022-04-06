package author;

public class testAuthor {
    public static void main(String[] args){
        Author anh1 = new Author("vu hoang anh", "anh@gmail.com",'m');
        System.out.println(anh1);

        anh1.setEmail("anh@gmail.com");
        System.out.println(anh1);

        System.out.println("name is:" + anh1.getname());

        System.out.println("gender is:" + anh1.getgender());

        System.out.println("email is :" + anh1.getEmail());
    }
}
