import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileUtil {
    public static boolean saveReadersList(List<Reader> readers) {
        boolean check;
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("readers.bin"));
            oos.writeObject(readers);
            oos.close();
            check = true;
        } catch (IOException e) {
            check = false;
            e.printStackTrace();
        }
        return check;
    }

    public static ArrayList<Reader> restoreReadersList() {
        ArrayList<Reader> readers;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("readers.bin"));
            readers = (ArrayList<Reader>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Восстановление не удалось");
            readers = new ArrayList<>();
        }
        return readers;
    }
}
