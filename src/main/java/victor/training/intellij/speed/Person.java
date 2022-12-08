package victor.training.intellij.speed;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


// typical Java Bean (1997)
public class Person {
  enum MaritalStatus {
    MARRIED,
    SINGLE,
    DIVORCED,
    WHATEVER
  }

  private String id;
  private String firstName;
  private String firstLetter;
  private String lastName;
  private String phone; // nullable in DB
  private LocalDateTime createTime;
  private Bio bio;
  private List<String> addresses;
  private MaritalStatus maritalStatus;

  public List<String> getAddresses() {
    return addresses;
  }

  public MaritalStatus getMaritalStatus() {
    return maritalStatus;
  }

  public String getFirstLetter() {
    return firstLetter;
  }

  public void setBio(Bio bio) {
    this.bio = bio;
  }

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

  public Person setMaritalStatus(MaritalStatus maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  public Optional<String> getPhone() {
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

}
