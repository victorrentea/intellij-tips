package victor.training;

// typical Java Bean (1997)
public class Person {
   private String id;
   private String firstName;
   private String lastName;
   private String phone;

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

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }
}
