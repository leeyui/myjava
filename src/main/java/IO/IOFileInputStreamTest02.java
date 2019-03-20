package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOFileInputStreamTest02 {
    public static void main(String[] args) {
        File file = new File("E:\\Code\\myjava\\src\\main\\resources\\IO\\hello.txt");
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            //1024 * 10 * 5：1M * 10 * 5便于阅读
            byte[] flush = new byte[1024 * 10 * 5];
            int len ;
            while ((len = is.read(flush)) != -1) {
                String s = new String(flush,0,len);
                System.out.println(s);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
