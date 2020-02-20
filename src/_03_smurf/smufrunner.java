package _03_smurf;

public class smufrunner {
	public static void main(String[] args) {
		Smurf papa = new Smurf("papa");
		Smurf Smurfette = new Smurf("Smurfette");
		Smurf lazy = new Smurf("lazy");
		lazy.eat();
		papa.eat();
		Smurfette.eat();
		System.out.println(lazy.getHatColor());
		System.out.println(papa.getHatColor());
		System.out.println(Smurfette.getHatColor());
		System.out.println(lazy.isGirlOrBoy());
		System.out.println(papa.isGirlOrBoy());
		System.out.println(Smurfette.isGirlOrBoy());
		
		
	}
}
