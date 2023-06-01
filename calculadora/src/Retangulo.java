public class Retangulo {
    double altura;
    double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    double calcularArea(){
        return altura * largura;
    }
    double calcularPerimetro(){
        return altura + altura + largura + largura;
    }
}
