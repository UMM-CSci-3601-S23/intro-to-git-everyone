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
    builder.append(harrySaysHello());
    builder.append(kkSaysHello());
    builder.append(nicSaysHello());
    builder.append(willSaysHello());
    return builder.toString();
  }


  private static String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }
  private static String willSaysHello() {
    return "Will says 'Howdy!'\n";
  }
  private static String harrySaysHello() {
    return "Harry says 'Howdy!'\n";
  }
  private static String kkSaysHello() {
   return "KK says 'Hello!'\n";
  }

  private static String alwinSaysHello() {
    return "Alwin says 'How are ya!'\n";
  }

  private static String ashSaysHello() {
    return "Ash says 'Hello!'\n";
  }
}
