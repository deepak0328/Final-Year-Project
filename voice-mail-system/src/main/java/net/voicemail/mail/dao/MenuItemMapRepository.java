package net.voicemail.mail.dao;

import net.voicemail.mail.entity.FoodItem;
import net.voicemail.mail.entity.MenuItemMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemMapRepository extends JpaRepository<MenuItemMap, Long> {

	List<MenuItemMap> findByFoodMenuId(long foodMenuId);

	MenuItemMap findByFoodItem(FoodItem foodItemId);

	void deleteByFoodItem(FoodItem foodItemId);

	void deleteByFoodMenuId(long foodMenuId);

}