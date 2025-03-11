public class ArrayPrint {

    // 1
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 2
    public static void printArray(double[] arr) {
        for (double num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 3
    public static void printArray(char[] arr) {
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    // 4
    public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    // 5
    public static void printArray(float[] arr) {
        for (float num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 6
    public static void printArray(long[] arr) {
        for (long num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 7
    public static void printArray(short[] arr) {
        for (short num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 8
    public static void printArray(byte[] arr) {
        for (byte num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 9
    public static void printArray(boolean[] arr) {
        for (boolean val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // 10
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            printArray(row);
        }
    }

    // 11
    public static void printArray(double[][] arr) {
        for (double[] row : arr) {
            printArray(row);
        }
    }

    // 12
    public static void printArray(char[][] arr) {
        for (char[] row : arr) {
            printArray(row);
        }
    }

    // 13
    public static void printArray(String[][] arr) {
        for (String[] row : arr) {
            printArray(row);
        }
    }

    // 14
    public static void printArray(float[][] arr) {
        for (float[] row : arr) {
            printArray(row);
        }
    }

    // 15
    public static void printArray(long[][] arr) {
        for (long[] row : arr) {
            printArray(row);
        }
    }

    // 16
    public static void printArray(short[][] arr) {
        for (short[] row : arr) {
            printArray(row);
        }
    }

    // 17
    public static void printArray(byte[][] arr) {
        for (byte[] row : arr) {
            printArray(row);
        }
    }

    // 18
    public static void printArray(boolean[][] arr) {
        for (boolean[] row : arr) {
            printArray(row);
        }
    }

    // 19
    public static void printArray(Object[] arr) {
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    // 20
    public static void printArray(Object[][] arr) {
        for (Object[] row : arr) {
            printArray(row);
        }
    }

    public static void main(String[] args) {
        printArray(new int[]{1, 2, 3, 4, 5});
        printArray(new double[]{1.1, 2.2, 3.3, 4.4, 5.5});
        printArray(new char[]{'A', 'B', 'C', 'D'});
        printArray(new String[]{"Hello", "World"});
        printArray(new float[]{1.1f, 2.2f, 3.3f});
        printArray(new long[]{100000L, 200000L});
        printArray(new short[]{10, 20, 30});
        printArray(new byte[]{1, 2, 3});
        printArray(new boolean[]{true, false, true});
        printArray(new int[][]{{1, 2}, {3, 4}});
        printArray(new double[][]{{1.1, 2.2}, {3.3, 4.4}});
        printArray(new char[][]{{'A', 'B'}, {'C', 'D'}});
        printArray(new String[][]{{"Hello", "World"}, {"Java", "Programming"}});
        printArray(new float[][]{{1.1f, 2.2f}, {3.3f, 4.4f}});
        printArray(new long[][]{{100000L, 200000L}, {300000L, 400000L}});
        printArray(new short[][]{{10, 20}, {30, 40}});
        printArray(new byte[][]{{1, 2}, {3, 4}});
        printArray(new boolean[][]{{true, false}, {false, true}});
        printArray(new Object[][]{{"String", 123}, {4.56, true}});
    }
}
