package victor.training.intellij.refactoring.extract_delegate;

class ClientCode {
   public static void main(String[] args) {
      LargeEntity customer = new LargeEntity();
      customer.setFirstName("John");
      customer.setLastName("DOE");
      customer.setCountry("Ch. Elysees");

      displayGreeting(customer);
      displayFarewell(customer);
   }

   private static void displayGreeting(LargeEntity customer) {
      System.out.println("Hello " + customer.getFirstName() + " from " + customer.getCountry());
   }

   private static void displayFarewell(LargeEntity customer) {
      System.out.println("Good bye " + customer.getFirstName());
   }
}
// - Extract Delegate (grouping fields together)
// - Remove Middleman

public class LargeEntity {
   private String firstName;
   private String lastName;
   private String country;

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

   public String getCountry() {
      return country;
   }

   public void setCountry(String country) {
      this.country = country;
   }
}
