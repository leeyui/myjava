package IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class IOByteArrayInputStreamTest06 {
    public static void main(String[] args) {
        //除了文件流需要释放，其他流由JVM自己管理释放
        ByteArrayInputStream bis = null;
        String s = "hello world";
        byte[] data = s.getBytes();
        try {
            bis = new ByteArrayInputStream(data);
            byte[] flush = new byte[2];
            int len;
            while ((len = bis.read(flush)) != -1) {
                String str = new String(flush,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
