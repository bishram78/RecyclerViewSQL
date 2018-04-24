package com.bishram.recyclerviewsql;

public class Player {
    private int id;
    private int image;
    private String name;
    private String position;

    public Player(int id, String name, String position, int image) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
