public class Cilindro {
    double raio;
    double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }
    double calcularVolume(){
        return 3.14 * raio * raio * altura;
    }
    double calcularSuperficie(){
        return 3.14 * raio * raio;
    }
}
