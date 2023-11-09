package myAnimal;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void deplacer() {
		System.out.println("je me deplace");
	}

}


class Pigeon extends Animal  {
  public void deplacer() {
    System.out.println("je vole en ville");
  }
}