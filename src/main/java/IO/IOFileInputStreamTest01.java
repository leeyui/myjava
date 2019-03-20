package IO;

import java.io.*;

/**
 * FileInputStream的例子
 */
public class IOFileInputStreamTest01 {
    public static void main(String[] args) {
        File file = new File("E:\\Code\\myjava\\src\\main\\resources\\IO\\hello.txt");
       InputStream is = null;
        try {
            is = new FileInputStream(file);
            int tmp;
            while ((tmp = is.read()) != -1) {
                System.out.println((char)tmp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
