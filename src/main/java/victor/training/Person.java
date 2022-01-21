package victor.training;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

// typical Java Bean (1997)
public class Person {
   private String id;
   private String firstName;
   private String lastName;
   private String phone; // NULLABLE in database
   private LocalDateTime createTime;
   private Bio bio;

   public Bio getBio() {
      return bio;
   }

   public LocalDateTime getCreateTime() {
      return createTime;
   }

   public Person setCreateTime(LocalDateTime createTime) {
      this.createTime = createTime;
      return this;
   }

   public Optional<String> getPhone() { // TODO return Optional<>
      return Optional.ofNullable(phone);
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }


   public void setPhone(String phone) {
      this.phone = phone;
   }

   public void someNewMethod(List<Integer> numbers) {

   }
}
