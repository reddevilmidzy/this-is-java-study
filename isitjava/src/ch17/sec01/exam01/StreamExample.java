package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //Set 컬렉션 생성
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("황예지");
        set.add("최지수");


        //Stream을 이용한 요소 반복 처리
        Stream<String> stream = set.stream();
        stream.forEach(System.out::println);
    }
}
