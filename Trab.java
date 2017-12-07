public class Trab{
  public static void main (String []args){
    int soma=0;
    int opCarac;
    intro();
    carac();
    do{
      opCarac=Entrada.leiaInt("\nEscolha as características que melhor lhe agradam");
      carac1()
    } while(opCarac<9);
      soma+=opCarac;
      System.out.println(soma);
  }
    
    public static void intro(){
      System.out.println("Mundo");
      System.out.println("Você está situado em um mundo distópico pelo ano de 2056, onde existe a magia, e com ela, tudo evoluiu mais rápido que o normal, as pessoas se dividiram em raças (Anão, Troll, Elfo, Orcs e Humanos), a Tecnologia evoluiu drasticamente (robôs, drones, etc).");
      System.out.println("As nações não possuem mais o poder governamental, e sim as NeoEmpresas.");
      System.out.println("As NeoEmpresas são empresas tão grandes que passam do limite territorial, ou seja, são elas que controlam as nações, e as regras.");
      System.out.println("E no meio disso tudo é onde você estará situado como um Shadowrunner. Mas afinal, oque é um Shadowrunner? ");
      System.out.println("Eles, como o nome diz, são Corredores das Sombras, você é um ladrão, dará a sua vida pelo trabalho sujo, e fará de tudo para completar sua missão e rezar para que não seja descoberto, por que se for, eles irão atrás de você. Mas não pense que são só ladrões, e como se fosse a elite deles.");
      
      System.out.println("\n\nSeu Passado");
      System.out.println("Agora em especial, o seu personagem.");
      System.out.println("Você será John, um humano com 29 anos. Você teve um passado triste, pois foi criado em um orfanato, e no decorrer da sua vida, acabou sendo arrastado para uma vida de crimes e roubos para poder sobreviver.");
      System.out.println("Em um dia na sua infância, um senhor apareceu por lá, ninguém sabia o porque nem de onde ele veio, mas que ele era estranho, todos concordavam.");
      System.out.println("Até que tiveram a brilhante ideia de rouba-lo também.");
      System.out.println("Você e seus amigos esperaram até o melhor momento para fazer a tentiva, mas foram parados, todos quase que ao mesmo tempo, pelo senhor. Seus olhos brilharam de medo e respeito por ele.");
      System.out.println("Ele chamou-lhe para treinar pois ficou intrigado por sua coragem, mesmo não conhecendo tal homem.");
      System.out.println("Muitos anos depois, você já era treinado para o que fazia, roubar. Já havia feito vários trabalhos com várias pessoas e havia conquistado seu próprio grupo.");

    }
    public static void carac(){
      System.out.println("\n\nCaracterísticas");
      System.out.println("Esse RPG também há um sistema de características, uma coisa básica para auxiliar na jogabilidade.");
      System.out.println("Você terá 3 Características:");
      System.out.println("STRENGTH (Força)");
      System.out.println("DEXTERITY (Dextreza)");
      System.out.println("INTELLIGENCE (Inteligência)");
      System.out.println("Cada um deles tem uma função específica, como exemplo:");
      System.out.println("STRENGTH será para verificar a força do seu personagem, quanto peso consegue aguentar, o quão longe pula, etc.");
      System.out.println("DEXTERITY será para verificar sua velocidade nas tarefas, acrobacias, mira com armas de fogo, etc.");
      System.out.println("INTELLIGENCE será para sua velocidade de raciocínio, construção de peças e afins, conhecimento mundano, etc.");
      System.out.println("Seu personagem terá 9 pontos para ser gasto em entre elas, o que irá afetar durante o jogo, pois algumas escolhas só serão feitas se você cumprir o requisito de tal característica.");
        
    }
    public static void carac1(){
      System.out.println("1- STRENGTH (Força)");
      System.out.println("2- DEXTERITY (Dextreza)");
      System.out.println("3- INTELLIGENCE (Inteligência)");
  
}