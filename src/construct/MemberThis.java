package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // this. 생략됨. 멤버변수와 매개변수의 이름 다르니까 식별 가능.
    }
}
