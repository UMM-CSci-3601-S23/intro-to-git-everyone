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
    builder.append(masonSaysHello());

    return builder.toString();
  }


  private static String brendanSaysHello() {
    return "Brendan says 'Howdy!'\n";
  }

  private static String masonSaysHello() {
    return "Mason says 'Howdy!'\n";
  }
}
