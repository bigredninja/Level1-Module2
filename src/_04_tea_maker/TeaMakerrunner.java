package _04_tea_maker;

import _04_tea_maker.Kettle.Water;

public class TeaMakerrunner {
public static void main(String[] args) {
	TeaBag teabag = new TeaBag(TeaBag.GREEN);
	Kettle kettle = new Kettle();  
	kettle.boil();
	Cup cup = new Cup();
	cup.makeTea(teabag,kettle.getWater() );
	
}
}
