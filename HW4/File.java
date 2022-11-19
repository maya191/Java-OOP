package HW4;

import java.util.Objects;

public class File {
	private String name;
	private int bytes;
	
	public File(String name, int bytes) {
		this.name=name;
		setBytes(bytes);
	}
	public File(File other) {
		this.name=other.name;
		this.bytes=other.bytes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBytes() {
		return bytes;
	}
	public void setBytes(int bytes) {
		if (bytes <1) {
			this.bytes=1;
		}
		else
			this.bytes = bytes;
	}
	
	@Override
	public String toString() {
		return "name = " + name + ", bytes = " + bytes ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof File)) {
			return false;
		}
		File other = (File) obj;
		return bytes == other.bytes && Objects.equals(name, other.name);
	}
	
	

	
	

}
