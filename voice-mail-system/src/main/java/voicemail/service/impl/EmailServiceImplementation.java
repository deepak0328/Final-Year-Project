package voicemail.service.impl;

import voicemail.entity.MailEntity;
import voicemail.service.api.EmailService;

public class EmailServiceImplementation implements EmailService{

	public MailEntity createNewMail(MailEntity mailEntity) {
		MailEntity mailEntity1 = new MailEntity();
		mailEntity1.setFromAddress(mailEntity.getFromAddress());
		mailEntity1.setToAddress(mailEntity.getToAddress());
		mailEntity1.setContent(mailEntity.getContent());
		return mailEntity1;
	}

}
