package ch03;

public class BitShiftExample1 {
    public static void main(String[] args){
        int num1 = 1;
        int result1 = num1 << 3;
        int result2 = num1 * (int) Math.pow(2, 3); //Math.pow(a, b)는 a**b 연산을 하고 double 타입으로 값 산출
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        // 8


        int num2 = -8;
        int result3 = num2 >> 3;
        int result4 = num2 / (int) Math.pow(2, 3);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
        //  -1
    }
}
