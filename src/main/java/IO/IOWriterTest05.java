package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOWriterTest05 {
    public static void main(String[] args) {
        File file = new File("E:\\Code\\myjava\\src\\main\\resources\\IO\\dest.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file);
            String s = "world hello !";
            writer.write(s);
            writer.append('h').append("ello");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != writer) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
