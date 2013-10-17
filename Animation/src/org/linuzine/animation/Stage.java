package org.linuzine.animation;

import java.util.ArrayList;


public class Stage {
	public static ArrayList <Toons> toons = new ArrayList<Toons>(1);
	public static ArrayList <Tricks> tricks = new ArrayList<Tricks>(1);


	public Stage(Object ...objects) {
		for(Object e : objects){
			if(e instanceof Toons)
				toons.add((Toons) e);
			else
				tricks.add((Tricks) e);
				
		}
	}


	public static ArrayList<Toons> getToons(Rooms room){
		ArrayList <Toons> array = new ArrayList<Toons>(1);
		for(Toons toon : toons)
			if(toon.getRoom() == room)
				array.add(toon);
		return array;
	}

	public void start(){
		for(Toons toon: toons){
			Thread t = new Thread(toon);
			t.start();
		}

	}


}



