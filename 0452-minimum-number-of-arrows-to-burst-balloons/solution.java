class Solution {
    public int findMinArrowShots(int[][] points) {
        Comparator<int[]> comp=new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return Integer.compare(a[1],b[1]);
            }
        };
        Arrays.sort(points,comp);
        int arrows=1;
        int end=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>end){
                arrows++;
                end=points[i][1];
            }
        }
        return arrows;
    }
}
