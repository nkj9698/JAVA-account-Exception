package Exception;

@SuppressWarnings("serial")
public class LoginException extends AccountException{

	@Override
	public void ShowExceptionReason() {
		// TODO Auto-generated method stub
		System.out.println("�߸���/���� ���̵��Դϴ�");
	}

}
