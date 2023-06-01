public class Produto {
    String nome;
    double preco;
    double desconto;
    boolean disponibilidade;

    public Produto(String nome, double preco, double desconto, boolean disponibilidade) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.disponibilidade = disponibilidade;
    }

    double calcularPrecoComDesconto(){

        return preco-preco*desconto;
    }

//    int somar(int par1, int par2){
//        return par1+par2;
//    }
//
//    void imprimirNaTela(){
//        System.out.println("Bosch");
//    }
//
//    int somar(int par1, int par2, int par3){
//        return par1+par2+par3;
//    }
//    int somar(double par1, double par2){
//        return (int) (par1+par2);
//    }
//
}
