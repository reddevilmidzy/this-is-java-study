package ch05;

public class ArrayCopyExample {
    public static void main(String[] args) {
        //길이 3인 배열
        String[] oldStrArray = { "java", "array", "copy" };
        //길이 5인 배열을 새로 생성
        String[] newStrArray = new String[5];
        //배열 항목 복사
        System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        // System.arraycopy(Object src, int srcPos, Object dest, int desPos, int length);
        // System.arraycopy(원본 배열, 원본 배열 복사 시작 인덱스, 새 배열, 새 배열 붙여넣기 시작 인덱스, 복사 항목 수);
        //배열 항목 출력
        for(int i=0; i<newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
//output
//java, array, copy, null, null,