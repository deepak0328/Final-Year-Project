package net.voicemail.mail.entity;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "voicemail")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_generator")
	@SequenceGenerator(name = "user_id_generator", sequenceName = "user_id_seq", schema = "voicemail", initialValue = 1, allocationSize = 1)
	@Column(name = "user_id", unique = true, nullable = false)
	private long userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_password")
	private String userPassword;

	@Column(name = "user_phone_number")
	private String userPhoneNumber;

	@Column(name = "user_email")
	private String userEmail;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userPhoneNumber=" + userPhoneNumber + ", userEmail=" + userEmail + "]";
	}

}
