package khannedy.javatipsweekly.retrofit;

import lombok.Data;

/**
 * https://lookup.binlist.net/45717360
 */
@Data
public class CreditCardBin {

  private String scheme;

  private String type;

  private String brand;

  private Boolean prepaid;

  private Number number;

  private Bank bank;

  private Country country;

  @Data
  public static class Number {

    private Integer length;

    private Boolean luhn;

  }

  @Data
  public static class Country {

    private String numeric;

    private String alpha2;

    private String name;

    private String emoji;

    private String currency;

    private Integer latitude;

    private Integer longitude;

  }

  @Data
  public static class Bank {

    private String name;

    private String url;

    private String phone;

    private String city;

  }

}
