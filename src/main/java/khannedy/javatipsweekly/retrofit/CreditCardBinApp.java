package khannedy.javatipsweekly.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class CreditCardBinApp {

  public static void main(String[] args) throws IOException {
    Retrofit retrofit = new Retrofit.Builder()
      .baseUrl("https://lookup.binlist.net")
      .addConverterFactory(JacksonConverterFactory.create())
      .build();

    CreditCardBinService service = retrofit.create(CreditCardBinService.class);

    CreditCardBin bin = service.get("45717360").execute().body();

    System.out.println(bin);
  }
}
