import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
      InputStreamReader consoleReader = new InputStreamReader(System.in);
      BufferedReader bufferedReader = new BufferedReader(consoleReader);
      
      System.out.println("Digite seu nome.");
      String name = bufferedReader.readLine();
      System.out.println("Digite seu sobrenome.");
      String surname = bufferedReader.readLine();
      Builder builder = new Builder(name, surname);

      User u1 = builder.build();
      u1.salvar();

      System.out.println("Digite seu email");
      String email = bufferedReader.readLine();
      u1 = builder.setEmail(email).build();
      u1.salvar();
  }
}
