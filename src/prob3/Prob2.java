package prob3;

public class Prob2 {
	public static void main(String[] args) {
		Bird bird01 = new Duck( "꽥꽥이");
		bird01.fly();
		bird01.sing();
		bird01.print();
		
		Bird bird02 = new Sparrow("짹짹이" );
		bird02.fly();
		bird02.sing();
		bird02.print();
	}
}
