package ch02;

// alt enter 숏컷으로 import 가능
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){

        // scanner 변수 = Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y = " + result);
        System.out.println();

        while(true){
            System.out.print("입력 문자열: ");
            // 입력 문자열이 q라면 종료한다.
            String data = scanner.nextLine();
            if (data.equals("q")) {
                System.out.println("종료");
                break;
            }

        }
    }
}
