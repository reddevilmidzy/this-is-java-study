package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //실행문이 두 개 이상일 경우
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        // 클래스 :: 메소드
        // 참조변수 :: 메소드
        person.action(Double::sum);

        person.action(LambdaExample::sum);
        
        person.action(Math::max);
    }

    public static double sum(double x, double y) {
        return x + y;
    }
}
