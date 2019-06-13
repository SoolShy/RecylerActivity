package com.example.recyleractivity;
public class Fruit {
    private String name;
    private int ImageId;
    public Fruit(String name, int imageId){
        this.name = name;
        this.ImageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return ImageId;
    }

}
