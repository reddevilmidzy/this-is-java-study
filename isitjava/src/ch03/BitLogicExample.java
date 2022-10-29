package ch03;

public class BitLogicExample {
    public static void main(String[] args){
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));
        //*
        //45 & 25 = 9
        //45 | 25 = 61
        //45 ^ 25 = 52
        //~45 = -46*/

        byte receiveData = -128;

        //방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1);
        //128

        //방법2: 자바 API 를 이용해서 Unsigned 정수 얻기
        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);
        //128

        int test = 136;
        byte btest = (byte) test;
        System.out.println(btest);
        //-120
    }
}
