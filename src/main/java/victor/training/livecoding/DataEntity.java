package victor.training.livecoding;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@ToString
@Setter// consider encapsulating changes
@Getter
@Entity
public class DataEntity {
   @Id
   @GeneratedValue
   private Long id;

   private String name;

   @ToString.Exclude
   @ElementCollection
   private List<String> children = new ArrayList<>();
}
