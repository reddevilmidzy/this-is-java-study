package ch02;

public class StringConcatExample {
    public static void main(String[] args){
        //숫자 연산
        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1);

        //결합 연산
        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2);

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3);

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4);

        String result5 = "10" + (2 + 8);
        System.out.println("result5: " + result5);
        
        // String이 있으면 int도 문자열로 자동 변환되여 문자열 결합 연산을 함
        //** output
        // result1: 20
        // result2: 128
        // result3: 1028
        // result4: 1028
        // result5: 1010 */
    }
}
