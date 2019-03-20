package IO;

import java.io.*;

public class IOReaderTest04 {
    public static void main(String[] args) {
        File file = new File("E:\\Code\\myjava\\src\\main\\resources\\IO\\hello.txt");
        Reader reader = null;
        try {
          reader = new FileReader(file);
          char[] flush = new char[1024];
          int len;
          while ((len = reader.read(flush)) != -1) {
              String s = new String(flush,0,len);
              System.out.println(s);
          }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != reader) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
