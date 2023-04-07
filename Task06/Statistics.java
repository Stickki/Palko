public class Statistics {
    public static double findMinimum(double[] values) {
        double minimum = Double.POSITIVE_INFINITY;
        for (double value : values) {
            if (value < minimum) {
                minimum = value;
            }
        }
        return minimum;
    }

    public static double findMaximum(double[] values) {
        double maximum = Double.NEGATIVE_INFINITY;
        for (double value : values) {
            if (value > maximum) {
                maximum = value;
            }
        }
        return maximum;
    }

    public static double calculateAverage(double[] values) {
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    public static double[] filterByCriterion(double[] values, double criterion) {
        int count = 0;
        for (double value : values) {
            if (value > criterion) {
                count++;
            }
        }
        double[] filteredValues = new double[count];
        int index = 0;
        for (double value : values) {
            if (value > criterion) {
                filteredValues[index++] = value;
            }
        }
        return filteredValues;
    }
}
