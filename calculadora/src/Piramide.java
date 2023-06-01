public class Piramide {
    double aresta;
    double altura;

    public Piramide(double aresta, double altura) {
        this.aresta = aresta;
        this.altura = altura;
    }
    double calcularVolume(){
        double ab = aresta * aresta;
        return (ab * altura) / 3;
    }
    double calcularSuperficie(){
        return aresta * aresta;
    }
}
