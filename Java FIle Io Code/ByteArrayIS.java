import java.io.*;
class ByteArrayIs{
    public static void main(String Arg[]) throws IOException, FileNotFoundException
    {
           String st= "This Is Bios ";
           byte ch[] = st.getBytes();
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
           baos.write(ch);
        

        //Reading Data Online in Array
          byte bis[] = baos.toByteArray();
        ByteArrayInputStream bais=new ByteArrayInputStream(bis);
        int data;
             while((data=bais.read()) != -1)
             {
                  System.out.print((char)data);
             }
      
        bais.close();
    }
}