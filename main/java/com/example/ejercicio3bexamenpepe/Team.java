package com.example.ejercicio3bexamenpepe;

public class Team {

    //atributos a cargar en elemento
    private int photo;
    private String name;
    private String city;
    private String country;
    private String year;

    //constructor
    public Team(int photo, String name , String city, String country , String year){
        this.photo = photo;
        this.name = name;
        this.city = city;
        this.country = country;
        this.year = year;

    }

    public int getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getYear() {
        return year;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Team{" +
                "photo=" + photo +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
