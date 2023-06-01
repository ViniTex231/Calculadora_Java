import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        int[] meuArray = new int[5];
//        System.out.println(Arrays.toString(meuArray));
//        meuArray[0]=1;
//        meuArray[1]=2;
//        meuArray[2]=3;
//        meuArray[3]=4;
//        meuArray[4]=5;
//        System.out.println(Arrays.toString(meuArray));
//        Arrays.fill(meuArray,9);
//        System.out.println(Arrays.toString(meuArray));
//        for (int i = 0; i < meuArray.length; i++) {
//            meuArray[i]=i*i;
//        }
//        System.out.println(Arrays.toString(meuArray));


//        int[] meuArray = {1,5,9,7,8};
//        System.out.println(Arrays.toString(meuArray));
//        for (int i = 0; i < meuArray.length; i++) {
//            System.out.println(meuArray[i]);
//
//        }

//       double[] notas = {5.0, 4.0, 3.0, 2.0, 6.0, 8.0};
//        for (double nota:notas) {
//            System.out.println(nota);
//        }
        ArrayList<usuario> listaDeUsuarios = new ArrayList<>();
        usuario u1 = new usuario("Vinícius", 18);
        listaDeUsuarios.add(u1);
        //System.out.println(listaDeUsuarios.get(0).nome);
        listaDeUsuarios.add(new usuario("Milena", 18));
        listaDeUsuarios.add(new usuario("João", 16));
        listaDeUsuarios.add(new usuario("André", 58));
        System.out.println(listaDeUsuarios);

        ArrayList<String> listaDeNomes = new ArrayList<>(Arrays.asList("Vinicius", "Milena"));
        System.out.println(listaDeNomes);
    }
}