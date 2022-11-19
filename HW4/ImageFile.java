package HW4;

import java.util.Objects;

public class ImageFile extends File {
	private int width;
	private int height;
	
	public ImageFile(String name, int bytes,int width,int height) {
		super (name+=".jpg", bytes);
		setWidth(width);
		setHeight(height);
	}
	public ImageFile(ImageFile other) {
		super(other);
		this.height=other.height;
		this.width=other.width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width <1) {
			this.width=1;
		}
		else
			this.width = width;		
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height<1) {
			this.height=1;
		}
		else
			this.height = height;
	}
	@Override
	public String toString() {
		
		return super.toString()+" width = " + width + ", height = " + height ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof ImageFile)) {
			return false;
		}
		ImageFile other = (ImageFile) obj;
		return height == other.height && width == other.width;
	}
	


	
	
}
