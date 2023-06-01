import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Sala {

    public static void main(String[] args) {

        ArrayList<String> listaSala = new ArrayList<>(Arrays.asList("Byanka", "Julia G", "Ket", "Outra Julia", "Felipe", "Vini", "Beck", "Vetores", "Pedrinho", "Prijas", "Prates", "Fabão", "Joao", "Victor", "Manu", "Keven"));

        int len = listaSala.size() - 1;
        Random random = new Random();

        System.out.println("Old List");
        System.out.println(listaSala);

        if (len % 2 == 0){
            for (int i = 0; i < len; i++) {
                int newLen = listaSala.size();
                listaSala.remove(random.nextInt(newLen));
            }
        }else{
            for (int i = 0; i < (len + 1)/2; i++) {
                int newLen = listaSala.size();
                listaSala.remove(random.nextInt(newLen));

            }
        }
        System.out.println("New List");
        System.out.println(listaSala);

    }
}
