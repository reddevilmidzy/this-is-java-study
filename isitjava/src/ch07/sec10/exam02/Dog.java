package ch07.sec10.exam02;

public class Dog extends Animal {
    //추상 메소드 재정의
    @Override //재정의 오버라이딩
    public void sound() {
        System.out.println("멍멍");
    }
}
