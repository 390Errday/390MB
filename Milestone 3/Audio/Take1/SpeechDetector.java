package edu.umass.cs.voice;

// Generated with Weka 3.6.13
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Wed Oct 28 15:28:08 EDT 2015

/*

        === Run information ===

        Scheme:weka.classifiers.trees.J48 -C 0.25 -M 2
        Relation:     speech
        Instances:    24000
        Attributes:   13
                      mfcc1
                      mfcc2
                      mfcc3
                      mfcc4
                      mfcc5
                      mfcc6
                      mfcc7
                      mfcc8
                      mfcc9
                      mfcc10
                      mfcc11
                      mfcc12
                      speech
        Test mode:10-fold cross-validation

        === Classifier model (full training set) ===

        J48 pruned tree

        === Summary ===

        Correctly Classified Instances           21013               87.5542 %
        Incorrectly Classified Instances         2987                12.4458 %
        Kappa statistic                          0.7511
        Mean absolute error                      0.1533
        Root mean squared error                  0.3245
        Relative absolute error                  30.655  %
        Root relative squared error              64.9056 %
        Total Number of Instances                24000

        === Detailed Accuracy By Class ===

        TP Rate          FP Rate    Precision   Recall    F-Measure   ROC Area  Class
        0.877            0.126      0.874       0.877     0.876       0.912     true
        0.874            0.123      0.877       0.874     0.875       0.912     false
        Weighted Avg.    0.876      0.124       0.876     0.876       0.876     0.912

        === Confusion Matrix ===

        a      b   <-- classified as
        10526  1474  |     a = true
        1513   10487 |     b = false

*/

import android.content.Context;

public class SpeechDetector {

