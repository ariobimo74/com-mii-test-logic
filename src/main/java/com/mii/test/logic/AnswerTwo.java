package main.java.com.mii.test.logic;

public class AnswerTwo
{
    public String listA(int numberCount)
    {
        String result = "";
        for (int i = 0; i <= numberCount; i++)
        {
            for (int j = 0; j < i; j++)
            {
                result += i;
            }

            result += "\n";
        }

        return result;
    }
}
