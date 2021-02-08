import java.io.*;
class Buffis {
public static void main(String arg[] ) throws FileNotFoundException,IOException
 {
    FileInputStream Fis=new FileInputStream("Demo.txt");
    BufferedInputStream bis =new BufferedInputStream(Fis);
    int data;
    while( (data= bis.read())!=-1){  
    System.out.print((char)data);
    }
    bis.close();
    Fis.close();  
 }
}