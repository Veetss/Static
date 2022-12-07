public class Main {
    public static void main(String[] args) {
        Employee pino = new Employee("Pino", "Daniele", "Via Napoli Mille Colori, 6");
        Badge pinoBadge = new Badge(pino);

        pinoBadge.showBadgeDetails();

        Employee gianni = new Employee("Gianni", "Celeste", "Via Povero Gabbiano, 10");
        Badge gianniBadge = new Badge(gianni);

        gianniBadge.showBadgeDetails();
    }
}
