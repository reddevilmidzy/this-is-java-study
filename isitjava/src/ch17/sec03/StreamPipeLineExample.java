package ch17.sec03;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("최동근", 20),
                new Student("조로", 10),
                new Student("샹크스", 30)
        );

        double avg = list.stream()
                .mapToDouble(Student::getScore)
                .average()
                .getAsDouble();

        System.out.println("평균 점수: " + avg);
    }
}
