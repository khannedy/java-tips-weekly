package khannedy.javatipsweekly.retrofit;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class HookBinApp {

  public static void main(String[] args) throws IOException {
    Retrofit retrofit = new Retrofit.Builder()
      .baseUrl("https://hookb.in")
      .addConverterFactory(JacksonConverterFactory.create())
      .build();

    HookBinService hookBinService = retrofit.create(HookBinService.class);

    HookBinRequest request = HookBinRequest.builder()
      .id("1")
      .firstName("Eko Kurniawan Khannedy")
      .build();

    Call<HookBinResponse> call = hookBinService.test(request);
    HookBinResponse response = call.execute().body();

    System.out.println(response);
  }
}
