public class Trab{
  public static void main (String []args){
    int soma=0;
    int opCarac;
    intro();
    carac();
    do{
      opCarac=Entrada.leiaInt("\nEscolha as caracter�sticas que melhor lhe agradam");
      carac1()
    } while(opCarac<9);
      soma+=opCarac;
      System.out.println(soma);
  }
    
    public static void intro(){
      System.out.println("Mundo");
      System.out.println("Voc� est� situado em um mundo dist�pico pelo ano de 2056, onde existe a magia, e com ela, tudo evoluiu mais r�pido que o normal, as pessoas se dividiram em ra�as (An�o, Troll, Elfo, Orcs e Humanos), a Tecnologia evoluiu drasticamente (rob�s, drones, etc).");
      System.out.println("As na��es n�o possuem mais o poder governamental, e sim as NeoEmpresas.");
      System.out.println("As NeoEmpresas s�o empresas t�o grandes que passam do limite territorial, ou seja, s�o elas que controlam as na��es, e as regras.");
      System.out.println("E no meio disso tudo � onde voc� estar� situado como um Shadowrunner. Mas afinal, oque � um Shadowrunner? ");
      System.out.println("Eles, como o nome diz, s�o Corredores das Sombras, voc� � um ladr�o, dar� a sua vida pelo trabalho sujo, e far� de tudo para completar sua miss�o e rezar para que n�o seja descoberto, por que se for, eles ir�o atr�s de voc�. Mas n�o pense que s�o s� ladr�es, e como se fosse a elite deles.");
      
      System.out.println("\n\nSeu Passado");
      System.out.println("Agora em especial, o seu personagem.");
      System.out.println("Voc� ser� John, um humano com 29 anos. Voc� teve um passado triste, pois foi criado em um orfanato, e no decorrer da sua vida, acabou sendo arrastado para uma vida de crimes e roubos para poder sobreviver.");
      System.out.println("Em um dia na sua inf�ncia, um senhor apareceu por l�, ningu�m sabia o porque nem de onde ele veio, mas que ele era estranho, todos concordavam.");
      System.out.println("At� que tiveram a brilhante ideia de rouba-lo tamb�m.");
      System.out.println("Voc� e seus amigos esperaram at� o melhor momento para fazer a tentiva, mas foram parados, todos quase que ao mesmo tempo, pelo senhor. Seus olhos brilharam de medo e respeito por ele.");
      System.out.println("Ele chamou-lhe para treinar pois ficou intrigado por sua coragem, mesmo n�o conhecendo tal homem.");
      System.out.println("Muitos anos depois, voc� j� era treinado para o que fazia, roubar. J� havia feito v�rios trabalhos com v�rias pessoas e havia conquistado seu pr�prio grupo.");

    }
    public static void carac(){
      System.out.println("\n\nCaracter�sticas");
      System.out.println("Esse RPG tamb�m h� um sistema de caracter�sticas, uma coisa b�sica para auxiliar na jogabilidade.");
      System.out.println("Voc� ter� 3 Caracter�sticas:");
      System.out.println("STRENGTH (For�a)");
      System.out.println("DEXTERITY (Dextreza)");
      System.out.println("INTELLIGENCE (Intelig�ncia)");
      System.out.println("Cada um deles tem uma fun��o espec�fica, como exemplo:");
      System.out.println("STRENGTH ser� para verificar a for�a do seu personagem, quanto peso consegue aguentar, o qu�o longe pula, etc.");
      System.out.println("DEXTERITY ser� para verificar sua velocidade nas tarefas, acrobacias, mira com armas de fogo, etc.");
      System.out.println("INTELLIGENCE ser� para sua velocidade de racioc�nio, constru��o de pe�as e afins, conhecimento mundano, etc.");
      System.out.println("Seu personagem ter� 9 pontos para ser gasto em entre elas, o que ir� afetar durante o jogo, pois algumas escolhas s� ser�o feitas se voc� cumprir o requisito de tal caracter�stica.");
        
    }
    public static void carac1(){
      System.out.println("1- STRENGTH (For�a)");
      System.out.println("2- DEXTERITY (Dextreza)");
      System.out.println("3- INTELLIGENCE (Intelig�ncia)");
  
}