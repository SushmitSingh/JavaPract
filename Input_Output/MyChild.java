import java.io.*;
public class MyChild{
ObjectOutputStream fout;
public MyChild1(){
try{
Emp e1=new Emp("Anand",10,4,20,100);
dout=new ObjectOutputStream(new FileOutputStream("Anand3"));
dout.writeObject(e1);
dout.flush();}
catch(Exception e)}}
public static void main(String...s){
new MyChild();}}