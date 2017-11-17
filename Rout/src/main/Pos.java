package main;

/**
 * Created by fengliejv on 2017/11/16.
 */
public class Pos {

    private int x;  // 横坐标
    private int y;  // 纵坐标

    // get、set、construct方法省略

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pos{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pos pos = (Pos) o;

        if (x != pos.x) return false;
        return y == pos.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }


}
