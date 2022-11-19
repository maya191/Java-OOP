package HW4;

public class HW4main {

	public static void main(String[] args) {
		File a=new File("A",100);
		File b=new File("B", 200);
		ImageFile c= new ImageFile("c",300,300,100);
		ImageFile d= new ImageFile("D",400,200,200);
		VideoFile e=new VideoFile("E",500,true);
		VideoFile f=new VideoFile("F",600,false);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
