package main.java.com.mii.test.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AnswerThree
{
    public int[] throwThreeAsc(int[] data)
    {
        List<Integer> dataTemp = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            dataTemp.add(data[i]);
        }

        List<Integer> dataTempFilteredSorted = dataTemp.stream().filter(i -> i%3 != 0).sorted().collect(Collectors.toList());
        int[] result = new int[dataTempFilteredSorted.size()];
        for (int i = 0; i < dataTempFilteredSorted.size(); i++)
        {
            result[i] = dataTempFilteredSorted.get(i);
        }

        return result;
    }
}
