package prob3;

public class Sparrow extends Bird {
	public Sparrow(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.println("참새 ( " + name + " )가 날아다닙니다.");
		
	}

	@Override
	public void sing() {
		System.out.println("참새 ( " + name + " )가 소리내어 웁니다.");
		
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println("참새의 이름은 " + name + "입니다.");
		
	}
	
}
