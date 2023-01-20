import java.util.*;

public class Funcoes {

  
   //exibi o menu inicial (inicialização do jogo)
   public static void exibirMenuInicial() {
      System.out.println("╔═╗╔═╗╔╗╔╔═╗╦ ╔╦╗╦ ╦  ╔═╗╔═╗╔═╗╔╦╗╔╗ ╔═╗╦  ╦ ");
      System.out.println("╠═╝║╣ ║║║╠═╣║  ║ ╚╦╝  ╠╣ ║ ║║ ║ ║ ╠╩╗╠═╣║  ║");
      System.out.println("╩  ╚═╝╝╚╝╩ ╩╩═╝╩  ╩   ╚  ╚═╝╚═╝ ╩ ╚═╝╩ ╩╩═╝╩═╝");
      System.out.println(" ");

      System.out.println("[1] INICIAR JOGO\n[2] MULTIPLAYER\n[3] MODO HISTORIA\n[0] SAIR \n");
      System.out.print("Opçâo: ");

   }
   //exibe a opcao de canto para chutar
   public static void exibirTrave() {

      System.out.println("\nESCOLHA UM CANTO!!!\n");

      System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
      System.out.println("II                              II");
      System.out.println("II  1                        4  II");
      System.out.println("II                              II");
      System.out.println("II              3               II");
      System.out.println("II                              II");
      System.out.println("II  2                        5  II");
      System.out.println("II                              II \n");

      System.out.println(
         "[1] Superior esquerdo \n[2] Inferior esquerdo \n[3] Meio \n[4] Superior Direito \n[5] Inferior Direito\n");

   }
   //exibi mensangem ou metodos
   public static void exibir(String m, boolean pula) {
      if (pula)
         System.out.println(m);
      else
         System.out.print(m);
   }

   //coloca espaço no console
   public static void pularLinha() {

      System.out.println("");

   }

   //pega o nome completo do jogador e retorna somente o primeiro nome
   public static String funcaoNome(String nome) {

      String resposta = "";
      int nomeCompleto = nome.indexOf(" ");
      boolean primeiroNome = nome.indexOf(" ") >= 0;

      if (primeiroNome) {
         resposta = nome.substring(0, nomeCompleto);
      } else {
         resposta = nome;
      }

      return resposta.toUpperCase();
   }

   //exibi mensagem de boas vindos ao o usuario   depois de  selecionar a opcao [INICIAR JOGO]
   public static void exibirInicio() {
      System.out.println("PENALTY FOOTBALL");

      System.out.println("BEM VINDO A EMOÇÃO, É HORA DE TESTAR O CORAÇÃO!");

      pularLinha();

      System.out.println("QUALIDADE OU SORTE?");

      pularLinha();

      System.out.println("VAMOS DESCOBRIR...");
      pularLinha();

   }

   //exibi as opções de nivel/modo solo
   public static void exibirNivel() {

      pularLinha();
      System.out.println("DIFICULDADE:");
      pularLinha();

      System.out.println("[1] FÁCIL\n[2] MÉDIO\n[3] DIFÍCIL");
      System.out.print("Escolha uma dificuldade (Insira número): ");

   }

   // verificar se foi gol e imprimi a mensagem de gol ou defesa
   public static void gol(boolean gol) {

      if (gol) {
         System.out.println("PARTIIUUUU");
         pularLinha();
         System.out.println("BATEEEUUUUUUUUU");
         pularLinha();
         System.out.println("GOOOOOOOOOOOOOOOOOOOOOL");
         pularLinha();
      } else {
         System.out.println("PARTIIUUUU");
         pularLinha();
         System.out.println("BATEEEUUUUUUUUU");
         pularLinha();
         System.out.println("DEEEFENDEEEEEUUUUUUUUUU OOH GOLEIRO");
         pularLinha();

      }

   }

   //retorna um número aleatorio
   public static int numeroAleatorio() {

      int cantoGoleiro = ((int)(Math.random() * 5) + 1);
      return cantoGoleiro;
   }

