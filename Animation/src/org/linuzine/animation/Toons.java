package org.linuzine.animation;
import java.util.ArrayList;
import java.util.Random;

/**
 * <b>Classe</b> per la modellazione di personaggi
 * di un'animazione.
 * 
 * @author Marco Cecchetti
 * @version 1.0
 */
public abstract class Toons implements Runnable {
	/**
	 * Indica la stanza in cui si trova il personaggio.
	 */
	private Rooms room;
	/**
	 * Indica il nome del personaggio.
	 */
	public String name;

	/**
	 * Crea un oggetto di tipo Toons.
	 * @param name
	 * @param name indica il nome.
	 */
	public Toons(String name){
		this.name = name;
	}

	/**Alloca il personaggio in una stanza.
	 * @param room indica la stanza.
	 * @param room
	 */
	public void setRoom(Rooms room){
		this.room = room;
		System.out.println(this.name+ " go to the "+room+"...");
	}

	/**Restituisce la stanza in cui il personaggio è allocato.
	* @return una <code>Rooms.room</code>
	*/
	public Rooms getRoom(){
		return room;
	}

	public abstract void speak(Toons toon);
	
	public abstract void act(Tricks trick);


	public void run(){
		for(Rooms room : Rooms.values()){
			try {
				setRoom(room);
				Thread.sleep(new Random().nextInt(1000));
				
				//TODO: Migliorare codice ridondante
				for(Tricks trick : Stage.tricks)
					if(trick.getRoom() == room)
						act(trick);
				
				ArrayList<Toons> toons = Stage.getToons(room);
				for(Toons toon: toons){
					speak(toon);
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}



}

