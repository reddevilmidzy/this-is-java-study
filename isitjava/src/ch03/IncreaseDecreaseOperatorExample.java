package ch03;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args){
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x=" + x);
        // x = 12

        y--;
        --y;
        System.out.println("y=" + y);
        // y = 8

        // z에 x를 대입한 다음 x에 +1을 하라
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        // z = 12
        // x = 13

        // x에 +1을 한 다음에 z에 대입해라
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        // z = 14
        // x = 14

        // x에 +1을 한 다음에 y를 더하고 z에 대입한 다음에, y에 +1을 해라
        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        // z = 23
        // x = 15
        // y = 9

    }
}
