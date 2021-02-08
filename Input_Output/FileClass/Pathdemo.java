import java.nio.file.Path;
import java.nio.file.Paths;
public class Pathdemo{
public static void main(String... args){
Path p1=Paths.get("E:\\anand\\anand.java");
printDetails(p1);
Path p2=Paths.get("anand.java");
printDetails(p2);}
public static void printDetails(Path p){
System.out.println("Detials for path:"+p);
int count =p.getNameCount();
System.out.println("Name count: "+count);
for(int i=0;i<count;i++){
Path name=p.getName(i);
System.out.println("Name at index "+i+"is "+name);}
Path parent=p.getParent();
Path root=p.getRoot();
Path fileName=p.getFileName();
System.out.println("Parent:"+parent+" Root "+root+" File Name"+fileName);
System.out.println("Absolute Path :"+p.isAbsolute());}}