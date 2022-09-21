import java.util.Scanner;

public class ReturnMaxOccuringCharInString
{

    static char getMaxOccurringChar(String str)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[256];

        // Construct character count array from the input
        // string.

        for (int i=0; i<str.length(); i++)
            count[str.charAt(i)]++;

        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < str.length(); i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }

    // Driver Method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        
        System.out.println("Max occurring character is " +
                getMaxOccurringChar(str));
    }
}