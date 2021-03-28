package io.kuehnemund;

import java.util.List;

public class Brick {
    public final BrickValue brickValue;
    public final BrickColor brickColor;

    public Brick(BrickColor brickColor, BrickValue brickValue) {
        this.brickColor = brickColor;
        this.brickValue = brickValue;
    }
    public boolean numericNeighbor(Brick brick)
    {
        int lower = brickValue.value -1;
        int higher = brickValue.value +1;
        if (this.brickColor == brick.brickColor){
            if (lower == brickValue.value || higher == brickValue.value){
                return true;
            }
        }
        return false;
    }
    public boolean colorNeighbor(Brick brick) {
        if (this.brickValue == brick.brickValue){
            if(this.brickColor != brickColor){
                return true;
            }
        }
        return false;
    }
}
