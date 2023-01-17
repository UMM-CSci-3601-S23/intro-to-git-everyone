package hellos;



/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public static void main(final String[] args) {
    Hellos helloRunner = new Hellos();
    helloRunner.run();
  }

  public void run() {
    String output = generateOutput();
    System.out.println(output);
  }

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(brendanSaysHello());
    builder.append(kkSaysHello());
    builder.append(masonSaysHello());
    builder.append(nicSaysHello());


    return builder.toString();
  }

  private String masonSaysHello() {
    return "Mason says 'Suh!'\n";
  }

  private String brendanSaysHello() {
    return "Brendan says 'Suhh!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Hello!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

}
