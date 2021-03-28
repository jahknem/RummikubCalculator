package io.kuehnemund;

import java.util.HashMap;
import java.util.Map;

public enum BrickColor {

    BLACK(0),
    YELLOW(1),
    BLUE(2),
    RED(3);

    public static final Map<Integer, BrickColor> BY_COLOR = new HashMap<>();

    static {
        for (BrickColor z : values()) {
            BY_COLOR.put(z.color, z);
        }
    }

    public final int color;

    private BrickColor(int color) {
        this.color = color;
    }

    public static BrickColor valueOfColor(int color) {
        return BY_COLOR.get(color);
    }
}
