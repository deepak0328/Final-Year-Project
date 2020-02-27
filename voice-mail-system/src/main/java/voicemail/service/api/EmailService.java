package voicemail.service.api;

import voicemail.entity.MailEntity;

public interface EmailService {
	
	MailEntity createNewMail(MailEntity mailEntity);

}
