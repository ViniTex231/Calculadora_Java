public class Cubo {
    double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }
    double calcularVolume (){
        return lado * lado * lado;
    }
    double calcularSuperficie (){
        return lado * lado;
    }
}
