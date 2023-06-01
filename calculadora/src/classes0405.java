public class classes0405 {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4449.89, 0.10, true); //INSTANCIA
//        p1.nome = "Notebook";
//        p1.preco = 4449.89;
//        p1.desconto = 0.10;
//        p1.disponibilidade = true;

        //System.out.println(p1);

//        Produto p2 = new Produto(); //INSTANCIA
//        p2.nome = "Shampoo";
//        p2.preco = 16.50;
//        p2.desconto = 0.25;
//        p2.disponibilidade = false;

        System.out.printf("R$ %.2f",p1.calcularPrecoComDesconto());

//        System.out.println(p2.somar(3,5));
//        p2.imprimirNaTela();
//        System.out.println(p2.somar(8,3,4));
//        System.out.println(p2.somar(2.5,3.9));
    }
}
