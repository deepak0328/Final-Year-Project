package net.voicemail.mail.dto;

import java.time.Instant;
import java.util.List;

public class FoodItemDto {

    private long foodItemDtoId;

    private String foodItemDtoName;

    private int foodItemDtoAvailableQuantity;

    private double foodItemDtoPrice;

    private String foodItemDtoStatus;

    private Instant foodItemDtoCreatedDate;

    private Instant foodItemDtoModifiedDate;

	private List<Long> foodMenuListId;

    public double getFoodItemDtoPrice() {
        return foodItemDtoPrice;
    }

    public void setFoodItemDtoPrice(double price) {
        this.foodItemDtoPrice = price;
    }

    public List<Long> getFoodMenuListId() {
        return foodMenuListId;
    }

    public void setFoodMenuListId(List<Long> menuListId) {
        this.foodMenuListId = menuListId;
    }

    public long getFoodItemDtoId() {
        return foodItemDtoId;
    }

    public void setFoodItemDtoId(long id) {
        this.foodItemDtoId = id;
    }

    public String getFoodItemDtoName() {
        return foodItemDtoName;
    }

    public void setFoodItemDtoName(String name) {
        this.foodItemDtoName = name;
    }

    public int getFoodItemDtoAvailableQuantity() {
        return foodItemDtoAvailableQuantity;
    }

    public void setFoodItemDtoAvailableQuantity(int quantity) {
        this.foodItemDtoAvailableQuantity = quantity;
    }

    public String getFoodItemDtoStatus() {
        return foodItemDtoStatus;
    }

    public void setFoodItemDtoStatus(String status) {
        this.foodItemDtoStatus = status;
    }

    public Instant getFoodItemDtoCreatedDate() {
        return foodItemDtoCreatedDate;
    }

    public void setFoodItemDtoCreatedDate(Instant createdDate) {
        this.foodItemDtoCreatedDate = createdDate;
    }

    public Instant getFoodItemDtoModifiedDate() {
        return foodItemDtoModifiedDate;
    }

    public void setFoodItemDtoModifiedDate(Instant modifiedDate) {
        this.foodItemDtoModifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "FoodItemDto [foodItemDtoId=" + foodItemDtoId + ", foodItemDtoName=" + foodItemDtoName
                + ", foodItemDtoAvailableQuantity=" + foodItemDtoAvailableQuantity + ", foodItemDtoPrice="
                + foodItemDtoPrice + ", foodItemDtoStatus=" + foodItemDtoStatus + ", foodItemDtoCreatedDate="
                + foodItemDtoCreatedDate + ", foodItemDtoModifiedDate=" + foodItemDtoModifiedDate + ", foodMenuListId="
                + foodMenuListId + "]";
    }

}
