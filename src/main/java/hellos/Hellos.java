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

    builder.append(alexSaysHello());
    builder.append(alwinSaysHelloAgain());
    builder.append(alwinSaysHello());
    builder.append(ashSaysHelloAgain());
    builder.append(ashSaysHello());
    builder.append(gregSaysHello());
    builder.append(jaydonSaysHello());
    builder.append(kkSaysHello());
    builder.append(nicSaysHello());
    builder.append(noahSaysHello());
    builder.append(ryanSaysHello());

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

  private String alwinSaysHelloAgain() {
    return "Alwin says 'How are ya again!'\n";
  }

  private String ashSaysHelloAgain() {
    return "Ash says 'Hello again!'\n";
  }

  private String noahSaysHello() {
    return "Noah says 'Hey!'\n";
  }

  private String jaydonSaysHello() {
    return "Jaydon says 'yoooooooooooooooooooooooooooooo!'\n";
  }

  private String alexSaysHello() {
    return "Alex says 'Hello!'\n";
  }

  private String gregSaysHello() {
    return "Greg says 'top of the Murnin!'\n";
  }

  private String ryanSaysHello() {
    return "Ryan says 'Hi.!'\n";
  }
}
