package vo;

import java.util.Arrays;

public class Uservo {
	private String username;
	
	private String password;

	private String nickname;
	
	private String phone;
	
	private String[] hobby;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Uservo [username=" + username + ", password=" + password + ", nickname=" + nickname + ", phone=" + phone
				+ ", hobby=" + Arrays.toString(hobby) + "]";
	}
	
	
}
