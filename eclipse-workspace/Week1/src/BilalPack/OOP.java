package BilalPack;


//Abstract Class 

abstract class Animal{
	
	//Common but unique Method overall a class called abstract method
	//declare without body
	
	public abstract void Sound ();
	
	//Common and same methods overall all objects of a class
	
	public void eat () {
		System.out.print("All animals eat food to live\n");
		
	}
	public void sleep () {
		System.out.print("All animals sleep to get relax\n");
		
	}
	
	
}

class Dog extends Animal {
	
	public void Sound() {
		System.out.println("Dog Says Ruff, ruff.. ");
	}
}


public class OOP {

	final int x=5; //Final Attribute of a class 
	int y;
	String basic1 = "Classes";
	String basic2 = "Objects";
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OOP objA = new OOP();
		OOP objB = new OOP();
		
		objA.y=10;
		objB.y=20;
		
		System.out.println("Value of x using Class A object : "+objA.x);
		System.out.println("Value of x using Class B object  : "+objB.x);
		
		System.out.println("Value of Y using Class A object : "+objA.y);
		System.out.println("Value of Y using Class A object : "+objB.y);

		System.out.println("The basics of OOPS are "+objA.basic1+" and "+objA.basic2);
		
		//Declare the object of a Dog class
		Dog pet = new Dog();

		pet.Sound();
		pet.sleep();
		pet.eat();
		
		
		//Inheritance - MNultilevel
		Child obj =new Child ();
		obj.traits();
		obj.charact();
		obj.habits();
		
		//Inheritance - MNultilevel
		students myObj = new students();
		//myObj.funcA();
	}

}


class GrandParent{
	public void traits() {
		System.out.println("ancient");
	}
}

class Parent extends GrandParent {
	public void charact () {
		System.out.println("Old");
	}
}

class Child extends Parent{
	public void habits () {
		System.out.println("modren");
	}
	
}

class Science {
	
	Science(){
		System.out.println("Science Constructor Called");
	}
}
class Arts {
	 Arts(){
		 System.out.println("Arts Constructor Called"); 
	 }
}

class students{
	
	Science objA = new Science();
	Arts objB = new Arts ();
	students (){
		
		System.out.println("Students Constructor Called");
	}

	public void funcA () {

		System.out.println("Called Function");
	}
	

}
