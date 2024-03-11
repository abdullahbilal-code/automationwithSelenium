package Card2;


// Constructor & Constructor Types & Constructor Overloading & Copy Constructor
//Created a Class noMad

class noMad {
	String Jrn, dist,dest, aim; //Create  class attributes 
	int id, contactNum;
	//Create a Default Constructor for class
	noMad(){
		System.out.println("This is a default Constructor");
	}
	
	
	
	//Create a Parameterized Constructor for class
	noMad (String X, String Y){
		Jrn=X;
		dist=Y;
	}
	
	noMad (String X, String Y,String Z){
		Jrn=X;
		dist=Y;
		dest=Z;
	}
	
	//Copy Constructor
	noMad(noMad m){
		
		Jrn=m.Jrn;
		dist=m.dist;
		dest=m.dest;

	}
	
	noMad(String a, String b, String c, String d){
		
		this("05","54356");
		this.Jrn=a;
		this.dest=a;
		this.dist=b;
		this.aim=d;
		
	}
	void display () {
		System.out.println(Jrn+" "+dist);
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		noMad person = new noMad();
	
		person.display();
		
		//Doing Constructor Overloading
		noMad p1 = new noMad("Adiana","1K KMS");
		System.out.println(p1.Jrn+" "+ p1.dest);
		
		noMad p2 = new noMad("Kumrat","1.5K KMS","Unknow");
		System.out.println(p2.Jrn+" "+ p2.dest+" "+p2.dist);
		
		//Object p3 copying values from Object p2
		//noMad p3 = new noMad(p2);
		
		//Copying values without constructor
		noMad p3 = new noMad();
		p3.dest=p2.dest;
		p3.Jrn=p2.Jrn;
		p3.dist=p2.dist;
		
		System.out.println("Object p3 copying values from Object p2: "+p3.Jrn+" "+ p3.dest+" "+p3.dist);
		
		
		noMad p4 = new noMad ("Kashmir", "2K KMs","ArangKel","Reboot");
		
		System.out.println("\n<<-------NEXTBRIDGE TOUR----->>>");
		
		System.out.println("\nTour: "+ p4.Jrn+"\nDistance: "+p4.dest+"\nNight Stay: "+ p4.dest+"\nPurpose:"+p4.aim+"\nId of Planner: "+p4.id+"\nContact Number: "+p4.contactNum);
		
		
		
		
	}

}
