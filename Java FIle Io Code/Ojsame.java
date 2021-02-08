import java.io.*;
import java.util.*;
class Objin
{
    public static void main(String arg[])throws IOException,FileNotFoundException, ClassNotFoundException,NotSerializableException
    {
         Scanner sc=new Scanner(System.in);
        int i=0;
          ObjectOutputStream ous;
         int Esn=sc.nextInt();
        for( i=0; i<=Esn; i++){
           
            String name=sc.nextLine();
            int id=sc.nextInt();
          student Integer.toString(i);
          Integer.toString(i)=new student(name,id);
          ous=new ObjectOutputStream( new FileOutputStream("Oj.txt",true));
                ous.writeObject(i);
        }
   
      
                ous.close();
                

        ObjectInputStream ois=new ObjectInputStream( new FileInputStream("Oj.txt")); 
                  student ind=null;
                 ind=(student)ois.readObject();   
               System.out.println(ind.stuname+" "+ind.stuid);
                  ois.close();
        
    }
}
    class student implements Serializable
    {
        String stuname;
        int stuid;
        public student(String stuname,int stuid)
        {
            super();
            this.stuname=stuname;
            this.stuid=stuid;
        }

    }
    
    
