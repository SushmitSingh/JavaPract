import java.io.*;
class PrintSt{
   public static void main(String ar[])throws IOException,FileNotFoundException
   {
      FileOutputStream fos=new FileOutputStream("fos.txt");
      PrintStream ps=new PrintStream(fos);
      ps.println(11);
      ps.println("This Is A Coming");
      ps.close();
      fos.close();
   }
}
