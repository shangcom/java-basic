package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        /*
        volume의 접근 제어자를 private로 수정하면 해당 필드에 외부에서 직접 접근 불가.
         */
//        speaker.volume = 200;
        speaker.showVolume();
    }
}
