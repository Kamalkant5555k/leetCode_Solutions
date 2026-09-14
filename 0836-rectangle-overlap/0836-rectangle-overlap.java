class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // int lx1=Math.abs(rec1[0]-rec1[2]);
        // int ry1=Math.abs(rec1[1]-rec1[3]);
        // double len1=Math.sqrt((lx1*lx1)+(ry1*ry1));

        // int lx2=Math.abs(rec2[0]-rec2[2]);
        // int ry2=Math.abs(rec2[1]-rec2[3]);
        // double len2=Math.sqrt((lx2*lx2)+(ry2*ry2));
        // if(len1==len2){
        //     return true;
        // }
        // return false;

      // X-axis overlap
        boolean xOverlap = rec1[0] < rec2[2] && rec2[0] < rec1[2];
        // Y-axis overlap
        boolean yOverlap = rec1[1] < rec2[3] && rec2[1] < rec1[3];
        return xOverlap && yOverlap;

        
    }
}