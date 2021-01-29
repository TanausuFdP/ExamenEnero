package rle;

import lombok.Getter;

@Getter
public class Tuple {
    private int count;
    private char character;

    public Tuple(char character){
        this.count = 1;
        this.character = character;
    }

    public void addCount() {
        count++;
    }
}
