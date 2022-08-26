package org.aibles.animal.dto.request;

import org.aibles.animal.entity.Animal;

public class UpdateAnimalRequest extends CreateAnimalRequest{

  private long id;
  public UpdateAnimalRequest() {
  }

  public UpdateAnimalRequest(long id, String name, int date, float weight, String place_to_live,
      String country) {
    super(name, date, weight, place_to_live, country);
    this.id = id;
  }
  

  public Animal toEntity() {
    Animal animal = new Animal();
    animal.setName(this.getName());
    animal.setDate(this.getDate());
    animal.setWeight(this.getWeight());
    animal.setPlace_to_live(this.getPlace_to_live());
    animal.setCountry(this.getCountry());
    return animal;
  }
}
