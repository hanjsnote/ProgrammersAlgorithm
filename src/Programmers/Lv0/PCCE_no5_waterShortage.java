package Programmers.Lv0;
//[PCCE 기출문제] 6번 / 물 부족
public class PCCE_no5_waterShortage {
    public static void main(String[] args) {

        Demo de = new Demo();

        System.out.println(de.demo());

    }

    private static class Demo{
        int demo(){
            int storage = 1000;
            int usage = 2000;
            int[] change = {-10, 25, -33};
            int total_usage = 0;

            for(int i=0; i<change.length; i++){
                usage = usage + (usage * change[i] / 100);
                total_usage += usage;
                System.out.println("usage: " + usage);
                System.out.println("total_usage: " + total_usage);
                if(total_usage > storage){
                    return i;
                }
            }
            return -1;

        }
    }
}


