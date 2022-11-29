
import java.util.Arrays;
import java.util.Scanner;

public class StudentReportingSystem {
	static String name;
	static int emarks1,mmarks1,smarks1,emarks2,mmarks2,smarks2;
	public static void main(String[] args) {	
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		sum [] obj=new sum[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+" student name");
			String s=sc.next();
			System.out.println("Enter the 1 sem english marks");
			int a=sc.nextInt();
			System.out.println("Enter the 1 sem maths marks");
			int b=sc.nextInt();
			System.out.println("Enter the 1 sem Science marks");
			int c=sc.nextInt();
			System.out.println("Enter the 2 sem english marks");
			int d=sc.nextInt();
			System.out.println("Enter the 2 sem maths marks ");
			int e=sc.nextInt();
			System.out.println("Enter the 2sem Science marks");
			int f=sc.nextInt();
			obj[i]=new sum(s,a,b,c,d,e,f);
		}
		float sum1=0;
		int [] mar=new int[n];
		for(int i=0;i<n;i++) {
			obj[i].display();
			sum1+=obj[i].avg;
			mar[i]=(int) obj[i].avg;
		}
		
		sum1=sum1/n;
		System.out.println("Average of class "+sum1);
		//Arrays.sort(mar);
		int max=mar[0],j=0,k=0;
		for(int i=0;i<n;i++)
			if(max<mar[i]) {
				j=i;
				max=mar[i];
			}
				
		Arrays.sort(mar);
		String sec="";
		for(int i=0;i<n;i++)
			if(obj[i].avg==mar[n-2])
			{
				sec=obj[i].name;
				k=i;
			}
			System.out.println("Top first performer of the class is "+obj[j].name+" and score is "+obj[j].avg);
			System.out.println("Top second performer of the class is "+sec+" and score is "+obj[k].avg);
			
	}
}
 class sum
{
	String name;
	int e1,m1,s1,e2,m2,s2;
	float avg;
	sum(String n,int a,int b,int c,int d,int e,int f)
	{
		name=n;
		e1=a;
		m1=b;
		s1=c;
		e2=d;
		m2=e;
		s2=f;
		avg=(e1+m1+s1+e2+m2+s2)/6; 
	}
	
	public void display()
	{
		System.out.println(name+" average: "+(float)(e1+m1+s1+e2+m2+s2)/6);
		
	}
	
 }
