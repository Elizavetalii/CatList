package com.example.catlist;

public class CatBreed {
    private String name;
    private String description;
    private int imageResId; // Ресурс изображения
    private String habits; // Новый атрибут
    private String history; // Новый атрибут

    public CatBreed(String name, String description, int imageResId, String habits, String history) {
        this.name = name;
        this.description = description;
        this.imageResId = imageResId;
        this.habits = habits; // Инициализация нового поля
        this.history = history; // Инициализация нового поля
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getHabits() {
        return habits;
    }

    public String getHistory() {
        return history;
    }
}
