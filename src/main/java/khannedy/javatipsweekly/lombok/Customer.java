package khannedy.javatipsweekly.lombok;

import lombok.*;

@Data
@Builder
public class Customer {

  private String id;

  private String name;

  private String email;
}
