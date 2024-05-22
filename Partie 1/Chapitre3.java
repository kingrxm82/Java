public class Chapitre3 {
    // Variable globalbe
    static String root = "Disponible dans tous les lignes"; // Attribut de classe

    // Visible pour tous
    public boolean exempleBoolean = true;

    // Accessible uniquement dans le contexte dans lequel les variables sont définies
    // private String exempleString = "String";

    // Visible pour le package et l'ensemble de ses sous-classes
    protected Boolean exempleProtected = true;

    public static void main(String[] args) {
        // Variable locale
        String spy = "Je suis un espion";
        System.out.println(root);
        System.out.println(spy);
    }

    public static void helpfulFunction() {
        // Variable locale
        String anotherSpy = "Je suis un autre espion";
        System.out.println(root);
        // System.out.println(spy); ==>Erreur : spy est une variable locale
        System.out.println(anotherSpy);
    }
}
