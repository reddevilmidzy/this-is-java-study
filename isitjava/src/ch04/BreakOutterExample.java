package ch04;

public class BreakOutterExample {
    public static void main(String[] args) {
        //2중 for 문에서 둘다 중지시키기 위해 for문에 라벨을 붙힌다.
        Outter: for(char upper='A'; upper<='Z'; upper++) {
            for(char lower='a'; lower<='z'; lower++) {
                System.out.println(upper + "-" + lower);
                if(lower=='g') {
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 실행 종료");
    }
}
