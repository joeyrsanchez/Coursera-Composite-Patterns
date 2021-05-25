import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList<IComponent>();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	@Override
	public void play() {
		for (int i = 0; i < playlist.size(); i++) {
			playlist.get(i).play();
		}

	}

	@Override
	public void setPlaybackSpeed(float speed) {
		for (int i = 0; i < playlist.size(); i++) {
			playlist.get(i).setPlaybackSpeed(speed);
		}

	}

	@Override
	public String getName() {
		return this.playlistName;
	}

	public void add(Song experimentalSong3) {
		playlist.add(experimentalSong3);
	}

	public void remove(IComponent component) {
		playlist.remove(component);
	}

	public void add(Playlist experimentalPlaylist) {
		playlist.add(experimentalPlaylist);

	}

}