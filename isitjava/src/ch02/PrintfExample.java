package ch02;

public class PrintfExample {
    public static void main(String[] args){
        int value = 123;
        System.out.printf("상품의 가격:%d원\n", value);
        // 6 자리 맞춤
        System.out.printf("상품의 가격:%6d원\n", value);
        // 6 자리 맞춤 좌측 정렬
        System.out.printf("상품의 가격:%-6d원\n", value);
        // 6 자리 맞춤 그리고 빈 칸은 0으로 채움
        System.out.printf("상품의 가격:%06d원\n", value);

        double area = 3.14159 * 10 * 10;
        // 10 자리 (정수 7자리, 소수점, 소수 2자리)
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
        // 10 자리에 왼쪽 빈공간은 0으로 채움
        System.out.printf("반지름이 %d인 원의 넓이:%010.2f\n", 10, area);
        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

        //** output
        // 상품의 가격:123원
        // 상품의 가격:   123원
        // 상품의 가격:123   원
        // 상품의 가격:000123원
        // 반지름이 10인 원의 넓이:    314.16
        // 반지름이 10인 원의 넓이:0000314.16
        //      1 | 홍길동        |         도적/
    }
}
