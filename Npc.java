import java.util.Random;

public class Npc {
    public int x = 0;
    public int y = 0;
    public boolean isAlive = true;
    
    public Npc (int x, int y, boolean isAlive) {
        this.x = x;
        this.y = x;
        this.isAlive = isAlive;
    }
    public Npc (int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void printPosition(String animal) { 
        System.out.println(animal + " is now at " + this.x + "," + this.y + "\n");
    }

    public void changePosition(){
        Random generator = new Random(); 
        int optionCounter = 0;
        if (this.y <= 10 && this.y > 0) {
            optionCounter++;
       }
       if (this.y >= 0 && this.y < 10) {
            optionCounter++;
       }
       if (this.x >=0 && this.x < 10) {
            optionCounter++;
       }
       if (this.x <=10 && this.x > 0) {
            optionCounter++;
       }

        String moveList[] = new String[optionCounter];

        int index = 0;
       if (this.y <= 10 && this.y > 0) {
            moveList[index] = "down";
            index++;
       }
       if (this.y >= 0 && this.y < 10) {
           moveList[index] = "up";
           index++;
       }
       if (this.x >=0 && this.x < 10) {
           moveList[index] = "right";
           index++;
       }
       if (this.x <=10 && this.x > 0) {
           moveList[index] = "left";
       }

       int number = generator.nextInt(optionCounter);
       String direction = moveList[number];
       
       if(direction == "up"){
           this.y++;
       }
       if(direction == "down"){
           this.y--;
       }
       if(direction == "left"){
           this.x--;
       }
       if(direction == "right"){
           this.x++;
       }
    }
}