package net.voicemail.mail.service.impl;

import net.voicemail.mail.dao.MailManagementRepository;
import net.voicemail.mail.dao.UserManagementRepository;
import net.voicemail.mail.entity.Mail;
import net.voicemail.mail.entity.User;
import net.voicemail.mail.service.api.MailManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MailManagementServiceImpl implements MailManagementService {

	Logger logger = LoggerFactory.getLogger(MailManagementServiceImpl.class);

	@Autowired
	UserManagementRepository userManagementRepository;

	@Autowired
	MailManagementRepository mailManagementRepository;

	@Transactional
	public Mail createOrUpdateMail(Mail mail) {

		return null;
	}

	@Transactional
	public boolean verifyUser(User user) {

		User user1 = userManagementRepository.findByUserName(user.getUserName());
		if (user1.getUserName().equals(user.getUserName()) && user1.getUserPassword().equals(user.getUserPassword())) {
			return true;
		}
		return false;
	}

}