package org.aibles.animal.dto.response;

import org.aibles.animal.entity.Animal;

public class AnimalResponse {

  private long id;
  private String name;
  private int date;
  private float weight;
  private String placeToLive;
  private String country;

  public AnimalResponse() {
  }


  public AnimalResponse(long id, String name, int date, float weight, String placeToLive,
      String country) {
    this.id = id;
    this.name = name;
    this.date = date;
    this.weight = weight;
    this.placeToLive = placeToLive;
    this.country = country;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDate() {
    return date;
  }

  public void setDate(int date) {
    this.date = date;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public String getPlaceToLive() {
    return placeToLive;
  }

  public void setPlaceToLive(String placeToLive) {
    this.placeToLive = placeToLive;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "AnimalResponse{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", date=" + date +
        ", weight=" + weight +
        ", placeToLive='" + placeToLive + '\'' +
        ", country='" + country + '\'' +
        '}';
  }

  public static AnimalResponse from(Animal animal) {
    AnimalResponse response = new AnimalResponse();
    response.setId(animal.getId());
    response.setName(animal.getName());
    response.setDate(animal.getDate());
    response.setWeight(animal.getWeight());
    response.setPlaceToLive(animal.getPlaceToLive());
    response.setCountry(animal.getCountry());
    return response;
  }

}
