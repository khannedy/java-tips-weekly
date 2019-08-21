package khannedy.javatipsweekly.retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface HookBinService {

  @POST("/8PMnzRr9qdUXgXYxOml0")
  Call<HookBinResponse> test(@Body HookBinRequest request);

}
