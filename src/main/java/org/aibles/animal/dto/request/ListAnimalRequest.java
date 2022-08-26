package org.aibles.animal.dto.request;

import org.aibles.animal.entity.Animal;

public class ListAnimalRequest extends CreateAnimalRequest{

  public ListAnimalRequest() {
    super();
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
