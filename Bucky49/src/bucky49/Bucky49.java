package bucky49;

import java.util.EnumSet;

public class Bucky49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		DogList DLO=new DogList();
		Dog d=new Dog();
		DLO.add(d);
		
		// Bucky 50 
		// delete or comment out DogList
		AnimalList ALO=new AnimalList();
		Dog d=new Dog();
		Fish f=new Fish();
		ALO.add(d);
		ALO.add(f);
		
		// Bucky 51
		Tuna49 Tuna49Object=new Tuna49();
		Tuna49 Tuna49Object2=new Tuna49(5);
		Tuna49 Tuna49Object3=new Tuna49(5, 13);
		Tuna49 Tuna49Object4=new Tuna49(5, 13, 43);
		
		System.out.printf("%s\n", Tuna49Object.toMilitary());
		System.out.printf("%s\n", Tuna49Object2.toMilitary());
		System.out.printf("%s\n", Tuna49Object3.toMilitary());
		System.out.printf("%s\n", Tuna49Object4.toMilitary());
		
		// Bucky 52
		potpie potObject=new potpie(4,5,6);
		
		Tuna49 tunaObject=new Tuna49("Greg", potObject);
		System.out.println(tunaObject);

		// Bucky 54
		for(Tuna49 people: Tuna49.values()) {
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
		// Bucky 55
		System.out.println("\nAnd now the range of constants\n");
		for(Tuna49 people: EnumSet.range(Tuna49.kelsey,Tuna49.candy)) {
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
		
		// Bucky 56
		Tuna49 member1=new Tuna49("Megan", "Fox");
		Tuna49 member2=new Tuna49("Taylor", "Swift");
		Tuna49 member3=new Tuna49("Natalie", "Portman");
		
		// Bucky 57
		System.out.println();
		System.out.println(member1.getFirst());
		System.out.println(member1.getLast());
		System.out.println(member1.getMembers());
		
		System.out.println(Tuna49.getMembers());
		
		// Bucky 58
		Tuna49 tunaObject=new Tuna49(10);
		
		for (int i=0; i<5; i++) {
			tunaObject.add();
			System.out.printf("%s",  tunaObject);
		}
		*/
		// Bucky 59
		Tuna49 tunaObject=new Tuna49();
		potpie potpieObject=new potpie();
		
		tunaObject.eat();
		potpieObject.eat();
	}
		
}
