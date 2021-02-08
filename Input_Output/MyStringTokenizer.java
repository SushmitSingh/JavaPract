import java.io.*;
import java.util.*;
class MyStringTokenizer{
	public static void main(String... arfs) throws IOException{
		String s="county =india ; capital=del,hi; country=japan;capital=tokyo;";
		StringTokenizer st=new StringTokenizer(s,",;=");
		while(st.hasMoreTokens()){
System.out.println(st.nextToken());}}}