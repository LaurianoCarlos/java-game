
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int inicio = 1;

    do {

      Funcoes.pularLinha();
      Funcoes.exibirMenuInicial();
      inicio = input.nextInt();

      switch (inicio) {
        case 1:
          Player.jogoInicial();
          break;
        case 2:
          Multiplayer.jogoMultiplayer();
          break;
        case 3:
          Historia.modoHistoria();
      }

    } while (inicio != 0);

  }

}