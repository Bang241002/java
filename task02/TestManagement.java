package java.task02;

import java.util.Scanner;


public class TestManagement{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Student student1 = new Student("01","ngyễn danh hưng","Thái Bình","bang241002@gmail.com","24/02/2003",1);
        Student student2 = new Student("02","Chu tiến đạt ","Hà nội","bang241002@gmail.com","24/02/2003",1);
        Student student3 = new Student("03","Đinh Công Bang","Nam Định","bang241002@gmail.com","24/02/2003",1);
        Student student4 = new Student("04","Lê Văn Minh","Hà Nội","bang241002@gmail.com","24/02/2003",1);
        Student student5 = new Student("05","Bùi văn Dũng","Hà Nội","bang241002@gmail.com","24/02/2003",1);
        StudentManagement studentManagement = new StudentManagement();

        studentManagement.addStudent(student1);
        studentManagement.addStudent(student2);
        studentManagement.addStudent(student3);
        studentManagement.addStudent(student4);

        int selection;
        do {
            System.out.println("Mời nhập lựa chọn:");
            System.out.println("1.Thêm học sinh");
            System.out.println("2.Xóa học sinh");
            System.out.println("3.Sửa học sinh");
            System.out.println("4.Sắp xếp học sinh theo tên A->Z");
            System.out.println("5.Tìm Kiếm học sinh");
            System.out.println("6.In danh sách sinh viên");
            System.out.println("7.Thoát");
            selection = in.nextInt();
            switch (selection){
                case 1: studentManagement.addStudent();
                    break;
                case 2: studentManagement.removeStudent();
                    break;
                case 3: studentManagement.setStudent();
                    break;
                case 4: studentManagement.sortStudent();
                    break;
                case 5: studentManagement.searchStudent();
                    break;
                case 6: studentManagement.getStudentList();
                    break;
            }
        }while (selection<7);



    }

}
