package khannedy.javatipsweekly.optional;

import java.util.Optional;

public class JavaOptional {

  public void nullCheck(Customer customer) {
    String name = Optional.ofNullable(customer.getName())
      .orElse("");

//    String name = customer.getName();
//    if (name == null) {
//      name = "";
//    }
  }

  public void ifLogic(CustomerRepository repository) {
    Customer customer = Optional.ofNullable(repository.findById("id"))
      .orElseGet(() -> repository.createNew());

//    Customer customer = repository.findById("id");
//    if (customer == null) {
//      customer = repository.createNew();
//    }
  }

  public void operationToNullValue(Customer customer) {
    String nameUpper = Optional.ofNullable(customer.getName())
      .map(value -> value.toUpperCase())
      .orElse("");

//    String nameUpper = customer.getName();
//    if (nameUpper != null) {
//      nameUpper = nameUpper.toUpperCase();
//    } else {
//      nameUpper = "";
//    }
  }

  public void nestedIfChecking(Customer customer) {
    String country = Optional.ofNullable(customer.getAddress())
      .map(address -> address.getCountry())
      .orElse("Indonesia");

//    String country = "Indonesia";
//    if (customer.getAddress() != null) {
//      if (customer.getAddress().getCountry() != null) {
//        country = customer.getAddress().getCountry();
//      }
//    }
  }

  public void checkAndThrowException(Customer customer) {
    String name = Optional.ofNullable(customer.getName())
      .orElseThrow(() -> new IllegalArgumentException("Name is null"));

//    String name = customer.getName();
//    if (name == null) {
//      throw new IllegalArgumentException("Name is null");
//    }
  }

  public void ifCheckDoSomething(Customer customer) {
    Optional.ofNullable(customer.getAddress())
      .map(address -> address.getCountry())
      .ifPresent(country -> System.out.println(country));

//    if (customer.getAddress() != null) {
//      if (customer.getAddress().getCountry() != null) {
//        System.out.println(customer.getAddress().getCountry());
//      }
//    }
  }

  public void nestedObject(Customer customer) {
    Long cashBalance = Optional.ofNullable(customer.getWallet())
      .map(wallet -> wallet.getBalance())
      .map(balance -> balance.getCashBalance())
      .orElse(0L);

//    Long cashBalance = 0L;
//    if (customer.getWallet() != null) {
//      if (customer.getWallet().getBalance() != null) {
//        cashBalance = customer.getWallet().getBalance().getCashBalance();
//      }
//    }
  }

  public void ifFilter(Customer customer) {
    Long bonus = Optional.ofNullable(customer)
      .filter(value -> CustomerType.PREMIUM.equals(value.getType()))
      .map(value -> value.getWallet())
      .map(wallet -> wallet.getBalance())
      .map(balance -> balance.getCashBalance())
      .map(cashBalance -> cashBalance * 10 / 100)
      .orElse(0L);

//    Long bonus = 0L;
//    if (CustomerType.PREMIUM.equals(customer.getType())) {
//      if (customer.getWallet() != null) {
//        if (customer.getWallet().getBalance() != null) {
//          bonus = customer.getWallet().getBalance().getCashBalance() * 10 / 100;
//        }
//      }
//    }
  }

}
