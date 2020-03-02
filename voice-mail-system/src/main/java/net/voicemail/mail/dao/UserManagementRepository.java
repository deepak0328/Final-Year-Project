package net.voicemail.mail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.voicemail.mail.entity.User;

@Repository
public interface UserManagementRepository extends JpaRepository<User, Long> {

	User findByUserName(String name);

}