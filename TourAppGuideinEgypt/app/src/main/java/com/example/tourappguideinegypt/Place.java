package com.example.tourappguideinegypt;

public class Place {
    private String nameOfPlace , address , information ;
    private int pictureOfPlace ;

    public Place(String nameOfPlace, String address, String information, int pictureOfPlace) {
        this.nameOfPlace = nameOfPlace;
        this.address = address;
        this.information = information;
        this.pictureOfPlace = pictureOfPlace;
    }

    public String getNameOfPlace() {
        return nameOfPlace;
    }

    public String getAddress() {
        return address;
    }

    public String getInformation() {
        return information;
    }

    public int getPictureOfPlace() {
        return pictureOfPlace;
    }
}
