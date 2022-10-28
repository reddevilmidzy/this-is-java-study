package ch02;

public class PrimitiveAndStringConversationExample {
    public static void main(String[] args){

        // 문자열을 -> 다른 타입으로
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        // 다른 타입들을 -> 문자열으로
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        // 출력을 봤을 때 위아래 모두 똑같이 나오지만.
        // 타입은 다르다.
    }
}
