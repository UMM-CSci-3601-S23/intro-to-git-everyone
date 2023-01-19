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

    builder.append(alwinSaysHello());
    builder.append(ashSaysHello());
    builder.append(chenfeiSaysHello());
    builder.append(kkSaysHello());
    builder.append(mattSaysHello());
    builder.append(nicSaysHello());

    return builder.toString();
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private String alwinSaysHello() {
    return "Alwin says 'How are ya!'\n";
  }

  private String ashSaysHello() {
    return "Ash says 'Hello!'\n";
  }

  private String chenfeiSaysHello() {
    return "Chenfei says 'Howdy!'\n";
  }

  private String mattSaysHello() {
    return "Matt says 'Hello!'\n";
  }
}
