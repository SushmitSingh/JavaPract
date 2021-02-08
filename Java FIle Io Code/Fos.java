import java.io.*;

 class Fos{
     public static void main(String arg[]) throws FileNotFoundException,IOException
     {
         FileOutputStream fos=new FileOutputStream("demo.txt");
         String str = "Hello Java";
          byte[] ch = str.getBytes();
          //fos.write(99);
         fos.write(ch);
         fos.flush();
         fos.close();
     }
 }