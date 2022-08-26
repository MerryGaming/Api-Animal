package org.aibles.animal.dto.response;

import javax.validation.constraints.NotBlank;
import org.aibles.animal.entity.Animal;

public class AnimalResponse {

  private Long id;
  private String name;
  private int date;
  private float weight;
  private String place_to_live;
  private String country;

  public AnimalResponse() {
  }


  public AnimalResponse(Long id, String name, int date, float weight, String place_to_live, String country) {
    this.id = id;
    this.name = name;
    this.date = date;
    this.weight = weight;
    this.place_to_live = place_to_live;
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

  public String getPlace_to_live() {
    return place_to_live;
  }

  public void setPlace_to_live(String place_to_live) {
    this.place_to_live = place_to_live;
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

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "AnimalResponse{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", date=" + date +
        ", weight=" + weight +
        ", place_to_live='" + place_to_live + '\'' +
        ", country='" + country + '\'' +
        '}';
  }

  public static AnimalResponse from(Animal animal) {
    AnimalResponse response = new AnimalResponse();
    response.setId(animal.getId());
    response.setName(animal.getName());
    response.setDate(animal.getDate());
    response.setWeight(animal.getWeight());
    response.setPlace_to_live(animal.getPlace_to_live());
    response.setCountry(animal.getCountry());
    return response;
  }

}
