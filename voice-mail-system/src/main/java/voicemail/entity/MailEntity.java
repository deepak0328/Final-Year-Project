package voicemail.entity;

import java.util.List;

public class MailEntity {
	String fromAddress;
	List<String> toAddress;
	String content;

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public List<String> getToAddress() {
		return toAddress;
	}

	public void setToAddress(List<String> toAddress) {
		this.toAddress = toAddress;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Mail [fromAddress=" + fromAddress + ", toAddress=" + toAddress + ", content=" + content + "]";
	}

}
