import com.sun.source.tree.Tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileManipulator {
    private static File file;
    private static Scanner scanner;
    private static PrintWriter printWriter;

    public static void init(){
        file = new File("records.db");
    }
    public static Map load(){
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] buf;

        Map<String, String> map = new TreeMap<>();
        while (scanner.hasNext()){
            buf = scanner.nextLine().split("[&]");
            map.put(buf[0], buf[1]);
        }
        scanner.close();

        return map;
    }

    public static void save(){
        if(file.exists()) file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, String> map = Planner.getMap();

        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for(var e : map.entrySet()){
            printWriter.println(e.getKey() + "&" + e.getValue());
        }

        printWriter.close();

    }

}
