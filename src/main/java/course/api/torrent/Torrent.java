package course.api.torrent;

public class Torrent {

	private String name;
	private int id;
	private String magnetUrl;
	
	public Torrent(String name, int id, String magnetUrl) {
		super();
		this.name = name;
		this.id = id;
		this.magnetUrl = magnetUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMagnetUrl() {
		return magnetUrl;
	}
	public void setMagnerUrl(String magnetUrl) {
		this.magnetUrl = magnetUrl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
