import java.util.Arrays;

public class fibonnaci {
    public static void main(String[] args) {
        int [] fibonnaci = new int[20];
        fibonnaci[0]=0;
        fibonnaci[1]=1;
        for (int i = 2; i < fibonnaci.length; i++) {
            fibonnaci[i]=fibonnaci[i-1]+fibonnaci[i-2];


        }
        System.out.println(Arrays.toString(fibonnaci));
    }
}
