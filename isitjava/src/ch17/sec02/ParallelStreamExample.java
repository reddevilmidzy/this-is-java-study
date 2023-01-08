package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<String> list = new ArrayList<>();
        list.add("황예지");
        list.add("최지수");
        list.add("신류진");
        list.add("이채령");
        list.add("신유나");

        //병렬 처리
        Stream<String> parallelStream = list.parallelStream(); // 병렬 스트림 얻기
        parallelStream.forEach(name -> System.out.println(name + ": " + Thread.currentThread().getName()));
    }
}
