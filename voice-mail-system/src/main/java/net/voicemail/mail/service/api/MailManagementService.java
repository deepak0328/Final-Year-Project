package net.voicemail.mail.service.api;

import net.voicemail.mail.entity.Mail;
import net.voicemail.mail.entity.User;

/**
 * Interface to manage menu and food item related services
 *
 */
public interface MailManagementService {

	boolean verifyUser(User user);

	Mail createOrUpdateMail(Mail mail);

}
