import java.io.*;
class MyBufferedWriter{
	public static void main(String...args)throws IOException{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		FileWriter fw=new FileWriter("Anand.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(fw);
		String s="  ";
		while(!s.equals("stop")){
			s=br.readLine();
			//bw.write(s);
			//bw.write("   ");
			pw.println(s);
		//flush();
		}
		br.close();
		br.close();
br.close();}}