public class Esfera {
    double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }
    double calcularVolume (){
        return 4 * 3.14 * raio * raio * raio / 3;
    }
    double calcularSuperficie (){
        return 4 * 3.14 * raio * raio;
    }
}
