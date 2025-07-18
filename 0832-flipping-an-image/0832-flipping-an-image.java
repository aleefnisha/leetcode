class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = image[i].length - 1;

            while (start <= end) {
                // Swap and invert simultaneously
                int temp = image[i][start] ^ 1;
                image[i][start] = image[i][end] ^ 1;
                image[i][end] = temp;

                start++;
                end--;
            }
        }
        return image;
    }
}