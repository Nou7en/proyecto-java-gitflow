public class Main {
    public static void main(String[] args) {
        // Saludo original
        Saludo saludo = new Saludo();
        System.out.println(saludo.generarSaludo("Mundo"));

        // Nueva funcionalidad de despedida
        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundo"));
    }
}