import java.io.*;
class FileWrite{
    public static void main(String ar[])throws IOException, FileNotFoundException{
        String s= "This Is Gonna Saved In File";
        char ch[] = s.toCharArray();
        FileWriter fw=new FileWriter("FileWriter.txt");
        for(int i=0; i<s.length();i++){
                   fw.write(ch[i]);
        }
        fw.close();
    }
}