    public static double classify(Object[] i)
            throws Exception {

        double p = Double.NaN;
        p = SpeechDetector.N696ef2af0(i);
        return p;
    }
    static double N696ef2af0(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 44.02553434186474) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 44.02553434186474) {
            p = SpeechDetector.N72fef53c1(i);
        }
        return p;
    }
    static double N72fef53c1(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 2.937728990799594) {
            p = SpeechDetector.N4096711f2(i);
        } else if (((Double) i[2]).doubleValue() > 2.937728990799594) {
            p = SpeechDetector.N3a92b28d341(i);
        }
        return p;
    }
    static double N4096711f2(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 8.493694305120961) {
            p = SpeechDetector.N54dccb593(i);
        } else if (((Double) i[1]).doubleValue() > 8.493694305120961) {
            p = SpeechDetector.Na0e690a314(i);
        }
        return p;
    }
    static double N54dccb593(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 69.8983727372088) {
            p = SpeechDetector.N6baa6b954(i);
        } else if (((Double) i[0]).doubleValue() > 69.8983727372088) {
            p = SpeechDetector.N6a78b924278(i);
        }
        return p;
    }
    static double N6baa6b954(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 7.017521058715346) {
            p = SpeechDetector.N17d3a6c5(i);
        } else if (((Double) i[1]).doubleValue() > 7.017521058715346) {
            p = SpeechDetector.N5ba40a50191(i);
        }
        return p;
    }
    static double N17d3a6c5(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -0.09145152221077481) {
            p = SpeechDetector.N448689376(i);
        } else if (((Double) i[2]).doubleValue() > -0.09145152221077481) {
            p = SpeechDetector.N143a7078(i);
        }
        return p;
    }
    static double N448689376(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 1.6984038580515288) {
            p = SpeechDetector.N5c9a9d067(i);
        } else if (((Double) i[1]).doubleValue() > 1.6984038580515288) {
            p = SpeechDetector.N64537f699(i);
        }
        return p;
    }
    static double N5c9a9d067(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -5.005483424374847) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -5.005483424374847) {
            p = SpeechDetector.N2abb24698(i);
        }
        return p;
    }
    static double N2abb24698(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -3.4524295424987925) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -3.4524295424987925) {
            p = 1;
        }
        return p;
    }
    static double N64537f699(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 64.5281149062975) {
            p = SpeechDetector.N25d1f9f410(i);
        } else if (((Double) i[0]).doubleValue() > 64.5281149062975) {
            p = SpeechDetector.N110bc24b30(i);
        }
        return p;
    }
    static double N25d1f9f410(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 3.901144281461735) {
            p = SpeechDetector.N7c71159111(i);
        } else if (((Double) i[4]).doubleValue() > 3.901144281461735) {
            p = SpeechDetector.N7ac172dd25(i);
        }
        return p;
    }
    static double N7c71159111(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 1.7091531627621845) {
            p = SpeechDetector.N643f226a12(i);
        } else if (((Double) i[3]).doubleValue() > 1.7091531627621845) {
            p = SpeechDetector.N6ee503c916(i);
        }
        return p;
    }
    static double N643f226a12(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 2.7855366895006437) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > 2.7855366895006437) {
            p = SpeechDetector.N6cec909013(i);
        }
        return p;
    }
    static double N6cec909013(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 4.55556882072489) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 4.55556882072489) {
            p = SpeechDetector.N1f0715ce14(i);
        }
        return p;
    }
    static double N1f0715ce14(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -1.7242632749749311) {
            p = SpeechDetector.Na28974c15(i);
        } else if (((Double) i[9]).doubleValue() > -1.7242632749749311) {
            p = 1;
        }
        return p;
    }
    static double Na28974c15(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 2.571348446790921) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > 2.571348446790921) {
            p = 1;
        }
        return p;
    }
    static double N6ee503c916(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -1.967417972894294) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -1.967417972894294) {
            p = SpeechDetector.N7d5bb9ff17(i);
        }
        return p;
    }
    static double N7d5bb9ff17(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 3.953708324791116) {
            p = SpeechDetector.N111054a518(i);
        } else if (((Double) i[5]).doubleValue() > 3.953708324791116) {
            p = 0;
        }
        return p;
    }
    static double N111054a518(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 2.7951484282421286) {
            p = SpeechDetector.N4725256319(i);
        } else if (((Double) i[10]).doubleValue() > 2.7951484282421286) {
            p = 1;
        }
        return p;
    }
    static double N4725256319(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 4.049109815848201) {
            p = SpeechDetector.N57b9ab1220(i);
        } else if (((Double) i[1]).doubleValue() > 4.049109815848201) {
            p = 1;
        }
        return p;
    }
    static double N57b9ab1220(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 4.314055246384753) {
            p = SpeechDetector.N5e8e57bc21(i);
        } else if (((Double) i[3]).doubleValue() > 4.314055246384753) {
            p = 0;
        }
        return p;
    }
    static double N5e8e57bc21(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 1.76062786606251) {
            p = SpeechDetector.N5322282322(i);
        } else if (((Double) i[10]).doubleValue() > 1.76062786606251) {
            p = 0;
        }
        return p;
    }
    static double N5322282322(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 60.651625233911275) {
            p = SpeechDetector.N67793c7823(i);
        } else if (((Double) i[0]).doubleValue() > 60.651625233911275) {
            p = 1;
        }
        return p;
    }
    static double N67793c7823(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -1.6742906038317986) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -1.6742906038317986) {
            p = SpeechDetector.N48711f5a24(i);
        }
        return p;
    }
    static double N48711f5a24(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 59.088520815516546) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 59.088520815516546) {
            p = 0;
        }
        return p;
    }
    static double N7ac172dd25(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -1.5182576877495597) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -1.5182576877495597) {
            p = SpeechDetector.N325c4a2126(i);
        }
        return p;
    }
    static double N325c4a2126(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 2.177575838668957) {
            p = SpeechDetector.N4906d65b27(i);
        } else if (((Double) i[11]).doubleValue() > 2.177575838668957) {
            p = 1;
        }
        return p;
    }
    static double N4906d65b27(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 5.739755432480512) {
            p = SpeechDetector.N5fe315d128(i);
        } else if (((Double) i[1]).doubleValue() > 5.739755432480512) {
            p = 0;
        }
        return p;
    }
    static double N5fe315d128(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 0.3973504048712989) {
            p = SpeechDetector.N35ad7d8529(i);
        } else if (((Double) i[5]).doubleValue() > 0.3973504048712989) {
            p = 1;
        }
        return p;
    }
    static double N35ad7d8529(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 3.8965210149763587) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 3.8965210149763587) {
            p = 1;
        }
        return p;
    }
    static double N110bc24b30(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 5.4719424894802255) {
            p = SpeechDetector.N1b00d2ab31(i);
        } else if (((Double) i[6]).doubleValue() > 5.4719424894802255) {
            p = SpeechDetector.N1d531b1068(i);
        }
        return p;
    }
    static double N1b00d2ab31(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 1.2601813787645657) {
            p = SpeechDetector.N5306e66632(i);
        } else if (((Double) i[5]).doubleValue() > 1.2601813787645657) {
            p = SpeechDetector.N641c66ff57(i);
        }
        return p;
    }
    static double N5306e66632(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -1.42293780070476) {
            p = SpeechDetector.N3de1d49733(i);
        } else if (((Double) i[2]).doubleValue() > -1.42293780070476) {
            p = SpeechDetector.N1100d29048(i);
        }
        return p;
    }
    static double N3de1d49733(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 4.849743016567997) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 4.849743016567997) {
            p = SpeechDetector.N1a2124c834(i);
        }
        return p;
    }
    static double N1a2124c834(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 2.6530906144523008) {
            p = SpeechDetector.N75f5d3de35(i);
        } else if (((Double) i[4]).doubleValue() > 2.6530906144523008) {
            p = SpeechDetector.N61149fb347(i);
        }
        return p;
    }
    static double N75f5d3de35(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -3.6876027980382684) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -3.6876027980382684) {
            p = SpeechDetector.N5e28d05236(i);
        }
        return p;
    }
    static double N5e28d05236(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -4.342425458576045) {
            p = SpeechDetector.N4984e7c937(i);
        } else if (((Double) i[4]).doubleValue() > -4.342425458576045) {
            p = SpeechDetector.N2e53674039(i);
        }
        return p;
    }
    static double N4984e7c937(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -4.74171305628663) {
            p = SpeechDetector.N348d62d438(i);
        } else if (((Double) i[9]).doubleValue() > -4.74171305628663) {
            p = 1;
        }
        return p;
    }
    static double N348d62d438(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -2.7569669064802196) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -2.7569669064802196) {
            p = 0;
        }
        return p;
    }
    static double N2e53674039(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -0.3441488303236296) {
            p = SpeechDetector.N659fb28240(i);
        } else if (((Double) i[10]).doubleValue() > -0.3441488303236296) {
            p = SpeechDetector.N601289cb46(i);
        }
        return p;
    }
    static double N659fb28240(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -0.14430223843683773) {
            p = SpeechDetector.N5780a8ed41(i);
        } else if (((Double) i[6]).doubleValue() > -0.14430223843683773) {
            p = SpeechDetector.N180541a043(i);
        }
        return p;
    }
    static double N5780a8ed41(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -4.0097496889529705) {
            p = SpeechDetector.N3fd28c7c42(i);
        } else if (((Double) i[10]).doubleValue() > -4.0097496889529705) {
            p = 1;
        }
        return p;
    }
    static double N3fd28c7c42(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -2.2840762996487793) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -2.2840762996487793) {
            p = 0;
        }
        return p;
    }
    static double N180541a043(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 65.80396092691305) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 65.80396092691305) {
            p = SpeechDetector.N1177bb244(i);
        }
        return p;
    }
    static double N1177bb244(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -1.2834935086581656) {
            p = SpeechDetector.N2cb9e3ad45(i);
        } else if (((Double) i[3]).doubleValue() > -1.2834935086581656) {
            p = 0;
        }
        return p;
    }
    static double N2cb9e3ad45(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 5.887970103124022) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 5.887970103124022) {
            p = 0;
        }
        return p;
    }
    static double N601289cb46(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -3.9068522319153742) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -3.9068522319153742) {
            p = 1;
        }
        return p;
    }
    static double N61149fb347(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.08959958465973089) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -0.08959958465973089) {
            p = 0;
        }
        return p;
    }
    static double N1100d29048(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -5.570707924865439) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -5.570707924865439) {
            p = SpeechDetector.N4cfff4a849(i);
        }
        return p;
    }
    static double N4cfff4a849(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 5.676531391580175) {
            p = SpeechDetector.N3817691650(i);
        } else if (((Double) i[1]).doubleValue() > 5.676531391580175) {
            p = SpeechDetector.N4f8ee7ad53(i);
        }
        return p;
    }
    static double N3817691650(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -0.8232246782426408) {
            p = SpeechDetector.N8f4401f51(i);
        } else if (((Double) i[11]).doubleValue() > -0.8232246782426408) {
            p = 1;
        }
        return p;
    }
    static double N8f4401f51(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -4.98126606614395) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -4.98126606614395) {
            p = SpeechDetector.N5b9db7d052(i);
        }
        return p;
    }
    static double N5b9db7d052(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 1.010875594677524) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 1.010875594677524) {
            p = 0;
        }
        return p;
    }
    static double N4f8ee7ad53(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 65.07762689094719) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 65.07762689094719) {
            p = SpeechDetector.N2f0c37a954(i);
        }
        return p;
    }
    static double N2f0c37a954(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -0.6897746584700758) {
            p = SpeechDetector.N4b1a506055(i);
        } else if (((Double) i[5]).doubleValue() > -0.6897746584700758) {
            p = 0;
        }
        return p;
    }
    static double N4b1a506055(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 66.97594065519533) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 66.97594065519533) {
            p = SpeechDetector.N2c92f52556(i);
        }
        return p;
    }
    static double N2c92f52556(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.9414653402077251) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -0.9414653402077251) {
            p = 0;
        }
        return p;
    }
    static double N641c66ff57(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 6.369788956579253) {
            p = SpeechDetector.N4ae22b258(i);
        } else if (((Double) i[1]).doubleValue() > 6.369788956579253) {
            p = SpeechDetector.N1c660dd366(i);
        }
        return p;
    }
    static double N4ae22b258(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 5.306790771169693) {
            p = SpeechDetector.N4467d68459(i);
        } else if (((Double) i[5]).doubleValue() > 5.306790771169693) {
            p = SpeechDetector.N49cb303163(i);
        }
        return p;
    }
    static double N4467d68459(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -5.164590542093255) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -5.164590542093255) {
            p = SpeechDetector.N7d34973160(i);
        }
        return p;
    }
    static double N7d34973160(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 69.18780168857548) {
            p = SpeechDetector.N7b2522f61(i);
        } else if (((Double) i[0]).doubleValue() > 69.18780168857548) {
            p = 0;
        }
        return p;
    }
    static double N7b2522f61(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 3.5808413452367587) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 3.5808413452367587) {
            p = SpeechDetector.N4c318f9b62(i);
        }
        return p;
    }
    static double N4c318f9b62(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 0.9754000052009257) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 0.9754000052009257) {
            p = 0;
        }
        return p;
    }
    static double N49cb303163(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -6.130733814671401) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -6.130733814671401) {
            p = SpeechDetector.N3ac906d064(i);
        }
        return p;
    }
    static double N3ac906d064(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 4.558120514107892) {
            p = SpeechDetector.N63de5fd665(i);
        } else if (((Double) i[1]).doubleValue() > 4.558120514107892) {
            p = 0;
        }
        return p;
    }
    static double N63de5fd665(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -1.9391598014185518) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -1.9391598014185518) {
            p = 0;
        }
        return p;
    }
    static double N1c660dd366(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 3.3227482456617143) {
            p = SpeechDetector.N7015a63567(i);
        } else if (((Double) i[10]).doubleValue() > 3.3227482456617143) {
            p = 1;
        }
        return p;
    }
    static double N7015a63567(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -1.2925119821186315) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -1.2925119821186315) {
            p = 0;
        }
        return p;
    }
    static double N1d531b1068(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -3.3652856158631814) {
            p = SpeechDetector.N3b15c67a69(i);
        } else if (((Double) i[2]).doubleValue() > -3.3652856158631814) {
            p = SpeechDetector.N2039194671(i);
        }
        return p;
    }
    static double N3b15c67a69(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -1.9009125184657896) {
            p = SpeechDetector.N129991e470(i);
        } else if (((Double) i[9]).doubleValue() > -1.9009125184657896) {
            p = 1;
        }
        return p;
    }
    static double N129991e470(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -2.230300224600555) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -2.230300224600555) {
            p = 0;
        }
        return p;
    }
    static double N2039194671(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -0.8554150449545121) {
            p = SpeechDetector.N4aa533172(i);
        } else if (((Double) i[2]).doubleValue() > -0.8554150449545121) {
            p = 0;
        }
        return p;
    }
    static double N4aa533172(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.14912901339321422) {
            p = SpeechDetector.N4a3bb85b73(i);
        } else if (((Double) i[3]).doubleValue() > -0.14912901339321422) {
            p = SpeechDetector.N3fd2e0bd75(i);
        }
        return p;
    }
    static double N4a3bb85b73(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 1.661343665224011) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > 1.661343665224011) {
            p = SpeechDetector.N16c4847074(i);
        }
        return p;
    }
    static double N16c4847074(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -0.3769889721308238) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -0.3769889721308238) {
            p = 1;
        }
        return p;
    }
    static double N3fd2e0bd75(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -0.6706796923864621) {
            p = SpeechDetector.N2da0b90776(i);
        } else if (((Double) i[5]).doubleValue() > -0.6706796923864621) {
            p = 0;
        }
        return p;
    }
    static double N2da0b90776(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 1.4388096477945498) {
            p = SpeechDetector.N12d391f877(i);
        } else if (((Double) i[3]).doubleValue() > 1.4388096477945498) {
            p = 0;
        }
        return p;
    }
    static double N12d391f877(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 4.542938878324522) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 4.542938878324522) {
            p = 0;
        }
        return p;
    }
    static double N143a7078(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 65.75759505520354) {
            p = SpeechDetector.N30088f1a79(i);
        } else if (((Double) i[0]).doubleValue() > 65.75759505520354) {
            p = SpeechDetector.N592b94df181(i);
        }
        return p;
    }
    static double N30088f1a79(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -1.797843343650515) {
            p = SpeechDetector.N1eb0c9980(i);
        } else if (((Double) i[4]).doubleValue() > -1.797843343650515) {
            p = SpeechDetector.N41432ed6119(i);
        }
        return p;
    }
    static double N1eb0c9980(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -4.4320173629269695) {
            p = SpeechDetector.N6e8811ca81(i);
        } else if (((Double) i[8]).doubleValue() > -4.4320173629269695) {
            p = SpeechDetector.N11eca45a91(i);
        }
        return p;
    }
    static double N6e8811ca81(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -3.4524295424987925) {
            p = SpeechDetector.N27481d7782(i);
        } else if (((Double) i[11]).doubleValue() > -3.4524295424987925) {
            p = SpeechDetector.Ndac621e85(i);
        }
        return p;
    }
    static double N27481d7782(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 2.451536723391855) {
            p = SpeechDetector.N6f8683c683(i);
        } else if (((Double) i[10]).doubleValue() > 2.451536723391855) {
            p = 0;
        }
        return p;
    }
    static double N6f8683c683(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 64.76872818922075) {
            p = SpeechDetector.N6835755d84(i);
        } else if (((Double) i[0]).doubleValue() > 64.76872818922075) {
            p = 0;
        }
        return p;
    }
    static double N6835755d84(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -2.647658834018727) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -2.647658834018727) {
            p = 0;
        }
        return p;
    }
    static double Ndac621e85(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -4.070560659468483) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -4.070560659468483) {
            p = SpeechDetector.N305da69586(i);
        }
        return p;
    }
    static double N305da69586(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -1.421354120672934) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -1.421354120672934) {
            p = SpeechDetector.N5463990187(i);
        }
        return p;
    }
    static double N5463990187(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 4.458038952024715) {
            p = SpeechDetector.N56d23bef88(i);
        } else if (((Double) i[1]).doubleValue() > 4.458038952024715) {
            p = SpeechDetector.N72b428f390(i);
        }
        return p;
    }
    static double N56d23bef88(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 3.1482654878328473) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 3.1482654878328473) {
            p = SpeechDetector.N45cf47189(i);
        }
        return p;
    }
    static double N45cf47189(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 0.3864177528310558) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 0.3864177528310558) {
            p = 0;
        }
        return p;
    }
    static double N72b428f390(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 63.328607785466836) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 63.328607785466836) {
            p = 0;
        }
        return p;
    }
    static double N11eca45a91(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 4.825836084323834) {
            p = SpeechDetector.N471a19e792(i);
        } else if (((Double) i[3]).doubleValue() > 4.825836084323834) {
            p = SpeechDetector.N46423a2d114(i);
        }
        return p;
    }
    static double N471a19e792(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -2.6517977389544396) {
            p = SpeechDetector.N29ab12993(i);
        } else if (((Double) i[11]).doubleValue() > -2.6517977389544396) {
            p = 1;
        }
        return p;
    }
    static double N29ab12993(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -3.09202812663612) {
            p = SpeechDetector.N79e4fc1494(i);
        } else if (((Double) i[9]).doubleValue() > -3.09202812663612) {
            p = SpeechDetector.N673f4c7c99(i);
        }
        return p;
    }
    static double N79e4fc1494(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 6.114361341372352) {
            p = SpeechDetector.N2861c39195(i);
        } else if (((Double) i[1]).doubleValue() > 6.114361341372352) {
            p = 0;
        }
        return p;
    }
    static double N2861c39195(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 4.1983250437748545) {
            p = SpeechDetector.N2a6e794d96(i);
        } else if (((Double) i[10]).doubleValue() > 4.1983250437748545) {
            p = 0;
        }
        return p;
    }
    static double N2a6e794d96(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -3.6565851884586755) {
            p = SpeechDetector.N3addc3fe97(i);
        } else if (((Double) i[9]).doubleValue() > -3.6565851884586755) {
            p = 1;
        }
        return p;
    }
    static double N3addc3fe97(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -3.295787040213702) {
            p = SpeechDetector.N356e76e398(i);
        } else if (((Double) i[11]).doubleValue() > -3.295787040213702) {
            p = 1;
        }
        return p;
    }
    static double N356e76e398(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -2.5092419334040708) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -2.5092419334040708) {
            p = 0;
        }
        return p;
    }
    static double N673f4c7c99(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -3.1868334471262543) {
            p = SpeechDetector.N6cb695d8100(i);
        } else if (((Double) i[5]).doubleValue() > -3.1868334471262543) {
            p = SpeechDetector.N788f35da104(i);
        }
        return p;
    }
    static double N6cb695d8100(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 2.0463587432773687) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 2.0463587432773687) {
            p = SpeechDetector.N4727cfaa101(i);
        }
        return p;
    }
    static double N4727cfaa101(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -0.04102032617880389) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -0.04102032617880389) {
            p = SpeechDetector.N6b2c665102(i);
        }
        return p;
    }
    static double N6b2c665102(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 62.49090444266062) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 62.49090444266062) {
            p = SpeechDetector.N42ff1452103(i);
        }
        return p;
    }
    static double N42ff1452103(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 0.998606600411333) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > 0.998606600411333) {
            p = 1;
        }
        return p;
    }
    static double N788f35da104(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 2.5817980277198735) {
            p = SpeechDetector.N218b90c105(i);
        } else if (((Double) i[1]).doubleValue() > 2.5817980277198735) {
            p = SpeechDetector.N251cc3e7106(i);
        }
        return p;
    }
    static double N218b90c105(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 3.014512806852379) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 3.014512806852379) {
            p = 1;
        }
        return p;
    }
    static double N251cc3e7106(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 5.087041872823321) {
            p = SpeechDetector.N38185ba107(i);
        } else if (((Double) i[1]).doubleValue() > 5.087041872823321) {
            p = SpeechDetector.N593f7ede110(i);
        }
        return p;
    }
    static double N38185ba107(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 57.81931920466252) {
            p = SpeechDetector.N2c727822108(i);
        } else if (((Double) i[0]).doubleValue() > 57.81931920466252) {
            p = 1;
        }
        return p;
    }
    static double N2c727822108(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 3.726764173440852) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 3.726764173440852) {
            p = SpeechDetector.Nf2d16fa109(i);
        }
        return p;
    }
    static double Nf2d16fa109(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 3.5768581034572478) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > 3.5768581034572478) {
            p = 1;
        }
        return p;
    }
    static double N593f7ede110(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 60.81772056638961) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 60.81772056638961) {
            p = SpeechDetector.N57a24e98111(i);
        }
        return p;
    }
    static double N57a24e98111(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -1.3467586284155943) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -1.3467586284155943) {
            p = SpeechDetector.N60d60a1a112(i);
        }
        return p;
    }
    static double N60d60a1a112(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 2.2761272303656535) {
            p = SpeechDetector.N43162a1113(i);
        } else if (((Double) i[2]).doubleValue() > 2.2761272303656535) {
            p = 0;
        }
        return p;
    }
    static double N43162a1113(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 3.002756687704854) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 3.002756687704854) {
            p = 1;
        }
        return p;
    }
    static double N46423a2d114(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 3.405956752594803) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 3.405956752594803) {
            p = SpeechDetector.N25f98464115(i);
        }
        return p;
    }
    static double N25f98464115(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 6.207455188141404) {
            p = SpeechDetector.N2062d4b6116(i);
        } else if (((Double) i[3]).doubleValue() > 6.207455188141404) {
            p = 0;
        }
        return p;
    }
    static double N2062d4b6116(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 4.899841995863111) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > 4.899841995863111) {
            p = SpeechDetector.N387b0956117(i);
        }
        return p;
    }
    static double N387b0956117(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 0.23852974404408434) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 0.23852974404408434) {
            p = SpeechDetector.N15a20a12118(i);
        }
        return p;
    }
    static double N15a20a12118(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 4.592543444726333) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 4.592543444726333) {
            p = 0;
        }
        return p;
    }
    static double N41432ed6119(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 1.7434278644214254) {
            p = SpeechDetector.N21b80513120(i);
        } else if (((Double) i[7]).doubleValue() > 1.7434278644214254) {
            p = SpeechDetector.N2f810452160(i);
        }
        return p;
    }
    static double N21b80513120(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.3550679188604226) {
            p = SpeechDetector.N385533b0121(i);
        } else if (((Double) i[3]).doubleValue() > -0.3550679188604226) {
            p = SpeechDetector.N7e33df34136(i);
        }
        return p;
    }
    static double N385533b0121(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 5.494041438055406) {
            p = SpeechDetector.N61b484b4122(i);
        } else if (((Double) i[1]).doubleValue() > 5.494041438055406) {
            p = SpeechDetector.N45ea3436126(i);
        }
        return p;
    }
    static double N61b484b4122(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 2.483504065996602) {
            p = SpeechDetector.N12747789123(i);
        } else if (((Double) i[2]).doubleValue() > 2.483504065996602) {
            p = 0;
        }
        return p;
    }
    static double N12747789123(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -1.0247020317355724) {
            p = SpeechDetector.N1c53ccd6124(i);
        } else if (((Double) i[11]).doubleValue() > -1.0247020317355724) {
            p = 1;
        }
        return p;
    }
    static double N1c53ccd6124(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 4.432879380120471) {
            p = SpeechDetector.N41ad0421125(i);
        } else if (((Double) i[1]).doubleValue() > 4.432879380120471) {
            p = 1;
        }
        return p;
    }
    static double N41ad0421125(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 61.81786621511846) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 61.81786621511846) {
            p = 1;
        }
        return p;
    }
    static double N45ea3436126(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 0.9614289440903439) {
            p = SpeechDetector.N1309e916127(i);
        } else if (((Double) i[8]).doubleValue() > 0.9614289440903439) {
            p = SpeechDetector.N21fa291f134(i);
        }
        return p;
    }
    static double N1309e916127(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 0.2568322556073123) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 0.2568322556073123) {
            p = SpeechDetector.N6fa5ad1d128(i);
        }
        return p;
    }
    static double N6fa5ad1d128(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 1.173570441775193) {
            p = SpeechDetector.N6608842e129(i);
        } else if (((Double) i[10]).doubleValue() > 1.173570441775193) {
            p = SpeechDetector.N67d6b10c131(i);
        }
        return p;
    }
    static double N6608842e129(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 55.68998362576952) {
            p = SpeechDetector.N391e1c57130(i);
        } else if (((Double) i[0]).doubleValue() > 55.68998362576952) {
            p = 0;
        }
        return p;
    }
    static double N391e1c57130(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 1.7669942375476588) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 1.7669942375476588) {
            p = 0;
        }
        return p;
    }
    static double N67d6b10c131(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 3.515414155947842) {
            p = SpeechDetector.N4001c016132(i);
        } else if (((Double) i[10]).doubleValue() > 3.515414155947842) {
            p = 0;
        }
        return p;
    }
    static double N4001c016132(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -1.5553570659230886) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -1.5553570659230886) {
            p = SpeechDetector.N32ea052e133(i);
        }
        return p;
    }
    static double N32ea052e133(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 2.242972818458596) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > 2.242972818458596) {
            p = 0;
        }
        return p;
    }
    static double N21fa291f134(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 1.7982023688013897) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 1.7982023688013897) {
            p = SpeechDetector.N2ea1c3a6135(i);
        }
        return p;
    }
    static double N2ea1c3a6135(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -0.07736314272171373) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -0.07736314272171373) {
            p = 0;
        }
        return p;
    }
    static double N7e33df34136(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 0.8371272411202254) {
            p = SpeechDetector.N7f830fa6137(i);
        } else if (((Double) i[10]).doubleValue() > 0.8371272411202254) {
            p = SpeechDetector.Ne3189b0147(i);
        }
        return p;
    }
    static double N7f830fa6137(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 5.303643859354765) {
            p = SpeechDetector.N75789cb0138(i);
        } else if (((Double) i[1]).doubleValue() > 5.303643859354765) {
            p = SpeechDetector.N180f637144(i);
        }
        return p;
    }
    static double N75789cb0138(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 1.8603863732351167) {
            p = SpeechDetector.N41772310139(i);
        } else if (((Double) i[2]).doubleValue() > 1.8603863732351167) {
            p = 0;
        }
        return p;
    }
    static double N41772310139(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 0.69528320484484) {
            p = SpeechDetector.N749f1103140(i);
        } else if (((Double) i[7]).doubleValue() > 0.69528320484484) {
            p = SpeechDetector.N5b871533143(i);
        }
        return p;
    }
    static double N749f1103140(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -0.08388692301989695) {
            p = SpeechDetector.N771617c5141(i);
        } else if (((Double) i[4]).doubleValue() > -0.08388692301989695) {
            p = 0;
        }
        return p;
    }
    static double N771617c5141(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -0.634491999582624) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -0.634491999582624) {
            p = SpeechDetector.N4b72c397142(i);
        }
        return p;
    }
    static double N4b72c397142(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -1.2859855692697992) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -1.2859855692697992) {
            p = 1;
        }
        return p;
    }
    static double N5b871533143(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 3.8784024515906177) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 3.8784024515906177) {
            p = 0;
        }
        return p;
    }
    static double N180f637144(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 1.4294140140583471) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 1.4294140140583471) {
            p = SpeechDetector.N39a495a6145(i);
        }
        return p;
    }
    static double N39a495a6145(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 0.9603074177314296) {
            p = SpeechDetector.N645ce2da146(i);
        } else if (((Double) i[2]).doubleValue() > 0.9603074177314296) {
            p = 0;
        }
        return p;
    }
    static double N645ce2da146(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -1.5443902455714902) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -1.5443902455714902) {
            p = 0;
        }
        return p;
    }
    static double Ne3189b0147(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 2.082745747177159) {
            p = SpeechDetector.N56468917148(i);
        } else if (((Double) i[9]).doubleValue() > 2.082745747177159) {
            p = SpeechDetector.N2af298db156(i);
        }
        return p;
    }
    static double N56468917148(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 1.632407684865765) {
            p = SpeechDetector.N30d27141149(i);
        } else if (((Double) i[2]).doubleValue() > 1.632407684865765) {
            p = SpeechDetector.N66875ca9151(i);
        }
        return p;
    }
    static double N30d27141149(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -1.6410564529507503) {
            p = SpeechDetector.N48097b71150(i);
        } else if (((Double) i[11]).doubleValue() > -1.6410564529507503) {
            p = 1;
        }
        return p;
    }
    static double N48097b71150(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 0.5984992131034642) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > 0.5984992131034642) {
            p = 1;
        }
        return p;
    }
    static double N66875ca9151(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -4.541967558470239) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -4.541967558470239) {
            p = SpeechDetector.N40d48fd5152(i);
        }
        return p;
    }
    static double N40d48fd5152(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 59.61058887333765) {
            p = SpeechDetector.N432f0a33153(i);
        } else if (((Double) i[0]).doubleValue() > 59.61058887333765) {
            p = 0;
        }
        return p;
    }
    static double N432f0a33153(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -1.8880083157849568) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -1.8880083157849568) {
            p = SpeechDetector.N4546bcba154(i);
        }
        return p;
    }
    static double N4546bcba154(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 2.210825242324709) {
            p = SpeechDetector.N27107ade155(i);
        } else if (((Double) i[4]).doubleValue() > 2.210825242324709) {
            p = 1;
        }
        return p;
    }
    static double N27107ade155(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -0.049806437131168224) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -0.049806437131168224) {
            p = 1;
        }
        return p;
    }
    static double N2af298db156(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 58.42079227788952) {
            p = SpeechDetector.N1d1167e4157(i);
        } else if (((Double) i[0]).doubleValue() > 58.42079227788952) {
            p = SpeechDetector.N6b57491c159(i);
        }
        return p;
    }
    static double N1d1167e4157(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 4.333696883832489) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > 4.333696883832489) {
            p = SpeechDetector.N61bbb8a4158(i);
        }
        return p;
    }
    static double N61bbb8a4158(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 1.2914225022822128) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 1.2914225022822128) {
            p = 0;
        }
        return p;
    }
    static double N6b57491c159(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 2.531672253680185) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > 2.531672253680185) {
            p = 0;
        }
        return p;
    }
    static double N2f810452160(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 6.749483426434587) {
            p = SpeechDetector.N3f42bbdb161(i);
        } else if (((Double) i[7]).doubleValue() > 6.749483426434587) {
            p = 1;
        }
        return p;
    }
    static double N3f42bbdb161(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 1.2673028439622391) {
            p = SpeechDetector.N363b474f162(i);
        } else if (((Double) i[2]).doubleValue() > 1.2673028439622391) {
            p = SpeechDetector.Ne9bcd6e165(i);
        }
        return p;
    }
    static double N363b474f162(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -2.6668636636180305) {
            p = SpeechDetector.N6dc6af59163(i);
        } else if (((Double) i[11]).doubleValue() > -2.6668636636180305) {
            p = 1;
        }
        return p;
    }
    static double N6dc6af59163(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 0.7881092493483012) {
            p = SpeechDetector.Nf22345d164(i);
        } else if (((Double) i[5]).doubleValue() > 0.7881092493483012) {
            p = 0;
        }
        return p;
    }
    static double Nf22345d164(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -1.3107841214043263) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -1.3107841214043263) {
            p = 1;
        }
        return p;
    }
    static double Ne9bcd6e165(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 0.7048946459907729) {
            p = SpeechDetector.N16cbf840166(i);
        } else if (((Double) i[10]).doubleValue() > 0.7048946459907729) {
            p = SpeechDetector.N3a1f830b173(i);
        }
        return p;
    }
    static double N16cbf840166(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 1.151256666858679) {
            p = SpeechDetector.N29173d71167(i);
        } else if (((Double) i[3]).doubleValue() > 1.151256666858679) {
            p = SpeechDetector.N726f0725171(i);
        }
        return p;
    }
    static double N29173d71167(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 1.604008417345148) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > 1.604008417345148) {
            p = SpeechDetector.N34c2daca168(i);
        }
        return p;
    }
    static double N34c2daca168(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -0.8136143108897321) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -0.8136143108897321) {
            p = SpeechDetector.N64aa1ed5169(i);
        }
        return p;
    }
    static double N64aa1ed5169(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 3.582372292908195) {
            p = SpeechDetector.N5cce6594170(i);
        } else if (((Double) i[5]).doubleValue() > 3.582372292908195) {
            p = 1;
        }
        return p;
    }
    static double N5cce6594170(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 2.623964843815046) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > 2.623964843815046) {
            p = 1;
        }
        return p;
    }
    static double N726f0725171(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 1.1062814823638707) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > 1.1062814823638707) {
            p = SpeechDetector.N573e48d4172(i);
        }
        return p;
    }
    static double N573e48d4172(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 0.49255482418336616) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > 0.49255482418336616) {
            p = 1;
        }
        return p;
    }
    static double N3a1f830b173(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -1.1796689297040415) {
            p = SpeechDetector.N6ad464fc174(i);
        } else if (((Double) i[5]).doubleValue() > -1.1796689297040415) {
            p = SpeechDetector.N69898225176(i);
        }
        return p;
    }
    static double N6ad464fc174(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 1.4651839147555585) {
            p = SpeechDetector.N1e32132f175(i);
        } else if (((Double) i[2]).doubleValue() > 1.4651839147555585) {
            p = 1;
        }
        return p;
    }
    static double N1e32132f175(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -2.388024208293407) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -2.388024208293407) {
            p = 0;
        }
        return p;
    }
    static double N69898225176(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -1.628146031623788) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -1.628146031623788) {
            p = SpeechDetector.N42bf8144177(i);
        }
        return p;
    }
    static double N42bf8144177(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 3.7896684274472743) {
            p = SpeechDetector.N2abfb998178(i);
        } else if (((Double) i[5]).doubleValue() > 3.7896684274472743) {
            p = 0;
        }
        return p;
    }
    static double N2abfb998178(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 2.1181316946164372) {
            p = SpeechDetector.N1131c015179(i);
        } else if (((Double) i[10]).doubleValue() > 2.1181316946164372) {
            p = 1;
        }
        return p;
    }
    static double N1131c015179(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -0.7705564592454824) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -0.7705564592454824) {
            p = SpeechDetector.N5939ab84180(i);
        }
        return p;
    }
    static double N5939ab84180(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 4.048113235632315) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 4.048113235632315) {
            p = 0;
        }
        return p;
    }
    static double N592b94df181(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 1.6173291397367155) {
            p = SpeechDetector.N3c3aea35182(i);
        } else if (((Double) i[11]).doubleValue() > 1.6173291397367155) {
            p = SpeechDetector.N537d6336189(i);
        }
        return p;
    }
    static double N3c3aea35182(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 5.399837399873533) {
            p = SpeechDetector.N3fe65c77183(i);
        } else if (((Double) i[1]).doubleValue() > 5.399837399873533) {
            p = 0;
        }
        return p;
    }
    static double N3fe65c77183(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 3.6548583874802913) {
            p = SpeechDetector.N2cc0a967184(i);
        } else if (((Double) i[5]).doubleValue() > 3.6548583874802913) {
            p = 0;
        }
        return p;
    }
    static double N2cc0a967184(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 3.7100012554769197) {
            p = SpeechDetector.N1cb1c025185(i);
        } else if (((Double) i[8]).doubleValue() > 3.7100012554769197) {
            p = 1;
        }
        return p;
    }
    static double N1cb1c025185(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -5.378887862826269) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -5.378887862826269) {
            p = SpeechDetector.N59bdcbda186(i);
        }
        return p;
    }
    static double N59bdcbda186(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -0.559755896154775) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -0.559755896154775) {
            p = SpeechDetector.N3b92833d187(i);
        }
        return p;
    }
    static double N3b92833d187(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 2.3207631159369835) {
            p = SpeechDetector.Nfe63859188(i);
        } else if (((Double) i[7]).doubleValue() > 2.3207631159369835) {
            p = 0;
        }
        return p;
    }
    static double Nfe63859188(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 5.14036228801771) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 5.14036228801771) {
            p = 0;
        }
        return p;
    }
    static double N537d6336189(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 0.22180880228387345) {
            p = SpeechDetector.N4cfc990c190(i);
        } else if (((Double) i[2]).doubleValue() > 0.22180880228387345) {
            p = 1;
        }
        return p;
    }
    static double N4cfc990c190(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 68.14680903591763) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 68.14680903591763) {
            p = 0;
        }
        return p;
    }
    static double N5ba40a50191(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 64.70682931392773) {
            p = SpeechDetector.N6ea13930192(i);
        } else if (((Double) i[0]).doubleValue() > 64.70682931392773) {
            p = SpeechDetector.N12388712263(i);
        }
        return p;
    }
    static double N6ea13930192(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 1.7406048117177337) {
            p = SpeechDetector.N1ab1b70e193(i);
        } else if (((Double) i[2]).doubleValue() > 1.7406048117177337) {
            p = SpeechDetector.Naf90d11255(i);
        }
        return p;
    }
    static double N1ab1b70e193(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 60.524900487251806) {
            p = SpeechDetector.N96905d3194(i);
        } else if (((Double) i[0]).doubleValue() > 60.524900487251806) {
            p = SpeechDetector.N6a4abee5224(i);
        }
        return p;
    }
    static double N96905d3194(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -5.603732934742211) {
            p = SpeechDetector.N4dfd6478195(i);
        } else if (((Double) i[8]).doubleValue() > -5.603732934742211) {
            p = SpeechDetector.N5ae0f914197(i);
        }
        return p;
    }
    static double N4dfd6478195(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -1.5760624707126165) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -1.5760624707126165) {
            p = SpeechDetector.N36cf2a48196(i);
        }
        return p;
    }
    static double N36cf2a48196(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -3.244012550711663) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -3.244012550711663) {
            p = 0;
        }
        return p;
    }
    static double N5ae0f914197(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 51.82180318258305) {
            p = SpeechDetector.N6800bea8198(i);
        } else if (((Double) i[0]).doubleValue() > 51.82180318258305) {
            p = SpeechDetector.N258a98e4202(i);
        }
        return p;
    }
    static double N6800bea8198(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 0.5099114934521786) {
            p = SpeechDetector.N8e53cf0199(i);
        } else if (((Double) i[11]).doubleValue() > 0.5099114934521786) {
            p = 0;
        }
        return p;
    }
    static double N8e53cf0199(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 0.8801464730169224) {
            p = SpeechDetector.N203b520200(i);
        } else if (((Double) i[7]).doubleValue() > 0.8801464730169224) {
            p = SpeechDetector.N416848e8201(i);
        }
        return p;
    }
    static double N203b520200(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 0.12731670388232535) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > 0.12731670388232535) {
            p = 0;
        }
        return p;
    }
    static double N416848e8201(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -3.7254718034754917) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -3.7254718034754917) {
            p = 1;
        }
        return p;
    }
    static double N258a98e4202(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 2.708050949557413) {
            p = SpeechDetector.N2e3bb3fd203(i);
        } else if (((Double) i[4]).doubleValue() > 2.708050949557413) {
            p = SpeechDetector.N5891b770215(i);
        }
        return p;
    }
    static double N2e3bb3fd203(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -0.6772886962759889) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -0.6772886962759889) {
            p = SpeechDetector.N51a5bec1204(i);
        }
        return p;
    }
    static double N51a5bec1204(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 0.23652760287869776) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > 0.23652760287869776) {
            p = SpeechDetector.N588e9ac7205(i);
        }
        return p;
    }
    static double N588e9ac7205(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 3.7168717743779065) {
            p = SpeechDetector.N7a53ac3c206(i);
        } else if (((Double) i[8]).doubleValue() > 3.7168717743779065) {
            p = 1;
        }
        return p;
    }
    static double N7a53ac3c206(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 57.303103652528314) {
            p = SpeechDetector.Nb50d5e2207(i);
        } else if (((Double) i[0]).doubleValue() > 57.303103652528314) {
            p = SpeechDetector.N145401d5210(i);
        }
        return p;
    }
    static double Nb50d5e2207(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 1.479827443694779) {
            p = SpeechDetector.N6809ee3b208(i);
        } else if (((Double) i[6]).doubleValue() > 1.479827443694779) {
            p = 1;
        }
        return p;
    }
    static double N6809ee3b208(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -1.852241924369946) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -1.852241924369946) {
            p = SpeechDetector.N63f798d9209(i);
        }
        return p;
    }
    static double N63f798d9209(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 55.31265250785841) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 55.31265250785841) {
            p = 1;
        }
        return p;
    }
    static double N145401d5210(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 1.8339570523875572) {
            p = SpeechDetector.N17445160211(i);
        } else if (((Double) i[7]).doubleValue() > 1.8339570523875572) {
            p = SpeechDetector.N6b0fd67a213(i);
        }
        return p;
    }
    static double N17445160211(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.9881990957461777) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -0.9881990957461777) {
            p = SpeechDetector.N63a818f212(i);
        }
        return p;
    }
    static double N63a818f212(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 0.18908205114439938) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > 0.18908205114439938) {
            p = 1;
        }
        return p;
    }
    static double N6b0fd67a213(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 1.7925588001287593) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 1.7925588001287593) {
            p = SpeechDetector.N5cca1a7f214(i);
        }
        return p;
    }
    static double N5cca1a7f214(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 0.3175351630499224) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 0.3175351630499224) {
            p = 1;
        }
        return p;
    }
    static double N5891b770215(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -2.9741813021041144) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -2.9741813021041144) {
            p = SpeechDetector.N46a2477d216(i);
        }
        return p;
    }
    static double N46a2477d216(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -1.2317304022076487) {
            p = SpeechDetector.N480383c5217(i);
        } else if (((Double) i[3]).doubleValue() > -1.2317304022076487) {
            p = SpeechDetector.N5ec01f72218(i);
        }
        return p;
    }
    static double N480383c5217(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 3.6259887777468367) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 3.6259887777468367) {
            p = 1;
        }
        return p;
    }
    static double N5ec01f72218(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -0.6351620312900821) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -0.6351620312900821) {
            p = SpeechDetector.N1750a5f7219(i);
        }
        return p;
    }
    static double N1750a5f7219(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= -4.5125236985469686) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > -4.5125236985469686) {
            p = SpeechDetector.N2fc00716220(i);
        }
        return p;
    }
    static double N2fc00716220(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 1.0010684650375818) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > 1.0010684650375818) {
            p = SpeechDetector.N68114dd7221(i);
        }
        return p;
    }
    static double N68114dd7221(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 5.227595647715979) {
            p = SpeechDetector.N480d93a1222(i);
        } else if (((Double) i[4]).doubleValue() > 5.227595647715979) {
            p = 0;
        }
        return p;
    }
    static double N480d93a1222(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 2.3678221644777997) {
            p = SpeechDetector.N735753fb223(i);
        } else if (((Double) i[3]).doubleValue() > 2.3678221644777997) {
            p = 1;
        }
        return p;
    }
    static double N735753fb223(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 1.6820599407722934) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 1.6820599407722934) {
            p = 0;
        }
        return p;
    }
    static double N6a4abee5224(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 4.3593747902504845) {
            p = SpeechDetector.N513ae2e7225(i);
        } else if (((Double) i[8]).doubleValue() > 4.3593747902504845) {
            p = 1;
        }
        return p;
    }
    static double N513ae2e7225(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -1.286306867246389) {
            p = SpeechDetector.N7106d55a226(i);
        } else if (((Double) i[2]).doubleValue() > -1.286306867246389) {
            p = SpeechDetector.N632ab09b235(i);
        }
        return p;
    }
    static double N7106d55a226(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -0.9035211904650463) {
            p = SpeechDetector.N77a141ae227(i);
        } else if (((Double) i[5]).doubleValue() > -0.9035211904650463) {
            p = SpeechDetector.N4d982fd8230(i);
        }
        return p;
    }
    static double N77a141ae227(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -1.131096541339112) {
            p = SpeechDetector.N7bdf43dd228(i);
        } else if (((Double) i[8]).doubleValue() > -1.131096541339112) {
            p = 1;
        }
        return p;
    }
    static double N7bdf43dd228(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 1.1219942610456046) {
            p = SpeechDetector.N7ee0a1b3229(i);
        } else if (((Double) i[4]).doubleValue() > 1.1219942610456046) {
            p = 0;
        }
        return p;
    }
    static double N7ee0a1b3229(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -2.960063497758458) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -2.960063497758458) {
            p = 1;
        }
        return p;
    }
    static double N4d982fd8230(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 8.215973310168689) {
            p = SpeechDetector.N426d35b4231(i);
        } else if (((Double) i[1]).doubleValue() > 8.215973310168689) {
            p = 0;
        }
        return p;
    }
    static double N426d35b4231(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 62.49821470837382) {
            p = SpeechDetector.Nfe0de7e232(i);
        } else if (((Double) i[0]).doubleValue() > 62.49821470837382) {
            p = 0;
        }
        return p;
    }
    static double Nfe0de7e232(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 3.8430200277625595) {
            p = SpeechDetector.N742f2a56233(i);
        } else if (((Double) i[4]).doubleValue() > 3.8430200277625595) {
            p = 0;
        }
        return p;
    }
    static double N742f2a56233(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 7.909188736739846) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 7.909188736739846) {
            p = SpeechDetector.N4484afb1234(i);
        }
        return p;
    }
    static double N4484afb1234(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 7.932290770650935) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 7.932290770650935) {
            p = 1;
        }
        return p;
    }
    static double N632ab09b235(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 0.3335553532246462) {
            p = SpeechDetector.N7b0c2fa236(i);
        } else if (((Double) i[5]).doubleValue() > 0.3335553532246462) {
            p = SpeechDetector.N6479f067248(i);
        }
        return p;
    }
    static double N7b0c2fa236(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 4.649644395881976) {
            p = SpeechDetector.N65d0af07237(i);
        } else if (((Double) i[6]).doubleValue() > 4.649644395881976) {
            p = SpeechDetector.N388ebd32246(i);
        }
        return p;
    }
    static double N65d0af07237(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 0.9441713465578323) {
            p = SpeechDetector.N679328c9238(i);
        } else if (((Double) i[7]).doubleValue() > 0.9441713465578323) {
            p = SpeechDetector.N6e5ad93e239(i);
        }
        return p;
    }
    static double N679328c9238(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 6.48378168618069) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 6.48378168618069) {
            p = 0;
        }
        return p;
    }
    static double N6e5ad93e239(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 0.09572629717191034) {
            p = SpeechDetector.Ne6cae0c240(i);
        } else if (((Double) i[2]).doubleValue() > 0.09572629717191034) {
            p = SpeechDetector.N73ac4b64242(i);
        }
        return p;
    }
    static double Ne6cae0c240(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -4.015169830445015) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -4.015169830445015) {
            p = SpeechDetector.N1169d3a241(i);
        }
        return p;
    }
    static double N1169d3a241(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 3.480956175062138) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 3.480956175062138) {
            p = 0;
        }
        return p;
    }
    static double N73ac4b64242(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 3.8109192007848494) {
            p = SpeechDetector.N3489cd90243(i);
        } else if (((Double) i[6]).doubleValue() > 3.8109192007848494) {
            p = 1;
        }
        return p;
    }
    static double N3489cd90243(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 7.562821561934024) {
            p = SpeechDetector.N4316c3e2244(i);
        } else if (((Double) i[1]).doubleValue() > 7.562821561934024) {
            p = 0;
        }
        return p;
    }
    static double N4316c3e2244(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 0.9625334233492948) {
            p = SpeechDetector.Nb964cd7245(i);
        } else if (((Double) i[3]).doubleValue() > 0.9625334233492948) {
            p = 1;
        }
        return p;
    }
    static double Nb964cd7245(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -1.428224252658156) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -1.428224252658156) {
            p = 1;
        }
        return p;
    }
    static double N388ebd32246(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 0.2170388385073217) {
            p = SpeechDetector.N23273aa0247(i);
        } else if (((Double) i[3]).doubleValue() > 0.2170388385073217) {
            p = 0;
        }
        return p;
    }
    static double N23273aa0247(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -0.4053445086972217) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -0.4053445086972217) {
            p = 0;
        }
        return p;
    }
    static double N6479f067248(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 1.2780408585556935) {
            p = SpeechDetector.N1962dba249(i);
        } else if (((Double) i[3]).doubleValue() > 1.2780408585556935) {
            p = 0;
        }
        return p;
    }
    static double N1962dba249(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 1.4200103410447904) {
            p = SpeechDetector.N2a940f26250(i);
        } else if (((Double) i[7]).doubleValue() > 1.4200103410447904) {
            p = 0;
        }
        return p;
    }
    static double N2a940f26250(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -3.327278721130211) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -3.327278721130211) {
            p = SpeechDetector.N5e6e9da0251(i);
        }
        return p;
    }
    static double N5e6e9da0251(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 1.2139325911100436) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > 1.2139325911100436) {
            p = SpeechDetector.N302ea3cf252(i);
        }
        return p;
    }
    static double N302ea3cf252(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -0.530810626484668) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -0.530810626484668) {
            p = SpeechDetector.N460483bf253(i);
        }
        return p;
    }
    static double N460483bf253(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 7.528915221722404) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 7.528915221722404) {
            p = SpeechDetector.N52659482254(i);
        }
        return p;
    }
    static double N52659482254(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 62.0975659640349) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 62.0975659640349) {
            p = 0;
        }
        return p;
    }
    static double Naf90d11255(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 60.06279725088597) {
            p = SpeechDetector.N64c8dcb7256(i);
        } else if (((Double) i[0]).doubleValue() > 60.06279725088597) {
            p = 0;
        }
        return p;
    }
    static double N64c8dcb7256(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 2.802506064614796) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 2.802506064614796) {
            p = SpeechDetector.N3f12a612257(i);
        }
        return p;
    }
    static double N3f12a612257(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -0.002710051341598012) {
            p = SpeechDetector.N61550817258(i);
        } else if (((Double) i[11]).doubleValue() > -0.002710051341598012) {
            p = 1;
        }
        return p;
    }
    static double N61550817258(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 7.376197901319307) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 7.376197901319307) {
            p = SpeechDetector.N15864fed259(i);
        }
        return p;
    }
    static double N15864fed259(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 7.500384113831798) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 7.500384113831798) {
            p = SpeechDetector.N24e95ba5260(i);
        }
        return p;
    }
    static double N24e95ba5260(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -0.5920017999284292) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -0.5920017999284292) {
            p = SpeechDetector.N547fc091261(i);
        }
        return p;
    }
    static double N547fc091261(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -1.0370806147253828) {
            p = SpeechDetector.Nf3b9aee262(i);
        } else if (((Double) i[3]).doubleValue() > -1.0370806147253828) {
            p = 1;
        }
        return p;
    }
    static double Nf3b9aee262(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -1.8315645678314942) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -1.8315645678314942) {
            p = 1;
        }
        return p;
    }
    static double N12388712263(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -0.352418929050111) {
            p = SpeechDetector.N3d2bb816264(i);
        } else if (((Double) i[2]).doubleValue() > -0.352418929050111) {
            p = 0;
        }
        return p;
    }
    static double N3d2bb816264(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 3.131775293371546) {
            p = SpeechDetector.N142cbba265(i);
        } else if (((Double) i[5]).doubleValue() > 3.131775293371546) {
            p = 0;
        }
        return p;
    }
    static double N142cbba265(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 2.592556561887054) {
            p = SpeechDetector.N484d20fb266(i);
        } else if (((Double) i[6]).doubleValue() > 2.592556561887054) {
            p = SpeechDetector.N669be5f8275(i);
        }
        return p;
    }
    static double N484d20fb266(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -3.050892008004672) {
            p = SpeechDetector.N3fb063d2267(i);
        } else if (((Double) i[5]).doubleValue() > -3.050892008004672) {
            p = SpeechDetector.N5983167269(i);
        }
        return p;
    }
    static double N3fb063d2267(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 4.38805443105664) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > 4.38805443105664) {
            p = SpeechDetector.N556990a8268(i);
        }
        return p;
    }
    static double N556990a8268(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -1.3476820083913603) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -1.3476820083913603) {
            p = 1;
        }
        return p;
    }
    static double N5983167269(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -3.939706005610262) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -3.939706005610262) {
            p = SpeechDetector.N4ad3640f270(i);
        }
        return p;
    }
    static double N4ad3640f270(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.39322897360370607) {
            p = SpeechDetector.N7c4e3b29271(i);
        } else if (((Double) i[3]).doubleValue() > -0.39322897360370607) {
            p = 0;
        }
        return p;
    }
    static double N7c4e3b29271(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -1.7902668958277757) {
            p = SpeechDetector.N740e4080272(i);
        } else if (((Double) i[2]).doubleValue() > -1.7902668958277757) {
            p = SpeechDetector.N764bbdd4274(i);
        }
        return p;
    }
    static double N740e4080272(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 0.4748848438616169) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > 0.4748848438616169) {
            p = SpeechDetector.N53accf06273(i);
        }
        return p;
    }
    static double N53accf06273(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 0.8422492549900561) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 0.8422492549900561) {
            p = 1;
        }
        return p;
    }
    static double N764bbdd4274(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 7.831218313084099) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 7.831218313084099) {
            p = 0;
        }
        return p;
    }
    static double N669be5f8275(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 0.49099081476028766) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 0.49099081476028766) {
            p = SpeechDetector.N5173169276(i);
        }
        return p;
    }
    static double N5173169276(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -2.169670535427666) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -2.169670535427666) {
            p = SpeechDetector.N35ace71b277(i);
        }
        return p;
    }
    static double N35ace71b277(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -1.295349531571466) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -1.295349531571466) {
            p = 0;
        }
        return p;
    }
    static double N6a78b924278(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 72.84593836334042) {
            p = SpeechDetector.N1bc32118279(i);
        } else if (((Double) i[0]).doubleValue() > 72.84593836334042) {
            p = SpeechDetector.N26dc83dd300(i);
        }
        return p;
    }
    static double N1bc32118279(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -2.3961793938439584) {
            p = SpeechDetector.N27b1bce5280(i);
        } else if (((Double) i[2]).doubleValue() > -2.3961793938439584) {
            p = SpeechDetector.N5b884fed289(i);
        }
        return p;
    }
    static double N27b1bce5280(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -6.284704255367665) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -6.284704255367665) {
            p = SpeechDetector.N5e872bf281(i);
        }
        return p;
    }
    static double N5e872bf281(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 1.6129092769870992) {
            p = SpeechDetector.N5fc55ca0282(i);
        } else if (((Double) i[3]).doubleValue() > 1.6129092769870992) {
            p = SpeechDetector.N23c8ea35288(i);
        }
        return p;
    }
    static double N5fc55ca0282(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 6.4461882065141385) {
            p = SpeechDetector.N16443d7f283(i);
        } else if (((Double) i[1]).doubleValue() > 6.4461882065141385) {
            p = 0;
        }
        return p;
    }
    static double N16443d7f283(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 4.829065372626915) {
            p = SpeechDetector.N5a216844284(i);
        } else if (((Double) i[5]).doubleValue() > 4.829065372626915) {
            p = 0;
        }
        return p;
    }
    static double N5a216844284(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 3.2797305153683713) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 3.2797305153683713) {
            p = SpeechDetector.N47447696285(i);
        }
        return p;
    }
    static double N47447696285(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -1.4249652674378783) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -1.4249652674378783) {
            p = SpeechDetector.N5fc59667286(i);
        }
        return p;
    }
    static double N5fc59667286(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -1.0598592420761839) {
            p = SpeechDetector.N25157550287(i);
        } else if (((Double) i[10]).doubleValue() > -1.0598592420761839) {
            p = 0;
        }
        return p;
    }
    static double N25157550287(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 3.154703684521774) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > 3.154703684521774) {
            p = 0;
        }
        return p;
    }
    static double N23c8ea35288(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -6.19384730655873) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -6.19384730655873) {
            p = 0;
        }
        return p;
    }
    static double N5b884fed289(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -1.2195065542509071) {
            p = SpeechDetector.N52377f8d290(i);
        } else if (((Double) i[7]).doubleValue() > -1.2195065542509071) {
            p = SpeechDetector.N7626fb7a295(i);
        }
        return p;
    }
    static double N52377f8d290(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 3.657174385808917) {
            p = SpeechDetector.N39972c26291(i);
        } else if (((Double) i[6]).doubleValue() > 3.657174385808917) {
            p = 0;
        }
        return p;
    }
    static double N39972c26291(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 71.11893337284971) {
            p = SpeechDetector.N73d39053292(i);
        } else if (((Double) i[0]).doubleValue() > 71.11893337284971) {
            p = SpeechDetector.N46a8748d293(i);
        }
        return p;
    }
    static double N73d39053292(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 0.6126315419151033) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > 0.6126315419151033) {
            p = 0;
        }
        return p;
    }
    static double N46a8748d293(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -0.0949748082660557) {
            p = SpeechDetector.N5d7bf938294(i);
        } else if (((Double) i[2]).doubleValue() > -0.0949748082660557) {
            p = 0;
        }
        return p;
    }
    static double N5d7bf938294(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -0.9439382411174339) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -0.9439382411174339) {
            p = 1;
        }
        return p;
    }
    static double N7626fb7a295(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -0.19504373930173408) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -0.19504373930173408) {
            p = SpeechDetector.N7948432f296(i);
        }
        return p;
    }
    static double N7948432f296(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 0.12727909679766283) {
            p = SpeechDetector.N773300dd297(i);
        } else if (((Double) i[10]).doubleValue() > 0.12727909679766283) {
            p = SpeechDetector.N5da1c251299(i);
        }
        return p;
    }
    static double N773300dd297(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 70.80674903635571) {
            p = SpeechDetector.N357dea4e298(i);
        } else if (((Double) i[0]).doubleValue() > 70.80674903635571) {
            p = 0;
        }
        return p;
    }
    static double N357dea4e298(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -1.917089980091473) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -1.917089980091473) {
            p = 0;
        }
        return p;
    }
    static double N5da1c251299(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 6.852936503751255) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 6.852936503751255) {
            p = 0;
        }
        return p;
    }
    static double N26dc83dd300(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -5.5488765470635375) {
            p = SpeechDetector.N57553619301(i);
        } else if (((Double) i[2]).doubleValue() > -5.5488765470635375) {
            p = SpeechDetector.N1b52d01a302(i);
        }
        return p;
    }
    static double N57553619301(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -5.0602934916149565) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -5.0602934916149565) {
            p = 0;
        }
        return p;
    }
    static double N1b52d01a302(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -3.298387543130571) {
            p = SpeechDetector.N59dc68f9303(i);
        } else if (((Double) i[7]).doubleValue() > -3.298387543130571) {
            p = SpeechDetector.N70418842306(i);
        }
        return p;
    }
    static double N59dc68f9303(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -6.358502533509628) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -6.358502533509628) {
            p = SpeechDetector.N156fe186304(i);
        }
        return p;
    }
    static double N156fe186304(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 2.681171925127922) {
            p = SpeechDetector.N643f2f68305(i);
        } else if (((Double) i[1]).doubleValue() > 2.681171925127922) {
            p = 0;
        }
        return p;
    }
    static double N643f2f68305(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 1.0127027744531292) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 1.0127027744531292) {
            p = 1;
        }
        return p;
    }
    static double N70418842306(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -0.7944049076373547) {
            p = SpeechDetector.N5e58dea1307(i);
        } else if (((Double) i[2]).doubleValue() > -0.7944049076373547) {
            p = 0;
        }
        return p;
    }
    static double N5e58dea1307(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 0.9860218190778818) {
            p = SpeechDetector.N1c804c6b308(i);
        } else if (((Double) i[5]).doubleValue() > 0.9860218190778818) {
            p = 0;
        }
        return p;
    }
    static double N1c804c6b308(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 6.240130956465611) {
            p = SpeechDetector.N2b19136b309(i);
        } else if (((Double) i[1]).doubleValue() > 6.240130956465611) {
            p = 0;
        }
        return p;
    }
    static double N2b19136b309(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 78.85454782012654) {
            p = SpeechDetector.N7b49ebe7310(i);
        } else if (((Double) i[0]).doubleValue() > 78.85454782012654) {
            p = 0;
        }
        return p;
    }
    static double N7b49ebe7310(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 1.7790409937567535) {
            p = SpeechDetector.N321ec9ed311(i);
        } else if (((Double) i[7]).doubleValue() > 1.7790409937567535) {
            p = 0;
        }
        return p;
    }
    static double N321ec9ed311(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 2.7069869699791704) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 2.7069869699791704) {
            p = SpeechDetector.N35b0050312(i);
        }
        return p;
    }
    static double N35b0050312(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -4.235990693816199) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -4.235990693816199) {
            p = SpeechDetector.N4b7185e8313(i);
        }
        return p;
    }
    static double N4b7185e8313(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 73.32529028746065) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 73.32529028746065) {
            p = 0;
        }
        return p;
    }
    static double Na0e690a314(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 60.98548666901881) {
            p = SpeechDetector.N381214ae315(i);
        } else if (((Double) i[0]).doubleValue() > 60.98548666901881) {
            p = SpeechDetector.N2c2a0da7333(i);
        }
        return p;
    }
    static double N381214ae315(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 9.57952222026399) {
            p = SpeechDetector.N2b0bc844316(i);
        } else if (((Double) i[1]).doubleValue() > 9.57952222026399) {
            p = SpeechDetector.N22e5f22d330(i);
        }
        return p;
    }
    static double N2b0bc844316(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -0.8355030187928302) {
            p = SpeechDetector.N1288fe70317(i);
        } else if (((Double) i[2]).doubleValue() > -0.8355030187928302) {
            p = SpeechDetector.N5e611d42323(i);
        }
        return p;
    }
    static double N1288fe70317(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 1.5436229743498682) {
            p = SpeechDetector.N5ff87491318(i);
        } else if (((Double) i[3]).doubleValue() > 1.5436229743498682) {
            p = 0;
        }
        return p;
    }
    static double N5ff87491318(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 2.345996637066866) {
            p = SpeechDetector.N30ad0cd0319(i);
        } else if (((Double) i[4]).doubleValue() > 2.345996637066866) {
            p = SpeechDetector.N44174925321(i);
        }
        return p;
    }
    static double N30ad0cd0319(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -4.175397647773508) {
            p = SpeechDetector.N312444a7320(i);
        } else if (((Double) i[3]).doubleValue() > -4.175397647773508) {
            p = 1;
        }
        return p;
    }
    static double N312444a7320(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -1.861145449351218) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -1.861145449351218) {
            p = 1;
        }
        return p;
    }
    static double N44174925321(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -3.1684149252721183) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -3.1684149252721183) {
            p = SpeechDetector.N54c33f0f322(i);
        }
        return p;
    }
    static double N54c33f0f322(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 3.587449595628626) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > 3.587449595628626) {
            p = 0;
        }
        return p;
    }
    static double N5e611d42323(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 0.5708100065593967) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 0.5708100065593967) {
            p = SpeechDetector.N39c80876324(i);
        }
        return p;
    }
    static double N39c80876324(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 1.3170180423939724) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 1.3170180423939724) {
            p = SpeechDetector.N7ba3989c325(i);
        }
        return p;
    }
    static double N7ba3989c325(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 0.4281575460083717) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 0.4281575460083717) {
            p = SpeechDetector.N3178692e326(i);
        }
        return p;
    }
    static double N3178692e326(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 52.169405069951054) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 52.169405069951054) {
            p = SpeechDetector.N58416461327(i);
        }
        return p;
    }
    static double N58416461327(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 8.893016462792083) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 8.893016462792083) {
            p = SpeechDetector.N2d25498b328(i);
        }
        return p;
    }
    static double N2d25498b328(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 9.433921004031996) {
            p = SpeechDetector.N6aff5bd4329(i);
        } else if (((Double) i[1]).doubleValue() > 9.433921004031996) {
            p = 1;
        }
        return p;
    }
    static double N6aff5bd4329(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -0.6269717392175008) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -0.6269717392175008) {
            p = 1;
        }
        return p;
    }
    static double N22e5f22d330(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 58.346386667180354) {
            p = SpeechDetector.N267e7a41331(i);
        } else if (((Double) i[0]).doubleValue() > 58.346386667180354) {
            p = 0;
        }
        return p;
    }
    static double N267e7a41331(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 3.9678502247476897) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > 3.9678502247476897) {
            p = SpeechDetector.N398c5525332(i);
        }
        return p;
    }
    static double N398c5525332(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 10.261178869507326) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 10.261178869507326) {
            p = 0;
        }
        return p;
    }
    static double N2c2a0da7333(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 67.67127795163982) {
            p = SpeechDetector.N7ce66597334(i);
        } else if (((Double) i[0]).doubleValue() > 67.67127795163982) {
            p = 0;
        }
        return p;
    }
    static double N7ce66597334(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 2.19517206547591) {
            p = SpeechDetector.N7a17dc90335(i);
        } else if (((Double) i[7]).doubleValue() > 2.19517206547591) {
            p = 0;
        }
        return p;
    }
    static double N7a17dc90335(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 8.833112257320755) {
            p = SpeechDetector.N3491b08f336(i);
        } else if (((Double) i[1]).doubleValue() > 8.833112257320755) {
            p = 0;
        }
        return p;
    }
    static double N3491b08f336(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 0.23962036429291772) {
            p = SpeechDetector.N48de973f337(i);
        } else if (((Double) i[3]).doubleValue() > 0.23962036429291772) {
            p = 0;
        }
        return p;
    }
    static double N48de973f337(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -3.5594402936168805) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -3.5594402936168805) {
            p = SpeechDetector.Nd9bce79338(i);
        }
        return p;
    }
    static double Nd9bce79338(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 1.1615632400881033) {
            p = SpeechDetector.N701070e9339(i);
        } else if (((Double) i[2]).doubleValue() > 1.1615632400881033) {
            p = 0;
        }
        return p;
    }
    static double N701070e9339(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 8.652122200607128) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 8.652122200607128) {
            p = SpeechDetector.N47650a79340(i);
        }
        return p;
    }
    static double N47650a79340(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -2.5950429774425854) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -2.5950429774425854) {
            p = 0;
        }
        return p;
    }
    static double N3a92b28d341(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 3.733223745838692) {
            p = SpeechDetector.N75086505342(i);
        } else if (((Double) i[4]).doubleValue() > 3.733223745838692) {
            p = SpeechDetector.N504ff367500(i);
        }
        return p;
    }
    static double N75086505342(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 7.927314560649508) {
            p = SpeechDetector.N7a206749343(i);
        } else if (((Double) i[1]).doubleValue() > 7.927314560649508) {
            p = SpeechDetector.N694a1247489(i);
        }
        return p;
    }
    static double N7a206749343(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 67.93311657595719) {
            p = SpeechDetector.N655d2842344(i);
        } else if (((Double) i[0]).doubleValue() > 67.93311657595719) {
            p = 0;
        }
        return p;
    }
    static double N655d2842344(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 0.7576701391134122) {
            p = SpeechDetector.N46fe390b345(i);
        } else if (((Double) i[10]).doubleValue() > 0.7576701391134122) {
            p = SpeechDetector.N6183d3b9420(i);
        }
        return p;
    }
    static double N46fe390b345(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 4.439907854215525) {
            p = SpeechDetector.N5c532596346(i);
        } else if (((Double) i[2]).doubleValue() > 4.439907854215525) {
            p = SpeechDetector.N4c5853eb385(i);
        }
        return p;
    }
    static double N5c532596346(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -2.7014601397588125) {
            p = SpeechDetector.N56c8ca34347(i);
        } else if (((Double) i[4]).doubleValue() > -2.7014601397588125) {
            p = SpeechDetector.N32d12b9361(i);
        }
        return p;
    }
    static double N56c8ca34347(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 65.86482192874692) {
            p = SpeechDetector.N1853486f348(i);
        } else if (((Double) i[0]).doubleValue() > 65.86482192874692) {
            p = SpeechDetector.N665316f2359(i);
        }
        return p;
    }
    static double N1853486f348(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 0.45301548695417093) {
            p = SpeechDetector.N3b87be3349(i);
        } else if (((Double) i[5]).doubleValue() > 0.45301548695417093) {
            p = SpeechDetector.N4946d29a353(i);
        }
        return p;
    }
    static double N3b87be3349(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 5.409101692544258) {
            p = SpeechDetector.N44cd75fd350(i);
        } else if (((Double) i[9]).doubleValue() > 5.409101692544258) {
            p = SpeechDetector.Ncfd5855351(i);
        }
        return p;
    }
    static double N44cd75fd350(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -1.764200728185006) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -1.764200728185006) {
            p = 1;
        }
        return p;
    }
    static double Ncfd5855351(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -1.1939281210783752) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -1.1939281210783752) {
            p = SpeechDetector.N4cb23b1c352(i);
        }
        return p;
    }
    static double N4cb23b1c352(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 5.861767719110212) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > 5.861767719110212) {
            p = 1;
        }
        return p;
    }
    static double N4946d29a353(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -0.532743684570883) {
            p = SpeechDetector.N48aca20b354(i);
        } else if (((Double) i[6]).doubleValue() > -0.532743684570883) {
            p = SpeechDetector.N35fc40b2356(i);
        }
        return p;
    }
    static double N48aca20b354(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 54.64306508264332) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 54.64306508264332) {
            p = SpeechDetector.N3dc2a573355(i);
        }
        return p;
    }
    static double N3dc2a573355(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 4.129052877226532) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 4.129052877226532) {
            p = 0;
        }
        return p;
    }
    static double N35fc40b2356(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 2.4774535762149843) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 2.4774535762149843) {
            p = SpeechDetector.N43fb81ce357(i);
        }
        return p;
    }
    static double N43fb81ce357(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -2.326517168897478) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -2.326517168897478) {
            p = SpeechDetector.N35071e40358(i);
        }
        return p;
    }
    static double N35071e40358(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 4.563293168241716) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 4.563293168241716) {
            p = 0;
        }
        return p;
    }
    static double N665316f2359(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 4.714913456729551) {
            p = SpeechDetector.N59079e59360(i);
        } else if (((Double) i[1]).doubleValue() > 4.714913456729551) {
            p = 0;
        }
        return p;
    }
    static double N59079e59360(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.4671310291268798) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 3.4671310291268798) {
            p = 0;
        }
        return p;
    }
    static double N32d12b9361(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 2.1076800466341368) {
            p = SpeechDetector.N4283150362(i);
        } else if (((Double) i[5]).doubleValue() > 2.1076800466341368) {
            p = SpeechDetector.Nff53eb2381(i);
        }
        return p;
    }
    static double N4283150362(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -1.485162293607178) {
            p = SpeechDetector.N6abd7d51363(i);
        } else if (((Double) i[3]).doubleValue() > -1.485162293607178) {
            p = SpeechDetector.N622daa46368(i);
        }
        return p;
    }
    static double N6abd7d51363(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -3.4212548609334448) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -3.4212548609334448) {
            p = SpeechDetector.N3e6e8796364(i);
        }
        return p;
    }
    static double N3e6e8796364(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 1.2199548393905415) {
            p = SpeechDetector.N4a87a8df365(i);
        } else if (((Double) i[8]).doubleValue() > 1.2199548393905415) {
            p = 1;
        }
        return p;
    }
    static double N4a87a8df365(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.894450174448428) {
            p = SpeechDetector.N105feeb3366(i);
        } else if (((Double) i[2]).doubleValue() > 3.894450174448428) {
            p = SpeechDetector.Na30322b367(i);
        }
        return p;
    }
    static double N105feeb3366(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 1.4037278799944803) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > 1.4037278799944803) {
            p = 0;
        }
        return p;
    }
    static double Na30322b367(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 56.59791369960316) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 56.59791369960316) {
            p = 1;
        }
        return p;
    }
    static double N622daa46368(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -0.44722788810946595) {
            p = SpeechDetector.N24060c05369(i);
        } else if (((Double) i[4]).doubleValue() > -0.44722788810946595) {
            p = SpeechDetector.N51cfe1e2374(i);
        }
        return p;
    }
    static double N24060c05369(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -2.5876283118372108) {
            p = SpeechDetector.N8ff2ebd370(i);
        } else if (((Double) i[5]).doubleValue() > -2.5876283118372108) {
            p = 0;
        }
        return p;
    }
    static double N8ff2ebd370(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 53.011579807111204) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 53.011579807111204) {
            p = SpeechDetector.N29557ee8371(i);
        }
        return p;
    }
    static double N29557ee8371(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 0.0725480919775857) {
            p = SpeechDetector.N2bfec68b372(i);
        } else if (((Double) i[7]).doubleValue() > 0.0725480919775857) {
            p = SpeechDetector.N639ce63d373(i);
        }
        return p;
    }
    static double N2bfec68b372(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 0.03295060477906377) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > 0.03295060477906377) {
            p = 1;
        }
        return p;
    }
    static double N639ce63d373(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -3.321504424577162) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -3.321504424577162) {
            p = 1;
        }
        return p;
    }
    static double N51cfe1e2374(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 1.4093135045846479) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > 1.4093135045846479) {
            p = SpeechDetector.N26f6e664375(i);
        }
        return p;
    }
    static double N26f6e664375(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 5.4272575998942525) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 5.4272575998942525) {
            p = SpeechDetector.N1b8fc338376(i);
        }
        return p;
    }
    static double N1b8fc338376(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 7.571663007049258) {
            p = SpeechDetector.N7b599faa377(i);
        } else if (((Double) i[1]).doubleValue() > 7.571663007049258) {
            p = 0;
        }
        return p;
    }
    static double N7b599faa377(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 1.2200945850164688) {
            p = SpeechDetector.N3901912a378(i);
        } else if (((Double) i[4]).doubleValue() > 1.2200945850164688) {
            p = SpeechDetector.N15e179a3379(i);
        }
        return p;
    }
    static double N3901912a378(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.07063768551642169) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -0.07063768551642169) {
            p = 0;
        }
        return p;
    }
    static double N15e179a3379(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -1.7830582089746112) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -1.7830582089746112) {
            p = SpeechDetector.N5f8c78e380(i);
        }
        return p;
    }
    static double N5f8c78e380(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 2.6219166464214094) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 2.6219166464214094) {
            p = 0;
        }
        return p;
    }
    static double Nff53eb2381(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 57.618842573228044) {
            p = SpeechDetector.N2de7204d382(i);
        } else if (((Double) i[0]).doubleValue() > 57.618842573228044) {
            p = 0;
        }
        return p;
    }
    static double N2de7204d382(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 1.1512294941938328) {
            p = SpeechDetector.N20f9b6c6383(i);
        } else if (((Double) i[9]).doubleValue() > 1.1512294941938328) {
            p = SpeechDetector.N6a4e9213384(i);
        }
        return p;
    }
    static double N20f9b6c6383(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -2.619675204795617) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -2.619675204795617) {
            p = 1;
        }
        return p;
    }
    static double N6a4e9213384(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 5.539479389537862) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 5.539479389537862) {
            p = 0;
        }
        return p;
    }
    static double N4c5853eb385(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -1.7003461506328192) {
            p = SpeechDetector.N3aed9075386(i);
        } else if (((Double) i[4]).doubleValue() > -1.7003461506328192) {
            p = SpeechDetector.N4ad6bdff417(i);
        }
        return p;
    }
    static double N3aed9075386(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 1.0647550978449003) {
            p = SpeechDetector.N42a70f8c387(i);
        } else if (((Double) i[3]).doubleValue() > 1.0647550978449003) {
            p = SpeechDetector.N48df8221410(i);
        }
        return p;
    }
    static double N42a70f8c387(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 9.004962814557503) {
            p = SpeechDetector.N65edd283388(i);
        } else if (((Double) i[2]).doubleValue() > 9.004962814557503) {
            p = 0;
        }
        return p;
    }
    static double N65edd283388(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 60.76842805896936) {
            p = SpeechDetector.N6097cabc389(i);
        } else if (((Double) i[0]).doubleValue() > 60.76842805896936) {
            p = SpeechDetector.N4dd406fc402(i);
        }
        return p;
    }
    static double N6097cabc389(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 2.591147458837647) {
            p = SpeechDetector.Nd7f2e2f390(i);
        } else if (((Double) i[7]).doubleValue() > 2.591147458837647) {
            p = SpeechDetector.N3266589401(i);
        }
        return p;
    }
    static double Nd7f2e2f390(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.6796829312557265) {
            p = SpeechDetector.N18b11695391(i);
        } else if (((Double) i[3]).doubleValue() > -0.6796829312557265) {
            p = SpeechDetector.N14bea5da396(i);
        }
        return p;
    }
    static double N18b11695391(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -0.9154078082627656) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -0.9154078082627656) {
            p = SpeechDetector.N12419cdd392(i);
        }
        return p;
    }
    static double N12419cdd392(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 49.708281584114985) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 49.708281584114985) {
            p = SpeechDetector.N11a17a88393(i);
        }
        return p;
    }
    static double N11a17a88393(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -3.540413856942487) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -3.540413856942487) {
            p = SpeechDetector.N737fc3394(i);
        }
        return p;
    }
    static double N737fc3394(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -4.851995512033899) {
            p = SpeechDetector.N1ec8db70395(i);
        } else if (((Double) i[4]).doubleValue() > -4.851995512033899) {
            p = 0;
        }
        return p;
    }
    static double N1ec8db70395(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 5.459336502746483) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 5.459336502746483) {
            p = 1;
        }
        return p;
    }
    static double N14bea5da396(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 4.972804647640936) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 4.972804647640936) {
            p = SpeechDetector.N707a95d9397(i);
        }
        return p;
    }
    static double N707a95d9397(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -1.4828528795054836) {
            p = SpeechDetector.N41340398(i);
        } else if (((Double) i[7]).doubleValue() > -1.4828528795054836) {
            p = 0;
        }
        return p;
    }
    static double N41340398(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 0.7027951819807527) {
            p = SpeechDetector.Nb8bcec2399(i);
        } else if (((Double) i[3]).doubleValue() > 0.7027951819807527) {
            p = 0;
        }
        return p;
    }
    static double Nb8bcec2399(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 5.7172003632643555) {
            p = SpeechDetector.N7b3287a400(i);
        } else if (((Double) i[1]).doubleValue() > 5.7172003632643555) {
            p = 1;
        }
        return p;
    }
    static double N7b3287a400(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 0.1495006979619262) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 0.1495006979619262) {
            p = 0;
        }
        return p;
    }
    static double N3266589401(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 4.748671548697497) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 4.748671548697497) {
            p = 0;
        }
        return p;
    }
    static double N4dd406fc402(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 4.206714851844895) {
            p = SpeechDetector.N1b16b24f403(i);
        } else if (((Double) i[1]).doubleValue() > 4.206714851844895) {
            p = SpeechDetector.N60fb1db9406(i);
        }
        return p;
    }
    static double N1b16b24f403(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -2.394082476241846) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -2.394082476241846) {
            p = SpeechDetector.N6f146e6d404(i);
        }
        return p;
    }
    static double N6f146e6d404(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 5.927230301562068) {
            p = SpeechDetector.N265def14405(i);
        } else if (((Double) i[2]).doubleValue() > 5.927230301562068) {
            p = 0;
        }
        return p;
    }
    static double N265def14405(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 4.879559856228105) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 4.879559856228105) {
            p = 1;
        }
        return p;
    }
    static double N60fb1db9406(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 63.59822475006004) {
            p = SpeechDetector.N65c8e6d407(i);
        } else if (((Double) i[0]).doubleValue() > 63.59822475006004) {
            p = 0;
        }
        return p;
    }
    static double N65c8e6d407(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 1.4735928806247531) {
            p = SpeechDetector.N268a995e408(i);
        } else if (((Double) i[11]).doubleValue() > 1.4735928806247531) {
            p = SpeechDetector.N555afe16409(i);
        }
        return p;
    }
    static double N268a995e408(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 6.402891732640316) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 6.402891732640316) {
            p = 1;
        }
        return p;
    }
    static double N555afe16409(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -2.1523123155701858) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -2.1523123155701858) {
            p = 0;
        }
        return p;
    }
    static double N48df8221410(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 6.351189800637714) {
            p = SpeechDetector.N49d869e7411(i);
        } else if (((Double) i[2]).doubleValue() > 6.351189800637714) {
            p = 0;
        }
        return p;
    }
    static double N49d869e7411(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -0.2870002734710275) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -0.2870002734710275) {
            p = SpeechDetector.N1f10e291412(i);
        }
        return p;
    }
    static double N1f10e291412(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 3.86771104639909) {
            p = SpeechDetector.Nd8aad86413(i);
        } else if (((Double) i[8]).doubleValue() > 3.86771104639909) {
            p = 0;
        }
        return p;
    }
    static double Nd8aad86413(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -1.1502148005100126) {
            p = SpeechDetector.Nb863f5c414(i);
        } else if (((Double) i[10]).doubleValue() > -1.1502148005100126) {
            p = 1;
        }
        return p;
    }
    static double Nb863f5c414(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -2.091879435029691) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -2.091879435029691) {
            p = SpeechDetector.N1aa9b6ed415(i);
        }
        return p;
    }
    static double N1aa9b6ed415(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -1.4100978149641188) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -1.4100978149641188) {
            p = SpeechDetector.N7c288f47416(i);
        }
        return p;
    }
    static double N7c288f47416(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -5.029257093313572) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -5.029257093313572) {
            p = 0;
        }
        return p;
    }
    static double N4ad6bdff417(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 0.4880500211033726) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > 0.4880500211033726) {
            p = SpeechDetector.N5853d6bb418(i);
        }
        return p;
    }
    static double N5853d6bb418(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 48.77541831523297) {
            p = SpeechDetector.N6836bc4a419(i);
        } else if (((Double) i[0]).doubleValue() > 48.77541831523297) {
            p = 0;
        }
        return p;
    }
    static double N6836bc4a419(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 6.848408489554351) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 6.848408489554351) {
            p = 0;
        }
        return p;
    }
    static double N6183d3b9420(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 5.050518540458376) {
            p = SpeechDetector.N15c148b3421(i);
        } else if (((Double) i[2]).doubleValue() > 5.050518540458376) {
            p = SpeechDetector.N357f908457(i);
        }
        return p;
    }
    static double N15c148b3421(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 3.8218921914506345) {
            p = SpeechDetector.N448beaed422(i);
        } else if (((Double) i[8]).doubleValue() > 3.8218921914506345) {
            p = SpeechDetector.N15d3768f455(i);
        }
        return p;
    }
    static double N448beaed422(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 0.3921345770433876) {
            p = SpeechDetector.N3dec90c3423(i);
        } else if (((Double) i[11]).doubleValue() > 0.3921345770433876) {
            p = SpeechDetector.N7d8cf60436(i);
        }
        return p;
    }
    static double N3dec90c3423(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 62.038450796031945) {
            p = SpeechDetector.N761411f7424(i);
        } else if (((Double) i[0]).doubleValue() > 62.038450796031945) {
            p = SpeechDetector.N1a3836f1429(i);
        }
        return p;
    }
    static double N761411f7424(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 1.6747791609075675) {
            p = SpeechDetector.N1fa7abb1425(i);
        } else if (((Double) i[9]).doubleValue() > 1.6747791609075675) {
            p = SpeechDetector.N63deabfd427(i);
        }
        return p;
    }
    static double N1fa7abb1425(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 3.536604815371599) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 3.536604815371599) {
            p = SpeechDetector.N38f901b3426(i);
        }
        return p;
    }
    static double N38f901b3426(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -1.039594468269074) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -1.039594468269074) {
            p = 0;
        }
        return p;
    }
    static double N63deabfd427(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 1.7599933940390124) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 1.7599933940390124) {
            p = SpeechDetector.N2feda244428(i);
        }
        return p;
    }
    static double N2feda244428(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 3.7695283459941953) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 3.7695283459941953) {
            p = 1;
        }
        return p;
    }
    static double N1a3836f1429(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 1.0490524445861629) {
            p = SpeechDetector.N609f15a9430(i);
        } else if (((Double) i[8]).doubleValue() > 1.0490524445861629) {
            p = SpeechDetector.N38a74744432(i);
        }
        return p;
    }
    static double N609f15a9430(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -0.5717523117537079) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -0.5717523117537079) {
            p = SpeechDetector.N6c473bcd431(i);
        }
        return p;
    }
    static double N6c473bcd431(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 6.863084252836698) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 6.863084252836698) {
            p = 0;
        }
        return p;
    }
    static double N38a74744432(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -2.480858585327118) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -2.480858585327118) {
            p = SpeechDetector.N6e37de6a433(i);
        }
        return p;
    }
    static double N6e37de6a433(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 3.558236158534672) {
            p = SpeechDetector.N15eb39ae434(i);
        } else if (((Double) i[9]).doubleValue() > 3.558236158534672) {
            p = 1;
        }
        return p;
    }
    static double N15eb39ae434(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 3.6460645031395353) {
            p = SpeechDetector.N617d9c0435(i);
        } else if (((Double) i[10]).doubleValue() > 3.6460645031395353) {
            p = 1;
        }
        return p;
    }
    static double N617d9c0435(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 65.69112322965569) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 65.69112322965569) {
            p = 1;
        }
        return p;
    }
    static double N7d8cf60436(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 6.454917448422082) {
            p = SpeechDetector.N2b16aba6437(i);
        } else if (((Double) i[1]).doubleValue() > 6.454917448422082) {
            p = SpeechDetector.N2e9bd714444(i);
        }
        return p;
    }
    static double N2b16aba6437(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -1.328846866829714) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -1.328846866829714) {
            p = SpeechDetector.N5d5f3563438(i);
        }
        return p;
    }
    static double N5d5f3563438(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 0.8022978996305196) {
            p = SpeechDetector.N15aa2679439(i);
        } else if (((Double) i[8]).doubleValue() > 0.8022978996305196) {
            p = 1;
        }
        return p;
    }
    static double N15aa2679439(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -1.1781850593812762) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -1.1781850593812762) {
            p = SpeechDetector.N55c3dd0b440(i);
        }
        return p;
    }
    static double N55c3dd0b440(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -2.3448288641228263) {
            p = SpeechDetector.N2de5292a441(i);
        } else if (((Double) i[4]).doubleValue() > -2.3448288641228263) {
            p = SpeechDetector.N1ff19bf0442(i);
        }
        return p;
    }
    static double N2de5292a441(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 1.597529969798129) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > 1.597529969798129) {
            p = 0;
        }
        return p;
    }
    static double N1ff19bf0442(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 58.346386667180354) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 58.346386667180354) {
            p = SpeechDetector.N2f34b9f2443(i);
        }
        return p;
    }
    static double N2f34b9f2443(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 0.048486753831878456) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 0.048486753831878456) {
            p = 1;
        }
        return p;
    }
    static double N2e9bd714444(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 3.781845092318258) {
            p = SpeechDetector.N794579f3445(i);
        } else if (((Double) i[10]).doubleValue() > 3.781845092318258) {
            p = 1;
        }
        return p;
    }
    static double N794579f3445(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 63.2833419743077) {
            p = SpeechDetector.N40497eb8446(i);
        } else if (((Double) i[0]).doubleValue() > 63.2833419743077) {
            p = 0;
        }
        return p;
    }
    static double N40497eb8446(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 3.0200072270080427) {
            p = SpeechDetector.N191e8301447(i);
        } else if (((Double) i[4]).doubleValue() > 3.0200072270080427) {
            p = SpeechDetector.N349c9c35454(i);
        }
        return p;
    }
    static double N191e8301447(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 2.883725349194471) {
            p = SpeechDetector.N222ac389448(i);
        } else if (((Double) i[8]).doubleValue() > 2.883725349194471) {
            p = 0;
        }
        return p;
    }
    static double N222ac389448(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -2.953320184416562) {
            p = SpeechDetector.N258b68e5449(i);
        } else if (((Double) i[4]).doubleValue() > -2.953320184416562) {
            p = SpeechDetector.N6393a5a4450(i);
        }
        return p;
    }
    static double N258b68e5449(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 58.68685421065376) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 58.68685421065376) {
            p = 0;
        }
        return p;
    }
    static double N6393a5a4450(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 1.6043396297135732) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 1.6043396297135732) {
            p = SpeechDetector.N725fe50e451(i);
        }
        return p;
    }
    static double N725fe50e451(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 2.2709346865969513) {
            p = SpeechDetector.N75b734cb452(i);
        } else if (((Double) i[6]).doubleValue() > 2.2709346865969513) {
            p = 1;
        }
        return p;
    }
    static double N75b734cb452(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 0.2849525860042232) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 0.2849525860042232) {
            p = SpeechDetector.N4eeb37cd453(i);
        }
        return p;
    }
    static double N4eeb37cd453(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 7.823180027253191) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 7.823180027253191) {
            p = 1;
        }
        return p;
    }
    static double N349c9c35454(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 2.6974013356055195) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 2.6974013356055195) {
            p = 0;
        }
        return p;
    }
    static double N15d3768f455(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 5.1604871846781455) {
            p = SpeechDetector.N6e0cb17a456(i);
        } else if (((Double) i[8]).doubleValue() > 5.1604871846781455) {
            p = 1;
        }
        return p;
    }
    static double N6e0cb17a456(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -0.2140608460347971) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -0.2140608460347971) {
            p = 1;
        }
        return p;
    }
    static double N357f908457(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -0.5828649729441164) {
            p = SpeechDetector.N49e7def458(i);
        } else if (((Double) i[11]).doubleValue() > -0.5828649729441164) {
            p = SpeechDetector.N259a19c1467(i);
        }
        return p;
    }
    static double N49e7def458(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 8.028923328544016) {
            p = SpeechDetector.N415dd847459(i);
        } else if (((Double) i[2]).doubleValue() > 8.028923328544016) {
            p = 0;
        }
        return p;
    }
    static double N415dd847459(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 3.5049706461373153) {
            p = SpeechDetector.N78223ed7460(i);
        } else if (((Double) i[8]).doubleValue() > 3.5049706461373153) {
            p = SpeechDetector.N2bacd397464(i);
        }
        return p;
    }
    static double N78223ed7460(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 3.09452587124406) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > 3.09452587124406) {
            p = SpeechDetector.N104bd2df461(i);
        }
        return p;
    }
    static double N104bd2df461(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 52.553995724795385) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 52.553995724795385) {
            p = SpeechDetector.N620136d4462(i);
        }
        return p;
    }
    static double N620136d4462(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 1.3113971964145916) {
            p = SpeechDetector.N3db6ca90463(i);
        } else if (((Double) i[8]).doubleValue() > 1.3113971964145916) {
            p = 1;
        }
        return p;
    }
    static double N3db6ca90463(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 4.81613982786559) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 4.81613982786559) {
            p = 1;
        }
        return p;
    }
    static double N2bacd397464(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 1.1813229229858895) {
            p = SpeechDetector.N5f7774e7465(i);
        } else if (((Double) i[3]).doubleValue() > 1.1813229229858895) {
            p = SpeechDetector.N1b9c1aa8466(i);
        }
        return p;
    }
    static double N5f7774e7465(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -2.994619782806833) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -2.994619782806833) {
            p = 1;
        }
        return p;
    }
    static double N1b9c1aa8466(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -1.2936461988217272) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -1.2936461988217272) {
            p = 1;
        }
        return p;
    }
    static double N259a19c1467(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -7.805884220609005) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -7.805884220609005) {
            p = SpeechDetector.N2810e130468(i);
        }
        return p;
    }
    static double N2810e130468(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 1.9468170568089513) {
            p = SpeechDetector.N6c302adc469(i);
        } else if (((Double) i[9]).doubleValue() > 1.9468170568089513) {
            p = SpeechDetector.N1ddb19c9486(i);
        }
        return p;
    }
    static double N6c302adc469(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 2.5824371281176637) {
            p = SpeechDetector.N4e4e0901470(i);
        } else if (((Double) i[10]).doubleValue() > 2.5824371281176637) {
            p = SpeechDetector.N3fbd8e0c483(i);
        }
        return p;
    }
    static double N4e4e0901470(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 2.2189739788287213) {
            p = SpeechDetector.N653148d0471(i);
        } else if (((Double) i[11]).doubleValue() > 2.2189739788287213) {
            p = SpeechDetector.N68cba2cd481(i);
        }
        return p;
    }
    static double N653148d0471(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 0.9397074294481178) {
            p = SpeechDetector.N6a38397472(i);
        } else if (((Double) i[5]).doubleValue() > 0.9397074294481178) {
            p = SpeechDetector.N3cd2640476(i);
        }
        return p;
    }
    static double N6a38397472(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -2.519429661016027) {
            p = SpeechDetector.N591431e8473(i);
        } else if (((Double) i[7]).doubleValue() > -2.519429661016027) {
            p = SpeechDetector.N3cd8a408474(i);
        }
        return p;
    }
    static double N591431e8473(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -0.9426466667130992) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -0.9426466667130992) {
            p = 1;
        }
        return p;
    }
    static double N3cd8a408474(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -4.663023282996537) {
            p = SpeechDetector.N32f9286d475(i);
        } else if (((Double) i[5]).doubleValue() > -4.663023282996537) {
            p = 0;
        }
        return p;
    }
    static double N32f9286d475(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 61.825458236374516) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 61.825458236374516) {
            p = 1;
        }
        return p;
    }
    static double N3cd2640476(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -5.784843767045546) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -5.784843767045546) {
            p = SpeechDetector.N118a35b3477(i);
        }
        return p;
    }
    static double N118a35b3477(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 3.164786383583154) {
            p = SpeechDetector.N8cb83c4478(i);
        } else if (((Double) i[5]).doubleValue() > 3.164786383583154) {
            p = 1;
        }
        return p;
    }
    static double N8cb83c4478(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 3.515666535949706) {
            p = SpeechDetector.N6937bd5e479(i);
        } else if (((Double) i[3]).doubleValue() > 3.515666535949706) {
            p = 0;
        }
        return p;
    }
    static double N6937bd5e479(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 5.948784612954324) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 5.948784612954324) {
            p = SpeechDetector.N4a719c49480(i);
        }
        return p;
    }
    static double N4a719c49480(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 0.9811373095530322) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > 0.9811373095530322) {
            p = 1;
        }
        return p;
    }
    static double N68cba2cd481(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 5.478616000999807) {
            p = SpeechDetector.N112d767b482(i);
        } else if (((Double) i[1]).doubleValue() > 5.478616000999807) {
            p = 0;
        }
        return p;
    }
    static double N112d767b482(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -2.1643066445087125) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -2.1643066445087125) {
            p = 1;
        }
        return p;
    }
    static double N3fbd8e0c483(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 0.7656450125271723) {
            p = SpeechDetector.N35b8d685484(i);
        } else if (((Double) i[9]).doubleValue() > 0.7656450125271723) {
            p = 1;
        }
        return p;
    }
    static double N35b8d685484(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -0.47103779638931254) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -0.47103779638931254) {
            p = SpeechDetector.N7a0bd150485(i);
        }
        return p;
    }
    static double N7a0bd150485(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 2.9313875105671308) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > 2.9313875105671308) {
            p = 1;
        }
        return p;
    }
    static double N1ddb19c9486(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 0.39444822207204605) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 0.39444822207204605) {
            p = SpeechDetector.N1b79ea6f487(i);
        }
        return p;
    }
    static double N1b79ea6f487(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -1.17168478840406) {
            p = SpeechDetector.N610e2b80488(i);
        } else if (((Double) i[6]).doubleValue() > -1.17168478840406) {
            p = 1;
        }
        return p;
    }
    static double N610e2b80488(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 1.83757146460329) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 1.83757146460329) {
            p = 0;
        }
        return p;
    }
    static double N694a1247489(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 4.480250475334315) {
            p = SpeechDetector.N7df62951490(i);
        } else if (((Double) i[2]).doubleValue() > 4.480250475334315) {
            p = SpeechDetector.Nd1fcc77497(i);
        }
        return p;
    }
    static double N7df62951490(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 61.085933886712716) {
            p = SpeechDetector.N2c12c572491(i);
        } else if (((Double) i[0]).doubleValue() > 61.085933886712716) {
            p = 0;
        }
        return p;
    }
    static double N2c12c572491(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 9.807828400121183) {
            p = SpeechDetector.N460d5f9492(i);
        } else if (((Double) i[1]).doubleValue() > 9.807828400121183) {
            p = 0;
        }
        return p;
    }
    static double N460d5f9492(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 3.3878207638521634) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 3.3878207638521634) {
            p = SpeechDetector.N717fd0ad493(i);
        }
        return p;
    }
    static double N717fd0ad493(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 2.1546850319799282) {
            p = SpeechDetector.N7e5d4811494(i);
        } else if (((Double) i[8]).doubleValue() > 2.1546850319799282) {
            p = 1;
        }
        return p;
    }
    static double N7e5d4811494(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -1.1750943722104497) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -1.1750943722104497) {
            p = SpeechDetector.N1e2694e7495(i);
        }
        return p;
    }
    static double N1e2694e7495(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 0.776864655063341) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 0.776864655063341) {
            p = SpeechDetector.N76f9d927496(i);
        }
        return p;
    }
    static double N76f9d927496(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -3.3213125476448684) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -3.3213125476448684) {
            p = 0;
        }
        return p;
    }
    static double Nd1fcc77497(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 4.773321009924137) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > 4.773321009924137) {
            p = SpeechDetector.N22a89f5c498(i);
        }
        return p;
    }
    static double N22a89f5c498(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 54.473940215385625) {
            p = SpeechDetector.N6c7662ca499(i);
        } else if (((Double) i[0]).doubleValue() > 54.473940215385625) {
            p = 0;
        }
        return p;
    }
    static double N6c7662ca499(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -1.2274069803603411) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -1.2274069803603411) {
            p = 1;
        }
        return p;
    }
    static double N504ff367500(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 2.8685377801004246) {
            p = SpeechDetector.N30f51862501(i);
        } else if (((Double) i[5]).doubleValue() > 2.8685377801004246) {
            p = 1;
        }
        return p;
    }
    static double N30f51862501(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 1.0446635470238597) {
            p = SpeechDetector.N2b13e30a502(i);
        } else if (((Double) i[10]).doubleValue() > 1.0446635470238597) {
            p = SpeechDetector.N4b42bd10507(i);
        }
        return p;
    }
    static double N2b13e30a502(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 4.413322306231625) {
            p = SpeechDetector.N269ebb9e503(i);
        } else if (((Double) i[1]).doubleValue() > 4.413322306231625) {
            p = 0;
        }
        return p;
    }
    static double N269ebb9e503(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 1.400290529088131) {
            p = SpeechDetector.N7f2f95e0504(i);
        } else if (((Double) i[5]).doubleValue() > 1.400290529088131) {
            p = 1;
        }
        return p;
    }
    static double N7f2f95e0504(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -0.20132431984025512) {
            p = SpeechDetector.Nd18e65c505(i);
        } else if (((Double) i[8]).doubleValue() > -0.20132431984025512) {
            p = 0;
        }
        return p;
    }
    static double Nd18e65c505(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 5.089134130236206) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 5.089134130236206) {
            p = SpeechDetector.N5dbba8bb506(i);
        }
        return p;
    }
    static double N5dbba8bb506(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 0.3099736338038557) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > 0.3099736338038557) {
            p = 1;
        }
        return p;
    }
    static double N4b42bd10507(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= -0.44652957781185254) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > -0.44652957781185254) {
            p = SpeechDetector.Na8a8c0a508(i);
        }
        return p;
    }
    static double Na8a8c0a508(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 3.5934475206545717) {
            p = SpeechDetector.Ndefe9ee509(i);
        } else if (((Double) i[7]).doubleValue() > 3.5934475206545717) {
            p = 0;
        }
        return p;
    }
    static double Ndefe9ee509(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 0.817366717344408) {
            p = SpeechDetector.N1e70f68510(i);
        } else if (((Double) i[6]).doubleValue() > 0.817366717344408) {
            p = SpeechDetector.N68a475d1511(i);
        }
        return p;
    }
    static double N1e70f68510(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 2.2087038565464945) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > 2.2087038565464945) {
            p = 1;
        }
        return p;
    }
    static double N68a475d1511(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 53.071970913208915) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 53.071970913208915) {
            p = SpeechDetector.N5332203512(i);
        }
        return p;
    }
    static double N5332203512(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 0.8462856184963324) {
            p = SpeechDetector.N5ffdf59f513(i);
        } else if (((Double) i[11]).doubleValue() > 0.8462856184963324) {
            p = 1;
        }
        return p;
    }
    static double N5ffdf59f513(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -0.9012166489024788) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -0.9012166489024788) {
            p = 0;
        }
        return p;
    }
}