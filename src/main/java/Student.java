import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：Java多对多关系
 * Package(包名): PACKAGE_NAME
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 19:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Student
{
    private String name;
    private int age;
    private List<Course> courses; // 定义集合保存全部课程

    private Student()
    {
        this.courses = new ArrayList<Course>();// 实例化List集合
    }

    public Student(String name, int age)
    {
        this();
        this.setName(name);
        this.setAge(age);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public List<Course> getCourses()
    {
        return courses;
    }

    public void setCourses(List<Course> courses)
    {
        this.courses = courses;
    }

    public String toString()
    {
        return "学生姓名：" + this.name + "：年龄" + this.age;
    }
}
