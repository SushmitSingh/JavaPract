import java.io.*;
class DataIN{
    public static void main(String ar[]) throws IOException, FileNotFoundException
    {

        DataOutputStream dos=new DataOutputStream(new FileOutputStream("demo.txt"));
             dos.writeInt(2020);
             dos.writeChar('A');
             dos.writeChars("This Is A Sting");
             dos.close();
             
        DataInputStream dis=new DataInputStream(new FileInputStream("demo.txt"));
        int a=dis.readInt();
        char st=dis.readChar();
         while(dis.available()>0) {
         
            // read character
            char c = dis.readChar();
            
            // print
            System.out.print(c);
         }
        System.out.println(st+" int is"+a);
             dis.close();
    }
}