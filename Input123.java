public class Input123{

    public static void main(String[] args)
    {

        int num;

        int result;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an even number or 999 to exit: ");

        num = input.nextInt();

        result = num % 2;

        while(num != 999)

        {

            while(result != 0)

            {

                System.out.println(num + " is not an even number");

                System.out.print("Please enter an even numbern");

                num = input.nextInt();

                result = num % 2;

            }

                System.out.println("Good job!");

                System.out.print("Please enter an even number or 999 to exit... ");

                num = input.nextInt();

                result = num % 2;

    } }
}