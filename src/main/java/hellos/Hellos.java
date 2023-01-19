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



    
   

    return builder.toString();
  }



    builder.append(alexSaysHello());
    builder.append(alwinSaysHelloAgain());
    builder.append(alwinSaysHello());
    builder.append(ashSaysHelloAgain());
    builder.append(ashSaysHello());
    builder.append(brendanSaysHello());
    builder.append(gregSaysHello());
    builder.append(harrySaysHello());
    builder.append(jaydonSaysHello());
    builder.append(kkSaysHello());
    builder.append(masonSaysHello());
    builder.append(nicSaysHello());
    builder.append(noahSaysHello());
    builder.append(ryanSaysHello());
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



  private static String brendanSaysHello() {
    return "Brendan says 'Hello!'\n";
   }

   private static String masonSaysHello() {
    return "Mason says 'Hello!'\n";
   }

  private static String alwinSaysHello() {
    return "Alwin says 'How are ya!'\n";
  }

  private static String ashSaysHello() {
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

  private String ryanSaysHello() {
    return "Ryan says 'Hi.!'\n";
  }
}
