import java.util.*;
import java.io.*;
class ByteArrayos{
    public static void main(String arg[])throws FileNotFoundException,IOException
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Some Text To share In Aother File y usig ytearryoutput Stream");
          String text=sc.nextLine();
          byte ch[] = text.getBytes();

        ByteArrayOutputStream baos= new ByteArrayOutputStream();
          baos.write(ch);

        FileOutputStream Fos=new FileOutputStream("yteData.txt");
        baos.writeTo(Fos);

        FileOutputStream Fos1=new FileOutputStream("Hello.txt");
        baos.writeTo(Fos1);
        Fos.close();
        baos.close();

    }

}