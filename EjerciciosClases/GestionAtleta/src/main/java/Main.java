import modelo.Atleta;

public class Main {
    public static void main(String[] args) {

        // atleta1 -> objeto
        Atleta atleta1 = new Atleta();
        atleta1.setNombre("Sandra");
        atleta1.setEdad(20);
        atleta1.setDeporte("Atletismo");
        atleta1.setPeso(55);
        atleta1.setAltura(1.70);
        atleta1.setHorasEntrenamientodiarias(3);
        atleta1.setImc(atleta1.calcularIMC());
        atleta1.setPromHorasEntrenamiento(atleta1.calcularPromedioSemanalEntrenamiento());
        atleta1.mostrarAtleta();
        System.out.print("Claficación del IMC: ");
        atleta1.clasificarIMC();
        System.out.print("Clasficación del rendimiento: ");
        atleta1.clasificarRendimiento();

        System.out.println("\n-------------------------------\n");

        // atleta2 -> objeto
        Atleta atleta2 = new Atleta("Jose", 21, "Natacion",  75, 1.80, 10, 0);

        System.out.println("Gestion de atletas");
        // calcular el IMC y asignarlo al atributo a traves de metodo set
        atleta2.setImc(atleta2.calcularIMC());
        atleta2.setPromHorasEntrenamiento(atleta2.calcularPromedioSemanalEntrenamiento());
        atleta2.mostrarAtleta();
        System.out.print("Claficación del IMC: ");
        atleta2.clasificarIMC();
        System.out.print("Clasficación del rendimiento: ");
        atleta2.clasificarRendimiento();

    }
}
