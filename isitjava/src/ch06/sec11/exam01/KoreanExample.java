package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        //객체 생성 시 주민등록번호와 이름 전달
        Korean k1 = new Korean("123456-1234567", "최자바");

        //필드값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        //*Final 필드는 값을 변경할 수 없음 컴파일 에러
        //k1.nation = "USA";
        //k1.ssn = "123-45-678";*/

        //비 final 필드는 값 변경 가능
        k1.name = "김자바";
    }
}
