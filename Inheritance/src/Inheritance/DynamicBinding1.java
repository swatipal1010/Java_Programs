package Inheritance;

class Animal{
	public void move() {
		System.out.println("Walk");
	}
}

class Fish extends Animal{
	public void move() {
		System.out.println("Swims");
	}
}

class Bird extends Animal{
	public void move() {
		System.out.println("Flies");
	}
}

class SongBird extends Bird{
	public void sing() {
		System.out.println("Sings");
	}
}


public class DynamicBinding1 {

	public static void main(String[] args) {
		Animal myAnimal = new SongBird();
		myAnimal.move(); 						//Since class SongBird doesn't overrides method move, 
												//call refers to the move of one level up class (i.e. SuperClass)
		
		/* myAnimal.sing()   ---> Gives error bcz myAnimal has reference of Animal class & thus 
								  only functionalities/methods defined(overrided) of Animal class can be used */
		
		((SongBird)myAnimal).sing(); 			//myAnimal reference has been typecasted to SongBird ref var 
												//to exc. functionalities not defined in Animal class
	}

}
