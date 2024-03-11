package BilalPack;

//Polymorpshism--- Function Overriding

class Bird {
	
	    //Encapsulation
		//Make Variables Private
		
		private	String favBird, Commonbird;
		
		//Make Getter and setter 
		public String getFav() {
			return favBird;
		}
		public String getCom() {
			return Commonbird;
		}
		public void setBird(String X,String Y) {
			this.favBird=X;
			this.Commonbird=Y;
			
		}
	
	void Fly () {
		System.out.println("All Birds fly on their wings!\n All Birds are Animal But All animals are not birds");
		
	}
   void sound () {
		System.out.println("All Birds Make Different Sounds!\n");
	}
}

class sparrow extends Bird{
	
	void sound () {
		System.out.println("Sparrow Makes Sounds Like Che.. Chee Chee \n");
	}
}

class parrot extends Bird {
	
	
	void sound() {
		System.out.println("Parrot Makes Sounds Like Tuan.. Tuan..  Tuan \n");
	}
}
public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sparrow myObjA = new sparrow();
		parrot myObjB  = new parrot();
		
		myObjA.sound();
		myObjB.sound();
		
		//----------------------
		
		Bird obj = new Bird();
		obj.setBird("White Parrot","Sparrow");
		System.out.println(obj.getFav()+"\n");
		System.out.println(obj.getCom());
		
		
		
		
	}
	

}
