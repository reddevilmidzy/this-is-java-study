package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A{
    //생성자 선언
    public D() {
        //A(); // 생성자 호출
        super();
    }

    //메소드 선언
    public void method1() {
        //A 필드값 변경
        this.field = "value";
        this.method();
    }

    public void method2() {
//        A a = new A(); // 이렇게 선언해서 사용하는건 안됨. 상속을 통해서 사용가능한게 protected
//        a.field = "valdue";
//        a.method();
    }
}
