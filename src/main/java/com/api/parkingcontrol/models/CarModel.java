package com.api.parkingcontrol.models;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TB_CAR")
public class CarModel {

   public CarModel(String id) {
      this.id = id;
   }

   @Id
   @GeneratedValue(generator="system-uuid")
   @GenericGenerator(name="system-uuid", strategy = "uuid")
   @Column(unique = true)
   private String id;

   @Column(nullable = false, unique = true, length = 70)
   private String modelCar;

   @ManyToOne
   private BrandModel brandCar;

}
