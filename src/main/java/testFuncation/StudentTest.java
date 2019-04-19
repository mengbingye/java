package testFuncation;


import java.util.function.Supplier;

public class StudentTest {


    public static void main(String[] args) {

//        Student student = new Student();
        Supplier<Student> supplier = Student::new;
        System.out.println(supplier.get().getName());
    }
}
