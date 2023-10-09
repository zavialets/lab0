package lab0;

import org.testng.Assert;
import org.testng.annotations.Test;

public class variant13Test{

    @Test
    public void testIntegerTask() {
        variant13 obj = new variant13();
        int result = obj.integerTask(312);
        Assert.assertEquals(result, 123);
    }

    @Test
    public void testBooleanTask() {
        variant13 obj = new variant13();
        boolean result1 = obj.booleanTask(1, 2, 3);
        boolean result2 = obj.booleanTask(0, -1, -2);
        boolean result3 = obj.booleanTask(-1, -2, -3);
        boolean result4 = obj.booleanTask(0, 0, 0);

        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
        Assert.assertFalse(result4);
    }

    @Test
    public void testIfTask() {
        variant13 obj = new variant13();
        int result1 = obj.ifTask(1, 2, 3);
        int result2 = obj.ifTask(5, 2, 2);
        int result3 = obj.ifTask(5, 5, 5);

        Assert.assertEquals(result1, 3);
        Assert.assertEquals(result2, 5);
        Assert.assertEquals(result3, 5);
    }

    @Test
    public void testForTask() {
        variant13 obj = new variant13();
        double result1 = obj.forTask(1);
        double result2 = obj.forTask(3);

        Assert.assertEquals(result1, 0.95, 0.001);
        Assert.assertEquals(result2, 2.75, 0.001);
    }

    @Test
    public void testWhileTask() {
        variant13 obj = new variant13();
        variant13.Result result1 = obj.whileTask(5);
        variant13.Result result2 = obj.whileTask(0);

        Assert.assertEquals(result1.k, 3);
        Assert.assertEquals(result1.sum, 2.283333333333333, 0.001);
        Assert.assertEquals(result2.k, -1);
        Assert.assertEquals(result2.sum, -1.0, 0.001);
    }

    @Test
    public void testMinmaxTask() {
        variant13 obj = new variant13();
        int[] numbers1 = {1, 2, 3, 4, 5};
        int result1 = variant13.minmaxTask(numbers1);

        int[] numbers2 = {-1, -2, -3, -4, -5};
        int result2 = variant13.minmaxTask(numbers2);

        Assert.assertEquals(result1, 5);
        Assert.assertEquals(result2, 0);
    }

    @Test
    public void testArrayTask() {
        variant13 obj = new variant13();
        double[] array1 = {1, 2, 3, 4, 5};
        double[] result1 = obj.arrayTask(array1);
        double[] expected1 = {5, 3, 1};

        Assert.assertEquals(result1, expected1);

        double[] array2 = {1.5, 2.5, 3.5, 4.5, 5.5};
        double[] result2 = obj.arrayTask(array2);
        double[] expected2 = {5.5, 3.5, 1.5};

        Assert.assertEquals(result2, expected2);
    }

    @Test
    public void testMatrixTask() {
        variant13 obj = new variant13();
        double[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double[] result = obj.matrixTask(matrix);

        double[] expected = {1, 2, 3, 6, 9, 8, 7, 4, 5};

        Assert.assertEquals(result, expected);
    }
}
