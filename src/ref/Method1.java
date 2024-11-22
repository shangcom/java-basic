package ref;

public class Method1 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름 : " + student1.name + ", 나이 : " + student1.age + ", 성적 = " + student1.grade);
        System.out.println("이름 : " + student2.name + ", 나이 : " + student2.age + ", 성적 = " + student2.grade);

        printStudent(student1);
        printStudent(student2);

        // initStudent() 사용
        Student student3 = new Student();
        initStudent(student3, "학생3", 15, 70);
        printStudent(student3);
    }

    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 성적 = " + student.grade);
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

}
