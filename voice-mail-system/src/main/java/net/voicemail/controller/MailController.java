package net.voicemail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import net.voicemail.mail.dao.UserManagementRepository;
import net.voicemail.mail.entity.Mail;
import net.voicemail.mail.entity.User;
import net.voicemail.mail.service.api.MailManagementService;

@Controller
@RequestMapping("/mail/*")
public class MailController {

	Logger logger = LoggerFactory.getLogger(MailController.class);

	@Autowired
	MailManagementService mailManagementService;

	@RequestMapping("/login")
	public String createUser(Model model) {

		model.addAttribute(new User());

		return "mail/create-user";
	}

	@RequestMapping(value = "/verify")
	public String verifyUser(User user) {

		if(mailManagementService.verifyUser(user)) {
			return "mail/edit-fooditems";

		}else {
			return "mail/edit-foodmenu";
		}

	}

}