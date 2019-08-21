package khannedy.javatipsweekly.retrofit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HookBinRequest {

  private String id;

  private String firstName;

}
