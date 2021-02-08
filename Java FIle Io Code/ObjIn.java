import java.io.*;
class Objin
{
    public static void main(String arg[])throws IOException,FileNotFoundException, ClassNotFoundException,NotSerializableException
    {
          student stu=new student("Aman",100);
          teacher te=new teacher("Raman",1234);
          course  cu=new course("Java",400);
   
        ObjectOutputStream ous=new ObjectOutputStream( new FileOutputStream("Oj.txt"));
                ous.writeObject(stu);
                ous.writeObject(te);
                ous.writeObject(cu);
                ous.close();
                

        ObjectInputStream ois=new ObjectInputStream( new FileInputStream("Oj.txt")); 
                  student ind=null;
                 ind=(student)ois.readObject();   
               System.out.println(ind.stuname+" "+ind.stuid);

               teacher tedata=null;
               tedata=(teacher)ois.readObject();
               System.out.println(tedata.tename+" "+tedata.teage);
                    course cudata=null;
               cudata=(course)ois.readObject();
               System.out.println(cudata.coursename+" "+ cudata.rupee);
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
    class teacher implements Serializable
    {
        String tename;
        int teage;
        public teacher(String tename ,int teage)
        {
            super();
            this.tename=tename;
            this.teage=teage;
        }

    }
    class course implements Serializable
    {
        String coursename;
        int rupee;
        public course(String coursename,int rupee)
        {
            super();
            this.coursename=coursename;
            this.rupee=rupee;
        }
    }
