public class Paralelepipedo {
    double altura;
    double largura;
    double profundidade;

    public Paralelepipedo(double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }
    double calcularVolume(){
        return altura*largura*profundidade;
    }
    double calcularSuperficie(){
        return largura*profundidade;

    }
}
