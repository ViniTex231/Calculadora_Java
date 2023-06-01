import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0;
        while (op != 12) {
            System.out.println("=========================================");
            System.out.println("[1] - Equilateral Triangle");
            System.out.println("[2] - Square");
            System.out.println("[3] - Rectangle");
            System.out.println("[4] - Circle");
            System.out.println("[5] - Hexagon");
            System.out.println("[6] - Cube");
            System.out.println("[7] - Paving Stone");
            System.out.println("[8] - Ball");
            System.out.println("[9] - Square base pyramid");
            System.out.println("[10] - Cylinder");
            System.out.println("[11] - Cone");
            System.out.println("[12] - Exit");
            System.out.println("Choose the option: ");

            try{
                op = sc.nextInt();
            } catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("Type a number, not a letter!");
                op = 0;
            }
            switch (op) {
                case 1 -> {
                    double alturat = 0;
                    System.out.println("Type the height: ");

                    try {
                        alturat = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    if (alturat < 0){
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    TrianguloEquilatero t1 = new TrianguloEquilatero(alturat);
                    System.out.printf("Area: %.2f ", t1.calcularArea());
                    System.out.println(" ");
                    System.out.printf("Perimeter: %.2f", t1.calcularPerimetro());
                    System.out.println(" ");
                    System.out.println("Do you want to continue? [Y/N]");
                    String option = sc.next();
                    if (!option.equalsIgnoreCase("N")){
                        op = 12;
                    }

                }
                case 2 -> {
                    System.out.println("Type the value of one of the sides: ");
                    double alturaq = 0;
                    try {
                        alturaq = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    if (alturaq < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    Quadrado q1 = new Quadrado(alturaq);
                    System.out.printf("Area: %.2f", q1.calcularArea());
                    System.out.println(" ");
                    System.out.printf("Perimeter: %.2f", q1.calcularPerimetro());
                    System.out.println(" ");
                    System.out.println("Do you want to continue? [Y/N]");
                    String option = sc.next();
                    if (!option.equalsIgnoreCase("N")){
                        op = 12;
                    }

                }
                case 3 -> {
                    double alturar = 0;
                    double largurar = 0;
                    System.out.println("Type the height: ");
                    try {
                        alturar = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    System.out.println("Type the width: ");
                    try {
                        largurar = sc.nextDouble();
                    } catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    if (alturar < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    if (largurar < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    Retangulo r1 = new Retangulo(alturar, largurar);
                    System.out.printf("Area: %.2f", r1.calcularArea());
                    System.out.println(" ");
                    System.out.printf("Perimeter: %.2f", r1.calcularPerimetro());
                    System.out.println(" ");
                    System.out.println("Do you want to continue? [Y/N]");
                    String option = sc.next();
                    if (!option.equalsIgnoreCase("N")){
                        op = 12;
                    }

                }
                case 4 -> {
                    double raio = 0;
                    System.out.println("Type the ray: ");
                    try {
                        raio = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    if (raio < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    Circulo c1 = new Circulo(raio);
                    System.out.printf("Area: %.2f", c1.calcularArea());
                    System.out.println(" ");
                    System.out.printf("Perimeter: %.2f", c1.calcularPerimetro());
                    System.out.println(" ");
                    System.out.println("Do you want to continue? [Y/N]");
                    String option = sc.next();
                    if (!option.equalsIgnoreCase("N")){
                        op = 12;
                    }

                }
                case 5 -> {
                    double alturah = 0;
                    System.out.println("Type the height: ");
                    try {
                        alturah = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    if (alturah < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    Hexagono h1 = new Hexagono(alturah);
                    System.out.printf("Area: %.2f", h1.calcularArea());
                    System.out.println(" ");
                    System.out.printf("Perimeter: %.2f", h1.calcularPerimetro());
                    System.out.println(" ");
                    System.out.println("Do you want to continue? [Y/N]");
                    String option = sc.next();
                    if (!option.equalsIgnoreCase("N")){
                        op = 12;
                    }

                }
                case 6 -> {
                    double ladoc = 0;
                    System.out.println("Type the side: ");
                    try {
                        ladoc = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    if (ladoc < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    Cubo cu1 = new Cubo(ladoc);
                    System.out.printf("Volume: %.2f", cu1.calcularVolume());
                    System.out.println(" ");
                    System.out.printf("Surface: %.2f", cu1.calcularSuperficie());
                    System.out.println(" ");
                    System.out.println("Do you want to continue? [Y/N]");
                    String option = sc.next();
                    if (!option.equalsIgnoreCase("N")){
                        op = 12;
                    }

                }
                case 7 -> {
                    double alturap = 0;
                    double largurap = 0;
                    double profundidadep = 0;
                    System.out.println("Type the height: ");
                    try {
                        alturap = sc.nextDouble();
                    } catch (InputMismatchException  e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    System.out.println("Type the width: ");
                    try {
                        largurap = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    System.out.println("Type the depth");
                    try {
                        profundidadep = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    if (alturap < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    if (largurap < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    if (profundidadep < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    Paralelepipedo p1 = new Paralelepipedo(alturap, largurap, profundidadep);
                    System.out.printf("Volume: %.2f", p1.calcularVolume());
                    System.out.println(" ");
                    System.out.printf("Surface: %.2f", p1.calcularSuperficie());
                    System.out.println(" ");
                    System.out.println("Do you want to continue? [Y/N]");
                    String option = sc.next();
                    if (!option.equalsIgnoreCase("N")){
                        op = 12;
                    }

                }
                case 8 -> {
                    double raioe = 0;
                    System.out.println("Type the ray: ");
                    try {
                        raioe = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    if (raioe < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    Esfera e1 = new Esfera(raioe);
                    System.out.printf("Volume: %.2f", e1.calcularVolume());
                    System.out.println(" ");
                    System.out.printf("Surface: %.2f", e1.calcularSuperficie());
                    System.out.println(" ");
                    System.out.println("Do you want to continue? [Y/N]");
                    String option = sc.next();
                    if (!option.equalsIgnoreCase("N")){
                        op = 12;
                    }
                }
                case 9 -> {
                    double arestap = 0;
                    double alturapi = 0;
                    System.out.println("Type the edge: ");
                    try {
                        arestap = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    System.out.println("Type the height: ");
                    try {
                        alturapi = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    if (alturapi < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    if (arestap < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    Piramide pi = new Piramide(arestap, alturapi);
                    System.out.printf("Volume: %.2f", pi.calcularVolume());
                    System.out.println(" ");
                    System.out.printf("Surface: %.2f", pi.calcularSuperficie());
                    System.out.println(" ");
                    System.out.println("Do you want to continue? [Y/N]");
                    String option = sc.next();
                    if (!option.equalsIgnoreCase("N")){
                        op = 12;
                    }
                }
                case 10 -> {
                    double raiocil = 0;
                    double alturacil = 0;
                    System.out.println("Type the ray:");
                    try {
                        raiocil = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    System.out.println("Type the height:");
                    try {
                        alturacil = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    if (raiocil < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    if (alturacil < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    Cilindro cil = new Cilindro(raiocil, alturacil);
                    System.out.printf("Volume: %.2f", cil.calcularVolume());
                    System.out.println(" ");
                    System.out.printf("Surface: %.2f", cil.calcularSuperficie());
                    System.out.println(" ");
                    System.out.println("Do you want to continue? [Y/N]");
                    String option = sc.next();
                    if (option.equalsIgnoreCase("N")){
                        op = 12;
                    }
                }
                case 11 -> {
                    double raiocon = 0;
                    double alturacon = 0;
                    System.out.println("Type the ray: ");
                    try {
                        raiocon = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    System.out.println("Type the height: ");
                    try {
                        alturacon = sc.nextDouble();
                    }catch (InputMismatchException e){
                        sc.nextLine();
                        System.out.println("Type a number, not a letter!");
                        break;
                    }
                    if (raiocon < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    if (alturacon < 0) {
                        System.out.println("I don't accept a negative number!");
                        break;
                    }
                    Cone con = new Cone(raiocon, alturacon);
                    System.out.printf("Volume: %.2f", con.calcularVolume());
                    System.out.println(" ");
                    System.out.printf("Surface: %.2f", con.calcularSuperficie());
                    System.out.println(" ");
                    System.out.println("Do you want to continue? [Y/N]");
                    String option = sc.next();
                    if (option.equalsIgnoreCase("N")){
                        op = 12;
                    }
                }
                case 12 -> System.out.println("Exiting...");
            }
        }
    }
}
