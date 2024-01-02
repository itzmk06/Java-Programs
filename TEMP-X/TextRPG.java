import java.util.Scanner;

public class TextRPG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to  RPG Adventure!");
        System.out.println("Choose your character class:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Rogue");

        int characterChoice = scanner.nextInt();

        switch (characterChoice) {
            case 1:
                System.out.println("You are a mighty Warrior! Prepare for battle!");
                handleWarriorActions(scanner);
                break;
            case 2:
                System.out.println("You are a powerful Mage! Get ready to cast spells!");
                handleMageActions(scanner);
                break;
            case 3:
                System.out.println("You are a cunning Rogue! Sneak and strike!");
                handleRogueActions(scanner);
                break;
            default:
                System.out.println("Invalid choice. Exiting the game.");
                break;
        }

        scanner.close();
    }

    private static void handleWarriorActions(Scanner scanner) {
        System.out.println("Choose your action as a Warrior:");
        System.out.println("1. Attack");
        System.out.println("2. Defend");

        int warriorAction = scanner.nextInt();

        switch (warriorAction) {
            case 1:
                System.out.println("You swing your mighty sword and deal damage!");
                break;
            case 2:
                System.out.println("You raise your shield and prepare for the enemy's attack.");
                System.out.println("Choose your defensive move:");
                System.out.println("a. Block");
                System.out.println("b. Counter");

                char warriorDefensiveMove = scanner.next().charAt(0);

                switch (warriorDefensiveMove) {
                    case 'a':
                        System.out.println("You successfully block the enemy's attack!");
                        break;
                    case 'b':
                        System.out.println("You counter the enemy's attack with a powerful strike!");
                        break;
                    default:
                        System.out.println("Invalid defensive move. The enemy seizes the opportunity!");
                        break;
                }
                break;
            default:
                System.out.println("Invalid action. The enemy seizes the opportunity!");
                break;
        }
    }

    private static void handleMageActions(Scanner scanner) {
        System.out.println("Choose your spell as a Mage:");
        System.out.println("1. Fireball");
        System.out.println("2. Ice Blast");

        int mageSpell = scanner.nextInt();

        switch (mageSpell) {
            case 1:
                System.out.println("You unleash a fiery fireball! Burn, enemy, burn!");
                break;
            case 2:
                System.out.println("You cast a freezing Ice Blast, slowing down the enemy.");
                System.out.println("Choose additional effect:");
                System.out.println("x. Freeze");
                System.out.println("y. Chill");

                char mageAdditionalEffect = scanner.next().charAt(0);

                switch (mageAdditionalEffect) {
                    case 'x':
                        System.out.println("The enemy is frozen solid! Your next attack is more effective.");
                        break;
                    case 'y':
                        System.out.println("The enemy is chilled, reducing their speed.");
                        break;
                    default:
                        System.out.println("Invalid additional effect. The spell fizzles.");
                        break;
                }
                break;
            default:
                System.out.println("Invalid spell. Your magical energy backfires!");
                break;
        }
    }

    private static void handleRogueActions(Scanner scanner) {
        System.out.println("Choose your action as a Rogue:");
        System.out.println("1. Sneak Attack");
        System.out.println("2. Evasion");

        int rogueAction = scanner.nextInt();

        switch (rogueAction) {
            case 1:
                System.out.println("You perform a deadly Sneak Attack, catching the enemy off guard!");
                break;
            case 2:
                System.out.println("You evade the enemy's attack with finesse, taking minimal damage.");
                System.out.println("Choose your evasive move:");
                System.out.println("u. Backflip");
                System.out.println("v. Sidestep");

                char rogueEvasiveMove = scanner.next().charAt(0);

                switch (rogueEvasiveMove) {
                    case 'u':
                        System.out.println("You execute a perfect backflip, avoiding the enemy's strike!");
                        break;
                    case 'v':
                        System.out.println("You swiftly sidestep the enemy's attack, remaining unscathed.");
                        break;
                    default:
                        System.out.println("Invalid evasive move. The enemy anticipates your actions!");
                        break;
                }
                break;
            default:
                System.out.println("Invalid action. The enemy anticipates your actions!");
                break;
        }
    }
}


//Welcome to  RPG Adventure!
// Choose your character class:
// 1. Warrior
// 2. Mage
// 3. Rogue
// 1
// You are a mighty Warrior! Prepare for battle!
// Choose your action as a Warrior:
// 1. Attack
// 2. Defend
// 2
// You raise your shield and prepare for the enemy's attack.
// Choose your defensive move:
// a. Block
// b. Counter
// a
// You successfully block the enemy's attack!