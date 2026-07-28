class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length;
        int left = 0;
        int right = matrix[0].length;
        List<Integer> result = new LinkedList<>();
        while (left < right && top < bottom) {
            System.out.printf("l: %d r: %d t: %d b: %d\n", left, right, top, bottom);
            for (int i = left; i < right; i++) {
                System.out.println(matrix[top][i] + "a");
                result.add(matrix[top][i]);
            }
            System.out.printf("l: %d r: %d t: %d b: %d\n", left, right, top, bottom);
            top++;
            System.out.printf("l: %d r: %d t: %d b: %d\n", left, right, top, bottom);
            if (top < bottom) {
                for (int i = top; i < bottom; i++) {
                    System.out.println(matrix[i][right - 1] + "b");
                    result.add(matrix[i][right - 1]);
                }
                System.out.printf("l: %d r: %d t: %d b: %d\n", left, right, top, bottom);

                right--;
                if (left < right) {
                    System.out.printf("l: %d r: %d t: %d b: %d\n", left, right, top, bottom);
                    for (int i = right - 1; i >= left; i--) {
                        System.out.println(matrix[bottom - 1][i] + "c");
                        result.add(matrix[bottom - 1][i]);
                    }
                    System.out.printf("l: %d r: %d t: %d b: %d\n", left, right, top, bottom);
                    bottom--;
                    System.out.printf("l: %d r: %d t: %d b: %d\n", left, right, top, bottom);
                    for (int i = bottom - 1; i >= top; i--) {
                        System.out.println(matrix[i][left] + "d");
                        result.add(matrix[i][left]);
                    }
                    System.out.printf("l: %d r: %d t: %d b: %d\n", left, right, top, bottom);
                    left++;
                    System.out.printf("l: %d r: %d t: %d b: %d\n", left, right, top, bottom);
                }
            }
        }
        return result;
    }
}