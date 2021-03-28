package io.kuehnemund;

import java.util.List;

public class Row {
    public List<Brick> content;
    public String type = "";


    public boolean addBrick(Brick brick)
    {
        if (content.isEmpty()) {
            content.add(brick);
            return true;
        }

        if(this.type == "NUMERIC")
            for(Brick b : content) {
                if (b.numericNeighbor(brick)) {
                    content.add(brick);
                    return true;
                }
            }
        else if(this.type == "COLORED")
            for(Brick b : content) {
                if (b.colorNeighbor(brick)) {
                    content.add(brick);
                    return true;
                }
            }
        else {
            if(content.get(0).colorNeighbor(brick)){
                this.type = "COLORED";
                content.add(brick);
                return true;
            }
            else if (content.get(0).numericNeighbor(brick)){
                this.type = "NUMERIC";
                content.add(brick);
                return true;
            }
            else return false;
        }

        return false;
    }

    public boolean isValid()
    {
        if(this.content.size() < 3)
            return false;
        return true;
    }
    public int size(){
        return content.size();
    }
}
