import java.io.*;
class FileRead{
    public static void main(String st[])throws IOException,FileNotFoundException
    {
      FileReader Fr=new FileReader("Fist.txt");
      int s ;
      while((s= Fr.read())!= -1){
      System.out.print((char)s);
      }
      Fr.close();
    }
}