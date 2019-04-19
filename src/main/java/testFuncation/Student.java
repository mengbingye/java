package testFuncation;

/**
 * Created by bingye on 2019-04-17
 */
public class Student {


    private String name = "张三";
    private Integer age = 12;




    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
