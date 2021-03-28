package io.kuehnemund;

import java.util.List;

public class Option {
    private List<Row> myOptions;

    public int findRows(List<Brick> bricks){
        int rowsFound = 0;
        for (Brick b : bricks){
            Row row = new Row();
            for (Brick c : bricks) {
                if (row.addBrick(c)) {
                    bricks.remove(c);
                }
            }
            if (row.size() > 0){
                myOptions.add(row);
            }
        }
        return rowsFound;
    }
}
