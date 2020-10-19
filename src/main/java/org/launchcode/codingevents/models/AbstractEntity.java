package org.launchcode.codingevents.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * @author Oksana
 */
@MappedSuperclass
public abstract class AbstractEntity {
   @Id
   @GeneratedValue
   private int id;

   @NotBlank(message = "Name is required")
   @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
   private String name;

   public AbstractEntity(String name) {
      this.name = name;
   }

   public AbstractEntity() {
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return name;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      AbstractEntity entity = (AbstractEntity) o;
      return id == entity.id;
   }
   @Override
   public int hashCode() {
      return Objects.hash(id);
   }
}
