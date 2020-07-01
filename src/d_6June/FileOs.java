package d_6June;

import java.io.*;

public class FileOs {
    public static void write() throws IOException {
        String path = "/Users/shaonaiyi/datas/tmp/hello.txt";
        //win系统
//        String path = "c:\\hello.txt";
        File file = new File(path);

        String content = "hello,shaonaiyi.\n";
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(content.getBytes());

        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {
        read();
    }

    public static void read() throws IOException {
        String path = "src/1.txt";
//        String path = "c:\\hello.txt";
        FileInputStream fileInputStream = new FileInputStream(path);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String line = null;
        String str=new String();
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line.startsWith("作品",0));
        }

//        System.out.println(str);

        fileInputStream.close();
    }
}
