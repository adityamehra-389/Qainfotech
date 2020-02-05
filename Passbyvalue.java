
public class Passbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=10;
		System.out.println("Before Swaping a="+a+" b="+b);
		swap(a,b);
		System.out.println("Afeter Swaping a="+a+" b="+b);

	}
public static void swap(int c,int d) {
		int temp;
		temp=c;
		c=d;
		d=temp;
	
	}
}
