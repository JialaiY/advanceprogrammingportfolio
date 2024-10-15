public class Tester {
    public static void main(String[] args) {
        Dialect dialect = new Dialect("Indo-European", "Europe", 400, "Spanish", "Andalusian", 8000000, true);
        Creole creole = new Creole("Afro-Asiatic", "Caribbean", 100, "French", "French & African", true, 500000);
        Pidgin pidgin = new Pidgin("Austronesian", "Oceania", 1200, "Tok Pisin", "Papua New Guinea");

        System.out.println("Dialect Information:");
        dialect.printInfo();

        System.out.println("\nCreole Information:");
        creole.printInfo();

        System.out.println("\nPidgin Information:");
        pidgin.printInfo();
    }
}
