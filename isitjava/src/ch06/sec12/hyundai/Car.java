package ch06.sec12.hyundai;

//import 문으로 다른 패키지 클래스 사용을 명시
import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

public class Car {
    //부품 필드 선언
    //두 패키지 모두 Tire란 클래스를 갖고있기 때문에 위치를 명시해줘야 한다.
    ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
    ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
    //아래처럼 서로 다른 이름이라면 위치를 명시하지 않아도 된다.
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
}
