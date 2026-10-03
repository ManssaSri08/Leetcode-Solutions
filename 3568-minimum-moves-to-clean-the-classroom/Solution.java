/*
LeetCode: 3568. Minimum Moves to Clean the Classroom
Runtime: 508
Memory: 282248000
*/

class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();

        List<int[]> litter = new ArrayList<>();
        int sr = 0, sc = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    sr = i;
                    sc = j;
                } else if (ch == 'L') {
                    litter.add(new int[]{i, j});
                }
            }
        }

        int k = litter.size();

        if (k == 0) return 0;

        int[][] index = new int[m][n];

        for (int[] row : index) {
            Arrays.fill(row, -1);
        }

        for (int i = 0; i < k; i++) {
            index[litter.get(i)[0]][litter.get(i)[1]] = i;
        }

        boolean[][][][] visited =
            new boolean[m][n][energy + 1][1 << k];

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{sr, sc, energy, 0});
        visited[sr][sc][energy][0] = true;

        int[][] dir = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        int moves = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- > 0) {
                int[] cur = q.poll();

                int r = cur[0];
                int c = cur[1];
                int e = cur[2];
                int mask = cur[3];

                if (mask == (1 << k) - 1)
                    return moves;

                for (int[] d : dir) {
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                        continue;

                    if (classroom[nr].charAt(nc) == 'X')
                        continue;

                    if (e == 0)
                        continue;

                    int ne = e - 1;
                    int nmask = mask;

                    char cell = classroom[nr].charAt(nc);

                    if (cell == 'L') {
                        int idx = index[nr][nc];
                        nmask |= (1 << idx);
                    }

                    if (cell == 'R')
                        ne = energy;

                    if (!visited[nr][nc][ne][nmask]) {
                        visited[nr][nc][ne][nmask] = true;
                        q.offer(new int[]{nr, nc, ne, nmask});
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}
