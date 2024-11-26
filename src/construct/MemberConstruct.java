package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
    }

    /*
    초기화되지 않은 필드에 기본값을 제공해야 하는 경우.
     */
//    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
//    }

    /*
    바로 위 주석처리된 생성자 리팩토링.
    this() : 현재 클래스의 생성자 호출.
    생성자 바디의 첫줄에만 작성 가능(아니면 컴파일 에러)
     */
    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }
}
