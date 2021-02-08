import java.io.*;
class Car implements Externalizable{
static int age;
String name;
int year;
// mandatory public no-arg constructor
public Car(){
System.out.println("Default");}
Car(String n,int y){
name=n;
year=y;
age=10;}
// Mandatory writeExeternal method
public void writeExeternal(ObjectOutput out)throws IOException {
System.out.println("writeExeternal");
out.writeObject(name);
out.writeInt(year);
out.writeInt(age);}
// Mandatory readExternal method
public void readExternal(ObjectInput in )throws IOException,ClassNotFoundException{
System.out.println("readExternal");
name=(String)in.readObject();
year=in.readInt();
age=in.readInt();}
public String toString(){
return("Name: " + name + " \n " + "Year: " + year +" \n "+ " age: "+age);}}
public class ExternExample{
public static void main(String... args){
// create a Car object
Car car=new Car("MG Hector",2019);
Car newCar=null;
//serialize the car
try{
FileOutputStream fo=new FileOutputStream("tmp");
ObjectOutputStream so=new ObjectOutputStream(fo);
so.writeObject(car);
so.flush();}
catch(Exception e){
System.out.println(e);}
// de-serialize the Car
try{
FileInputStream fi=new FileInputStream("tmp");
ObjectInputStream si=new ObjectInputStream(fi);
newCar=(Car) si.readObject();}
catch(Exception e){
System.out.println(e);}
System.out.println("The original car is");
System.out.println(car);
System.out.println("The new car is ");
System.out.println(newCar);}}

/*
\1. In this example, class Car implements Externalizable interface which means that car object is ready for serialization. This class has two public methods-"writeExeternal" and "readExteranl". Unlike Serializable interface which will serialize all the  variable in the object with just by implementing the interface, here you have to explicitly mention what fields or variables you want to serialize and the same is done in "writeExeternal" and "readExteranl" methodsl So in the "ExternExample" class , when you write the "Car" object to the OutputStream, the "writeExeternal" method is called and the data is persisted. The same applies to "readExteranl" method in the ObjectInputStream, "readExteranl" method in called 
2. Also the information about class description in added to the stream which includes the descption of all the serializable superclasses, the description of the class and the instance data associated with the specific instance of the class. Lots of data and metadata and again performance issue.
3. Now when an Externalizable object is reconstructed, an instance is created first using the public no-arg constructor then the readExternal method is called.
4. When an object that implements Serializable interface , is serialized or de-serialize, no constructor of the object is called and hence any initialization which is done in the constructor connot be done.
5. Externalization is nothing but serialization but by implementing Externalizable interface to persist and restore the object . To externalize your object, you need to implemenent externalizable interface that extends Serializable interface.Here only the identity of the class is written in the serialization stream and it is the responsibility of the class to save and restore the contents of its instance which means you will have complete control of what to serialize and what not to serializa. But with serialization the identity of all the classes, its superclasses, instance variables and then the contents for these items is written to the serialization stream. But to externalize an  object, you need a default public constructor.
6. Limitations of Serialization

1>>File size is very high
1>>Costomization due to transient which in not effective because we get null in place of transient attributes.
 
7. One thing you can do with externalizable is that you can store extra information into object like STATIC variables and transient variables or you can add more information if you have any business need
8. Externalization allows you to customize how serialization is done. By implementing externalization you are controlling what gets serialized(and what doesnot) as versus default serialization where all non-transient attributes get serialized.
*/