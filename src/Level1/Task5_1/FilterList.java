package Level1.Task5_1;

import java.util.ArrayList;
import java.util.List;

public class FilterList {
    private List<String> list;

    public FilterList(List<String> list) {
        this.list = list;
    }

    public List<String> filter(int minLengthWord) {
        List<String> result = new ArrayList<>();
        for (String str: list){
            if (str.length() > minLengthWord){
                result.add(str);
            }
        }
        return result;
    }
}
