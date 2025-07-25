package Programmers.Lv1;
import java.util.*;
import java.util.stream.LongStream;

public class MakeAnArrayByReversingNaturalNumbers {
    public static void main(String[] args) {
        long n = 12345;
        Demo de = new Demo();

        System.out.println(Arrays.toString(de.demo(n)));

    }
    private static class Demo{
        int[] demo(long n) {

            int a = String.valueOf(n).length();
            int[] answer = new int[a];

            for(int i = 0; n > 0; i++){
                answer[i] = (int)(n % 10);
                n /= 10;
            }
            return answer;

//            int[] answer = new StringBuilder(String.valueOf(n))
//                    .reverse()  //문자열 뒤집기
//                    .chars()    //IntStream으로 변환
//                    .map(c -> c - '0')  //문자 '0'을 빼서 int화
//                    .toArray();             //int[]로 변환
//
//            return answer;
        }
    }
}
