package org.aibles.animal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder.In;

@Entity
@Table(name = "animal")
public class Animal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column (name = "name", unique = true, length = 100)
  private String name;

  private Integer date;

  private Float weight;

  @Column (name = "place_to_live", unique = true, length = 200)
  private String place_to_live;

  @Column (name = "country", unique = true, length = 200)
  private String country;

  public Animal() {
  }

  public Animal(Long id, String name, Integer date, Float weight, String place_to_live,
      String country) {
    this.id = id;
    this.name = name;
    this.date = date;
    this.weight = weight;
    this.place_to_live = place_to_live;
    this.country = country;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getDate() {
    return date;
  }

  public void setDate(Integer date) {
    this.date = date;
  }

  public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
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

  @Override
  public String toString() {
    return "Animal{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", date=" + date +
        ", weight=" + weight +
        ", place_to_live='" + place_to_live + '\'' +
        ", country='" + country + '\'' +
        '}';
  }
}
