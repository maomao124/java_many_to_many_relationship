import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：Java多对多关系
 * Package(包名): PACKAGE_NAME
 * Class(类名): Course
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 19:43
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Course
{
    private String name;
    private int credit;
    // 定义集合保存多个学生
    private List<Student> students;

    private Course()
    {
        // 实例化List集合
        this.students = new ArrayList<Student>();
    }

    public Course(String name, int credit)
    {
        this();
        this.setName(name);
        this.setCredit(credit);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getCredit()
    {
        return credit;
    }

    public void setCredit(int credit)
    {
        this.credit = credit;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public void setStudents(List<Student> students)
    {
        this.students = students;
    }

    public String toString()
    {
        return "课程名称" + this.name + "；课程学分" + this.credit;
    }


}
