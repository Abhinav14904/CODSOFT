import java.util.*;
public class Task2{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int sum=0;
	System.out.println("enter no of subjects");
	int size=sc.nextInt();

	ArrayList<Integer> l=new ArrayList<Integer>(size);

	for(int i=0;i<size;i++){
		System.out.println("Enter marks of " +(i+1)+"st/nd subject:");
		int marks=sc.nextInt();
		if(marks<=100 && marks>=0){
		l.add(marks);
		}
		else{
		System.out.println("enter valid marks(0-100)");
		i--;
		}
	}
	for(int x:l){
	    sum +=x;
	}
	float avg= (float)sum/(l.size());

	System.out.println("Total marks obtained"+sum);

	System.out.println("Average marks obtained"+avg);

	String grade=determinegrade(avg);

	System.out.println(grade);



sc.close();
}
	public static String determinegrade(float avg){
		if(avg>=90){
		   return "A";
		}
		else if(avg>=80 && avg<90){
			return "B";
		}
		else if(avg>=70 && avg<80){
			return "C";
		}
		else if(avg>=60 && avg<70){
			return "D";
		}
		else{
		  return "Fail";
		}

	}
}