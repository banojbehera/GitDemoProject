package exam.com;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test {

	public static void main(String[] args) {
		
		String hungry = "yes";
		if(hungry == "yes")
			System.out.println("eat Something....");
		else {
			System.out.println("Do Work....");
		}
		
	}

}
