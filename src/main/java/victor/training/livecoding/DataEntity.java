package victor.training.livecoding;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class DataEntity {
   @Id
   @GeneratedValue
   private Long id;

   private String name;

   @ElementCollection
   private List<String> children = new ArrayList<>();
}
