package ch07.sec10.exam02;

public abstract class Animal {
    //메소드 선언
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    //추상 메소드 선언
    public abstract void sound(); //어떤 소리를 낼지는 모름
}
