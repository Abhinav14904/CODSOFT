import java.util.*;
public class Task1{
public static void main(String[] args){
	Random rand=new Random();
	int r=rand.nextInt(100);
	System.out.println("GAME OF NUMBERS");
	System.out.println("Enter a Number Between 1-100");
	game(r,0);
}
public static void game(int ran,int chances){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Your Guess: ");
	int userinput=sc.nextInt();
	if(userinput!=ran){
		if(userinput>ran){
		System.out.println("Too High");
		}
		else{
		System.out.println("Too Low");
		}
		
		game(ran,chances+1);
	}
	else{
	System.out.println("Congratulations You Got the Correct Number");
	System.out.println("Your Score is: "+(100-chances));
	}
sc.close();
}
}