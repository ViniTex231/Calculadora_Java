public class Cone {
    double raio;
    double altura;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }
    double calcularVolume(){
        return (3.14 * raio * raio * altura) / 3;
    }
    double calcularSuperficie(){
        return 3.14 * raio * raio;
    }
}
