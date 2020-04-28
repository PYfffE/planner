public class Main {
    public static void main(String[] args) {

        // Панфилов Алексей
        // БАСО-02-18
        // Ежедневник

        FileManipulator.init();

        Planner.init();
        Menu menu = new Menu();
        menu.showMenu();
    }
}
