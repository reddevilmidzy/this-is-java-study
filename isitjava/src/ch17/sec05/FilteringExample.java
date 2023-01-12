package ch17.sec05;

import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<String> list = List.of("황예지", "최지수", "신류진", "이채령", "신유나", "이채령");

        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        // 신으로 시작하는 요소만 필터링
        list.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(System.out::println);
        System.out.println();

    }
}
