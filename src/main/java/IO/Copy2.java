package IO;

import java.io.*;

/**
 * 文件拷贝
 * 源文件从文件输入流到字节数组输出流
 * 字节数组输入流到文件输出流到拷贝文件
 */
public class Copy2 {
    public static void main(String[] args) {
        String s1 = "E:\\Code\\myjava\\src\\main\\resources\\IO\\1.jpg";
        String s2 = "E:\\Code\\myjava\\src\\main\\resources\\IO\\3.jpg";
        byte[] a = fileToByteArray(s1);
        byteArrayToFile(a,s2);

    }
    static byte[] fileToByteArray(String path) {
        File file = new File(path);
        InputStream is = null;
        ByteArrayOutputStream bos = null;
        try {
            is = new FileInputStream(file);
            bos = new ByteArrayOutputStream();
            byte[] flush = new byte[1024];
            int len;
            while ((len = is.read(flush)) != -1) {
                bos.write(flush,0,len);
                bos.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null != is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bos.toByteArray();
    }
    static void byteArrayToFile(byte[] data,String path) {
        File file = new File(path);
        OutputStream os = null;
        ByteArrayInputStream bis = null;
        try {
            os = new FileOutputStream(path);
            bis = new ByteArrayInputStream(data);
            byte[] flush = new byte[1024];
            int len;
            while ((len = bis.read(flush)) != -1) {
                os.write(flush,0,len);
                os.flush();
            }
        } catch (FileNotFoundException e) {
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
