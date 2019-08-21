package khannedy.javatipsweekly.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CreditCardBinService {

  @GET("/{binNumber}")
  Call<CreditCardBin> get(@Path("binNumber") String binNumber);

}
