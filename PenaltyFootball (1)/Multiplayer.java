import java.util.Scanner;

public class Multiplayer{
  public static void jogoMultiplayer() {
      Scanner input = new Scanner(System.in);
    String nomeJogador = "";
    String nomeJogador2 = "";
    String nomeEntrada = "";
    int cantoSelecionado = 0, goleiro = 0, placarJogador = 0, placarGoleiro = 0;
    char jogarNovamente = 'S';

    
    Funcoes.voltarConsole();
    Funcoes.exibir("MODO MULTIPLAYER", true);
    Funcoes.pularLinha();
    Funcoes.exibir("BATEDOR X GOLEIRO",true);
    Funcoes.exibir("QUEM PONTUAR 5 PRIMERIO SERÁ O VENCEDOR!",true);
    Funcoes.pularLinha();
    Funcoes.exibir("Insira nome do batedor: ", false);
    nomeEntrada = input.nextLine();
    nomeJogador = Funcoes.funcaoNome(nomeEntrada);

    Funcoes.pularLinha();
    
    Funcoes.exibir("Insira nome do goleiro: ", false);
    nomeEntrada = input.next();
    nomeJogador2 = Funcoes.funcaoNome(nomeEntrada);

    
    while(jogarNovamente != 'N')
    {
      Funcoes.voltarConsole();
      
      try 
        {
        Funcoes.exibirTrave();
        Funcoes.cor("\033[0;34m", true);
        Funcoes.exibir("OPÇÃO DO BATEDOR: ",false);
        Funcoes.cor("",false);
        input.nextLine();
        cantoSelecionado = input.nextInt();
        Funcoes.voltarConsole();
      } 
      catch (Exception ex)
        {
        Funcoes.cor("\033[1;31m", true);
        Funcoes.exibir("[Seleçâo Inválida]", true);
        Funcoes.cor("", false);
      break;
      }

 while (cantoSelecionado < 1 || cantoSelecionado > 5) 
 {
        Funcoes.voltarConsole();
        Funcoes.exibirTrave();
        Funcoes.cor("\033[1;31m", true);
        Funcoes.exibir("Você inseriu um número que não corresponde aos cantos!!!", true);
        Funcoes.exibir("\n{Tente Novamente}", true);
        Funcoes.cor("", false);
        Funcoes.pularLinha();
        Funcoes.cor("\033[0;34m", true);
        Funcoes.exibir("OPÇÃO DO BATEDOR: ", false);
        Funcoes.cor("", false);
        cantoSelecionado = input.nextInt();

      }
      
      try
        {
        Funcoes.voltarConsole();
        Funcoes.exibirTrave();
        Funcoes.cor("\033[0;33m", true);
        Funcoes.exibir("OPÇÃO DO GOLEIRO: ", false);
        Funcoes.cor("",false);
        goleiro = input.nextInt();

        } 
        
      catch (Exception ex) 
        {

        Funcoes.cor("\033[1;31m", true);
        Funcoes.exibir("[Seleçâo Inválida]", true);
        Funcoes.cor("", false);
        break;
      }


       while (goleiro < 1 || goleiro > 5) 
       {
        Funcoes.voltarConsole();
        Funcoes.exibirTrave();
        Funcoes.cor("\033[1;31m", true);
        Funcoes.exibir("Você inseriu um número que não corresponde aos cantos!!!", true);
        Funcoes.exibir("\n{Tente Novamente}", true);
        Funcoes.cor("", false);
        Funcoes.pularLinha();
        Funcoes.cor("\033[0;33m", true);
        Funcoes.exibir("OPÇÃO DO GOLEIRO: ", false);
        Funcoes.cor("",false);
        goleiro = input.nextInt();

      }

      if (cantoSelecionado == goleiro) 
      {

        Funcoes.gol(false);
        Funcoes.exibir(" Canto: " + cantoSelecionado + " Goleiro: " + goleiro, true);
        placarGoleiro++;

      } 
      else 
      {

        Funcoes.gol(true);
        Funcoes.exibir("Batedor: " + cantoSelecionado + " Goleiro: " + goleiro, true);
        placarJogador++;
      }
      
      Funcoes.exibir("\033[0;34m" + nomeJogador + "\033[0m" + " [" + placarJogador + "]" + " x " + "[" + placarGoleiro + "] " + "\033[0;33m" + nomeJogador2 + "\033[0m", true);

//verifica o ganhador da partida, ao atingir 5 pontos é mostrado uma mensagem ao ganhador e o programa é encerrado.
      do{
        
         if (placarGoleiro >= 5) {
        Funcoes.pularLinha();
        Funcoes.cor("\033[0;33m", true);
        Funcoes.exibirGanhadorMultiplayer(nomeJogador2);
        Funcoes.pularLinha();
        placarGoleiro = 0;
        placarJogador = 0;
        Funcoes.cor("", false);
        Funcoes.limpaTela();
        jogarNovamente = 'N';
        break;
      }
      if (placarJogador >= 5) {
        Funcoes.pularLinha();
        Funcoes.cor("\033[0;34m", true);
        Funcoes.exibirGanhadorMultiplayer(nomeJogador);
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
       
        
      }while(jogarNovamente != 'N' && jogarNovamente != 'S');
      Funcoes.voltarConsole();

    }
  }
}