import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Student\\Projects\\HomeWork\\HomeWork 9\\some files");
        File[] files = file.listFiles();
        StringBuilder sb = new StringBuilder();
        for (File f : files) {
            BufferedReader br = new BufferedReader(new FileReader(f));
            sb.append(br.readLine()).append(" ");
        }
        System.out.println(sb);
        BufferedWriter bw = new BufferedWriter
                (new FileWriter("result.txt",false));
        String text = String.valueOf(sb);
        bw.write(text);
        bw.flush();
        bw.close();
    }
}

