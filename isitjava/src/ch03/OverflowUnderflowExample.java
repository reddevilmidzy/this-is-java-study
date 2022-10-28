package ch03;

public class OverflowUnderflowExample {
    public static void main(String[] args){
        byte var1 = 125;
        for(int i=0; i<5; i++){
            var1 ++;
            System.out.println("var1: " + var1);
        }
        // byte 범위에 벗어나기에 오버플로우 발생
        // output
        //*var1: 126
        // var1: 127
        // var1: -128
        // var1: -127
        // var1: -126
        // */

        byte var2 = -125;
        for(int i=0; i<5; i++){
            var2--;
            System.out.println("var2: " + var2);
        }
        // 역시 byte 범위를 벗어나기에 언더플로우 발생
        // output
        //*var2: -126
        // var2: -127
        // var2: -128
        // var2: 127
        // var2: 126*/

        // 그럴땐 타입을 변환시킨다.
    }
}
