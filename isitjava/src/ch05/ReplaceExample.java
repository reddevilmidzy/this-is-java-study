package ch05;

public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String 입니다.";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
