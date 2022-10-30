package ch04;

public class ContinueExample {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            if(i%2 != 0) {
                continue;
            }
            System.out.println(i + " ");
        }
        //output
        //2 4 6 8 10
    }
}
