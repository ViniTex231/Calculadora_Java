import javax.swing.JOptionPane;

public class primos {
    public static void main(String[] args) {
        int numero, contador, i, decisao;
        i = 2;
        contador = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if (numero > 10000) {
            JOptionPane.showMessageDialog(null, "Só aceitamos números até 10.000!");
        }else {
            while (i < numero) {
                if (numero % i == 0) contador++;
                i++;
            }
            if (contador > 0 || numero == 1) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " não é primo!");
            } else {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é primo!");
            }
            decisao = Integer.parseInt(JOptionPane.showInputDialog(
                    "[0] - Remover | [1] - Inserir"));

            if (decisao == 0){

            }
            else if (decisao == 1){
                for (int j = 1; j <= numero; j++){
                    int counter = 0;
                    for (int k = 1; k <= j; k++){
                        if (j % k == 0) counter++;
                    }
                    if (counter == 2){
                        System.out.println(j);
                    }
                }
            }else {

            }
        }
    }
}