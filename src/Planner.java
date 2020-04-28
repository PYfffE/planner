import java.util.Map;
import java.util.TreeMap;

public class Planner {
    private static Map<String, String> dataBase;

    public static Map<String, String> getMap(){
        return dataBase;
    }

    public static void getEl(String key){
        if (!dataBase.containsKey(key)) {
            System.out.println("Заданный ключ не существует");
            return;
        }
        System.out.println(dataBase.get(key));
    }

    public static void addEl(String key, String value){
        if(dataBase.containsKey(key)){
            System.out.println("Заданный ключ существует");
            return;
        }

        dataBase.put(key, value);
    }

    public static void delEl(String key){
        if(!dataBase.containsKey(key)){
            System.out.println("Невозможно удалить запись. Заданный ключ не существует");
            return;
        }
        dataBase.remove(key);
        System.out.println("Готово.");
    }

    public static void replaceEl(String key, String value) {
        if (!dataBase.containsKey(key)) {
            System.out.println("Заданный ключ не существует");
            return;
        }
        dataBase.put(key, value);
    }

    public static void removeAll() {
        dataBase = new TreeMap<>();
    }

    public static void init() {
        dataBase = FileManipulator.load();
    }
}
