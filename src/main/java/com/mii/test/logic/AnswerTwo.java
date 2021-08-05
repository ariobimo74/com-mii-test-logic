package main.java.com.mii.test.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public String listB(int numberCount)
    {
        String result = "";
        for (int i = 0; i <= numberCount; i++)
        {
            for (int j = i; j > 0; j--)
            {
                result += j;
            }

            result += "\n";
        }

        return result;
    }

    public String listC(int numberCount)
    {
        String result = "";
        int temp = 0;
        boolean isGoUp = true;

        for (int i = 0; i <= numberCount; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (isGoUp)
                {
                    temp += 1;
                }
                else
                {
                    temp -= 1;
                }

                result += temp;

                if (temp == 1)
                {
                    isGoUp = true;
                }
                if (temp == 5)
                {
                    isGoUp = false;
                }
            }

            result += "\n";
        }

        return result;
    }

    public String listD(int numberCount)
    {
        String result = "\n";
        List<List<Integer>> listList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        for (int i = 1; i <= Math.pow(numberCount, 2); i++)
        {
            tempList.add(i);
            if (i % numberCount == 0)
            {
                listList.add(tempList);
                tempList = new ArrayList<>();
            }
        }

        List<List<Integer>> listNew = new ArrayList<>();
        for (int i = 0; i < listList.size(); i++)
        {
            if (i%2 == 0)
            {
                listNew.add(listList.get(i));
            }
            else
            {
                listNew.add(listList.get(i).stream()
                        .sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
            }
        }

        for (int i = 0; i < listNew.size(); i++)
        {
            for (int j = 0; j < listNew.size(); j++)
            {
                result += listNew.get(j).get(i) + "\t";
            }

            result += "\n";
        }

        return result;
    }
}
