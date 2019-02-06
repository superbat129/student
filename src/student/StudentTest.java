/*
 * Burhanuddin Lokhandwala
 * Student Id - 991523243
 * SYST-10199 - Web Programming
 */
package student;

/**
 *
 * @author Burhanuddin
 */
import java.util.*;

class StudentTest
{
	public static void main(String args[])
	{
		Student s[]=new Student[5];
		int i;
		for(i=0;i<5;i++)
		{
			s[i]=new Student();
		}
		String name[]=new String[s.length];
		System.out.println("Give Names of Students");
		for(i=0;i<5;i++)
		{
			Scanner stus=new Scanner(System.in);
			name[i]=stus.nextLine();
			s[i].setName(name[i]);
			System.out.println(s[i].getName());
		}
	}
}
