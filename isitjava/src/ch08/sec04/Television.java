package ch08.sec04;

public class Television implements RemoteControl {
    //필드
    private int volume;

    //turnOn() 추상 메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    //turnOff() 추상 메소드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    //setVolume() 추상 메소드 오버라이딩
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
            printVolume(volume);
            return;
        }
        this.volume = Math.max(volume, RemoteControl.MIN_VOLUME);
        printVolume(volume);
    }

    private void printVolume(int volume) {
        System.out.println("현재 볼륨은 " + volume + " 입니다.");
    }
}
