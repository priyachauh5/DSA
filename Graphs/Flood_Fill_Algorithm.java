import java.util.*;

public class Flood_Fill_Algorithm{
    //O(m*n)
    public void helper(int image[][], int sr, int sc, int color, boolean vis[][], int orgCol){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || vis[sr][sc]|| image[sr][sc]!=orgCol){
            return;
        }
        
        //left
        helper(image, sr, sc-1, color, vis, orgCol);
        //right
        helper(image, sr, sc+1, color, vis, orgCol);
        //up
        helper(image, sr-1, sc, color, vis, orgCol);
        //down
        helper(image, sr+1, sc, color, vis, orgCol);
    }
    //const time
    public int[][] floodfill(int[][] image, int sr, int sc, int color){
        boolean vis[][]=new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
    public static void main(String args[]){

    }
}