package ch02;

public class IntegerLiteralExample {
    public static void main(String[] args){
        int var1 = 0b1011; // 2진수
        int var2 = 0206; // 8진수
        int var3 = 356; // 10진수
        int var4 = 0xB3; // 16진수

        System.out.println("var1: "+var1);
        System.out.println("var2: "+var2);
        System.out.println("var3: "+var3);
        System.out.println("var4: "+var4);

        //* output
        // var1: 11
        //var2: 134
        //var3: 356
        //var4: 179 */
    }
}
