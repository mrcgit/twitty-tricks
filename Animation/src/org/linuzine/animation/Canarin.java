package org.linuzine.animation;

public class Canarin extends Toons{

	public Canarin(String name){
		super(name);
	}

	@Override
	public void speak(Toons toon) {
		if(toon instanceof Cat)
			System.out.println(this.name+" says: «Mi è semblato di vedele un gatto!» ("+toon.name+")");
		else if(toon != this)
			System.out.println(this.name+ " says: «Hello! "+toon.name+"»");
	

	}

	@Override
	public void act(Tricks trick) {
		// TODO Auto-generated method stub
		
	}

}
