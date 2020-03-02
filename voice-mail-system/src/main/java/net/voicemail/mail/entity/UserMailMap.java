package net.voicemail.mail.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_mail_map", schema = "voicemail")
public class UserMailMap {

	@Id
	@Column(name = "user_mail_map_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_gen")
	@SequenceGenerator(name = "seq_gen", sequenceName = "user_mail_id_seq", schema = "voicemail", allocationSize = 1)
	private long userMailMapId;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	@Column(name = "mail_id")
	private long mailId;

	public long getUserMailMapId() {
		return userMailMapId;
	}

	public void setUserMailMapId(long userMailMapId) {
		this.userMailMapId = userMailMapId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getMailId() {
		return mailId;
	}

	public void setMailId(long mailId) {
		this.mailId = mailId;
	}

	@Override
	public String toString() {
		return "UserMailMap [userMailMapId=" + userMailMapId + ", user=" + user + ", mailId=" + mailId + "]";
	}

}
