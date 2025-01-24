
public class primeNov1 {

	public static void main(String[] args) {
		
		int num = 3,counter=0;
		for(int p=num;p>=1;p--) {
			if(num % p ==0) counter++;
			
		}
		if(counter== 2) System.out.println("Yes it is Prime");
		else System.out.println("No, it is a not a Prime No");
		}
	}
