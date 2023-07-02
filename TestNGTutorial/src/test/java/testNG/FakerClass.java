package testNG;

import java.util.Locale;

import com.github.javafaker.Faker;

public class FakerClass {
	
	public static void main(String args[]) {
		
		for(int i=0;i<=3;i++) {
		Faker fake=new Faker();
		
		String fname=fake.name().firstName();
		String lname=fake.name().lastName();
		String phone=fake.phoneNumber().phoneNumber();
		String address=fake.address().fullAddress();
		System.out.println(fake.animal().name());
		System.out.println(fake.harryPotter().character());
		
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(phone);
		System.out.println(address);
		}
		
		for(int j=1;j<=5;j++) {
		Faker fake = new Faker(new Locale("en-IND"));
		
		String fName=fake.name().firstName();
		String book=fake.book().title();
		String sports=fake.esports().game();
		String addresss=fake.address().fullAddress();
		
		System.out.println(fName);
		System.out.println(book);
		System.out.println(sports);
		System.out.println(addresss);
		
	}

}
}
