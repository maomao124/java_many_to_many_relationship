import java.util.Iterator;

/**
 * Project name(项目名称)：Java多对多关系
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 19:44
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        // 实例化课程对象
        Course course1 = new Course("英语", 3);
        Course course2 = new Course("计算机", 5);
        // 实例化学生对象
        Student student1 = new Student("张三", 20);
        Student student2 = new Student("李四", 21);
        Student student3 = new Student("王五", 22);
        Student student4 = new Student("赵六", 23);
        Student student5 = new Student("孙七", 24);
        Student student6 = new Student("钱八", 25);
        // 第一门课程有3个人参加，向课程中增加3个学生信息，同时向学生中增加课程信息
        course1.getStudents().add(student1);
        course1.getStudents().add(student2);
        course1.getStudents().add(student6);
        student1.getCourses().add(course1);
        student2.getCourses().add(course1);
        student6.getCourses().add(course1);
        // 第二门课程有6个人参加，向课程中增加6个学生信息，同时向学生中添加课程信息
        // 向课程中增加学生信息
        course2.getStudents().add(student1);
        course2.getStudents().add(student2);
        course2.getStudents().add(student3);
        course2.getStudents().add(student4);
        course2.getStudents().add(student5);
        course2.getStudents().add(student6);
        // 像学生中增加课程信息
        student1.getCourses().add(course2);
        student2.getCourses().add(course2);
        student3.getCourses().add(course2);
        student4.getCourses().add(course2);
        student5.getCourses().add(course2);
        student6.getCourses().add(course2);
        // 输出一门课程的信息，观察一门课程有多少个学生参加
        System.out.println(course1); // 输出第一门课程
        Iterator<Student> iterator = course1.getStudents().iterator();
        // 迭代输出
        while (iterator.hasNext())
        {
            Student student = iterator.next();
            System.out.println("\t" + student);
        }
        // 输出一个学生参加的课程信息，观察有多少门课程
        System.out.println(student6);
        Iterator<Course> iterator1 = student6.getCourses().iterator();
        while (iterator1.hasNext())
        {
            // 取得所参加的课程
            Course course = iterator1.next();
            // 输出课程信息
            System.out.println("\t" + course);
        }
    }
}
