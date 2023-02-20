import java.io.*;

public class BufferedwriterAndReader {

    public static void main(String[] args) throws IOException {

        //Writing
//
//        FileWriter fw = new FileWriter("buffer.txt",true);
//        BufferedWriter bout = new BufferedWriter(fw);
//
//        bout.write("Ridham\n");
//
//        bout.close();

        //Reading

        FileReader fr = new FileReader("buffer.txt");

        BufferedReader br = new BufferedReader(fr);

//        int ch;
//        while((ch=br.read())!=-1){
//
//            System.out.print((char)ch);
//        }
//          String s1;
//        while((s1=br.readLine())!=null){
//
//            System.out.println(s1);
//
//        }
//        br.close();



        char[] s= new char[20];
        br.read(s,0,4);
        System.out.println(s);
    }
}
