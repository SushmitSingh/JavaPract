import java.io.File;
public class EmptyDir{
public static void main(String... ags){
File file=new File("E:\\anand");
if(file.isDirectory()){
String[] files=file.list();
if(files.length>0){
System.out.println("The "+file.getPath()+"is not empty!");}}}}