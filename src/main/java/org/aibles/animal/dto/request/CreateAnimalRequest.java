package org.aibles.animal.dto.request;

import javax.validation.constraints.NotBlank;
import org.aibles.animal.dto.response.AnimalResponse;
import org.aibles.animal.entity.Animal;

public class CreateAnimalRequest  {

  @NotBlank
  private String name;
  private int date;
  private float weight;
  @NotBlank
  private String place_to_live;
  @NotBlank
  private String country;

  public CreateAnimalRequest() {
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


  public Animal toAnimal() {
    Animal animal = new Animal();
    animal.setName(this.getName());
    animal.setDate(this.getDate());
    animal.setWeight(this.getWeight());
    animal.setPlace_to_live(this.getPlace_to_live());
    animal.setCountry(this.getCountry());
    return animal;
  }
}
