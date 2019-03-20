package IO;

import java.io.*;

public class Spliter {
    public static void main(String[] args) {
        RandomAccessFile source = null;
        FileInputStream is= null;
        try {
            File file = new File("E:\\Code\\myjava\\src\\main\\resources\\IO\\IO笔记.md");
            long len = file.length();
            int beginPos = 0;
            int actulSize = 256;
            int size = (int) Math.ceil((len * 1.0)/ actulSize);
            is = new FileInputStream(file);
            int read;
            byte[] flush = new byte[actulSize];
            source = new RandomAccessFile(file,"r");
            for (int i = 0; i < size; i++) {
                if (actulSize > len ) {
                    actulSize = (int) len;
                } else {
                    len -= actulSize;
                }

                while ((read = is.read(flush)) != -1) {
                    if (actulSize > read ) {
                        File file1 = new File("E:\\Code\\myjava\\src\\main\\resources\\IO\\xx" + i + ".md");
                        OutputStream out = new BufferedOutputStream(new FileOutputStream(file1));
                        out.write(flush);
                        out.flush();
                    } else {
                        File file1 = new File("E:\\Code\\myjava\\src\\main\\resources\\IO\\xx" + i + ".md");
                        OutputStream out = new BufferedOutputStream(new FileOutputStream(file1));
                        out.write(flush);
                        out.flush();
                        break;
                    }
                }
                beginPos += actulSize;
                source.seek(beginPos);
                System.out.println("-------------");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
