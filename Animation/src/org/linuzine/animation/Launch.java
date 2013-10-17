package org.linuzine.animation;

public class Launch {
	
	public static void main(String [] args){
		Toons twitty = new Canarin("Twitty");
		Toons cat = new Cat("Silvester");
		Toons cat2 = new Cat("Muddy");
		
		Tricks trick1 = Tricks.bucciaBanana;
		Tricks trick2 = Tricks.sgabello;
		
		trick1.setRoom(Rooms.lounge);
		trick2.setRoom(Rooms.kitchen);
		
		Stage stage = new Stage(twitty, cat, cat2, trick1, trick2);
		stage.start();	
	

	}

	
}
