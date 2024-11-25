package oop1.ex;

/*
Account 클래스를 만들어라.
int balance 잔액
deposit(int amount): 입금 메서드
입금시 잔액이 증가한다.
withdraw(int amount): 출금 메서드
출금시 잔액이 감소한다.
만약 잔액이 부족하면 잔액 부족을 출력해야 한다.
AccountMain 클래스를 만들고 main() 메서드를 통해 프로그램을 시작해라.
계좌에 10000원을 입금해라.
계좌에서 9000원을 출금해라.
계좌에서 2000원을 출금 시도해라. 잔액 부족 출력을 확인해라.
잔고를 출력해라. 잔고: 1000

실행 결과

잔액 부족
잔고: 1000

 */
public class Account {

    int balance = 0;

    public void deposit(int amount) {
        System.out.println("입금 전 잔액 : " + balance);
        balance += amount;
        System.out.println("입금 후 잔액 : " + balance);
    }

    public void withdraw(int amount) {
        System.out.println("출금 전 잔액 : " + balance);
        if (balance >= amount) {
            balance -= amount;
            System.out.println("출금 후 잔액 : " + balance);
        } else {
            System.out.println("잔액 부족");
        }
    }
}
