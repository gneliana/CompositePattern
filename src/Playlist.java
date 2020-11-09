import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

  // Your code goes here!

	public void setPlaybackSpeed(float slowSpeed) {
		for (IComponent song: playlist) {
			song.setPlaybackSpeed(slowSpeed);
		}
	}
	

	public String getName() {
		// TODO Auto-generated method stub
		return playlistName;
	}

	public void play() {
		// TODO Auto-generated method stub
		for(IComponent allsongs: playlist) {
			allsongs.play();
		}
	}

	public void add(IComponent component) {
		// TODO Auto-generated method stub
		playlist.add(component);
	}
	public void remove(Playlist playlist) {
		
	}

}
