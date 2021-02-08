import java.io.*;
class Sequls{
    public static void main(String ar[]) throws IOException,FileNotFoundException
    {
        FileInputStream Fis=new FileInputStream("Fist.txt");
        FileInputStream Fis1=new FileInputStream("Fist1.txt");

        SequenceInputStream seq=new SequenceInputStream(Fis,Fis1);
        
            int data;
            while((data=seq.read())!=-1)
            {
                System.out.print((char)data);
            }
        
        Fis.close();
        Fis1.close();
        seq.close();
    }
}