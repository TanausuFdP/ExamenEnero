package unit;

import org.junit.Test;
import rle.RunLenghtEncode;
import rle.Tuple;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class RLE_ {

    @Test
    public void test_encode_string_correctly(){
        //GIVEN
        RunLenghtEncode rle = new RunLenghtEncode();
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
}