   //verifica se o jogador ganhou ou perdeu e exibi uma ilustração de acordo com o resultado
   public static void exibirGanhador(boolean vdd) {

      if (vdd) {
         System.out.println("      PARABÉNS VOCÊ GANHOU         ");
         System.out.println("            ____                 ");
         System.out.println("           (    )            ");
         System.out.println("            \\  /             ");
         System.out.println("             ||              ");
         System.out.println("             ||              ");
         System.out.println("            [__]             ");
         System.out.println("           /)  (\\            ");
         System.out.println("          (( () ))           ");
         System.out.println("           \\__            ");
         System.out.println("            `..'             ");
         System.out.println("             ||              ");
         System.out.println("             ||              ");
         System.out.println("            //\\__           ");
         System.out.println("          ((  `--'          ");
         System.out.println("           \\)               ");
         System.out.println("        '''''''''''''''      ");

      } else {

         System.out.println("      VOCÊ PERDEU  ");
         System.out.println("         _       ");
         System.out.println("        |.|      ");
         System.out.println("        ]^[      ");
         System.out.println("      ,-|||~\\   ");
         System.out.println("     {<|||||>}   ");
         System.out.println("      \\|||||/    ");
         System.out.println("      {/   \\}    ");
         System.out.println("      /__9__\\    ");
         System.out.println("      | / \\ |    ");
         System.out.println("      (<   >)     ");
         System.out.println("     _|)   (|_    ");
         System.out.println(" ,.,.(  |.,.|  ).,.,. ");
      }
   }

   //recebe o nome do vencedor da partida e retorna com uma mensagem
   public static void exibirGanhadorMultiplayer(String nome) {

      System.out.println("PARABÉNS " + nome + ", VOCÊ GANHOU");
      System.out.println("            ____                 ");
      System.out.println("           (    )            ");
      System.out.println("            \\  /             ");
      System.out.println("             ||              ");
      System.out.println("             ||              ");
      System.out.println("            [__]             ");
      System.out.println("           /)  (\\            ");
      System.out.println("          (( () ))           ");
      System.out.println("           \\__            ");
      System.out.println("            `..'             ");
      System.out.println("             ||              ");
      System.out.println("             ||              ");
      System.out.println("            //\\__           ");
      System.out.println("          ((  `--'          ");
      System.out.println("           \\)               ");
      System.out.println("        '''''''''''''''      ");

   }

   //muda a cor do console, quando executada tudo código a baixo mudara de cor;
   public static void cor(String corSelecionada, boolean corSim) {

      String cor = "";

      if (corSim) {
         cor = corSelecionada;
         System.out.println(cor);

         //passando FALSE é exuctado o codigo abaixo voltando as cores padroes do conosle  
      } else {
         cor = "\033[0m";
         System.out.println(cor);

      }
   }

