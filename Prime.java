public class Prime
{
    public static void main(String[] args)
    {
         int currentNumber, dividers;
        for (currentNumber = 2; currentNumber < 101; currentNumber++)
        {
            dividers = 0;
            for (int i = 1; i <= currentNumber; i++)
            {
                if (currentNumber % i == 0)
                    dividers++;
            }
            if (dividers <= 2)
                System.out.println(currentNumber);
        }
     }
 }
