package ch06.sec07.exam05;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car("자가용");
        System.out.println("car1.company: " + car1.company);
        System.out.println("car1.model: " + car1.model);
        System.out.println();

        Car car2 = new Car("자가용", "빨강");
        System.out.println("car2.company: " + car2.company);
        System.out.println("car2.model: " + car2.model);
        System.out.println("car2.color: " + car2.color);
        System.out.println();

        Car car3 = new Car("택시", "검정", 200);
        System.out.println("car3.company: " + car3.company);
        System.out.println("car3.model: " + car3.model);
        System.out.println("car3.color: " + car3.color);
        System.out.println("car3.maxSpeed: " + car3.maxSpeed);
    }
}
//output 다른 생성자를 호출하는 것을 볼 수 있다.
//car1.company: 기아자동차
//car1.model: 자가용
//
//car2.company: 기아자동차
//car2.model: 자가용
//car2.color: 빨강
//
//car3.company: 기아자동차
//car3.model: 택시
//car3.color: 검정