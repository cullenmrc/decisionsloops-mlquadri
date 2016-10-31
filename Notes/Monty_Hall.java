
import java.util.Random;
import java.util.Arrays;
/*
“Suppose you’re on a game show, and you’re given the choice of three doors: Behind
one door is a car; behind the others, goats. You pick a door, say No. 1, and the host,
who knows what’s behind the doors, opens another door, say No. 3, which has a
goat. He then says to you, “Do you want to pick door No. 2?” Is it to your advantage to 
switch your choice?”

Ms. vos Savant proved that it is to your advantage, but many of her readers, includ-
ing some mathematics professors, disagreed, arguing that the probability would not
change because another door was opened.

Your task is to simulate this game show. In each iteration, randomly pick a door
number between 1 and 3 for placing the car. Randomly have the player pick a door.
Randomly have the game show host pick a door having a goat (but not the door that
the player picked). Increment a counter for strategy 1 if the player wins by switching
to the host’s choice, and increment a counter for strategy 2 if the player wins by
sticking with the original choice. Run 1,000 iterations and print both counters.
 */
public class Monty_Hall
{
    public static void main(String[] args) {
        int winbyswitching = 0;
        int winsnotbyswitching = 0;
        Random r = new Random();

        for(int iterations = 0; iterations < 100000; iterations++) {
            int playersChoice = r.nextInt(3)+1;
            int correctDoor = r.nextInt(3)+1;
            int openedDoor = 0;

            if(playersChoice == 1 && correctDoor == 1) {
                openedDoor = r.nextInt(2);
                switch (openedDoor) {
                    case 0:
                    openedDoor = 2;
                    break;
                    default:
                    openedDoor = 3;
                }

            }
            else if(playersChoice == 2 && correctDoor == 2) {
                openedDoor = r.nextInt(2);
                switch (openedDoor) {
                    case 0:
                    openedDoor = 1;
                    break;
                    default:
                    openedDoor = 3;
                }
            }
            else if(playersChoice == 3 && correctDoor == 3) {
                openedDoor = r.nextInt(2);
                switch (openedDoor) {
                    case 0:
                    openedDoor = 1;
                    break;
                    default:
                    openedDoor = 2;
                }
            }
            else if((playersChoice == 1 && correctDoor == 2) || (playersChoice == 2 && correctDoor == 1)) {
                openedDoor = 3;
            }
            else if((playersChoice == 2 && correctDoor == 3) || (playersChoice == 3 && correctDoor == 2)) {
                openedDoor = 1;
            }
            else {
                openedDoor = 2;
            }
            
            if(playersChoice == correctDoor) {
                winsnotbyswitching++;
            } else {
                winbyswitching++;
            }
                
        }
        
        System.out.println("Wins by switching: " + winbyswitching);
        System.out.println("Wins by not switching: " + winsnotbyswitching);
    }
}