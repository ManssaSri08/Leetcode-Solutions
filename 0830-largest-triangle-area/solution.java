class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double max = 0;
        for (int i = 0; i < n; i++) {
            int xi = points[i][0], yi = points[i][1];
            for (int j = i + 1; j < n; j++) {
                int xj = points[j][0], yj = points[j][1];
                for (int k = j + 1; k < n; k++) {
                    int xk = points[k][0], yk = points[k][1];
                    int area2 = xi*(yj-yk) + xj*(yk-yi) + xk*(yi-yj);
                    if (area2 < 0) area2 = -area2;
                    if (area2 > max) max = area2; 
        }   }   }
        return max * 0.5;
    }
}
