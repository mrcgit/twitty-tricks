package org.linuzine.animation;

import java.util.Random;

public class Cat extends Toons {

	public Cat(String name){
		super(name);
	}

	@Override
	public void speak(Toons toon){
		if(toon instanceof Cat && toon!= this)
			System.out.println(name+" says: "+"«Hey "+toon.name+"!»");
	}

	@Override
	public void act(Tricks trick) {
		Random rd = new Random();
		if(rd.nextBoolean()){
			System.out.println(name+" l'ha scampata...");
			return;
		}
		switch (trick) {
		case bucciaBanana:
			System.out.println(name+ " scivola sulla buccia di banana...");
			break;
		case sgabello:
			System.out.println(name + " inciampa nello sgabello...");
			break;
		case pallaDaBowling:
			System.out.println(" Una palla da bowling cade sulla testa di "+name+"...");
		default:
			break;
		}





	}


}
