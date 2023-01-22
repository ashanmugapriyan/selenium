package week1day1;

public class CarInfo {

	//noOfwheels = 4    short,int,long,float,double,char
			//
			
			short noOfwheels= 4;
			int price = 65000;
			long phno= 930022911;
			float fuelcapacity = 13l;
			double onroadprice =  275000;
			char typeOFfuel = 'p';
			
	public static void main(String[] args) {
		
		CarInfo maruthi = new CarInfo();
		
		
		System.out.println(maruthi.noOfwheels);
		System.out.println(maruthi.price);
		System.out.println(maruthi.phno);
		System.out.println(maruthi.fuelcapacity);
		System.out.println(maruthi.onroadprice);
		System.out.println(maruthi.typeOFfuel);	
		
		CarInfo hyundai = new CarInfo();
		System.out.println(hyundai.fuelcapacity);
		
		int Newprice = hyundai.price;
		System.out.println(Newprice*2);
		
	
	}
	
	
}
