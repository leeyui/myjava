package IO;

import java.io.*;

/**
 * FileOutputStream的例子
 */
public class IOFileOutputStreamTest03 {
    public static void main(String[] args) {
        File dest = new File("E:\\Code\\myjava\\src\\main\\resources\\IO\\dest.txt");
        OutputStream os = null;
        try {
            os = new FileOutputStream(dest,true);
            byte[] data = "hello world".getBytes("UTF-8");
            os.write(data);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != os) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
