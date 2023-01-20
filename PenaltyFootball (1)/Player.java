import java.util.Scanner;
public class Player {
  // funçâo para jogar sozinho, primeira opçâo.
  public static void jogoInicial() {

    Scanner input = new Scanner(System.in);
    String nomeJogador = "";
    String nomeEntrada = "";
    int cantoSelecionado = 0, goleiro = 0, nivel = 0, placarJogador = 0, placarGoleiro = 0;
    char jogarNovamente = 'S';

    Funcoes.voltarConsole();
    Funcoes.pularLinha();
    Funcoes.exibirInicio();

    Funcoes.exibir("\nDigite seu nome: ", false);

    nomeEntrada = input.next();
    nomeJogador = Funcoes.funcaoNome(nomeEntrada);

    Funcoes.pularLinha();

    Funcoes.voltarConsole();
    Funcoes.exibir("\nSeja bem vindo, ", false);

    Funcoes.exibir("\033[1;34m", false); // nâo usei a funcâo Funcoes.cor nesse caso, porque ela trabalha com println, e nesse
                                 // caso necessito que o nome apareça a frente da ultima frase.

    Funcoes.exibir(nomeJogador, false);

    Funcoes.cor("", false);

    Funcoes.pularLinha();

    Funcoes.exibir("VAMOS AS COBRANCAS ?!", true);

    try {
      Funcoes.exibirNivel();
      input.nextLine();
      nivel = input.nextInt();

    } catch (Exception ex) {
      Funcoes.pularLinha();
      Funcoes.cor("\033[1;31m", true);
      Funcoes.exibir("[Seleçâo Inválida]", true);
      Funcoes.exibir("[NIVEL 1 SELECIONADO]", true);
      Funcoes.cor("", false);
      Funcoes.pularLinha();
      nivel = 1;
    }

    while (nivel < 1 || nivel > 3) {
      Funcoes.pularLinha();
      Funcoes.cor("\033[1;31m", true);
      Funcoes.exibir("[Seleçâo Inválida]", true);
      Funcoes.pularLinha();
      Funcoes.exibir("Você inseriu um número que não Funcoes.corresponde ás dificuladades!", true);
      Funcoes.pularLinha();
      Funcoes.exibir("[NIVEL 1 SELECIONADO]", true);
      Funcoes.cor("", false);
      Funcoes.pularLinha();
      nivel = 1;
    }

    while (jogarNovamente != 'N') {

      try {

        Funcoes.exibirTrave();
        Funcoes.exibir("Insira canto(número): ", false);
        input.nextLine();
        cantoSelecionado = input.nextInt();

      } catch (Exception ex) {
        Funcoes.voltarConsole();
        Funcoes.pularLinha();
        Funcoes.cor("\033[1;31m", true);
        Funcoes.exibir("[Seleçâo Inválida]", true);
        Funcoes.cor("", false);
        Funcoes.pularLinha();
        break;

      }

      try {

        while (cantoSelecionado < 1 || cantoSelecionado > 5) {
          Funcoes.voltarConsole();
          Funcoes.exibirTrave();
          Funcoes.cor("\033[1;31m", true);
          Funcoes.exibir("Você inseriu um número que não Funcoes.corresponde aos cantos!!!", true);
          Funcoes.exibir("\n{Tente Novamente}", true);
          Funcoes.cor("", false);
          Funcoes.pularLinha();

          Funcoes.exibir("Insira canto (número):", false);

          cantoSelecionado = input.nextInt();
        }

      } catch (Exception ex) {

        Funcoes.voltarConsole();
        break;

      }

      goleiro = Funcoes.numeroAleatorio();

      // Dificuldade do nivel, a variavel GOLEIRO recebe um numero aletorio entre 1 e
      // 5, que será comparado a variavel CANTOSELECIONADO, de acordo com o nivel
      // selecionado a comparação será mais de uma vez
      int numero[] = new int[4];

      switch (nivel) {
        case 1:
          for (int c = 0; c <= nivel; c++) {
            numero[c] = Funcoes.numeroAleatorio();
            goleiro = numero[c];
          }
          break;

        case 2:
          for (int c = 0; c <= nivel; c++) {
            numero[c] = Funcoes.numeroAleatorio();

            if (numero[c] == cantoSelecionado) {
              goleiro = numero[c];
            }
          }

          break;

        case 3:
          for (int c = 0; c <= nivel; c++) {
            numero[c] = Funcoes.numeroAleatorio();

            if (numero[c] == cantoSelecionado) {
              goleiro = numero[c];
            }
          }

          break;
        default:

          goleiro = Funcoes.numeroAleatorio();

      }

      Funcoes.pularLinha();

      // verificar se marcou o gol e acrescenta pontos ao placar
      if (cantoSelecionado == goleiro) {
        Funcoes.gol(false);
        Funcoes.pularLinha();
        Funcoes.exibir("Canto: " + cantoSelecionado + " Goleiro: " + goleiro, false);
        Funcoes.pularLinha();
        placarGoleiro++;
      }

      else

      {
        Funcoes.gol(true);
        Funcoes.pularLinha();
        Funcoes.exibir("Canto: " + cantoSelecionado + " Goleiro: " + goleiro, false);
        Funcoes.pularLinha();
        placarJogador++;
      }

      // exibi o placar
      Funcoes.pularLinha();
      Funcoes.exibir("Gols[" + placarJogador + "] " + "Defesas[" + placarGoleiro + "]", true);

      // verificar o ganhador quando o placar chega a pontuação 5, Funcoes.exibir a animacao
      // do vencedor e finaliza a partida
      do {

        if (placarGoleiro >= 5) {
          Funcoes.pularLinha();
          Funcoes.cor("\033[1;31m", true);
          Funcoes.exibirGanhador(false);
          Funcoes.pularLinha();
          placarGoleiro = 0;
          placarJogador = 0;
          Funcoes.cor("", false);
          Funcoes.limpaTela();
          jogarNovamente = 'N';
          break;
        }

        if (placarJogador >= 5) {
          Funcoes.animacao();
          Funcoes.animacaoComemorandoGol();
          Funcoes.pularLinha();
          Funcoes.cor("\033[0;32m", true);
          Funcoes.exibirGanhador(true);
          placarGoleiro = 0;
          placarJogador = 0;
          Funcoes.cor("", false);
          Funcoes.limpaTela();
          jogarNovamente = 'N';
          break;
        }

        Funcoes.pularLinha();
        Funcoes.exibir("Deseja continuar?\n Responda [S] para continua, [N] encerrar o jogo", false);
        Funcoes.exibir(": ", false);
        jogarNovamente = input.next().toUpperCase().charAt(0);
        Funcoes.voltarConsole();

      } while (jogarNovamente != 'N' && jogarNovamente != 'S');

    }
  }
}