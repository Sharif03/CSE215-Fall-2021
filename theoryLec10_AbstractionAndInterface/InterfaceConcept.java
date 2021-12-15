package theoryLec10_AbstractionAndInterface;

public class InterfaceConcept {

	public static void main(String[] args) {
		AudioPlayer aa = new MP5();
		aa.playAudio();
		
		VideoPlayer bb = new MP5();
		bb.playVideo();
		
		Camer cc = new MP5();
		cc.takePicture();
		
		
		MP5 t = new MP5();

		// MP3
		System.out.println("MP3 Player");
		AudioPlayer  mp3 = t;
		mp3.playAudio();
		System.out.println();
		
		// MP4
		System.out.println("MP4 Player");
		AudioPlayer mp41 = t;
		VideoPlayer mp42= t;
		mp41.playAudio();
		mp42.playVideo();
		System.out.println();
		
		// MP5
		System.out.println("MP5 Player");
		t.playAudio();
		t.playVideo();
		t.takePicture();
		System.out.println();

	}

}

interface AudioPlayer {
	int v=1;
	void playAudio();

}
interface VideoPlayer{
	void playVideo();
}
interface Camer{
	void takePicture();
}
class MP5 implements AudioPlayer, VideoPlayer, Camer{
	public void playAudio() {
		System.out.println("Audio Playing");
	}
	public void playVideo() {
		System.out.println("Video Playing");
	}
	public void takePicture() {  
		System.out.println("Taking Image");
	}
}

interface SpecialUseCase{
	// Java Version: 8 [default & static] => Used in Child Class with super keyword
	default void specialDefault() {
	
	}
	static void specialStatic() { // => Used in Anywhere with Interface Class using dot operator
			
	}
		
	// Java Version: 9 [private] // => Used in self Interface
	private void specialPrivate() {

	}
}
class AA{
	public void a() {
		// hhhh
	}
}

class BB extends AA{
    public void a() {
		// iii
	}
}

class CC extends BB{
    public void a() {
		
	}
}