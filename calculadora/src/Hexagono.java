public class Hexagono {
    double altura;

    public Hexagono(double altura) {
        this.altura = altura;
    }
    double calcularArea(){
        return ((3* Math.sqrt(3) *
                (altura * altura)) / 2);
    }
    double calcularPerimetro(){
        return 6 * altura;
    }
}
