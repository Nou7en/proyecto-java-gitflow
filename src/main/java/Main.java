public class Main {
    public static void main(String[] args) {
        // Logo ASCII
        System.out.println("***************");
        System.out.println("* JAVA PROJECT *");
        System.out.println("***************");

        // Saludo multilingüe
        Saludo saludo = new Saludo();
        System.out.println(saludo.generarSaludo("Mundo", "es"));
        System.out.println(saludo.generarSaludo("World", "en"));
        System.out.println(saludo.generarSaludo("Monde", "fr"));

        // Funcionalidad de despedida
        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundo"));
    }
}