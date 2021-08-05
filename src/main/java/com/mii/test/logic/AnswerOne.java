package main.java.com.mii.test.logic;

import java.util.ArrayList;
import java.util.List;

public class AnswerOne
{
    public List<String> okYes(int numberCount)
    {
        List<String> resultList = new ArrayList<>();

        for (int i = 1; i <= numberCount; i++)
        {
            String result = String.valueOf(i);
            if ((i%3 == 0) && (i%4 == 0))
            {
                result = "OKYES";
            }
            else
            {
                if (i%3 == 0)
                {
                    result = "OK";
                }
                else
                {
                    if (i%4 == 0)
                    {
                        result = "YES";
                    }
                }
            }

            resultList.add(result);
        }

        return resultList;
    }
}
