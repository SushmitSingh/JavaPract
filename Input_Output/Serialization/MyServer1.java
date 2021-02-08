// Life time baad
import java.io.*;
public class MyServer1{
ObjectInputStream dis;
public MyServer1(){
try{
dis=new ObjectInputStream(new FileInputStream("Anand4.txt"));
emp z=(emp)dis.readObject();
emp z2=(emp)dis.readObject();
System.out.println("name="+z.name);
System.out.println("age="+z.age);
System.out.println("name="+z2.name);
System.out.println("age="+z2.age);}
catch(Exception e){
System.out.println(e);}}
public static void main(String... args){
new MyServer1();}}