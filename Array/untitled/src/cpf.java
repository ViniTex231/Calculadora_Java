
import java.util.Scanner;

public class cpf {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int sumCountOne = 10, sumCountTwo = 11;
        int countDigitOne = 0, countDigitTwo = 0;
        int digitOne, digitTwo;
        int[] cpf = new int[11];
        String cpfString;

        System.out.print("Input your CPF>> ");
        cpfString = tec.nextLine();

        tec.close();

        cpfString = cpfString.replace(".", "");
        cpfString = cpfString.replace("-", "");

        for (int i=0; i<cpfString.length(); i++) {
            cpf[i] = Character.getNumericValue(cpfString.charAt(i));
        }

        // CHECK DIGITO 1
        for (int i=0; i < 9; i++) {
            countDigitOne += cpf[i] * sumCountOne;
            sumCountOne--;
        }

        digitOne = 11 - (countDigitOne%11);

        if (digitOne > 9){
            digitOne = 0;
        }

        cpf[9] = digitOne;

        // CHECK DIGITO 2
        for (int i=0; i < 10; i++) {
            countDigitTwo += cpf[i] * sumCountTwo;
            sumCountTwo--;
        }

        digitTwo = 11 - (countDigitTwo%11);

        if (digitTwo > 9){
            digitTwo = 0;
        }

        cpf[10] = digitTwo;

        for (int digit : cpf) {
            System.out.print(digit);
        }
    }
}
