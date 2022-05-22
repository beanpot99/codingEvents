package org.launchcode.codingevents.controllers;

public class Events {
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    private String imagePath;
    public Events(String name, String description, String address ){
        this.name=name;
        this.description=description;

        this.address=address;
    }
    public Events(String name, String description, String address, String imagePath ){
        this.name=name;
        this.description=description;
        this.imagePath=imagePath;
        this.address=address;
    }

}
