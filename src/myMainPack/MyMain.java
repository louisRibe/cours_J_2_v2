package myMainPack;

import myAnimal.Animal;
import myAnimal.Chien;
import myAnimal.Oiseau;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal a1 = new Animal();
//	    Animal a2 = new Chien();
//	    Animal a3 = new Oiseau();
//	    a1.deplacer();
//	    a2.deplacer();
//	    a3.deplacer();
		
		int[] nbCups;
		//nbCups = new int[7];
		nbCups = new int[] {1,0,2,3,0,6,7};
		nbCups[3] = 16;
				
		for(int i=0; i<nbCups.length; i++) {
			//afficher(nbCups[i]);
			System.out.println(nbCups[i]);
		}
			
	}
	
	void afficher(Void message) {
		System.out.println(message);
	}

}
