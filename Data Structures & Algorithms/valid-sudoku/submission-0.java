class Solution {
    public boolean isValidSudoku(char[][] b) {

        // Row check
        for (int i = 0; i < 9; i++) {
            int fr[] = new int[10];

            for (int j = 0; j < 9; j++) {
                if (b[i][j] == '.') continue;

                int num = b[i][j] - '0';

                if (fr[num] > 0) return false;
                fr[num]++;
            }
        }

        // Column check
        for (int i = 0; i < 9; i++) {
            int fr[] = new int[10];

            for (int j = 0; j < 9; j++) {
                if (b[j][i] == '.') continue;

                int num = b[j][i] - '0';

                if (fr[num] > 0) return false;
                fr[num]++;
            }
        }

        // 3x3 Box check
        for (int box = 0; box < 9; box++) {
            int fr[] = new int[10];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    int r = (box / 3) * 3 + i;
                    int c = (box % 3) * 3 + j;

                    if (b[r][c] == '.') continue;

                    int num = b[r][c] - '0';

                    if (fr[num] > 0) return false;
                    fr[num]++;
                }
            }
        }

        return true;
    }
}