package IO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class IOByteArrayOutputStreamTest07 {
    public static void main(String[] args) {
        ByteArrayOutputStream bos = null;
        String s = "hello world";
        byte[] data = s.getBytes();
        try {
            bos = new ByteArrayOutputStream();
            bos.write(data);
            byte[] bytes = bos.toByteArray();
            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
