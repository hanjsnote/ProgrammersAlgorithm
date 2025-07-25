package Programmers.Lv1;

import java.util.*;
import java.util.stream.LongStream;

public class NnumbersSpacedByX {
    public static void main(String[] args) {

        Demo de = new Demo();

        System.out.println(Arrays.toString(de.demo()));
    }
}
class Demo{
    long[] demo(){

        int x = 3;
        int n = 5;

//        long[] answer = new long[n];
//        for(int i = 0; i < n; i++){
//            a += x;
//            answer[i] = a;
//        }
//        return LongStream.iterate(x, a -> a + x).limit(n).toArray();
        return LongStream.rangeClosed(1, n).map(i -> x * i).toArray();
    }
}