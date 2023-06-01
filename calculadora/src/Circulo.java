public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    double calcularArea(){
        return 3.14 * raio;
    }
    double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }
}
