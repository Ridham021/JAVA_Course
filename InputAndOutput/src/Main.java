import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        File f1 = new File("hello.txt");
//        f1.createNewFile();
//        System.out.println("file exist : "+f1.exists());
//         f1.delete(); //deleting file

        //FileOutputStream


//        int i;
//        FileOutputStream fout = new FileOutputStream("Hello.txt",true);
//        String s = "TATA";
//
//        char ch[] = s.toCharArray();
//        for(i=0;i<s.length();i++){
//            fout.write(ch[i]);
//        }
//        fout.close();

        //FileInputStream

        int i;
        FileInputStream fis = new FileInputStream("Hello.txt");

        do {
            i = fis.read();
            if (i != -1) {
                System.out.print((char) i);
            }
        } while (i != -1);

        fis.close();



    }
}
