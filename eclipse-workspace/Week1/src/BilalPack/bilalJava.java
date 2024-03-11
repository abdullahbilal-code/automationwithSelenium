package BilalPack;
import java.util.Scanner; 
import java.util.ArrayList;
public class bilalJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 boolean hasGoodSalary = false;
	 boolean hasGoodCredit = true;
	 boolean hasCriminalRecord = false;
	 
	 boolean isEligible = (hasGoodSalary || hasGoodCredit) && ! hasCriminalRecord; 
	 
	 System.out.println(isEligible);
	 
	 int temp =30;
	 
	 if(temp >30) {
		 System.out.println("Today is Hot!");
		 System.out.println("Stay Hydrated");
		 
	 }		
	 else if (temp >20 && temp <=30) {
		 System.out.println("It's a beautiful day. Enjoy!");
	 }
	 else {
		 System.out.println("It's Cold. Stay Home!");
	 }
	 
	 //To Get Rid of if else we can use Ternary Operator
	 //Ternaary Operator 
	 
	 int income = 60_000;
	 String ClassName = income > 1000_00 ? "First" : "Economy";
	 System.out.println(ClassName);
	 
	 //Switch Statements
	 
	 String role = "Admin";
	 
	 switch(role) {
	 
	 case "Admin":
		 System.out.println("Your're an admin!");
		 break;
		 
	 case "Moderatore":
		 System.out.println("You're a moderator!");
		 break;
		 
	 default:
		 System.out.println("You're a Guest");
	 
	 }
	    
	 for (int i=5; i > 0 ; i--)
		 System.out.println("Hello World !"+ i);
	 
	 int i=0;
	 
	 while (i>=0) {
		 System.out.println("Hello World "+i);
		 i--;
	 }
     Scanner scanner = new Scanner(System.in);
	 String input=""; 
	 
//	 while(!input.equals("quit")) {
//		 System.out.println("Input: ");
//		 input = scanner.next().toLowerCase();
//		 if (input.equals("start"))
//			 continue;
//		 if (input.equals("quit"))
//			 break;
//		 System.out.println(input);
//	 } 
//	
//	 do {
//		 System.out.println("Input: ");
//		 input = scanner.next().toLowerCase();
//		 if (input.equals("quit"))
//			 break;
//		 System.out.println(input);
//	 }
//	 while(true);

	 String [] fruits = {"Apple", "Orange", "Bnana", "Mango", "Peers"};
	 
	double [][][] dec = { {{0.1, 0.25, 0.5}, {0.75, 1.0} }, {{2.1,2.25,2.5},{2.75,3.0}},{{3.1,3.25,3.5},{3.75,4.0}}};
	 
//	 for(double Bad: dec) {
//		 System.out.println(Bad);
//	 }
	 
	 for (int a=0; a < dec.length; a++) {
		 
		 for (int b=0; b < dec[a].length; b++) {
			 
			 for (int c=0; c < dec[b].length; c++) {
				 
				 
					System.out.println("Index: "+dec[a][b][c]);
				 
		 }
		 }
	 }
	 
	 ArrayList <Integer> vehicles = new  ArrayList <Integer> ();
	 vehicles.add(1);
	 vehicles.add(2);
	 vehicles.add(3);
	 vehicles.add(4);
	 vehicles.add(5);
	 
	 vehicles.set(1, 2);
	
	//String and String Manipulation. 
	 //vehicles.clear();
	// System.out.println(vehicles);
	
	 
	 
	 
	 //String Builder uses to concatenate the strings 
	 
	 StringBuilder sb = new StringBuilder();
	 
	 sb.append("Muhammad");
	 sb.append(" ");
	 sb.append("Abdullah");
	 sb.append(" ");
	 sb.append("Bilal");
	 
	 String result= sb.toString();
	 
	 System.out.println("Result of String Builder: "+ result);
	 
	 StringBuilder sc = new StringBuilder (result);
	 
	 
	 
	 for ( int s =0; s< sc.length(); s++) {
		 
		 char  nc= sc.charAt(s);
		 System.out.println("Character no: "+ s +"\n "+nc);
	 }
	 
	 
	 
	 //Use equals Ignore case, starts with, and ends with for comparison instead of ==
	 String str1="Bella", str2= "BELLA";
	 
	 if (str1.equalsIgnoreCase(str2)) {
		 
		 System.out.println("Strings are Equal: "+ str2 );
	 }
	 
	 if (str1.startsWith("B")) {
		 
		 System.out.println("Strings are Equal: "+ str1 );
	 }
	 
	 if (str1.endsWith("a")) {
		 System.out.println("Strings are Equal: "+ str1 );
	 }
	 
	 if (str1 != null && !str1.isEmpty()) { 
		 System.out.println("Strings are Equal: "+ str1 );
		} 
	 
	 
	 
	 //Use Trim() for removing spaces from string at starts or ends.
	 String str = "     Hello World !    ";
	 
	 String trimedStr = str.trim();
	 
	 System.out.println(trimedStr);
	 
	 
	 
	 //Use split() method to split strings into array of substrings
	 
	 String strA = "Java is awesome"; 
	 String[] parts = strA.split(" "); // ["Java", "is", "awesome"] 

	 
	 for(String i1: parts) {
		 System.out.print(i1+"\n");
	 }
	 
	 
	 
	 //Convert String to lower and upper case
	 String strB = "Journey to QA Automation!"; 
	 
	 String upperCaseStr = strB.toUpperCase(); 
	 System.out.println(upperCaseStr);
	 
	 String lowerCaseStr = strB.toLowerCase();
	 System.out.println(lowerCaseStr);
	 
	 if(strB.contains("QA")) {
		 System.out.println("Technical Path");
	 }
	 
	 String replaceStrB = strB.replace("QA", "SQA");
	 System.out.print(replaceStrB);
     
	
     
	}
}
