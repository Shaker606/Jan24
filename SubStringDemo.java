
public class SubStringDemo {

	public static void main(String[] args) {
		
		
		String name1 = "shaker";
		String name2 = "Aleem";
		System.out.println("Before Swapping....");
		System.out.println("name1------"+name1);
		System.out.println("name2------"+name2);
		
		name1 = name1 + name2;//ShakerAleem
		name2 = name1.substring(0, name1.length()-name2.length());// Ramu
		name1 = name1.substring(name2.length());
		
	   System.out.println("Afters Swapping....");
		System.out.println("name1------"+name1);
		System.out.println("name2------"+name2);
		
	}

}
