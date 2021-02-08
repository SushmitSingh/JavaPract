import java.io.*;
import java.util.*;
class MyStringTokenizer{
public static void main(String... args) throws IOException{
String s="county=indiaa;capital=delhi;county=japan;capital=tokto;";
StringTokenizer st=new StringTokenizer(s,";=");
while(st.hasMoreTokens()){
System.out.println(st.nextToken());}}}
