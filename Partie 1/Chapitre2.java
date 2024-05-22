public class Chapitre2 {
    public static void main(String[] args) {
        String exemple = "hello world";

        // Ajouter la méthode uppercase pour transferer notre texte en majiscule
        exemple = exemple.toUpperCase();

        // On a utiliser la méthode pour remplacer une partie de notre ancien text vers un autre text
        exemple = exemple.replace("HELL", "YEAH");

        System.out.println(exemple);

    }
}
