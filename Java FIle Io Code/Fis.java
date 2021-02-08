import java.io.*;
class Fis{
    public static void main(String args[]) throws FileNotFoundException,IOException
    {
        File fi=new File("Fist.txt");
         InputStream fis=new FileInputStream(fi);
        int data;
         
         while((data=fis.read()) != -1)
         {
              System.out.print((char)data);
         }
         
         fis.close();

            

           


    }
}