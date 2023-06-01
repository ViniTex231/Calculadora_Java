public class Quadrado {
    double alturaq;

    public Quadrado(double alturaq) {
        this.alturaq = alturaq;
    }
    double calcularArea(){
        return alturaq*alturaq;
    }
    double calcularPerimetro(){
        return alturaq*4;
    }
}

