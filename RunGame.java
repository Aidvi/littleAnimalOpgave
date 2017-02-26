import java.io.Console;

public class RunGame {

    public static void main(String[] args){
        Console console = System.console();
        Npc rabbit = new Npc(10, 0, true);
        Npc snake = new Npc(0, 10);


    while (rabbit.isAlive == true) {
        rabbit.changePosition();
        rabbit.printPosition("rabbit");
         try {
            Thread.sleep(200);  
        }
         catch(InterruptedException e) {
        }
        snake.changePosition();
        snake.printPosition("Snake");
         try {
            Thread.sleep(200);  
        }
         catch(InterruptedException e) {
        }

        if (snake.x == rabbit.x && snake.y == rabbit.y) {
            String answer = console.readLine("Hello there Rabbit... Would you like to asssk for mercy?");

            while (!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No")) {
                 answer = console.readLine("I'm not sure what you are saying, Rabbit. I need to hear either a 'yes' or a 'no' from you.");
           } 
           
            if (answer.equalsIgnoreCase("Yes")) {
                System.out.println("I am sssorry, Rabbit, but I am an evil sssnake and therefore I will grant you no mercy.");
                rabbit.isAlive = false;
                System.out.println("Game Over");

            } else if (answer.equalsIgnoreCase("No")) {
                 System.out.println("You are a foolish rabbit if you really thought I would even consssider granting you merssscy");
                 rabbit.isAlive = false;
                 System.out.println("Game Over");
            } 

         } 
      }
   }
}