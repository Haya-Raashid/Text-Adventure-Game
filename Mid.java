import java.util.*;
public class Mid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║     WELCOME TO THE GAME, SAM CHARLES  ║");
        System.out.println("╚═══════════════════════════════════════╝");
        System.out.println("Trace the murder mystery and find the killer to win the game.");
        System.out.println("Initial Health = 100. Be careful.");
        delay(1000);
        int health = 100;
        boolean hasKey = false;
        boolean hasLighter = false;
        delay(1000);
        System.out.println();
        System.out.println("*********************");
        System.out.println("Let the game begin.");
        System.out.println("*********************");
        System.out.println();
        delay(1500);
        System.out.println("Your head throbs. The room is silent _ too silent.");
        delay(1000);
        System.out.println("Where are you? How did you get here?");
        System.out.println("You notice a crumbled note on the floor. In smudged ink, it reads:");
        delay(1000);
        System.out.println("'This is not your first time here. Retrace your past.");
        System.out.println("Next to it, lies an old torn map. and something else...");
        delay(1000);
        System.out.println();
        System.out.println("a trail of blood");
        System.out.println();
        // First riddle
        System.out.println("In order to read the map, you must answer the riddle: ");
        System.out.println(" RIDDLE TIME ");
        delay(2000);
        System.out.println("I follow you all the time and copy your every move, but you can’t touch me or catch me. What am I?");
        String answer = scanner.nextLine();
        String riddle1 = "shadow";
        while (!riddle1.equals(answer)) {
            System.out.println("Incorrect Answer.");
            delay(1000);
            health--;
            System.out.println("You health is now: " + health);
            System.out.println("Try again please: ");
            answer = scanner.nextLine();
        }
        if (riddle1.equalsIgnoreCase(answer)) {
            System.out.println("Correct answer.");
            health++;
        }
        delay(1000);
        System.out.println("The map gets revealed.");
        delay(1000);
        System.out.println("The locations are: ");

        // THE MAIN FRAMEWORK
        char place = '1';
        while (health > 0) {
            do {
                delay(1000);
                System.out.println("╔═══════════════════════════════════════╗");
                System.out.println("║1- The Blood Garden                    ║");
                System.out.println("║2- The Chrono Lab                      ║");
                System.out.println("║3- The Chapel of Echoes                ║");
                System.out.println("║4- The Portal of Truth                 ║");
                System.out.println("║5- Exit                                ║");
                System.out.println("╚═══════════════════════════════════════╝");
                System.out.println("Where would you like to go? ");
                place = scanner.next().charAt(0);
                switch (place) {
                    // THE BLOOD GARDEN
                    case '1':
                        System.out.println("╔═══════════════════════════════════════╗");
                        System.out.println("║          The Blood Garden             ║ ");
                        System.out.println("╚═══════════════════════════════════════╝");
                        System.out.println("You reach the crime scene. A dead body lies there.");
                        System.out.println("A strange familiarity creeps along your veins.");
                        System.out.println("You begin investigating the crime scene.");

                        int tbg = (int) (Math.random() * 2);
                        switch (tbg) {
                            case 0:
                                delay(1300);
                                System.out.println("You find a buried locket.");
                                delay(1000);
                                System.out.println("To open the locket, you must answer the riddle: ");
                                delay(1000);
                                System.out.println("RIDDLE TIME");
                                System.out.println("What is harder to catch the faster you run?");
                                String answer2 = scanner.nextLine();
                                scanner.nextLine();
                                String riddle2 = "Breath";
                                while (!answer2.equals(riddle2)) {
                                    System.out.println("Incorrect Answer.");
                                    delay(1000);
                                    health--;
                                    System.out.println("You health is now: " + health);
                                    System.out.println("Try again please: ");
                                    answer2 = scanner.nextLine();
                                }
                                if (answer2.equalsIgnoreCase(riddle2)) {
                                    health++;
                                    System.out.println("The locket opens with a click.");
                                    System.out.println("It reveals a picture.");
                                    delay(1000);
                                    System.out.println("a picture of YOU and the victim. ");
                                    System.out.println("On the back: 'Don't forget why you did it.'");
                                }
                                break;

                            case 1:
                                System.out.println("You find a knife, the blade covered in blood.");
                                delay(1000);
                                System.out.println("Something is carved at the base of the knife.");
                                System.out.println("To see it, you must answer the riddle.");
                                System.out.println("RIDDLE TIME");
                                delay(1000);
                                System.out.println("What do you find at the end of a rainbow?");
                                String answer3 = scanner.nextLine();
                                scanner.nextLine();
                                String riddle3 = "W";
                                while (!answer3.equals(riddle3)) {
                                    System.out.println("Incorrect Answer.");
                                    delay(1000);
                                    health--;
                                    System.out.println("You health is now: " + health);
                                    System.out.println("Try again please: ");
                                    answer3 = scanner.nextLine();
                                }
                                if (answer3.equals(riddle3)) {
                                    health++;
                                    System.out.println("You wipe the blood off the knife.");
                                    System.out.println("It reveals some initials.");
                                    delay(1000);
                                    System.out.println("The initials ... 𝓢𝓒 ");
                                    delay(1200);
                                    System.out.println("Your initials.");
                                }
                                break;
                        }
                        System.out.println("*FLASHBACK*");
                        System.out.println("You’re standing in a room — same layout, same air... but it's not the present.");
                        System.out.println("Someone screams. You’re holding something heavy. Something warm.");
                        delay(700);
                        System.out.println("Blood drips from your hand.");
                        delay(1000);
                        System.out.println("You shake your head and it all disappears. WHAT WAS THAT ?");
                        System.out.println("An illusion ? A hallucination ? A memory ? A nightmare ?");
                        break;

                    // THE CHRONO LAB
                    case '2':
                        System.out.println("╔═══════════════════════════════════════╗");
                        System.out.println("║         The Chrono Lab                ║ ");
                        System.out.println("╚═══════════════════════════════════════╝");
                        System.out.println("The lab is empty ... or is it ?");
                        System.out.println("You start looking around for clues.");
                        int tcl = (int) (Math.random() * 2);
                        switch (tcl) {
                            case 0:
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("You see an operating computer.");
                                delay(1000);
                                System.out.println("It needs a 2-digit code to unlock.");
                                System.out.println("RIDDLE TIME");
                                System.out.println("HINT: ");
                                System.out.println("- The two digits add up to 9.");
                                System.out.println("- The first digit is one less than the second.");
                                delay(1000);
                                System.out.println("Enter the code: ");
                                int answer4 = scanner.nextInt();
                                scanner.nextLine();
                                int choices = 3;
                                while (choices > 0) {
                                    while (answer4 != 45) {
                                        System.out.println("Incorrect Answer");
                                        System.out.println("You only have " + choices-- + " tries left.");
                                        health--;
                                        System.out.println("You health is now: " + health);
                                        System.out.println("Try again please: ");
                                        answer4 = scanner.nextInt();
                                    }
                                    if (answer4 == 45) {
                                        health++;
                                        System.out.println("The code was correct.");
                                        delay(1000);
                                        System.out.println("The screen shows DNA reports of the supposed killer.");
                                        System.out.println("DNA matches to ...");
                                        delay(1000);
                                        System.out.println("to SAM CHARLES");
                                        delay(600);
                                        System.out.println("Close to the computer, you find a key.");
                                        System.out.println("Keep it, it may be useful.");
                                        hasKey = true;
                                        delay(1000);
                                        System.out.println("Huh ? Why is your name there?");
                                        System.out.println("Play the game further to unravel the truth.");
                                        break;
                                    }
                                }
                                if (choices <= 0) {
                                    System.out.println("The computer is now locked.");
                                    System.out.println("You failed to get proof.");
                                    health--;
                                    System.out.println("Your health is now " + health);
                                }
                                break;

                            case 1:
                                delay(1000);
                                System.out.println("You see a chamber and decide to explore it.");
                                System.out.println("The moment you open the door, something leaps at you.");
                                delay(1000);
                                System.out.println("Press F to fight it.");
                                char input = scanner.next().charAt(0);
                                if (input == 'f' || input == 'F') {
                                    health++;
                                    System.out.println("You fight off the shadow-like creature.");
                                    delay(600);
                                    System.out.println("The creature disappears leaving behind a key.");
                                    System.out.println("The key must be useful.");
                                    hasKey = true;
                                } else {
                                    System.out.println("The creature hurt you and disappeared.");
                                    delay(1000);
                                    System.out.println("Your health is " + health--);
                                    System.out.println("You see a key glowing in the dark.");
                                    System.out.println("To get it, you must solve this riddle.");
                                    delay(1000);
                                    System.out.println("RIDDLE TIME");
                                    delay(1000);
                                    System.out.println("2 + 4 x 5 - 6 = ? ");
                                    int answer5 = scanner.nextInt();
                                    scanner.nextLine();
                                    while (answer5 != 16) {
                                        System.out.println("Incorrect Answer");
                                        health--;
                                        System.out.println("You health is now: " + health);
                                        System.out.println("Try again please: ");
                                        answer5 = scanner.nextInt();
                                    }
                                    if (answer5 == 16) {
                                        System.out.println("You obtained the key.");
                                        System.out.println("It must be useful.");
                                        hasKey = true;
                                        health++;
                                    }
                                }
                                break;
                        }
                        System.out.println("You try to leave, but the path loops back.");
                        delay(1000);
                        System.out.println("The place... it has rearranged.");
                        System.out.println("You hear your own footsteps behind you.");
                        delay(1000);
                        System.out.println("But when you turn around — there's no one there.");
                        System.out.println("You hurry and get out of there.");
                        break;

                    // THE CHAPEL OF ECHOES
                    case '3':
                        delay(1000);
                        System.out.println("╔═══════════════════════════════════════╗");
                        System.out.println("║          THE CHAPEL OF ECHOES         ║ ");
                        System.out.println("╚═══════════════════════════════════════╝");
                        System.out.println("As you step into the chapel, the door slams shut behind you.");
                        System.out.println("Candles light themselves. You hear whispers... dozens of voices.");
                        delay(1000);
                        System.out.println("One rises above the rest: 'Do you remember what you did here?'");
                        delay(1000);
                        System.out.println("You blink and the candles disappear. ");
                        System.out.println("What is happening ?");
                        delay(1000);
                        int tce = (int) (Math.random() * 2);
                        switch (tce) {
                            case 0:
                                System.out.println("You see a trail of red on the floor.");
                                System.out.println("You follow the trail and end up in front of a DARK wall.");
                                System.out.println("In order to lighten the scene, you must solve the riddle.");
                                System.out.println("RIDDLE TIME");
                                delay(1000);
                                System.out.println("I start out tall, but the longer I stand, the shorter I grow. What am I?");
                                String answer6 = scanner.nextLine();
                                scanner.nextLine();
                                System.out.println();
                                String riddle6 = "candle";
                                while (!answer6.equalsIgnoreCase(riddle6)) {
                                    System.out.println("Incorrect answer");
                                    health--;
                                    System.out.println("You health is now: " + health);
                                    System.out.println("Try again please: ");
                                    answer6 = scanner.nextLine();
                                }
                                if (answer6.equalsIgnoreCase(riddle6)) {
                                    System.out.println("You obtain a lighter.");
                                    hasLighter = true;
                                    health++;
                                    System.out.println("You put it towards the wall and are shocked to see...");
                                    delay(1000);
                                    System.out.println("YOU ARE THE ARTIST OF THIS BLOODY PAINTING.");
                                    System.out.println("What the hell does that mean ?");
                                    delay(1000);
                                    System.out.println("Are you the ...");
                                    System.out.println("No.No.No, NO ,you are not.");
                                    delay(1000);
                                    System.out.println("You keep the lighter, and rush out.");
                                }
                                break;

                            case 1:
                                System.out.println("You see some papers locked in a cabinet.");
                                System.out.println("They might be important.");
                                delay(1000);
                                System.out.println("To open the cabinet, you must solve this riddle.");
                                System.out.println("RIDDLE TIME");
                                delay(1000);
                                System.out.println("Guess the next number. 2,6,11,17,24, ?");
                                int answer7 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println();
                                while (answer7 != 32) {
                                    System.out.println("Incorrect answer");
                                    health--;
                                    System.out.println("You health is now: " + health);
                                    System.out.println("Try again please: ");
                                    answer7 = scanner.nextInt();
                                }
                                if (answer7 == 32) {
                                    health++;
                                    delay(1000);
                                    System.out.println("The cabinet unlocks.");
                                    System.out.println("You find a lighter and some papers.");
                                    delay(1000);
                                    System.out.println("The papers show a picture of you and the victim.");
                                    delay(1000);
                                    System.out.println("They are being used as evidence in court. You have been accused of murder.");
                                    System.out.println("You read a note: 'There’s still time for redemption.'");
                                    hasLighter = true;
                                    delay(1000);
                                    System.out.println("You keep the lighter.");
                                    break;
                                }
                                break;
                        }
                        break;
                        //THE PORTAL OF ANSWERS
                        case '4':
                        System.out.println("You can only enter if you have the key and the lighter.");
                     if (hasKey && hasLighter) {
                System.out.println("╔═══════════════════════════════════════╗");
                System.out.println("║         THE PORTAL OF ANSWERS         ║ ");
                System.out.println("╚═══════════════════════════════════════╝");
                System.out.println("You unlock the Portal of Answers. It glows and opens slowly...");
                System.out.println("In front of you, is a mirror.");
                System.out.println("A mirror ? That's it?");
                System.out.println("You touch the mirror and then ...");
                delay(1000);
                System.out.println("You see your reflection in the mirror.");
                System.out.println("But your face is covered in blood.");
                delay(1000);
                System.out.println("And you hold a knife. A sinister smile appears on your face.");
                delay(1000);
                System.out.println("AND THEN YOU STAB");
                delay(1000);
                System.out.println("The air is filled with screams. Moments later, silence lingers in the air.");
                System.out.println("You stare at your own reflection. And that is when the realization hits.");
                delay(1000);
                System.out.println("╭────────────────────────────────────────────────────────╮");
                System.out.println("│ You yourself are the killer you are chasing.           │ ");
                System.out.println("╰────────────────────────────────────────────────────────╯");
                delay(1000);
                System.out.println("You feel it now. The weight of every choice.");
                System.out.println("You remember everything.");
                System.out.println("You are the architecture of this nightmare and you'll live with it forever.");
            } 
            else {
                System.out.println("The portal remains shut. You need both a key and a candle.");
            } 
            break;
        }
        break;
                } while (health > 0 && place != '5');

                if (health <= 0) {
                    System.out.println("Your health is 0. You failed to solve the riddles and fell into despair.");
                }
            }
            if (place == '5') {
                System.out.println("╔═══════════════════════════════════════╗");
                System.out.println("║         EXITING THE GAME              ║");
                System.out.println("╚═══════════════════════════════════════╝");
                delay(1000);
                System.out.println(" Remember,You can run from your past, but not from yourself.");
            }
            scanner.close();
        }
        

    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
