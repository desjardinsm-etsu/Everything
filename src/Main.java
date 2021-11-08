public class Main
{

    public static void main(String[] args)
    {

        char[] letters = createLetters('b');
        for (char letter: letters)
        {
            System.out.println(letter);
        }


    }

    public static char[] createLetters(char whichCase)
    {
        char[] letters;

        if(whichCase == 'l')
        {
            letters = new char[26];

            for (int i = 0; i < 26; i++)
            {
               letters[i] = (char)(i + 97);
            }
        }
        else if (whichCase == 'u')
        {
            letters= new char[26];

            for (int i = 0; i < 26; i++)
            {
                letters[i] = (char)(i + 65);
            }
        }
        else
        {
            letters = new char[52];

            for (int i = 0; i < 26; i++)
            {
                letters[i] = (char)(i + 65);
                letters[i+26] = (char)(i + 97);
            }
        }

        return letters;

    }

    public static int max(int num1, int num2)
    {
        if(num1 > num2)
        {
            return num1;
        }
        else
        {
            return num2;
        }
    }
}
