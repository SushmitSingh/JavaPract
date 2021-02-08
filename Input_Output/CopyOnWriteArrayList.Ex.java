import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class CopyOnWriteArrayListEx{
	public static void main(String... args){
		CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		try{
			ArrayListTh1 alt1=new ArrayListTh1(al);
			ArrayListTh2 alt2=new ArrayListTh2(al);
			tt1.setPriority(5);
			tt