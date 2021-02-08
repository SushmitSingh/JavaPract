import java.io.*;
class ObjectinOu implements Serializable {
    public static void main(String ar[])throws IOException,FileNotFoundException, ClassNotFoundException,NotSerializableException
    {
       student stu=new student("Aman",1011);
         //Serializing Tha Object
         ObjectOutputStream ous=new ObjectOutputStream(new FileOutputStream("obj.txt"));
         ous.writeObject(stu);
         ous.close();

         //Deserializing Tha Object
         ObjectInputStream ois=new ObjectInputStream(new FileInputStream("obj.txt"));
         student ind=null;
            ind=(student)ois.readObject();   
         System.out.print(ind.name+" "+ind.rnu);
         ois.close();
          }
      
}
class student implements Serializable
        {
            String name ;
            int rnu;
            public student(String name, int rnu)
            {
                super();
                this.name=name;
                this.rnu=rnu;
            }
        }