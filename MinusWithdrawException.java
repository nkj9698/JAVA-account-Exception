package Exception;

@SuppressWarnings("serial")
public class MinusWithdrawException extends AccountException 
{
	private int money;
	
	public MinusWithdrawException(int cash)
	{
		this.money = cash;
	}

	public void ShowExceptionReason() {
		// TODO Auto-generated method stub
		System.out.println("[���� �޽��� : ��ݾ�" + money + ", �ܾ׺���]");
		
	}

}
