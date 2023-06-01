public class TrianguloEquilatero {
    double alturat;

    public TrianguloEquilatero(double alturat) {
        this.alturat = alturat;
    }
    double calcularArea(){
        return (Math.sqrt((3)) / 4) * alturat * alturat;
    }
    double calcularPerimetro(){
        return alturat * 3;
    }
}
