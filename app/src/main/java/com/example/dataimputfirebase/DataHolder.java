package com.example.dataimputfirebase;

public class DataHolder {

    private  String name,age,major,gender,game,drink,food;

    public DataHolder(String name, String age, String major)
    {
        this.name = name;
        this.age = age;
        this.major = major;

    }

    public DataHolder(String game, String drink, String food,String gender)
    {
        this.game = game;
        this.drink = drink;
        this.food = food;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
