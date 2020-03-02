package net.voicemail.mail.dao;

import net.voicemail.mail.entity.Mail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailManagementRepository extends JpaRepository<Mail, Long> {

}
