package rle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RunLengthEncoder {

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

    public String decode(List<Tuple> tupleList){
        return decode(tupleList.stream());
    }

    private String decode(Stream<Tuple> tuplesStream){
        return tuplesStream.reduce("", this::decodeTuple, (a1, a2) -> null);
    }

    private String decodeTuple(String string, Tuple tuple) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < tuple.getCount(); i++) {
            stringBuilder.append(tuple.getCharacter());
        }
        string = stringBuilder.toString();
        return string;
    }
}
