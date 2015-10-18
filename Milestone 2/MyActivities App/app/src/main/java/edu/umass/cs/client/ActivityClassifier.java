package edu.umass.cs.client;

// Generated with Weka 3.6.13
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Thu Oct 15 15:02:16 EDT 2015

/*
=== Run information ===

        Scheme:weka.classifiers.trees.J48 -C 0.25 -M 2
        Relation:     activity
        Instances:    198
        Attributes:   44
        xMean
        xDev
        xCrossRate
        xFFT1
        xFFT2
        xFFT3
        xFFT4
        xVelocityChange
        xDistance
        yMean
        yDev
        yCrossRate
        yFFT1
        yFFT2
        yFFT3
        yFFT4
        yVelocityChange
        yDistance
        zMean
        zDev
        zCrossRate
        zFFT1
        zFFT2
        zFFT3
        zFFT4
        zVelocityChange
        zDistance
        speedMean
        speedDev
        speedCrossRate
        speedFFT1
        speedFFT2
        speedFFT3
        energyMean
        energyDev
        energyCrossRate
        energyFFT1
        energyFFT2
        energyFFT3
        energyFFT4
        energyXYMean
        energyXYDev
        energyXYCrossRate
class
        Test mode:10-fold cross-validation

        === Classifier model (full training set) ===

        J48 pruned tree
        ------------------

        energyCrossRate <= 0.092369
        |   speedMean <= 2.945485
        |   |   zCrossRate <= 0.052209: jumping (4.0/1.0)
        |   |   zCrossRate > 0.052209: walking (60.0)
        |   speedMean > 2.945485: jumping (61.0)
        energyCrossRate > 0.092369: stationary (73.0/1.0)

        Number of Leaves  : 	4

        Size of the tree : 	    7


        Time taken to build model: 0.01 seconds

        === Stratified cross-validation ===
        === Summary ===

        Correctly Classified Instances         191              96.4646 %
        Incorrectly Classified Instances       7                3.5354 %
        Kappa statistic                        0.9468
        Mean absolute error                    0.0286
        Root mean squared error                0.1535
        Relative absolute error                6.4474 %
        Root relative squared error            32.5813 %
        Total Number of Instances              198

        === Detailed Accuracy By Class ===

        TP Rate          FP Rate   Precision   Recall    F-Measure   ROC Area   Class
        0.938            0.007     0.984       0.938     0.96        0.958      jumping
        1                0.016     0.973       1         0.986       0.989      stationary
        0.952            0.029     0.937       0.952     0.944       0.95       walking
        Weighted Avg.    0.965     0.017       0.965     0.965       0.965      0.967

        === Confusion Matrix ===

        a  b  c   <-- classified as
        60  0  4 |  a = jumping
        0 72  0 |  b = stationary
        1  2 59 |  c = walking
*/

public class ActivityClassifier {

    public static double classify(Object[] i)
            throws Exception {

        double p = Double.NaN;
        p = ActivityClassifier.N47e5353411(i);
        return p;
    }
    static double N47e5353411(Object []i) {
        double p = Double.NaN;
        if (i[35] == null) {
            p = 0;
        } else if (((Double) i[35]).doubleValue() <= 0.09236947791164658) {
            p = ActivityClassifier.N19080dcc12(i);
        } else if (((Double) i[35]).doubleValue() > 0.09236947791164658) {
            p = 1;
        }
        return p;
    }
    static double N19080dcc12(Object []i) {
        double p = Double.NaN;
        if (i[27] == null) {
            p = 2;
        } else if (((Double) i[27]).doubleValue() <= 2.9454853615416323) {
            p = ActivityClassifier.N5fc1d8ea13(i);
        } else if (((Double) i[27]).doubleValue() > 2.9454853615416323) {
            p = 0;
        }
        return p;
    }
    static double N5fc1d8ea13(Object []i) {
        double p = Double.NaN;
        if (i[20] == null) {
            p = 0;
        } else if (((Double) i[20]).doubleValue() <= 0.05220883534136546) {
            p = 0;
        } else if (((Double) i[20]).doubleValue() > 0.05220883534136546) {
            p = 2;
        }
        return p;
    }
}
