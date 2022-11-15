package ch08.sec02;

public class Television implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");         //인터페이스에 선언된 turnOn() 추상 메소드 재정으ㅢ
    }
}
