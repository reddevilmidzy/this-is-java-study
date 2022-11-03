package ch06.sec07.exam03;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    public Korean(String name, String ss) {
        //매개변수명이 필드명과 동일하기에 필드임을 구분하기 위해 this 키워드를 필드명앞에 붙여주었다.
        this.name = name;
        this.ssn = ssn;
    }
}
