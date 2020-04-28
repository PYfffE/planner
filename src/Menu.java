import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        String x = "-1";
        while(!x.equals("0")) {
            System.out.println("Выберите действие\n");

            System.out.println("1) Просмотреть все записи");
            System.out.println("2) Поиск по записям");
            System.out.println("3) Добавить элемент");
            System.out.println("4) Изменить элемент");
            System.out.println("5) Удалить элемент");
            System.out.println("6) Удалить всё");
            System.out.println("0) Выход\n");

            System.out.print("Выберите действие..");

            x = scanner.nextLine();
            chooseOp(x);
        }
    }

    public void chooseOp(String x){
        switch (x){
            case "0":
                Operations.save();
                System.exit(0);
                break;
            case "1":
                Operations.showAll();
                break;
            case "2":
                Operations.show();
                break;
            case "3":
                Operations.add();
                break;
            case "4":
                Operations.replace();
                break;
            case "5":
                Operations.delete();
                break;
            case "6":
                Operations.deleteAll();
                break;
            default:
                System.out.println("Неверное значение");
                break;
        }
    }
}
