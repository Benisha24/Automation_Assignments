package week1.day1;

public class Mobile {
	
	public void makeCall() {
		String mobileModel="OPPO";
		float mobileWeight=1.5f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		
	}
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=25000;
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
		
	}
	
	public static void main(String[] args) {
		Mobile model=new Mobile();
		model.makeCall();
		model.sendMsg();
		
		System.out.println("This is my mobile");
		
		
	}

}
