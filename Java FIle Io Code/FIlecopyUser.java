 import java.io.*;
 class FilecopyUser{
     public static void main(String Ar[]) throws FileNotFoundException,IOException
     {
         FileInputStream fis=new FileInputStream(Ar[0]);
         FileOutputStream fos=new FileOutputStream(Ar[1]);
     
            int data;
            while((data= fis.read()) != -1)
            {
                fos.write(data);

            }
            fos.close();
            fis.close();
     }
 }