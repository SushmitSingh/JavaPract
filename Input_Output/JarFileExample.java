// commond create java file ->  jar cvf JarFileName.jar    SeceltItemName
// for example>  jar cvf t1.jar  *.java

 import java.io.IOException;
 import java.util.Enumeration;
 import java.util.jar.JarEntry;
 import java.util.jar.JarFile;
 public class JarFileExample{
	 public static void main(String ... args) throws IOException{
		 JarFile jarFile=new JarFile("E:\\anand\\t1.jar");
		 Enumeration e= jarFile.entries();
		 while (e.hasMoreElements()){
		 process (e.nextElement());}
 jarFile.close();}
 private static void process(Object obj){
	 JarEntry entry=(JarEntry) obj;
	 String name=entry.getName();
	 long size=entry.getSize();
	 long compressedSize=entry.getCompressedSize();
 System.out.println(name+ " \t " + size+ " \t " +compressedSize);}}
 