   //limpa o console mandando todo codigo para cima
   public static void limpaTela() {

      System.out.print("\n\npressione <enter> para voltar ao Menu.\n");
      new Scanner(System.in).nextLine();

      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
   public static void voltarConsole() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

   //atrada a executado do codido de acordo com os milissegundos passados
   public static void tempo(int ms) {
      try {
         Thread.sleep(ms);
      } catch (InterruptedException e) {
         System.err.format("IOException: %s%n", e);
      }
   }

   //Animacao cobrando o ultimo penalty do vencedor
   public static void animacao() {

      voltarConsole();
      for (int c = 1; c <= 7; c++) {
         if (c == 1) {
            System.out.println("                      ___       ");
            System.out.println("    o__       o__    |   |\\    ");
            System.out.println("   /|         /\\     |   |X\\  ");
            System.out.println("   / > o       <\\    |   |XX\\");
            tempo(500);
            voltarConsole();
         } else if (c == 2) {
            System.out.println("                      ___           ");
            System.out.println("    o__       o__    |   |\\       ");
            System.out.println("   /|         /\\     |   |X\\      ");
            System.out.println("   / >  o      <\\    |   |XX\\     ");
            tempo(500);
            voltarConsole();

         } else if (c == 3) {
            System.out.println("                      ___      ");
            System.out.println("    o__        o__   |   |\\     ");
            System.out.println("   /|          /\\    |   |X\\   ");
            System.out.println("   / >    o     <\\   |   |XX\\  ");
            tempo(500);
            voltarConsole();

         } else if (c == 4) {
            System.out.println("                      ___     ");
            System.out.println("    o__        o__   |   |\\   ");
            System.out.println("   /|          /\\    |   |X\\ ");
            System.out.println("   / >      o   <\\   |   |XX\\");
            tempo(500);
            voltarConsole();

         } else if (c == 5) {
            System.out.println("                      ___    ");
            System.out.println("    o__        o__   |   |\\  ");
            System.out.println("   /|          /\\    |   |X\\ ");
            System.out.println("   / >         o<\\   |   |XX\\");
            tempo(500);
            voltarConsole();

         } else if (c == 6) {
            System.out.println("                      ___     ");
            System.out.println("    o__        o__   |   |\\   ");
            System.out.println("   /|          /\\    |   |X\\ ");
            System.out.println("   / >          <\\  o|   |XX\\");
            tempo(500);
            voltarConsole();
         } else if (c == 7) {
            System.out.println("                      ___       ");
            System.out.println("    o__        o__   |   |\\    ");
            System.out.println("   /|          /\\    |   |X\\  ");
            System.out.println("   / >          <\\   |  o|XX\\ ");
         }
      }
   }

   //Animacao comemorando o gol do ultimo penalty
   public static void animacaoComemorandoGol() {

      voltarConsole();
      for (int c = 1; c <= 10; c++) {
         if (c == 1) {
            System.out.println("      o       ");
            System.out.println("     /|\\      ");
            System.out.println("     / \\      ");
            tempo(500);
            voltarConsole();
         } else if (c == 2) {
            System.out.println("     \\ o / ");
            System.out.println("       |   ");
            System.out.println("      / \\  ");
            tempo(500);
            voltarConsole();

         } else if (c == 3) {
            System.out.println("        _ o    ");
            System.out.println("         /\\    ");
            System.out.println("        | \\    ");
            tempo(500);
            voltarConsole();

         } else if (c == 4) {
            System.out.println("                    ");
            System.out.println("          ___\\o     ");
            System.out.println("         /)  |      ");
            tempo(500);
            voltarConsole();

         } else if (c == 5) {
            System.out.println("              __|      ");
            System.out.println("                \\o     ");
            System.out.println("                ( \\     ");
            tempo(500);
            voltarConsole();

         } else if (c == 6) {
            System.out.println("              \\ /       ");
            System.out.println("               |        ");
            System.out.println("              /o\\       ");
            tempo(500);
            voltarConsole();
         } else if (c == 7) {
            System.out.println("               |__    ");
            System.out.println("             o/       ");
            System.out.println("            / )       ");

            tempo(500);
            voltarConsole();
         } else if (c == 8) {
            System.out.println("                         ");
            System.out.println("             o/__        ");
            System.out.println("             |  (\\       ");
            tempo(500);
            voltarConsole();
         } else if (c == 9) {
            System.out.println("              o _             ");
            System.out.println("              /\\              ");
            System.out.println("              / |             ");
            tempo(500);
            voltarConsole();

         } else if (c == 10) {
            System.out.println("              \\ o /      ");
            System.out.println("                |        ");
            System.out.println("               / \\       ");
            tempo(700);
            voltarConsole();
         }
      }
   }

   //animacao usada no modo historia/verifica o ganhador e imprimi um resultado
   public static void fim(boolean sim) {
      if (sim) {
         System.out.println("");
         System.out.println(" VOÇÊ FOI BARRADO DO TIME, MAIS SORTE NA PROXIMA TEMPORADA");
         System.out.println("         _       ");
         System.out.println("        |.|      ");
         System.out.println("        ]^[      ");
         System.out.println("      ,-|||~\\   ");
         System.out.println("     {<|||||>}   ");
         System.out.println("      \\|||||/    ");
         System.out.println("      {/   \\}    ");
         System.out.println("      /__9__\\    ");
         System.out.println("      | / \\ |    ");
         System.out.println("      (<   >)     ");
         System.out.println("     _|)   (|_    ");
         System.out.println(" ,.,.(  |.,.|  ).,.,. ");
      } else {
         System.out.println("    ZEROUUUU O GAME! PARABÉNS!!!   ");
         System.out.println("            ____                 ");
         System.out.println("           (    )            ");
         System.out.println("            \\  /             ");
         System.out.println("             ||              ");
         System.out.println("             ||              ");
         System.out.println("            [__]             ");
         System.out.println("           /)  (\\            ");
         System.out.println("          (( () ))           ");
         System.out.println("           \\__            ");
         System.out.println("            `..'             ");
         System.out.println("             ||              ");
         System.out.println("             ||              ");
         System.out.println("            //\\__           ");
         System.out.println("          ((  `--'          ");
         System.out.println("           \\)               ");
         System.out.println("        '''''''''''''''      ");
      }
   }

   //retorna um time selecionado/usado no modo historia
   public static String times(int select) {

      String time = "";

      if (select == 1) {
         time = "Palmeiras";
      } else if (select == 2) {
         time = "Santos";
      } else if (select == 3) {
         time = "Fortaleza";
      } else if (select == 4) {
         time = "Corinthians";
      } else if (select == 5) {
         time = "São Paulo";
      } else if (select == 6) {
         time = "Coritiba";
      } else {
         time = "time";
      }
      return time;
   }

   //imprimi o texto com tempo estabelecido/usado no modo historia
   public static void fraseCaracterPorVez(String mensagem) {

      int t = mensagem.length();
      for (int c = 0; c < t; c++) {
         char caracter = mensagem.charAt(c);
         System.out.print(caracter);
         tempo(40);
      }

   }

   //marca a quantidade de vidas restantes no modo historia
   public static void vida(int vida) {

      if (vida == 1) {
         System.out.println("\033[0;92m"+"VIDA:"+"\033[0;91m"+" I  "+"\033[0m");
      } else if (vida == 2) {
         System.out.println("\033[0;92m"+"VIDA:"+"\033[1;93m"+" II "+"\033[0m");
      } else if (vida == 3) {
         System.out.println("\033[0;92m"+"VIDA:"+"\033[1;94m"+" III"+"\033[0m");
      }
   }

   //metodo para verificar se foi gol, usado no modo historia//retorna um valor booleano
   public static boolean penalti(int nivel) {

      Scanner input = new Scanner(System.in);

      int cantoSelecionado = 0, goleiro = 0;
      char jogarNovamente = 'S';

      boolean resultado = false;

      while (jogarNovamente != 'N') {

         try {
            exibirTrave();
            exibir("Insira canto(número): ", false);
            cantoSelecionado = input.nextInt();

         } catch (Exception ex) {
            voltarConsole();
            pularLinha();
            cor("\033[1;31m", true);
            exibir("[Seleçâo Inválida]", true);
            cor("", false);
            pularLinha();
            break;

         }

         try {

            while (cantoSelecionado < 1 || cantoSelecionado > 5) {
               voltarConsole();
               exibirTrave();
               cor("\033[1;31m", true);
               exibir("Você inseriu um número que não corresponde aos cantos!!!", true);
               exibir("\n{Tente Novamente}", true);
               cor("", false);
               pularLinha();

               exibir("Insira canto (número):", false);

               cantoSelecionado = input.nextInt();
            }

         } catch (Exception ex) {

            voltarConsole();
           
        Funcoes.cor("\033[1;31m", true);
        Funcoes.exibir("[Seleçâo Inválida]", true);
        Funcoes.cor("", false);
            break;

         }

         goleiro = numeroAleatorio();

         int numero[] = new int[4];

         switch (nivel) {
         case 1:
            for (int c = 0; c <= nivel; c++) {
               numero[c] = numeroAleatorio();
               goleiro = numero[c];
            }
            break;

         case 2:
            for (int c = 0; c <= nivel; c++) {
               numero[c] = numeroAleatorio();

               if (numero[c] == cantoSelecionado) {
                  goleiro = numero[c];
               }
            }

            break;

         case 3:
            for (int c = 0; c <= nivel; c++) {
               numero[c] = numeroAleatorio();

               if (numero[c] == cantoSelecionado) {
                  goleiro = numero[c];
               }
            }

            break;
         default:

            goleiro = numeroAleatorio();

         }

         pularLinha();

         if (cantoSelecionado == goleiro) {
            gol(false);
            pularLinha();
            jogarNovamente = 'N';
            resultado = false; //defesa retorna FALSE
         } else

         {
            gol(true);
            pularLinha();
            jogarNovamente = 'N';
            resultado = true; //gol retorna TRUE
         }

      }

      return resultado;
   }

   //limpa o console mandando todo codigo para cima/com mensagem diferente
   public static void limpaTela2() {

      System.out.print("\n\npressione <enter> para Continuar.\n");
      new Scanner(System.in).nextLine();

      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}