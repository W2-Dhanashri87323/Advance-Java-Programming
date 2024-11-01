package com.dhanashri.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="mobiles")
public class Mobile {
   @Id
   private int id;
   @Column(name="mname")
   private String name;
   private int ram;
   private int storage;
   private String company;
   private Double price;
   private String image;
   
   
   
}
