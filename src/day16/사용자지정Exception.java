<<<<<<< HEAD
package day16;

import day02.If01;

public class 사용자지정Exception {

	public static void main(String[] args) throws PasswordException{
		/* passwordException
		 * 
		 * - 비밀번호는 null일 수 없다.
		 * - 비밀번호의 길이는 5글자 이상
		 * - 비밀번호는 문자로만 이루어지면 안 됨. (문자 + 숫자 + 특수문자)
		 * */
		PasswordTest t = new PasswordTest();
		String pw = "가나다라마바사";
		try {
			t.setPassword(pw);
			System.out.println(t.getPassword());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}

class PasswordTest{
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("비밀번호는 null 일 수 없습니다.");
		} else if(password.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상이여야 합니다.");
		} else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야합니다.");
		}
		
		//		if(chekNumber(password) && chekSpecial(password)) {
//			throw new PasswordException("비밀번호는 특수문자와 숫자를 포함해야합니다.");
//		}
		this.password = password;
	}
	
	public boolean chekSpecial(String password) {
		String[] spec = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "=", "-", "+"};
		for(String tmp : spec) {
			if(password.contains(tmp)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean chekNumber(String password) {
		String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		for(String tmp : number) {
			if(password.equals(tmp)) {
				return true;
			}
		}
		return false;
	}
		
	}
=======
package day16;

import day02.If01;

public class 사용자지정Exception {

	public static void main(String[] args) throws PasswordException{
		/* passwordException
		 * 
		 * - 비밀번호는 null일 수 없다.
		 * - 비밀번호의 길이는 5글자 이상
		 * - 비밀번호는 문자로만 이루어지면 안 됨. (문자 + 숫자 + 특수문자)
		 * */
		PasswordTest t = new PasswordTest();
		String pw = "가나다라마바사";
		try {
			t.setPassword(pw);
			System.out.println(t.getPassword());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}

class PasswordTest{
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("비밀번호는 null 일 수 없습니다.");
		} else if(password.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상이여야 합니다.");
		} else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야합니다.");
		}
		
		//		if(chekNumber(password) && chekSpecial(password)) {
//			throw new PasswordException("비밀번호는 특수문자와 숫자를 포함해야합니다.");
//		}
		this.password = password;
	}
	
	public boolean chekSpecial(String password) {
		String[] spec = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "=", "-", "+"};
		for(String tmp : spec) {
			if(password.contains(tmp)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean chekNumber(String password) {
		String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		for(String tmp : number) {
			if(password.equals(tmp)) {
				return true;
			}
		}
		return false;
	}
		
	}
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
