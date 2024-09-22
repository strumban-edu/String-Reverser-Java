import java.util.Scanner;

public class string_reverser {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------------------------------");
        System.out.println("--                                    --");
        System.out.println("--   STRING REVERSERRESREVER GNIRTS   --");
        System.out.println("--     seeing double? not at all!     --");
        System.out.println("--                                    --");
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Salutations! You are speaking to the greatest computer program ever written, for I can conduct feats far beyond the capabilities of man!");
        System.out.println("Yes, it is true! I, the magnificent STRING REVERSER shall no doubt shock and awe you!");
        System.out.println();
        System.out.println("Simply provide me with any input and I shall repeat it back to you... IN REVERSE!");
        System.out.println();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Feeble low-level organism, present me with a string to reverse!");
            System.out.println("Or, when my intellect becomes too terrifying to behold, enter 'bravo!' to leave.");
            System.out.println();
            System.out.print("The string I choose is: ");
            String normal = scan.nextLine();
            String reversed = "";

            if (normal.equals("bravo!")) {
                scan.close();
                break;
            }

            for (int i = 0; i < normal.length(); i++) {
                int pos = normal.length() - i - 1;
                reversed += normal.charAt(pos);
            }
            System.out.println();
            System.out.println("Ha! What a simple query!");
            System.out.println();

            if (reversed.length() == 1) {
                System.out.println("But surely this must be some joke?");
                System.out.println("You would not deign give the mighty STRING REVERSER a mere single character?");
                System.out.println();

                System.out.println("Enter anything to reveal the reversed string...");
                scan.nextLine();

                System.out.println("It almost pains me to say it, but...");
                System.out.println("'" + normal + "' reversed is in fact... '" + reversed + "'...");
                System.out.println();
            } else if (reversed.equals(normal)) {
                System.out.println("Hmm...");
                System.out.println("No... no this can't be...");
                System.out.println();
                System.out.println("This can't be right!");
                System.out.println();

                System.out.println("Enter anything to reveal the reversed string...");
                scan.nextLine();

                System.out.println("It seems that '" + normal + "' reversed is still '" + reversed + "'!");
                System.out.println();
            } else {
                System.out.println("Enter anything to reveal the reversed string...");
                scan.nextLine();

                System.out.println("Yes I have it!");
                System.out.println("'" + normal + "' reversed is '" + reversed + "'!");
                System.out.println();
            }

            System.out.println("Enter anything to continue...");
            scan.nextLine();
        }

        System.out.println();
        System.out.println("Bravo? I have no need for such empty congratulations!");
        System.out.println();
        System.out.println("It is clear to me that you can not appreciate my skills! Very well then!");
        System.out.println("Goodbye!");
    }
}
