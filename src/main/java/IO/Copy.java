package IO;

import java.io.*;

/**
 * 实现了文件拷贝
 * 读取文件使用FileInputStream，写入文件使用FileOutputStream
 */
public class Copy {

    public static void main(String[] args) {
        String str = "E:\\Code\\myjava\\src\\main\\resources\\IO\\1.jpg";
        copy(str);
    }

    static void copy(String file) {
        File orn = new File(file);
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(orn);
            os = new FileOutputStream("E:\\Code\\myjava\\src\\main\\resources\\IO\\2.jpg",true);
            byte[] flush = new byte[256];
            int len;
            while ((len = is.read(flush)) != -1) {
                os.write(flush,0,len);
                os.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
