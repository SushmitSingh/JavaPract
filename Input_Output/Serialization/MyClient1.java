import java.io.*;
public class MyClient1{
ObjectOutputStream dout;
public MyClient1(){
try{
emp e1=new emp("anand",10,5,20,100);
dout=new ObjectOutputStream(new FileOutputStream("Anand4"));
dout.writeObject(e1); 
dout.flush();}
catch(Exception e){
System.out.println(e);}}
public static void main(String ... a){
new MyClient1();}}
