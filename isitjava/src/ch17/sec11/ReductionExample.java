package ch17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 92),
                new Student("최지수", 100),
                new Student("신류진", 98)
        );
        // 방법 1
        int sum1 = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();

        // 방법 2
        int sum2 = studentList.stream()
                .map(Student::getScore)
                .reduce(0, Integer::sum);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
