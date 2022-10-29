package ch03;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args){
        int x = 5;
        double y = 0.0;
        // double z = x / y; => Infinity
        double z = x % y;

        if(Double.isFinite(z)){
            System.out.println("z는 무한 입니다. 0.0으로 나누었군요.");
        } else if (Double.isNaN(z)){
            System.out.println("z는 NaN 입니다. 0.0의 나머지를 구하려고 시도했군요.");
        }

    }
}
