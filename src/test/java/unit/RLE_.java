package unit;

import org.junit.Test;
import rle.RunLengthEncoder;
import rle.Tuple;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class RLE_ {

    @Test
    public void test_encode_string_correctly(){
        //GIVEN
        RunLengthEncoder rle = new RunLengthEncoder();
        String decodedString = "aghhhffaa4!**";
        ArrayList<Tuple> arrayList;

        //WHEN
        arrayList = (ArrayList<Tuple>) rle.encode(decodedString);

        //THEN
        assertThat(arrayList.get(0).getCharacter()).isEqualTo('a');
        assertThat(arrayList.get(0).getCount()).isEqualTo(1);
        assertThat(arrayList.get(2).getCharacter()).isEqualTo('h');
        assertThat(arrayList.get(2).getCount()).isEqualTo(3);
        assertThat(arrayList.get(4).getCharacter()).isEqualTo('a');
        assertThat(arrayList.get(4).getCount()).isEqualTo(2);
        assertThat(arrayList.get(7).getCharacter()).isEqualTo('*');
        assertThat(arrayList.get(7).getCount()).isEqualTo(2);
    }

    @Test
    public void test_decode_list_correctly(){
        //GIVEN
        RunLengthEncoder rle = new RunLengthEncoder();
        ArrayList<Tuple> arrayList = new ArrayList<>();
        arrayList.add(new Tuple(4, 'a'));
        arrayList.add(new Tuple(3, '*'));
        arrayList.add(new Tuple(1, 'a'));
        arrayList.add(new Tuple(2, '-'));
        String result;

        //WHEN
        result = rle.decode(arrayList);

        //THEN
        assertThat(result).isEqualTo("aaaa***a--");
    }
}
