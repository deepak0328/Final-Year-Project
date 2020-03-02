package net.voicemail.mail.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.Instant;

@Entity
@Table(name = "mail", schema = "voicemail")
public class Mail implements Comparable<Mail> {

	public static final String MAIL_AVAILABLE_STATUS = "available";
	public static final String MAIL_UNAVAILABLE_STATUS = "unavailable";
	public static final String MAIL_DELETED_STATUS = "deleted";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_gen")
	@SequenceGenerator(name = "seq_gen", schema = "voicemail", sequenceName = "mail_id_seq", allocationSize = 1)
	@Column(name = "mail_id", nullable = false)
	private long mailId;

	@Column(name = "mail_from", nullable = false, unique = true)
	private String mailFrom;

	@Column(name = "mail_to")
	private String mailTo;

	@Column(name = "mail_subject_name")
	private String mailSubjectName;

	@Column(name = "mail_status")
	private String mailStatus;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "mail_created_date")
	private Instant mailCreatedDate;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "mail_modified_date")
	private Instant mailModifiedDate;

	public long getMailId() {
		return mailId;
	}

	public void setMailId(long mailId) {
		this.mailId = mailId;
	}

	public String getMailFrom() {
		return mailFrom;
	}

	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	public String getMailTo() {
		return mailTo;
	}

	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	public String getMailSubjectName() {
		return mailSubjectName;
	}

	public void setMailSubjectName(String mailSubjectName) {
		this.mailSubjectName = mailSubjectName;
	}

	public String getMailStatus() {
		return mailStatus;
	}

	public void setMailStatus(String mailStatus) {
		this.mailStatus = mailStatus;
	}

	public Instant getMailCreatedDate() {
		return mailCreatedDate;
	}

	public void setMailCreatedDate(Instant mailCreatedDate) {
		this.mailCreatedDate = mailCreatedDate;
	}

	public Instant getMailModifiedDate() {
		return mailModifiedDate;
	}

	public void setMailModifiedDate(Instant mailModifiedDate) {
		this.mailModifiedDate = mailModifiedDate;
	}

	@Override
	public String toString() {
		return "Mail [mailId=" + mailId + ", mailFrom=" + mailFrom + ", mailTo=" + mailTo + ", mailSubjectName="
				+ mailSubjectName + ", mailStatus=" + mailStatus + ", mailCreatedDate=" + mailCreatedDate
				+ ", mailModifiedDate=" + mailModifiedDate + "]";
	}

	public int compareTo(Mail foodItem) {
		if (foodItem.getMailId() > this.getMailId()) {
			return -1;
		} else if (foodItem.getMailId() < this.getMailId()) {
			return 1;
		}
		return 0;

	}

}
