import java.util.Vector;
public class MyVectorArrayCopy{
	public static void main(String args){
		Vector<String> vcr=new Vector<String>();
		vcr.add("first");
		vcr.add("secend");
		vcr.add("third");
		vcr.add("random");
		System.out.println("Actual Vecto:" +vcr);
		String [] copyArr=new String [vcr.size()];
		vcr.copyInto(copyArr);
		// vcr.toArray(copyArr);
		System.out.println("Copied Array Content");
		for(String str: copyArr){
System.out.println(str);}}}