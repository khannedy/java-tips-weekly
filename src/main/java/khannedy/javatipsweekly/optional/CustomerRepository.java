package khannedy.javatipsweekly.optional;

public interface CustomerRepository {

  Customer findById(String id);

  Customer createNew();

}
