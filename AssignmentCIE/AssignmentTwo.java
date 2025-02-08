// Violation of LSP:

class Bird {
	void fly() { System.out.println("Flying"); }
}

class Penguin extends Bird {
    // Penguins can't fly!
}

//Corrected Code:

class Bird{
	void chirp(){
		System.out.println("Chirp....");
	}
}

class FlyingBird extends Bird{
	void fly(){
		System.out.println("Flying");
	}
}

class NonFlyingBird extends Bird{

}

class Penguin extends NonFlyingBird{
	void swim(){
		System.out.println("Swimming...");
	}
}





