public class Song implements IComponent {
	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}
	
	// Your code goes here!
	public void setPlaybackSpeed(float fasterSpeed) {
		// TODO Auto-generated method stub
		this.speed = fasterSpeed;
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + songName);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return songName;
	}

	public String getArtist() {
		// TODO Auto-generated method stub
		return artist;
	}


}
