package org.linuzine.animation;

enum Tricks{
	sgabello,
	bucciaBanana,
	pallaDaBowling;

	private Rooms room;
	
public void setRoom(Rooms room){
		this.room = room;
	}

public Rooms getRoom(){
	return room;
}
	


}