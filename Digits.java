public class Digits{
	public static void main(String args[]){
	long contactNo = 9876543021l;
	String msg = "";
	while(contactNo != 0){
		long digit = contactNo%10;
		contactNo = contactNo/10;
		System.out.println(digit);
		if (digit == 0){
			msg=msg+"Hi ";
		}
		else if (digit == 1){
			
			msg=msg+"Hello ";
		}
		else if (digit == 2){
			
			msg=msg+"Hey ";
		}
		else if (digit == 3){
			
			msg=msg+"how ";
		}
		else if (digit == 4){
			
			msg=msg+"who ";
		}
		else if (digit == 5){
			
			msg=msg+"bye ";
		}
		else if (digit == 6){
			
			msg=msg+"what ";
		}
		else if (digit == 7){
			
			msg=msg+"where ";
		}
		else if (digit == 8){
			
			msg=msg+"why ";
		}
		else if (digit == 9){
			
			msg=msg+"while ";
		}
	}
	System.out.println("Sentence for the contact number provide is :"+msg);
}
}