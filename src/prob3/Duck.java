package prob3;

class Duck extends Bird {
	
	public Duck(String name) {
		this.name = name;
	}
	@Override
	public void fly() {
		System.out.println("오리 ( "+ name + " ) 는 날지 않습니다.");

	}
	@Override
	public void sing() {
		System.out.println("오리 ( " + name + " ) 가 소리내어 웁니다.");
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print() {
		System.out.println("오리의 이름은 " + name + "입니다.");
		
	}
	
	

	
}
