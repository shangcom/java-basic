package poly.ex.sender;

/*
실행 결과

메일을 발송합니다: 환영합니다!
SMS를 발송합니다: 환영합니다!
페이스북에 발송합니다: 환영합니다!
 */
public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
