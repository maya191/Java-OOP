package HW4;

import java.util.Objects;

public class VideoFile extends File {
	private boolean hasTranslation;
	
	public VideoFile(String name, int bytes,boolean hasTranslation ) {
		super(name+".mp4" , bytes);
		this.hasTranslation=hasTranslation;
	}
	public VideoFile( VideoFile other) {
		super(other);
		this.hasTranslation=other.hasTranslation;
	}
	public boolean isHasTranslation() {
		return hasTranslation;
	}
	public void setHasTranslation(boolean hasTranslation) {
		this.hasTranslation = hasTranslation;
	}
	@Override
	public String toString() {
	
		return super.toString()+ " hasTranslation = " + hasTranslation ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof VideoFile)) {
			return false;
		}
		VideoFile other = (VideoFile) obj;
		return hasTranslation == other.hasTranslation;
	}
	
	
}
