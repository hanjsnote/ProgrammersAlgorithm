package Programmers.Lv1;

//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
public class AddDigits {

    public static void main(String[] args) {
        int answer = 0;
        int n = 123;

        for(; n > 0; n /= 10){
            answer += n % 10;
            System.out.println(answer);
        }
    }
}
