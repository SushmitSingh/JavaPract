import java.io.IOException;
import java.util.Enumration;
import java.util.JarEntry;
import java.util.jar.JarFile;
public class JarFileEx{
public static void main(String... args) throws IOException{
JarFile jarFile=new JarFile("E:\\Anand\\Bind\\Anand.jar");
Enumration e=jarFile.entries();
while(e.hasMoreElements()){
process(e.nextElement());}
jarFile.close();}
private static void process(Object obj){
JarEntry entry=(JarEntry)obj;
String name=entry.getName();
long size=entry.getSize();
long compressedSize=entry.getCompressedSize();
System.out.println(name+ "\t"+ size+"\t"+compressedSize);}}