package rle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RunLenghtEncode {

    public List<Tuple> encode(String decodedSentence){
        return encode(Arrays.stream(decodedSentence.split("")));
    }

    private ArrayList<Tuple> encode (Stream<String> stringStream){
        ArrayList<Tuple> result = new ArrayList<>();
        stringStream.forEach(c -> {
            if (result.isEmpty() || result.get(result.size() - 1).getCharacter() != c.charAt(0))
                result.add(new Tuple(c.charAt(0)));
            else result.get(result.size() - 1).addCount();
        });
        return result;
    }

    public String decode(Stream<Tuple> tuplesStream){
        return "";
    }
}
