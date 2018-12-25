
public class PaymentGateway {
	public static boolean trasfer(Bank sender,
			Bank receiver,double amount) {
		boolean flag=false;
		if(sender.getIntialBalance()>=amount) {
			flag=true;
			sender.deposit(-amount);
			receiver.deposit(-amount);
		}
		return flag;
	}

}
