import java.util.Scanner;
import java.util.stream.Stream;

public class Operations {
    private Operations(){}
    private static Scanner scanner = new Scanner(System.in);
    private static String key, value;

    public static void showAll(){
        int i = 0;
        for(var e : Planner.getMap().entrySet()){
            System.out.println(i + ") " + e.getKey() + ": " + e.getValue() + ";");
            i++;
        }
    }

    public static void show(){

        System.out.println("Введите заголовок");
        Planner.getEl(scanner.nextLine());

    }

    public static void add() {

        System.out.println("Введите заголовок");
        key = scanner.nextLine();
        System.out.println("Введите значение");
        value = scanner.nextLine();

        Planner.addEl(key, value);

    }

    public static void replace() {
        System.out.println("Введите заголовок");
        key = scanner.nextLine();
        System.out.println("Введите значение");
        value = scanner.nextLine();

        Planner.replaceEl(key, value);
    }

    public static void delete() {
        System.out.println("Введите заголовок");
        key = scanner.nextLine();

        Planner.delEl(key);
    }

    public static void deleteAll() {
        Planner.removeAll();
    }

    public static void save() {
        FileManipulator.save();
    }
}
