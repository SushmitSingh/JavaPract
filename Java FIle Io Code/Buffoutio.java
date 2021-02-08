import java.io.*;
import java.util.*;
class Buffoutio{
    public static void main(String ar[])throws IOException,FileNotFoundException
    {
        Scanner sc=new Scanner(System.in);
      
        OutputStream bos=new BufferedOutputStream( new FileOutputStream("Bufer.txt"));
        String str = sc.nextLine();
        byte[] ch = str.getBytes();
        bos.write(ch);
        bos.flush();
        bos.close();
       
        System.out.println("Data Is Sved In a File");
    }
}