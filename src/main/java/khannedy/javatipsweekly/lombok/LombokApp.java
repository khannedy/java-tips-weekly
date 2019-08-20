package khannedy.javatipsweekly.lombok;

public class LombokApp {

  public static void main(String[] args) {
    Customer customer = Customer.builder()
      .email("eko@gmail.com")
      .id("123")
      .name("Eko")
      .build();

    System.out.println(customer);
  }
}
