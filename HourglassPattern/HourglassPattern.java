import java.util.Scanner;
public class HourglassPattern
{
    public static void main(String[] args)
    {
        int i, j, k;
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size (number of rows) for your custom hourglass pattern: ");
        size = scanner.nextInt();

        //Segment of code creating top half of the hourglass pattern
        for(i = 0; i < size; i++)
        {
            for(j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for(k = i; k < size; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Segment of code creating bottom half of the hourglass pattern
        for(i = size -1; i >= 0; i--)
        {
            for(j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for(k = i; k < size; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
