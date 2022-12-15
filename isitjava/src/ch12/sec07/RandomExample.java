package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        //선택번호
        int[] selectNumber = new int[6];
        Random random = new Random(3); //seed가 같으면 같은 랜덤값을 추출해낸다.
        System.out.print("선택번호: ");
        for (int i = 0; i < 6; i++) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        //당첨번호
        int[] winningNumber = new int[6];
        random = new Random(5);
        System.out.print("당첨번호: ");
        for (int i = 0; i < 6; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winningNumber[i] + " ");
        }
        System.out.println();

        //당첨 여부
        System.out.print("당첨여부: ");
        if (isWin(selectNumber, winningNumber)) {
            System.out.println("1등에 당첨되셨습니다.");
        } else {
            System.out.println("당첨되지 않았습니다.");
        }
    }

    private static boolean isWin(int[] selectNumber, int[] winningNumber) {
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        return Arrays.equals(selectNumber, winningNumber);
    }
}
