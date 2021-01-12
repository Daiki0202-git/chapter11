package enemy;

public class Matango {
	public String name;
	public int hp;
	
	public Matango(String name,int hp) {
		this.name = name;
		this.hp = hp;
		}



	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}

}
