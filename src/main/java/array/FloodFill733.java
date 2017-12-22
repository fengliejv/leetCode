package array;

/**
 * Created by fengliejv on 2017/12/22.
 */
public class FloodFill733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image.length == 0) {
            return image;
        }
        int[][] visited = new int[image.length][image[0].length];
        dfs(image, sr, sc, newColor, visited, image[sr][sc]);

        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int newCllor, int[][] visited, int initColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != initColor || visited[sr][sc] == 1) {
            return;
        }
        visited[sr][sc] = 1;
        image[sr][sc] = newCllor;
        dfs(image,sr-1,sc,newCllor,visited,initColor);
        dfs(image,sr,sc-1,newCllor,visited,initColor);
        dfs(image,sr,sc+1,newCllor,visited,initColor);
        dfs(image,sr+1,sc,newCllor,visited,initColor);

    }
}
