import java.io.File;
public class EmptyDir{
	public static void main(String ... args){
		File file=new File("E:\\sir");
		if(file.isDirectory()){
			String[] files=file.list();
			if(files.length>0){
System.out.println("Thre"+file.getPath()+"is not empty");}}}}