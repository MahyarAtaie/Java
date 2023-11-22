package zoo;

import java.util.LinkedList;

public class animals_Deatils {

	public static void main(String[] args) {
	
		birds bird1 = new birds("chicken", "brown",2);
		birds bird2 = new birds("Owl", "black", 3);
		birds bird3 = new birds("Parrot", "yellow", 4);
		
		
		mammals mammal1 = new mammals ("wolf", "gray",2);
		mammals mammal2 = new mammals ("Cow", "red", 1);
		mammals mammal3 = new mammals("Bear", "white", 1);
		
		
		
		reptiles reptile1 = new reptiles ("Lizard","green", 1);
		reptiles reptile2 = new reptiles ("Snake","black", 2);
		reptiles reptile3 = new reptiles ("Crocodile","gray", 4);
		
		
		insects insect1 = new insects("ButterFly", "yellow", 1);
		insects insect2 = new insects("Cricket", "green", 1);
		insects insect3 = new insects("Ant", "Black",2);

		
		LinkedList bird = new LinkedList<birds>();
		bird.add(bird1);
		bird.add(bird2);
		bird.add(bird3);
		
		
		LinkedList mammal = new LinkedList<mammals>();
		mammal.add(mammal1);
		mammal.add(mammal2);
		mammal.add(mammal3);
		
		LinkedList reptile = new LinkedList<reptiles>();

		reptile.add(reptile1);
		reptile.add(reptile2);
		reptile.add(reptile3);

		LinkedList insect = new LinkedList<insects>();
      
		insect.add(insect1);
		insect.add(insect2);
		insect.add(insect3);

		LinkedList<animal> zoo = new LinkedList<animal>();		
		zoo.addAll(bird);
		zoo.addAll(mammal);
		zoo.addAll(reptile);
		zoo.addAll(insect);
		
	for(animal b : zoo) { 
		System.out.println(b.toString());
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
