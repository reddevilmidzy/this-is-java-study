package ch06.sec13.exam02.package2; //A랑 패키지 다름

import ch06.sec13.exam02.package1.*;

public class C {
    //필드 선언
    A a1 = new A(true);         //가능
    //A a2 = new A(1);            //불가능 default 생성자
    //A a3 = new A("문자열");      //불가능 private 생성자
}
