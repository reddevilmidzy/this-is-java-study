package ch04;

public class FloatCounterExample {
    public static void main(String[] args) {
        for(float x=0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);
        }

        //output
        //*
        //0.1
        //0.2
        //0.3
        //0.4
        //0.5
        //0.6
        //0.70000005
        //0.8000001
        //0.9000001
        // 부동소수점 방식의 float는 정확히 0.1을 표현하지 못하기때문에 이런 오차가 발생한다.*/
    }
}
