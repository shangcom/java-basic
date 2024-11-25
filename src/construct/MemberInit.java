package construct;

public class MemberInit {

    String name;
    int age;
    int grade;

    /*
    매개변수와 멤버변수의 이름이 같을 경우 this 붙여줘야 멤버변수 취급함.
    이름이 같으면 가까운쪽을 따라가기 때문에 만약 아래 메서드 바디에서 this 붙이지 않으면 가까운 매개변수를 나타내는 것으로 인식.
    name = name;
    둘 다 매개변수. 아무런 의미도 없어짐.
     */
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
