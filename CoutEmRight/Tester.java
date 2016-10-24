import java.util.*;
import java.io.*;
public class Tester {

	public static void main(String[] args) {
		Scanner kbReader=new Scanner(System.in);
		boolean question=true;
		String start="";
		String end=" WORD";
		//String xyz[];
		String zz;
		//String zyx[];
		while (question)
		{
		System.out.println("Type in a sentence and press ENTER. ");
		String xxx=kbReader.nextLine().toUpperCase();
		xxx+=end;
		if (xxx.equals("EXIT WORD"))
		{break;}
		else
		{
			
			//System.out.println("Type in a sentence and press ENTER. ");
			//zz=kbReader.next();
			//xxx.toUpperCase();
			xxx.split("\\s+");
		
		//for (int n=0; n==1;n++)
		//{
			String[] xyz=new String[1];
			start+=xxx;
			xyz[0]=start;
		
		String []zyx=xyz[0].split("SA");
		//System.out.println(xyz[0].split("SA"));
		//System.out.println(zyx[0]);
		if (zyx.length==1)
		{
			System.out.println("There is "+(zyx.length)+" occurrences.");
		}
		else if (zyx.length==2)
		{
			System.out.println("There are "+(zyx.length)+" occurrences.");
		}
		else
		{
			System.out.println("There are "+(zyx.length-1)+" occurrences.");
		}
	
		}
		
	}
		
	}
}


