package io.kuehnemund;

import java.util.HashMap;
import java.util.Map;

public enum BrickValue {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ELEVEN(11),
    TWELVE(12),
    THIRTEEN(13);


    public static final Map<Integer, BrickValue> BY_VALUE = new HashMap<>();

    static {
        for (BrickValue z : values()) {
            BY_VALUE.put(z.value, z);
        }
    }

    public final int value;

    private BrickValue(int value) {
        this.value = value;
    }

    public static BrickValue valueOfValue(int value) {
        return BY_VALUE.get(value);
    }
}
