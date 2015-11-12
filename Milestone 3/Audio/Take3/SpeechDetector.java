package edu.umass.cs.voice;

// Generated with Weka 3.6.13
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Wed Oct 28 18:32:10 EDT 2015

/*

       === Run information ===

       Scheme:weka.classifiers.trees.J48 -C 0.25 -M 2
       Relation:     speech
       Instances:    47600
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

       Correctly Classified Instances       41988               88.2101 %
       Incorrectly Classified Instances      5612               11.7899 %
       Kappa statistic                          0.6839
       Mean absolute error                      0.1422
       Root mean squared error                  0.3149
       Relative absolute error                 37.6295 %
       Root relative squared error             72.4509 %
       Total Number of Instances            47600     

       === Detailed Accuracy By Class ===

                      TP Rate   FP Rate   Precision   Recall  F-Measure   ROC Area  Class
                        0.747     0.072      0.778     0.747     0.762      0.881    true
                        0.928     0.253      0.916     0.928     0.922      0.881    false
       Weighted Avg.    0.882     0.207      0.881     0.882     0.881      0.881

       === Confusion Matrix ===

            a     b   <-- classified as
         8998  3042 |     a = true
         2570 32990 |     b = false

*/

import android.content.Context;

public class SpeechDetector {

    public static double classify(Object[] i)
            throws Exception {

    double p = Double.NaN;
    p = SpeechDetector.N324b7cd4946(i);
    return p;
  }
  static double N324b7cd4946(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 49.098627997796534) {
    p = SpeechDetector.N79f05c17947(i);
    } else if (((Double) i[0]).doubleValue() > 49.098627997796534) {
    p = SpeechDetector.N7e4ee5d1179(i);
    } 
    return p;
  }
  static double N79f05c17947(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -2.0969825338480903) {
    p = SpeechDetector.N132e288c948(i);
    } else if (((Double) i[5]).doubleValue() > -2.0969825338480903) {
    p = SpeechDetector.N60e6846b1103(i);
    } 
    return p;
  }
  static double N132e288c948(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 47.27843678950971) {
    p = SpeechDetector.N3b68092a949(i);
    } else if (((Double) i[0]).doubleValue() > 47.27843678950971) {
    p = SpeechDetector.N465a57511031(i);
    } 
    return p;
  }
  static double N3b68092a949(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= -0.47528949600690656) {
    p = SpeechDetector.N2b31c2de950(i);
    } else if (((Double) i[6]).doubleValue() > -0.47528949600690656) {
    p = SpeechDetector.N25a81332980(i);
    } 
    return p;
  }
  static double N2b31c2de950(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.04387673243848184) {
    p = SpeechDetector.N4ff092f9951(i);
    } else if (((Double) i[3]).doubleValue() > -0.04387673243848184) {
    p = SpeechDetector.N7974cb31963(i);
    } 
    return p;
  }
  static double N4ff092f9951(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.726817442687706) {
    p = SpeechDetector.N3b41426f952(i);
    } else if (((Double) i[4]).doubleValue() > 1.726817442687706) {
    p = SpeechDetector.N1071c498957(i);
    } 
    return p;
  }
  static double N3b41426f952(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -3.992942783608697) {
    p = SpeechDetector.N3970a3cd953(i);
    } else if (((Double) i[5]).doubleValue() > -3.992942783608697) {
      p = 1;
    } 
    return p;
  }
  static double N3970a3cd953(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 4.133350624019941) {
    p = SpeechDetector.N12120531954(i);
    } else if (((Double) i[8]).doubleValue() > 4.133350624019941) {
      p = 0;
    } 
    return p;
  }
  static double N12120531954(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -0.7342415282518967) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > -0.7342415282518967) {
    p = SpeechDetector.N5d12dd3b955(i);
    } 
    return p;
  }
  static double N5d12dd3b955(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 7.484148856802874) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 7.484148856802874) {
    p = SpeechDetector.N17a7c3a956(i);
    } 
    return p;
  }
  static double N17a7c3a956(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 5.737905467231864) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 5.737905467231864) {
      p = 1;
    } 
    return p;
  }
  static double N1071c498957(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -4.3179397445061225) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -4.3179397445061225) {
    p = SpeechDetector.N1d21df97958(i);
    } 
    return p;
  }
  static double N1d21df97958(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 46.48333195764745) {
    p = SpeechDetector.N1ade4172959(i);
    } else if (((Double) i[0]).doubleValue() > 46.48333195764745) {
    p = SpeechDetector.N372950c1962(i);
    } 
    return p;
  }
  static double N1ade4172959(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5.8832878854501836) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 5.8832878854501836) {
    p = SpeechDetector.N759ab125960(i);
    } 
    return p;
  }
  static double N759ab125960(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -3.025179210863485) {
    p = SpeechDetector.N7ee43074961(i);
    } else if (((Double) i[5]).doubleValue() > -3.025179210863485) {
      p = 1;
    } 
    return p;
  }
  static double N7ee43074961(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -0.4053196656566282) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > -0.4053196656566282) {
      p = 0;
    } 
    return p;
  }
  static double N372950c1962(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.7251490114656992) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -0.7251490114656992) {
      p = 0;
    } 
    return p;
  }
  static double N7974cb31963(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -3.4623225982136203) {
    p = SpeechDetector.N62c83c42964(i);
    } else if (((Double) i[5]).doubleValue() > -3.4623225982136203) {
    p = SpeechDetector.N685209eb966(i);
    } 
    return p;
  }
  static double N62c83c42964(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -1.6384936471465499) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > -1.6384936471465499) {
    p = SpeechDetector.N47ec43b8965(i);
    } 
    return p;
  }
  static double N47ec43b8965(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -0.863575281155251) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -0.863575281155251) {
      p = 0;
    } 
    return p;
  }
  static double N685209eb966(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.9236525223374028) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 0.9236525223374028) {
    p = SpeechDetector.N620958ce967(i);
    } 
    return p;
  }
  static double N620958ce967(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -0.40882233783245886) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -0.40882233783245886) {
    p = SpeechDetector.N53a56eaa968(i);
    } 
    return p;
  }
  static double N53a56eaa968(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.969083914619592) {
    p = SpeechDetector.N120485cd969(i);
    } else if (((Double) i[3]).doubleValue() > 0.969083914619592) {
    p = SpeechDetector.N21e29986976(i);
    } 
    return p;
  }
  static double N120485cd969(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 45.953525712141186) {
    p = SpeechDetector.N66ec5ef8970(i);
    } else if (((Double) i[0]).doubleValue() > 45.953525712141186) {
    p = SpeechDetector.N284f2092971(i);
    } 
    return p;
  }
  static double N66ec5ef8970(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 1.6118230731918513) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 1.6118230731918513) {
      p = 0;
    } 
    return p;
  }
  static double N284f2092971(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.9633948754123822) {
    p = SpeechDetector.N62e365ea972(i);
    } else if (((Double) i[4]).doubleValue() > 1.9633948754123822) {
    p = SpeechDetector.N7bc7e3be974(i);
    } 
    return p;
  }
  static double N62e365ea972(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -0.9665806339276444) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > -0.9665806339276444) {
    p = SpeechDetector.N3f38185e973(i);
    } 
    return p;
  }
  static double N3f38185e973(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -0.7796407285323528) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -0.7796407285323528) {
      p = 1;
    } 
    return p;
  }
  static double N7bc7e3be974(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -1.186311400007155) {
    p = SpeechDetector.N390e6f975(i);
    } else if (((Double) i[10]).doubleValue() > -1.186311400007155) {
      p = 0;
    } 
    return p;
  }
  static double N390e6f975(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 7.9922510656159025) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 7.9922510656159025) {
      p = 1;
    } 
    return p;
  }
  static double N21e29986976(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -2.3352387910742607) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > -2.3352387910742607) {
    p = SpeechDetector.N23cd3dcb977(i);
    } 
    return p;
  }
  static double N23cd3dcb977(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 0.5463818550260963) {
    p = SpeechDetector.N7793ecc9978(i);
    } else if (((Double) i[11]).doubleValue() > 0.5463818550260963) {
      p = 1;
    } 
    return p;
  }
  static double N7793ecc9978(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 47.083059652547085) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 47.083059652547085) {
    p = SpeechDetector.N109ebd74979(i);
    } 
    return p;
  }
  static double N109ebd74979(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.4436395421038553) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 2.4436395421038553) {
      p = 0;
    } 
    return p;
  }
  static double N25a81332980(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.651912324604459) {
    p = SpeechDetector.N3d844aee981(i);
    } else if (((Double) i[3]).doubleValue() > 0.651912324604459) {
    p = SpeechDetector.N6f90a386999(i);
    } 
    return p;
  }
  static double N3d844aee981(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.4008802623007774) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 1.4008802623007774) {
    p = SpeechDetector.N38536ecf982(i);
    } 
    return p;
  }
  static double N38536ecf982(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 44.5960942173335) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 44.5960942173335) {
    p = SpeechDetector.N6d8ff4ec983(i);
    } 
    return p;
  }
  static double N6d8ff4ec983(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 0.114359319924655) {
    p = SpeechDetector.N618ea26984(i);
    } else if (((Double) i[10]).doubleValue() > 0.114359319924655) {
    p = SpeechDetector.N516c33bf995(i);
    } 
    return p;
  }
  static double N618ea26984(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 7.947954368744454) {
    p = SpeechDetector.N4db467ea985(i);
    } else if (((Double) i[1]).doubleValue() > 7.947954368744454) {
    p = SpeechDetector.N56ba1c24988(i);
    } 
    return p;
  }
  static double N4db467ea985(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -2.6344464068663735) {
    p = SpeechDetector.N7f125b80986(i);
    } else if (((Double) i[5]).doubleValue() > -2.6344464068663735) {
      p = 1;
    } 
    return p;
  }
  static double N7f125b80986(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -3.1352741290577315) {
    p = SpeechDetector.Ne3571ad987(i);
    } else if (((Double) i[5]).doubleValue() > -3.1352741290577315) {
      p = 0;
    } 
    return p;
  }
  static double Ne3571ad987(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 2.2610556719676103) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 2.2610556719676103) {
      p = 0;
    } 
    return p;
  }
  static double N56ba1c24988(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.2321410674103282) {
    p = SpeechDetector.N548dabf7989(i);
    } else if (((Double) i[6]).doubleValue() > 0.2321410674103282) {
      p = 1;
    } 
    return p;
  }
  static double N548dabf7989(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -4.167982450732544) {
    p = SpeechDetector.N2115107f990(i);
    } else if (((Double) i[5]).doubleValue() > -4.167982450732544) {
    p = SpeechDetector.N6dee12d0991(i);
    } 
    return p;
  }
  static double N2115107f990(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -2.0496704480716916) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > -2.0496704480716916) {
      p = 0;
    } 
    return p;
  }
  static double N6dee12d0991(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 2.3944699563436442) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 2.3944699563436442) {
    p = SpeechDetector.N29154e12992(i);
    } 
    return p;
  }
  static double N29154e12992(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 2.7144301475764743) {
    p = SpeechDetector.N35b894d0993(i);
    } else if (((Double) i[4]).doubleValue() > 2.7144301475764743) {
      p = 1;
    } 
    return p;
  }
  static double N35b894d0993(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 46.52966863358957) {
    p = SpeechDetector.N6931ff3d994(i);
    } else if (((Double) i[0]).doubleValue() > 46.52966863358957) {
      p = 0;
    } 
    return p;
  }
  static double N6931ff3d994(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.4388042779426297) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -0.4388042779426297) {
      p = 0;
    } 
    return p;
  }
  static double N516c33bf995(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.5094306476395369) {
    p = SpeechDetector.N16b96a5c996(i);
    } else if (((Double) i[6]).doubleValue() > 0.5094306476395369) {
      p = 1;
    } 
    return p;
  }
  static double N16b96a5c996(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 46.17827879641072) {
    p = SpeechDetector.N66f5c9ab997(i);
    } else if (((Double) i[0]).doubleValue() > 46.17827879641072) {
      p = 0;
    } 
    return p;
  }
  static double N66f5c9ab997(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 8.289322024416808) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 8.289322024416808) {
    p = SpeechDetector.N128b2e5c998(i);
    } 
    return p;
  }
  static double N128b2e5c998(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 6.320835172614269) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 6.320835172614269) {
      p = 0;
    } 
    return p;
  }
  static double N6f90a386999(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.8742917900602265) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 6.8742917900602265) {
    p = SpeechDetector.Ndfeba31000(i);
    } 
    return p;
  }
  static double Ndfeba31000(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 2.151383589386569) {
    p = SpeechDetector.N6ce71ac71001(i);
    } else if (((Double) i[4]).doubleValue() > 2.151383589386569) {
    p = SpeechDetector.N5e28c21c1018(i);
    } 
    return p;
  }
  static double N6ce71ac71001(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -0.9690965612663043) {
    p = SpeechDetector.N388f36ac1002(i);
    } else if (((Double) i[10]).doubleValue() > -0.9690965612663043) {
    p = SpeechDetector.N5ddcc44c1007(i);
    } 
    return p;
  }
  static double N388f36ac1002(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 1.5513769482689783) {
    p = SpeechDetector.N424e73361003(i);
    } else if (((Double) i[6]).doubleValue() > 1.5513769482689783) {
      p = 1;
    } 
    return p;
  }
  static double N424e73361003(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -0.06070206850123177) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > -0.06070206850123177) {
    p = SpeechDetector.N2c6e003c1004(i);
    } 
    return p;
  }
  static double N2c6e003c1004(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.330255130172765) {
    p = SpeechDetector.N69d179ed1005(i);
    } else if (((Double) i[9]).doubleValue() > 0.330255130172765) {
      p = 0;
    } 
    return p;
  }
  static double N69d179ed1005(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -4.160890520836247) {
    p = SpeechDetector.N379bece11006(i);
    } else if (((Double) i[5]).doubleValue() > -4.160890520836247) {
      p = 1;
    } 
    return p;
  }
  static double N379bece11006(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -0.5570361955416664) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -0.5570361955416664) {
      p = 0;
    } 
    return p;
  }
  static double N5ddcc44c1007(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -3.951402369370558) {
    p = SpeechDetector.N48db89b81008(i);
    } else if (((Double) i[5]).doubleValue() > -3.951402369370558) {
    p = SpeechDetector.N51f765181013(i);
    } 
    return p;
  }
  static double N48db89b81008(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.21865986960316) {
    p = SpeechDetector.N452eb4661009(i);
    } else if (((Double) i[4]).doubleValue() > 1.21865986960316) {
      p = 0;
    } 
    return p;
  }
  static double N452eb4661009(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 3.34276550759237) {
    p = SpeechDetector.N7d45b8051010(i);
    } else if (((Double) i[7]).doubleValue() > 3.34276550759237) {
      p = 1;
    } 
    return p;
  }
  static double N7d45b8051010(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -0.9218721694426363) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -0.9218721694426363) {
    p = SpeechDetector.N6c3490831011(i);
    } 
    return p;
  }
  static double N6c3490831011(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 1.06700905083762) {
    p = SpeechDetector.N6efbbff41012(i);
    } else if (((Double) i[4]).doubleValue() > 1.06700905083762) {
      p = 1;
    } 
    return p;
  }
  static double N6efbbff41012(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -2.9767645065515422) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > -2.9767645065515422) {
      p = 0;
    } 
    return p;
  }
  static double N51f765181013(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -2.1655649107770674) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > -2.1655649107770674) {
    p = SpeechDetector.N490e34b21014(i);
    } 
    return p;
  }
  static double N490e34b21014(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 3.4608478680420616) {
    p = SpeechDetector.N43a5b7961015(i);
    } else if (((Double) i[8]).doubleValue() > 3.4608478680420616) {
      p = 1;
    } 
    return p;
  }
  static double N43a5b7961015(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -3.0839414384622628) {
    p = SpeechDetector.N34b7fb8c1016(i);
    } else if (((Double) i[5]).doubleValue() > -3.0839414384622628) {
      p = 1;
    } 
    return p;
  }
  static double N34b7fb8c1016(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 2.336306697093308) {
    p = SpeechDetector.N1ae3bf5e1017(i);
    } else if (((Double) i[6]).doubleValue() > 2.336306697093308) {
      p = 1;
    } 
    return p;
  }
  static double N1ae3bf5e1017(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 1.6702935779225898) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > 1.6702935779225898) {
      p = 1;
    } 
    return p;
  }
  static double N5e28c21c1018(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -1.7349233906554442) {
    p = SpeechDetector.N45dfec8f1019(i);
    } else if (((Double) i[10]).doubleValue() > -1.7349233906554442) {
    p = SpeechDetector.N7023c41f1020(i);
    } 
    return p;
  }
  static double N45dfec8f1019(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 3.119215806240462) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 3.119215806240462) {
      p = 0;
    } 
    return p;
  }
  static double N7023c41f1020(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 2.1712109166755558) {
    p = SpeechDetector.N3c2108bd1021(i);
    } else if (((Double) i[3]).doubleValue() > 2.1712109166755558) {
      p = 0;
    } 
    return p;
  }
  static double N3c2108bd1021(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 2.7158912201065615) {
    p = SpeechDetector.N1cc4cf221022(i);
    } else if (((Double) i[4]).doubleValue() > 2.7158912201065615) {
    p = SpeechDetector.N8d837e41027(i);
    } 
    return p;
  }
  static double N1cc4cf221022(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 6.3580813583305105) {
    p = SpeechDetector.N3cfacfef1023(i);
    } else if (((Double) i[2]).doubleValue() > 6.3580813583305105) {
      p = 1;
    } 
    return p;
  }
  static double N3cfacfef1023(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -4.274076469865871) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -4.274076469865871) {
    p = SpeechDetector.N7669732f1024(i);
    } 
    return p;
  }
  static double N7669732f1024(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -0.4013355075280212) {
    p = SpeechDetector.N5094f651025(i);
    } else if (((Double) i[11]).doubleValue() > -0.4013355075280212) {
      p = 1;
    } 
    return p;
  }
  static double N5094f651025(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.6046708739985752) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -0.6046708739985752) {
    p = SpeechDetector.N263b72781026(i);
    } 
    return p;
  }
  static double N263b72781026(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 8.493565157445738) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 8.493565157445738) {
      p = 1;
    } 
    return p;
  }
  static double N8d837e41027(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.4987486579629726) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.4987486579629726) {
    p = SpeechDetector.N2b3d5e451028(i);
    } 
    return p;
  }
  static double N2b3d5e451028(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 0.04921571791651285) {
    p = SpeechDetector.N49f81a301029(i);
    } else if (((Double) i[11]).doubleValue() > 0.04921571791651285) {
      p = 1;
    } 
    return p;
  }
  static double N49f81a301029(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 1.2315708552685638) {
    p = SpeechDetector.N3f7f6b401030(i);
    } else if (((Double) i[3]).doubleValue() > 1.2315708552685638) {
      p = 0;
    } 
    return p;
  }
  static double N3f7f6b401030(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -0.6158777515621172) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -0.6158777515621172) {
      p = 1;
    } 
    return p;
  }
  static double N465a57511031(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.4962140902235051) {
    p = SpeechDetector.N551aaaec1032(i);
    } else if (((Double) i[6]).doubleValue() > 0.4962140902235051) {
    p = SpeechDetector.N273a03b41062(i);
    } 
    return p;
  }
  static double N551aaaec1032(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 1.0377271100508676) {
    p = SpeechDetector.N49cb979a1033(i);
    } else if (((Double) i[3]).doubleValue() > 1.0377271100508676) {
    p = SpeechDetector.N542c998f1051(i);
    } 
    return p;
  }
  static double N49cb979a1033(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -3.476112425785734) {
    p = SpeechDetector.N554e254f1034(i);
    } else if (((Double) i[5]).doubleValue() > -3.476112425785734) {
    p = SpeechDetector.N5a3cd7981043(i);
    } 
    return p;
  }
  static double N554e254f1034(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 1.1845925972061304) {
    p = SpeechDetector.N7d7391491035(i);
    } else if (((Double) i[9]).doubleValue() > 1.1845925972061304) {
      p = 0;
    } 
    return p;
  }
  static double N7d7391491035(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -0.2952735364912344) {
    p = SpeechDetector.N2e478ff71036(i);
    } else if (((Double) i[4]).doubleValue() > -0.2952735364912344) {
    p = SpeechDetector.N5c3cb8dd1037(i);
    } 
    return p;
  }
  static double N2e478ff71036(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -6.205704818576061) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -6.205704818576061) {
      p = 1;
    } 
    return p;
  }
  static double N5c3cb8dd1037(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -1.5541220817720385) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -1.5541220817720385) {
    p = SpeechDetector.N168ce47a1038(i);
    } 
    return p;
  }
  static double N168ce47a1038(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 0.17905949907432087) {
    p = SpeechDetector.N7bec11261039(i);
    } else if (((Double) i[10]).doubleValue() > 0.17905949907432087) {
      p = 0;
    } 
    return p;
  }
  static double N7bec11261039(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -0.08008651520248364) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -0.08008651520248364) {
    p = SpeechDetector.N475a15591040(i);
    } 
    return p;
  }
  static double N475a15591040(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 1.705591625168693) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > 1.705591625168693) {
    p = SpeechDetector.N6b2faaa71041(i);
    } 
    return p;
  }
  static double N6b2faaa71041(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 47.401756709187424) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 47.401756709187424) {
    p = SpeechDetector.N66cf0eb1042(i);
    } 
    return p;
  }
  static double N66cf0eb1042(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 6.114337007207929) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 6.114337007207929) {
      p = 0;
    } 
    return p;
  }
  static double N5a3cd7981043(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.08282367902301178) {
    p = SpeechDetector.N506e6a701044(i);
    } else if (((Double) i[4]).doubleValue() > 0.08282367902301178) {
    p = SpeechDetector.N107203001049(i);
    } 
    return p;
  }
  static double N506e6a701044(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 1.8109589129486843) {
    p = SpeechDetector.N10e08511045(i);
    } else if (((Double) i[9]).doubleValue() > 1.8109589129486843) {
    p = SpeechDetector.N252e82621048(i);
    } 
    return p;
  }
  static double N10e08511045(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 48.53095506359777) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 48.53095506359777) {
    p = SpeechDetector.N4043fe611046(i);
    } 
    return p;
  }
  static double N4043fe611046(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -0.8202170014053464) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > -0.8202170014053464) {
    p = SpeechDetector.N2ff1b33d1047(i);
    } 
    return p;
  }
  static double N2ff1b33d1047(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -1.3428917732935048) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -1.3428917732935048) {
      p = 1;
    } 
    return p;
  }
  static double N252e82621048(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -0.4535267554711167) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -0.4535267554711167) {
      p = 1;
    } 
    return p;
  }
  static double N107203001049(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 2.342248388419356) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 2.342248388419356) {
    p = SpeechDetector.N2d22fd6f1050(i);
    } 
    return p;
  }
  static double N2d22fd6f1050(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 2.9519072443492758) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 2.9519072443492758) {
      p = 0;
    } 
    return p;
  }
  static double N542c998f1051(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -0.6042643886276492) {
    p = SpeechDetector.N3c15a6751052(i);
    } else if (((Double) i[11]).doubleValue() > -0.6042643886276492) {
    p = SpeechDetector.N35b5f86b1059(i);
    } 
    return p;
  }
  static double N3c15a6751052(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 2.47314705908163) {
    p = SpeechDetector.N31636a241053(i);
    } else if (((Double) i[3]).doubleValue() > 2.47314705908163) {
    p = SpeechDetector.Nd6401461057(i);
    } 
    return p;
  }
  static double N31636a241053(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 6.813420145457011) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 6.813420145457011) {
    p = SpeechDetector.N75cd7ad01054(i);
    } 
    return p;
  }
  static double N75cd7ad01054(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -1.9788343129936456) {
    p = SpeechDetector.N53a2a1c1055(i);
    } else if (((Double) i[10]).doubleValue() > -1.9788343129936456) {
      p = 0;
    } 
    return p;
  }
  static double N53a2a1c1055(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.7296189171955996) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 1.7296189171955996) {
    p = SpeechDetector.N2da296f21056(i);
    } 
    return p;
  }
  static double N2da296f21056(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -2.505339697562817) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -2.505339697562817) {
      p = 1;
    } 
    return p;
  }
  static double Nd6401461057(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 4.738818363532023) {
    p = SpeechDetector.N208fa1881058(i);
    } else if (((Double) i[2]).doubleValue() > 4.738818363532023) {
      p = 0;
    } 
    return p;
  }
  static double N208fa1881058(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= -0.7417336091483285) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > -0.7417336091483285) {
      p = 0;
    } 
    return p;
  }
  static double N35b5f86b1059(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -0.0067324433677057715) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -0.0067324433677057715) {
    p = SpeechDetector.N3dc854591060(i);
    } 
    return p;
  }
  static double N3dc854591060(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5.212056544163853) {
    p = SpeechDetector.N2b19bebf1061(i);
    } else if (((Double) i[2]).doubleValue() > 5.212056544163853) {
      p = 0;
    } 
    return p;
  }
  static double N2b19bebf1061(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 7.330606957119766) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 7.330606957119766) {
      p = 1;
    } 
    return p;
  }
  static double N273a03b41062(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 1.656543154260465) {
    p = SpeechDetector.N51c9328a1063(i);
    } else if (((Double) i[10]).doubleValue() > 1.656543154260465) {
    p = SpeechDetector.N54de947c1102(i);
    } 
    return p;
  }
  static double N51c9328a1063(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.6658801144969195) {
    p = SpeechDetector.N70152bf81064(i);
    } else if (((Double) i[3]).doubleValue() > 2.6658801144969195) {
    p = SpeechDetector.N3b57fb0b1093(i);
    } 
    return p;
  }
  static double N70152bf81064(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 8.47918992360353) {
    p = SpeechDetector.N7df9e0441065(i);
    } else if (((Double) i[1]).doubleValue() > 8.47918992360353) {
    p = SpeechDetector.N2a7d1a471079(i);
    } 
    return p;
  }
  static double N7df9e0441065(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.4561372442484528) {
    p = SpeechDetector.N1ff2d0f91066(i);
    } else if (((Double) i[4]).doubleValue() > 1.4561372442484528) {
    p = SpeechDetector.N66b1675d1074(i);
    } 
    return p;
  }
  static double N1ff2d0f91066(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5.429835632421448) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 5.429835632421448) {
    p = SpeechDetector.N7e759bd11067(i);
    } 
    return p;
  }
  static double N7e759bd11067(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -2.564632417907959) {
    p = SpeechDetector.N5b48f7331068(i);
    } else if (((Double) i[5]).doubleValue() > -2.564632417907959) {
      p = 1;
    } 
    return p;
  }
  static double N5b48f7331068(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 47.5667862206453) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 47.5667862206453) {
    p = SpeechDetector.N135d64171069(i);
    } 
    return p;
  }
  static double N135d64171069(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.7689188491104825) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.7689188491104825) {
    p = SpeechDetector.N58562bef1070(i);
    } 
    return p;
  }
  static double N58562bef1070(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 5.62848224129907) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 5.62848224129907) {
    p = SpeechDetector.N15e85381071(i);
    } 
    return p;
  }
  static double N15e85381071(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 2.6734588745511703) {
    p = SpeechDetector.N647c203b1072(i);
    } else if (((Double) i[7]).doubleValue() > 2.6734588745511703) {
      p = 0;
    } 
    return p;
  }
  static double N647c203b1072(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -1.9669156043711877) {
    p = SpeechDetector.N112835071073(i);
    } else if (((Double) i[11]).doubleValue() > -1.9669156043711877) {
      p = 1;
    } 
    return p;
  }
  static double N112835071073(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 2.7725928287289485) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 2.7725928287289485) {
      p = 1;
    } 
    return p;
  }
  static double N66b1675d1074(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 4.628674192979545) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 4.628674192979545) {
    p = SpeechDetector.N8f93f571075(i);
    } 
    return p;
  }
  static double N8f93f571075(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -1.0191430202514662) {
    p = SpeechDetector.N23ad6d5b1076(i);
    } else if (((Double) i[11]).doubleValue() > -1.0191430202514662) {
      p = 0;
    } 
    return p;
  }
  static double N23ad6d5b1076(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -2.5669853397402633) {
    p = SpeechDetector.N4ee683a91077(i);
    } else if (((Double) i[5]).doubleValue() > -2.5669853397402633) {
      p = 1;
    } 
    return p;
  }
  static double N4ee683a91077(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -0.4063833745651604) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > -0.4063833745651604) {
    p = SpeechDetector.N7fcdf4b61078(i);
    } 
    return p;
  }
  static double N7fcdf4b61078(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 48.495720967371966) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 48.495720967371966) {
      p = 1;
    } 
    return p;
  }
  static double N2a7d1a471079(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -3.676731787174059) {
    p = SpeechDetector.N7b48411b1080(i);
    } else if (((Double) i[5]).doubleValue() > -3.676731787174059) {
    p = SpeechDetector.N7b8a0fd11084(i);
    } 
    return p;
  }
  static double N7b48411b1080(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 48.12718068298338) {
    p = SpeechDetector.N44aa92d81081(i);
    } else if (((Double) i[0]).doubleValue() > 48.12718068298338) {
      p = 0;
    } 
    return p;
  }
  static double N44aa92d81081(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 9.350036511805373) {
    p = SpeechDetector.N1a8ec6201082(i);
    } else if (((Double) i[1]).doubleValue() > 9.350036511805373) {
      p = 0;
    } 
    return p;
  }
  static double N1a8ec6201082(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5.062249010699992) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 5.062249010699992) {
    p = SpeechDetector.N13716c7f1083(i);
    } 
    return p;
  }
  static double N13716c7f1083(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 1.2900650610117659) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 1.2900650610117659) {
      p = 1;
    } 
    return p;
  }
  static double N7b8a0fd11084(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -0.04931128805346184) {
    p = SpeechDetector.N2514a1b41085(i);
    } else if (((Double) i[11]).doubleValue() > -0.04931128805346184) {
    p = SpeechDetector.N6b47265e1090(i);
    } 
    return p;
  }
  static double N2514a1b41085(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 2.3910121211476256) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 2.3910121211476256) {
    p = SpeechDetector.N6d8443701086(i);
    } 
    return p;
  }
  static double N6d8443701086(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 9.107268032542375) {
    p = SpeechDetector.N667a63c1087(i);
    } else if (((Double) i[1]).doubleValue() > 9.107268032542375) {
      p = 1;
    } 
    return p;
  }
  static double N667a63c1087(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 0.08796651356244223) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > 0.08796651356244223) {
    p = SpeechDetector.N7ed2b06c1088(i);
    } 
    return p;
  }
  static double N7ed2b06c1088(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 2.659310864826131) {
    p = SpeechDetector.N3a3cc3801089(i);
    } else if (((Double) i[7]).doubleValue() > 2.659310864826131) {
      p = 1;
    } 
    return p;
  }
  static double N3a3cc3801089(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5.531207157207611) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 5.531207157207611) {
      p = 0;
    } 
    return p;
  }
  static double N6b47265e1090(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 6.364733219274551) {
    p = SpeechDetector.Nc281c581091(i);
    } else if (((Double) i[2]).doubleValue() > 6.364733219274551) {
      p = 1;
    } 
    return p;
  }
  static double Nc281c581091(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 3.485571465764636) {
    p = SpeechDetector.N1d5cdba41092(i);
    } else if (((Double) i[8]).doubleValue() > 3.485571465764636) {
      p = 1;
    } 
    return p;
  }
  static double N1d5cdba41092(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.7772284795625385) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -0.7772284795625385) {
      p = 0;
    } 
    return p;
  }
  static double N3b57fb0b1093(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 2.956247633936354) {
    p = SpeechDetector.Nd22ad9d1094(i);
    } else if (((Double) i[6]).doubleValue() > 2.956247633936354) {
    p = SpeechDetector.N643ec49e1101(i);
    } 
    return p;
  }
  static double Nd22ad9d1094(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -4.108271471299224) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > -4.108271471299224) {
    p = SpeechDetector.N5fb425271095(i);
    } 
    return p;
  }
  static double N5fb425271095(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -1.1088295805741613) {
    p = SpeechDetector.N2bf354871096(i);
    } else if (((Double) i[11]).doubleValue() > -1.1088295805741613) {
      p = 0;
    } 
    return p;
  }
  static double N2bf354871096(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.8232035130023946) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 0.8232035130023946) {
    p = SpeechDetector.N7432819b1097(i);
    } 
    return p;
  }
  static double N7432819b1097(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 8.223474049045336) {
    p = SpeechDetector.N1fdb22b61098(i);
    } else if (((Double) i[1]).doubleValue() > 8.223474049045336) {
      p = 0;
    } 
    return p;
  }
  static double N1fdb22b61098(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -3.6254819688926383) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -3.6254819688926383) {
    p = SpeechDetector.N6bc3eb101099(i);
    } 
    return p;
  }
  static double N6bc3eb101099(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 7.690869805805006) {
    p = SpeechDetector.Nb7d9eb61100(i);
    } else if (((Double) i[1]).doubleValue() > 7.690869805805006) {
      p = 1;
    } 
    return p;
  }
  static double Nb7d9eb61100(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.841644017263888) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 2.841644017263888) {
      p = 0;
    } 
    return p;
  }
  static double N643ec49e1101(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.4454039397332152) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 0.4454039397332152) {
      p = 0;
    } 
    return p;
  }
  static double N54de947c1102(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 48.18417032349436) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 48.18417032349436) {
      p = 0;
    } 
    return p;
  }
  static double N60e6846b1103(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 47.37361731536619) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 47.37361731536619) {
    p = SpeechDetector.N3dffbe801104(i);
    } 
    return p;
  }
  static double N3dffbe801104(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 2.3206125966272535) {
    p = SpeechDetector.N6133e54c1105(i);
    } else if (((Double) i[4]).doubleValue() > 2.3206125966272535) {
    p = SpeechDetector.N6861f1d1157(i);
    } 
    return p;
  }
  static double N6133e54c1105(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 1.7286896193078722) {
    p = SpeechDetector.N1613126f1106(i);
    } else if (((Double) i[3]).doubleValue() > 1.7286896193078722) {
    p = SpeechDetector.N4cb556a61133(i);
    } 
    return p;
  }
  static double N1613126f1106(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.7311582936164562) {
    p = SpeechDetector.N3e1f40bb1107(i);
    } else if (((Double) i[5]).doubleValue() > -0.7311582936164562) {
      p = 1;
    } 
    return p;
  }
  static double N3e1f40bb1107(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 48.41986958691597) {
    p = SpeechDetector.N75d2d4d91108(i);
    } else if (((Double) i[0]).doubleValue() > 48.41986958691597) {
    p = SpeechDetector.N2b85f9e61113(i);
    } 
    return p;
  }
  static double N75d2d4d91108(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.8980092798236369) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 0.8980092798236369) {
    p = SpeechDetector.N64942efd1109(i);
    } 
    return p;
  }
  static double N64942efd1109(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -1.4592250322811275) {
    p = SpeechDetector.N3c9917a11110(i);
    } else if (((Double) i[5]).doubleValue() > -1.4592250322811275) {
      p = 1;
    } 
    return p;
  }
  static double N3c9917a11110(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 2.406555290184206) {
    p = SpeechDetector.N66de6a1b1111(i);
    } else if (((Double) i[8]).doubleValue() > 2.406555290184206) {
      p = 1;
    } 
    return p;
  }
  static double N66de6a1b1111(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 47.40505841258315) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 47.40505841258315) {
    p = SpeechDetector.N140847601112(i);
    } 
    return p;
  }
  static double N140847601112(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 2.2796438894472124) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > 2.2796438894472124) {
      p = 0;
    } 
    return p;
  }
  static double N2b85f9e61113(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.9881563857612229) {
    p = SpeechDetector.N68d9815c1114(i);
    } else if (((Double) i[6]).doubleValue() > 0.9881563857612229) {
      p = 1;
    } 
    return p;
  }
  static double N68d9815c1114(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= 0.7080342005404429) {
    p = SpeechDetector.N1fbbf4cb1115(i);
    } else if (((Double) i[11]).doubleValue() > 0.7080342005404429) {
    p = SpeechDetector.N6716c4291131(i);
    } 
    return p;
  }
  static double N1fbbf4cb1115(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.4385508316419447) {
    p = SpeechDetector.N6cc44bb31116(i);
    } else if (((Double) i[9]).doubleValue() > 0.4385508316419447) {
    p = SpeechDetector.N13d455831122(i);
    } 
    return p;
  }
  static double N6cc44bb31116(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -1.1513383269680952) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > -1.1513383269680952) {
    p = SpeechDetector.N4b460c8e1117(i);
    } 
    return p;
  }
  static double N4b460c8e1117(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.7755163437790287) {
    p = SpeechDetector.N63e2653d1118(i);
    } else if (((Double) i[3]).doubleValue() > 0.7755163437790287) {
    p = SpeechDetector.N2464bb061119(i);
    } 
    return p;
  }
  static double N63e2653d1118(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -2.7095402202608825) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -2.7095402202608825) {
      p = 1;
    } 
    return p;
  }
  static double N2464bb061119(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.3053351576457077) {
    p = SpeechDetector.N513299941120(i);
    } else if (((Double) i[9]).doubleValue() > -0.3053351576457077) {
      p = 1;
    } 
    return p;
  }
  static double N513299941120(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -0.460868800488061) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -0.460868800488061) {
    p = SpeechDetector.N5100ed311121(i);
    } 
    return p;
  }
  static double N5100ed311121(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -1.0909304776509396) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -1.0909304776509396) {
      p = 1;
    } 
    return p;
  }
  static double N13d455831122(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 0.6611077143906183) {
    p = SpeechDetector.N593a15a01123(i);
    } else if (((Double) i[9]).doubleValue() > 0.6611077143906183) {
    p = SpeechDetector.N481134861125(i);
    } 
    return p;
  }
  static double N593a15a01123(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -3.0453987052520417) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > -3.0453987052520417) {
    p = SpeechDetector.N7461e9231124(i);
    } 
    return p;
  }
  static double N7461e9231124(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.8253645894351346) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.8253645894351346) {
      p = 1;
    } 
    return p;
  }
  static double N481134861125(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.05061112740809193) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -0.05061112740809193) {
    p = SpeechDetector.N618f6e601126(i);
    } 
    return p;
  }
  static double N618f6e601126(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 3.3950021385976665) {
    p = SpeechDetector.Nf9792aa1127(i);
    } else if (((Double) i[8]).doubleValue() > 3.3950021385976665) {
      p = 1;
    } 
    return p;
  }
  static double Nf9792aa1127(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 2.1274256401502143) {
    p = SpeechDetector.N281ddee51128(i);
    } else if (((Double) i[7]).doubleValue() > 2.1274256401502143) {
      p = 0;
    } 
    return p;
  }
  static double N281ddee51128(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.4336972138700927) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 0.4336972138700927) {
    p = SpeechDetector.N4114a0f61129(i);
    } 
    return p;
  }
  static double N4114a0f61129(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.43623467764838575) {
    p = SpeechDetector.N315397db1130(i);
    } else if (((Double) i[6]).doubleValue() > 0.43623467764838575) {
      p = 0;
    } 
    return p;
  }
  static double N315397db1130(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 48.516071438080665) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 48.516071438080665) {
      p = 1;
    } 
    return p;
  }
  static double N6716c4291131(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 48.92650992445932) {
    p = SpeechDetector.N7a8949f1132(i);
    } else if (((Double) i[0]).doubleValue() > 48.92650992445932) {
      p = 0;
    } 
    return p;
  }
  static double N7a8949f1132(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 4.638842184486464) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 4.638842184486464) {
      p = 1;
    } 
    return p;
  }
  static double N4cb556a61133(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -0.7942459209120329) {
    p = SpeechDetector.N154bd3a21134(i);
    } else if (((Double) i[6]).doubleValue() > -0.7942459209120329) {
    p = SpeechDetector.N160bba3f1142(i);
    } 
    return p;
  }
  static double N154bd3a21134(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -1.301942116454952) {
    p = SpeechDetector.N25333b9a1135(i);
    } else if (((Double) i[5]).doubleValue() > -1.301942116454952) {
    p = SpeechDetector.N6baacbb81138(i);
    } 
    return p;
  }
  static double N25333b9a1135(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -0.6335422682020393) {
    p = SpeechDetector.N468e0e8a1136(i);
    } else if (((Double) i[10]).doubleValue() > -0.6335422682020393) {
      p = 0;
    } 
    return p;
  }
  static double N468e0e8a1136(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 47.873962548127125) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 47.873962548127125) {
    p = SpeechDetector.N185caa361137(i);
    } 
    return p;
  }
  static double N185caa361137(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 2.405382502021726) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 2.405382502021726) {
      p = 1;
    } 
    return p;
  }
  static double N6baacbb81138(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 7.339036864075021) {
    p = SpeechDetector.N1a24d4411139(i);
    } else if (((Double) i[2]).doubleValue() > 7.339036864075021) {
      p = 0;
    } 
    return p;
  }
  static double N1a24d4411139(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -0.24374558884793668) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -0.24374558884793668) {
    p = SpeechDetector.N67eb04cf1140(i);
    } 
    return p;
  }
  static double N67eb04cf1140(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -1.4946711739462553) {
    p = SpeechDetector.N7688e7551141(i);
    } else if (((Double) i[11]).doubleValue() > -1.4946711739462553) {
      p = 1;
    } 
    return p;
  }
  static double N7688e7551141(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 8.250694831894632) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 8.250694831894632) {
      p = 1;
    } 
    return p;
  }
  static double N160bba3f1142(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.5664069491553915) {
    p = SpeechDetector.N5bf089671143(i);
    } else if (((Double) i[5]).doubleValue() > -0.5664069491553915) {
      p = 1;
    } 
    return p;
  }
  static double N5bf089671143(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.5446284053987007) {
    p = SpeechDetector.Ncccf8591144(i);
    } else if (((Double) i[3]).doubleValue() > 2.5446284053987007) {
    p = SpeechDetector.N6f0a13061151(i);
    } 
    return p;
  }
  static double Ncccf8591144(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -0.9535301236276852) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > -0.9535301236276852) {
    p = SpeechDetector.N64c4a19f1145(i);
    } 
    return p;
  }
  static double N64c4a19f1145(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 8.010746526787862) {
    p = SpeechDetector.N294f01681146(i);
    } else if (((Double) i[1]).doubleValue() > 8.010746526787862) {
      p = 1;
    } 
    return p;
  }
  static double N294f01681146(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.3728907281075158) {
    p = SpeechDetector.N1e568081147(i);
    } else if (((Double) i[4]).doubleValue() > 1.3728907281075158) {
      p = 0;
    } 
    return p;
  }
  static double N1e568081147(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 2.1677046972248806) {
    p = SpeechDetector.N7c10e6301148(i);
    } else if (((Double) i[7]).doubleValue() > 2.1677046972248806) {
      p = 1;
    } 
    return p;
  }
  static double N7c10e6301148(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 7.0616012173173885) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 7.0616012173173885) {
    p = SpeechDetector.N397898f21149(i);
    } 
    return p;
  }
  static double N397898f21149(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.13863766482375436) {
    p = SpeechDetector.N1c8155581150(i);
    } else if (((Double) i[9]).doubleValue() > -0.13863766482375436) {
      p = 1;
    } 
    return p;
  }
  static double N1c8155581150(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 7.932658642653867) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 7.932658642653867) {
      p = 1;
    } 
    return p;
  }
  static double N6f0a13061151(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 1.43315356673458) {
    p = SpeechDetector.N7e6727dd1152(i);
    } else if (((Double) i[6]).doubleValue() > 1.43315356673458) {
      p = 1;
    } 
    return p;
  }
  static double N7e6727dd1152(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 3.003590527488135) {
    p = SpeechDetector.N266a5f001153(i);
    } else if (((Double) i[7]).doubleValue() > 3.003590527488135) {
      p = 1;
    } 
    return p;
  }
  static double N266a5f001153(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 1.1393270474260744) {
    p = SpeechDetector.N11830cb41154(i);
    } else if (((Double) i[4]).doubleValue() > 1.1393270474260744) {
      p = 0;
    } 
    return p;
  }
  static double N11830cb41154(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 0.534976891513263) {
    p = SpeechDetector.N32b706671155(i);
    } else if (((Double) i[4]).doubleValue() > 0.534976891513263) {
      p = 1;
    } 
    return p;
  }
  static double N32b706671155(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -1.593941306432635) {
    p = SpeechDetector.Ne056e341156(i);
    } else if (((Double) i[5]).doubleValue() > -1.593941306432635) {
      p = 0;
    } 
    return p;
  }
  static double Ne056e341156(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 48.29394767798688) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 48.29394767798688) {
      p = 1;
    } 
    return p;
  }
  static double N6861f1d1157(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.6583532563167479) {
    p = SpeechDetector.N4f64ac431158(i);
    } else if (((Double) i[5]).doubleValue() > -0.6583532563167479) {
    p = SpeechDetector.N547dde041170(i);
    } 
    return p;
  }
  static double N4f64ac431158(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -1.208482032579274) {
    p = SpeechDetector.N5a698b6d1159(i);
    } else if (((Double) i[11]).doubleValue() > -1.208482032579274) {
    p = SpeechDetector.N304be8721164(i);
    } 
    return p;
  }
  static double N5a698b6d1159(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 48.2367589248308) {
    p = SpeechDetector.N4740cf7a1160(i);
    } else if (((Double) i[0]).doubleValue() > 48.2367589248308) {
    p = SpeechDetector.N6ff577211161(i);
    } 
    return p;
  }
  static double N4740cf7a1160(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -3.973722021883484) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -3.973722021883484) {
      p = 1;
    } 
    return p;
  }
  static double N6ff577211161(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -0.17941889946716294) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -0.17941889946716294) {
    p = SpeechDetector.N5c6050f31162(i);
    } 
    return p;
  }
  static double N5c6050f31162(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 9.4975429043309) {
    p = SpeechDetector.N3762b0e61163(i);
    } else if (((Double) i[1]).doubleValue() > 9.4975429043309) {
      p = 0;
    } 
    return p;
  }
  static double N3762b0e61163(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.0282965363423697) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 2.0282965363423697) {
      p = 0;
    } 
    return p;
  }
  static double N304be8721164(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 4.016814611790409) {
    p = SpeechDetector.N4789ad231165(i);
    } else if (((Double) i[8]).doubleValue() > 4.016814611790409) {
      p = 1;
    } 
    return p;
  }
  static double N4789ad231165(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -0.6405483152834307) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -0.6405483152834307) {
    p = SpeechDetector.N1fc5f9861166(i);
    } 
    return p;
  }
  static double N1fc5f9861166(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -0.4107133332969091) {
    p = SpeechDetector.N7e80dcb51167(i);
    } else if (((Double) i[11]).doubleValue() > -0.4107133332969091) {
      p = 1;
    } 
    return p;
  }
  static double N7e80dcb51167(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -0.7506773399449763) {
    p = SpeechDetector.N3e1a2ff51168(i);
    } else if (((Double) i[11]).doubleValue() > -0.7506773399449763) {
      p = 0;
    } 
    return p;
  }
  static double N3e1a2ff51168(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -1.187179099789498) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > -1.187179099789498) {
    p = SpeechDetector.N29429dad1169(i);
    } 
    return p;
  }
  static double N29429dad1169(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -1.1762756898008004) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -1.1762756898008004) {
      p = 1;
    } 
    return p;
  }
  static double N547dde041170(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 48.303577151717775) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 48.303577151717775) {
    p = SpeechDetector.N137b03f21171(i);
    } 
    return p;
  }
  static double N137b03f21171(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.14644250291190808) {
    p = SpeechDetector.N71400edb1172(i);
    } else if (((Double) i[8]).doubleValue() > 0.14644250291190808) {
    p = SpeechDetector.N4aa327451174(i);
    } 
    return p;
  }
  static double N71400edb1172(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 48.6319304315351) {
    p = SpeechDetector.N248f85f31173(i);
    } else if (((Double) i[0]).doubleValue() > 48.6319304315351) {
      p = 0;
    } 
    return p;
  }
  static double N248f85f31173(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 48.40213495236735) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 48.40213495236735) {
      p = 1;
    } 
    return p;
  }
  static double N4aa327451174(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= 0.4998530696610466) {
    p = SpeechDetector.N1d67494b1175(i);
    } else if (((Double) i[11]).doubleValue() > 0.4998530696610466) {
    p = SpeechDetector.N6ca02cea1178(i);
    } 
    return p;
  }
  static double N1d67494b1175(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -0.7260862853784301) {
    p = SpeechDetector.N67fcea011176(i);
    } else if (((Double) i[6]).doubleValue() > -0.7260862853784301) {
      p = 1;
    } 
    return p;
  }
  static double N67fcea011176(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 3.381981150380268) {
    p = SpeechDetector.Nd671cfd1177(i);
    } else if (((Double) i[4]).doubleValue() > 3.381981150380268) {
      p = 0;
    } 
    return p;
  }
  static double Nd671cfd1177(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= -1.194609633891715) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > -1.194609633891715) {
      p = 0;
    } 
    return p;
  }
  static double N6ca02cea1178(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.5964209795464273) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 0.5964209795464273) {
      p = 0;
    } 
    return p;
  }
  static double N7e4ee5d1179(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -8.470619698556936) {
    p = SpeechDetector.N46dd1fb71180(i);
    } else if (((Double) i[4]).doubleValue() > -8.470619698556936) {
    p = SpeechDetector.N126c39831198(i);
    } 
    return p;
  }
  static double N46dd1fb71180(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 3.527419294935631) {
    p = SpeechDetector.N5f4d4bb91181(i);
    } else if (((Double) i[2]).doubleValue() > 3.527419294935631) {
    p = SpeechDetector.N78feb9d91194(i);
    } 
    return p;
  }
  static double N5f4d4bb91181(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -0.25836060177689485) {
    p = SpeechDetector.N4ba68f901182(i);
    } else if (((Double) i[11]).doubleValue() > -0.25836060177689485) {
    p = SpeechDetector.N698a19281189(i);
    } 
    return p;
  }
  static double N4ba68f901182(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.014455882724538748) {
    p = SpeechDetector.N241b5dbd1183(i);
    } else if (((Double) i[3]).doubleValue() > -0.014455882724538748) {
      p = 0;
    } 
    return p;
  }
  static double N241b5dbd1183(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 75.54343619619284) {
    p = SpeechDetector.Na735d01184(i);
    } else if (((Double) i[0]).doubleValue() > 75.54343619619284) {
      p = 0;
    } 
    return p;
  }
  static double Na735d01184(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -1.5079701214344305) {
    p = SpeechDetector.N61bdeb051185(i);
    } else if (((Double) i[8]).doubleValue() > -1.5079701214344305) {
    p = SpeechDetector.N7b90c7641186(i);
    } 
    return p;
  }
  static double N61bdeb051185(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -2.098842738669693) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -2.098842738669693) {
      p = 1;
    } 
    return p;
  }
  static double N7b90c7641186(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 0.6072322769152221) {
    p = SpeechDetector.N5e12b59c1187(i);
    } else if (((Double) i[2]).doubleValue() > 0.6072322769152221) {
    p = SpeechDetector.N1e5145041188(i);
    } 
    return p;
  }
  static double N5e12b59c1187(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 65.16414355468147) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 65.16414355468147) {
      p = 1;
    } 
    return p;
  }
  static double N1e5145041188(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 58.27268951088485) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 58.27268951088485) {
      p = 0;
    } 
    return p;
  }
  static double N698a19281189(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -0.19124479251085974) {
    p = SpeechDetector.N6979c7391190(i);
    } else if (((Double) i[10]).doubleValue() > -0.19124479251085974) {
    p = SpeechDetector.N5385db451193(i);
    } 
    return p;
  }
  static double N6979c7391190(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 3.0227276303464254) {
    p = SpeechDetector.N3a06a5481191(i);
    } else if (((Double) i[6]).doubleValue() > 3.0227276303464254) {
      p = 0;
    } 
    return p;
  }
  static double N3a06a5481191(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.7112352561219333) {
    p = SpeechDetector.Na4d37bb1192(i);
    } else if (((Double) i[3]).doubleValue() > 2.7112352561219333) {
      p = 0;
    } 
    return p;
  }
  static double Na4d37bb1192(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 72.63130180769541) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 72.63130180769541) {
      p = 0;
    } 
    return p;
  }
  static double N5385db451193(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -3.8030266680581657) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -3.8030266680581657) {
      p = 1;
    } 
    return p;
  }
  static double N78feb9d91194(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 60.2243083071109) {
    p = SpeechDetector.N1b5b939e1195(i);
    } else if (((Double) i[0]).doubleValue() > 60.2243083071109) {
      p = 0;
    } 
    return p;
  }
  static double N1b5b939e1195(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.8338401650024023) {
    p = SpeechDetector.N1938781a1196(i);
    } else if (((Double) i[3]).doubleValue() > 0.8338401650024023) {
      p = 0;
    } 
    return p;
  }
  static double N1938781a1196(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -2.7941256597590476) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -2.7941256597590476) {
    p = SpeechDetector.N4a54ffe51197(i);
    } 
    return p;
  }
  static double N4a54ffe51197(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -0.16533575613156937) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > -0.16533575613156937) {
      p = 0;
    } 
    return p;
  }
  static double N126c39831198(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 8.273836677971714) {
    p = SpeechDetector.N7f33d0e71199(i);
    } else if (((Double) i[1]).doubleValue() > 8.273836677971714) {
    p = SpeechDetector.N601064851726(i);
    } 
    return p;
  }
  static double N7f33d0e71199(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 2.2995478231982034) {
    p = SpeechDetector.N22d82eef1200(i);
    } else if (((Double) i[1]).doubleValue() > 2.2995478231982034) {
    p = SpeechDetector.N3d0847b81214(i);
    } 
    return p;
  }
  static double N22d82eef1200(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 3.1799388405949465) {
    p = SpeechDetector.N1ef15ec81201(i);
    } else if (((Double) i[4]).doubleValue() > 3.1799388405949465) {
    p = SpeechDetector.N6120ae911211(i);
    } 
    return p;
  }
  static double N1ef15ec81201(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 4.749349707286223) {
    p = SpeechDetector.N7885ac561202(i);
    } else if (((Double) i[2]).doubleValue() > 4.749349707286223) {
    p = SpeechDetector.N99791271208(i);
    } 
    return p;
  }
  static double N7885ac561202(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -0.18641390243867567) {
    p = SpeechDetector.Nff57feb1203(i);
    } else if (((Double) i[5]).doubleValue() > -0.18641390243867567) {
    p = SpeechDetector.N161758ad1206(i);
    } 
    return p;
  }
  static double Nff57feb1203(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.245668546512368) {
    p = SpeechDetector.N3ea1257c1204(i);
    } else if (((Double) i[3]).doubleValue() > 2.245668546512368) {
      p = 0;
    } 
    return p;
  }
  static double N3ea1257c1204(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 79.77647264191351) {
    p = SpeechDetector.N45a410031205(i);
    } else if (((Double) i[0]).doubleValue() > 79.77647264191351) {
      p = 0;
    } 
    return p;
  }
  static double N45a410031205(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.3371320061962457) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > -0.3371320061962457) {
      p = 1;
    } 
    return p;
  }
  static double N161758ad1206(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 4.01201576340522) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > 4.01201576340522) {
    p = SpeechDetector.N56bed12f1207(i);
    } 
    return p;
  }
  static double N56bed12f1207(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 60.70450671924785) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 60.70450671924785) {
      p = 1;
    } 
    return p;
  }
  static double N99791271208(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 8.346820311380975) {
    p = SpeechDetector.N3dba9c5c1209(i);
    } else if (((Double) i[2]).doubleValue() > 8.346820311380975) {
      p = 0;
    } 
    return p;
  }
  static double N3dba9c5c1209(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -1.4258216047054724) {
    p = SpeechDetector.N266f7bad1210(i);
    } else if (((Double) i[9]).doubleValue() > -1.4258216047054724) {
      p = 0;
    } 
    return p;
  }
  static double N266f7bad1210(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 56.47033335953613) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 56.47033335953613) {
      p = 0;
    } 
    return p;
  }
  static double N6120ae911211(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -0.21876068381430502) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -0.21876068381430502) {
    p = SpeechDetector.N28a4e3681212(i);
    } 
    return p;
  }
  static double N28a4e3681212(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -1.1217508210741363) {
    p = SpeechDetector.N614dd5b01213(i);
    } else if (((Double) i[10]).doubleValue() > -1.1217508210741363) {
      p = 1;
    } 
    return p;
  }
  static double N614dd5b01213(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 57.95439401572315) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 57.95439401572315) {
      p = 0;
    } 
    return p;
  }
  static double N3d0847b81214(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 1.8844885058792937) {
    p = SpeechDetector.N6a9ca0551215(i);
    } else if (((Double) i[2]).doubleValue() > 1.8844885058792937) {
    p = SpeechDetector.N717fa8da1418(i);
    } 
    return p;
  }
  static double N6a9ca0551215(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 64.45970509683707) {
    p = SpeechDetector.N50e263211216(i);
    } else if (((Double) i[0]).doubleValue() > 64.45970509683707) {
    p = SpeechDetector.Ne1b6edb1260(i);
    } 
    return p;
  }
  static double N50e263211216(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -3.101377406254556) {
    p = SpeechDetector.N3eda35031217(i);
    } else if (((Double) i[8]).doubleValue() > -3.101377406254556) {
    p = SpeechDetector.N2242ff821236(i);
    } 
    return p;
  }
  static double N3eda35031217(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -6.332908257879536) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -6.332908257879536) {
    p = SpeechDetector.N67ce78311218(i);
    } 
    return p;
  }
  static double N67ce78311218(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 4.8321438986366045) {
    p = SpeechDetector.N24350e351219(i);
    } else if (((Double) i[6]).doubleValue() > 4.8321438986366045) {
      p = 0;
    } 
    return p;
  }
  static double N24350e351219(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 62.174304811577414) {
    p = SpeechDetector.N1737cc251220(i);
    } else if (((Double) i[0]).doubleValue() > 62.174304811577414) {
    p = SpeechDetector.N662164e01227(i);
    } 
    return p;
  }
  static double N1737cc251220(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 2.3103293807653333) {
    p = SpeechDetector.N503b9d0b1221(i);
    } else if (((Double) i[3]).doubleValue() > 2.3103293807653333) {
      p = 0;
    } 
    return p;
  }
  static double N503b9d0b1221(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 3.744026667746825) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 3.744026667746825) {
    p = SpeechDetector.N79c366531222(i);
    } 
    return p;
  }
  static double N79c366531222(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -0.4460702978665199) {
    p = SpeechDetector.Nb7311991223(i);
    } else if (((Double) i[5]).doubleValue() > -0.4460702978665199) {
      p = 0;
    } 
    return p;
  }
  static double Nb7311991223(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.9502073347399823) {
    p = SpeechDetector.N2f8859ae1224(i);
    } else if (((Double) i[9]).doubleValue() > 0.9502073347399823) {
      p = 0;
    } 
    return p;
  }
  static double N2f8859ae1224(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.7962463346598548) {
    p = SpeechDetector.N20b7c6e31225(i);
    } else if (((Double) i[3]).doubleValue() > 0.7962463346598548) {
      p = 1;
    } 
    return p;
  }
  static double N20b7c6e31225(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -1.8817286595328404) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -1.8817286595328404) {
    p = SpeechDetector.N16271dd1226(i);
    } 
    return p;
  }
  static double N16271dd1226(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 4.539397909709953) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 4.539397909709953) {
      p = 0;
    } 
    return p;
  }
  static double N662164e01227(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -5.686477406777463) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -5.686477406777463) {
    p = SpeechDetector.N1a65e2821228(i);
    } 
    return p;
  }
  static double N1a65e2821228(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -4.466246484985769) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -4.466246484985769) {
    p = SpeechDetector.N16f9d2581229(i);
    } 
    return p;
  }
  static double N16f9d2581229(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 7.834439659514516) {
    p = SpeechDetector.N6b609b301230(i);
    } else if (((Double) i[1]).doubleValue() > 7.834439659514516) {
      p = 0;
    } 
    return p;
  }
  static double N6b609b301230(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -1.2335389309270661) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -1.2335389309270661) {
    p = SpeechDetector.N136ca3631231(i);
    } 
    return p;
  }
  static double N136ca3631231(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -2.59217371452573) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -2.59217371452573) {
    p = SpeechDetector.N415ac28b1232(i);
    } 
    return p;
  }
  static double N415ac28b1232(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 64.16330671774405) {
    p = SpeechDetector.N2d9a55321233(i);
    } else if (((Double) i[0]).doubleValue() > 64.16330671774405) {
      p = 0;
    } 
    return p;
  }
  static double N2d9a55321233(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= 1.511427603003465) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > 1.511427603003465) {
    p = SpeechDetector.N6f4f5d011234(i);
    } 
    return p;
  }
  static double N6f4f5d011234(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 1.299243536561592) {
    p = SpeechDetector.N436325be1235(i);
    } else if (((Double) i[5]).doubleValue() > 1.299243536561592) {
      p = 1;
    } 
    return p;
  }
  static double N436325be1235(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -4.2204016787295915) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > -4.2204016787295915) {
      p = 0;
    } 
    return p;
  }
  static double N2242ff821236(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 3.777823488290937) {
    p = SpeechDetector.N5c94c1601237(i);
    } else if (((Double) i[4]).doubleValue() > 3.777823488290937) {
    p = SpeechDetector.N5ab57c421258(i);
    } 
    return p;
  }
  static double N5c94c1601237(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -5.5982080868476976) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -5.5982080868476976) {
    p = SpeechDetector.N2a23b51c1238(i);
    } 
    return p;
  }
  static double N2a23b51c1238(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 3.4455192593303776) {
    p = SpeechDetector.Ne4756e11239(i);
    } else if (((Double) i[5]).doubleValue() > 3.4455192593303776) {
    p = SpeechDetector.N4d8e7ef31254(i);
    } 
    return p;
  }
  static double Ne4756e11239(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 3.038967199614725) {
    p = SpeechDetector.N6d98d5191240(i);
    } else if (((Double) i[3]).doubleValue() > 3.038967199614725) {
    p = SpeechDetector.N4db78d111253(i);
    } 
    return p;
  }
  static double N6d98d5191240(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 63.07200959990137) {
    p = SpeechDetector.N4cce94851241(i);
    } else if (((Double) i[0]).doubleValue() > 63.07200959990137) {
    p = SpeechDetector.N3cc975c1247(i);
    } 
    return p;
  }
  static double N4cce94851241(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 53.45796138997178) {
    p = SpeechDetector.Ne78cf281242(i);
    } else if (((Double) i[0]).doubleValue() > 53.45796138997178) {
    p = SpeechDetector.N177312a31246(i);
    } 
    return p;
  }
  static double Ne78cf281242(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 1.5294455691526907) {
    p = SpeechDetector.N1d6852841243(i);
    } else if (((Double) i[6]).doubleValue() > 1.5294455691526907) {
      p = 1;
    } 
    return p;
  }
  static double N1d6852841243(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 1.2112410369367121) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 1.2112410369367121) {
    p = SpeechDetector.N2c0167311244(i);
    } 
    return p;
  }
  static double N2c0167311244(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -2.707425325593324) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > -2.707425325593324) {
    p = SpeechDetector.N101dd8891245(i);
    } 
    return p;
  }
  static double N101dd8891245(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -2.0953300125983376) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > -2.0953300125983376) {
      p = 0;
    } 
    return p;
  }
  static double N177312a31246(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -3.1258199581497284) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -3.1258199581497284) {
      p = 1;
    } 
    return p;
  }
  static double N3cc975c1247(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -3.926016905661588) {
    p = SpeechDetector.N6ce51af61248(i);
    } else if (((Double) i[11]).doubleValue() > -3.926016905661588) {
    p = SpeechDetector.N147339581251(i);
    } 
    return p;
  }
  static double N6ce51af61248(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 1.689924415254189) {
    p = SpeechDetector.N354d44541249(i);
    } else if (((Double) i[9]).doubleValue() > 1.689924415254189) {
      p = 1;
    } 
    return p;
  }
  static double N354d44541249(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 6.95389817092763) {
    p = SpeechDetector.N63c102221250(i);
    } else if (((Double) i[1]).doubleValue() > 6.95389817092763) {
      p = 0;
    } 
    return p;
  }
  static double N63c102221250(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -4.761361717672743) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -4.761361717672743) {
      p = 1;
    } 
    return p;
  }
  static double N147339581251(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.33964615851972124) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 0.33964615851972124) {
    p = SpeechDetector.N18b9cae51252(i);
    } 
    return p;
  }
  static double N18b9cae51252(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 1.8836778392583522) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > 1.8836778392583522) {
      p = 0;
    } 
    return p;
  }
  static double N4db78d111253(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 2.770244053751976) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 2.770244053751976) {
      p = 1;
    } 
    return p;
  }
  static double N4d8e7ef31254(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -2.256741757347196) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -2.256741757347196) {
    p = SpeechDetector.N4630ab4c1255(i);
    } 
    return p;
  }
  static double N4630ab4c1255(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.892362878694478) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.892362878694478) {
    p = SpeechDetector.N253e2e941256(i);
    } 
    return p;
  }
  static double N253e2e941256(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -0.08533792151691039) {
    p = SpeechDetector.N156409a61257(i);
    } else if (((Double) i[8]).doubleValue() > -0.08533792151691039) {
      p = 1;
    } 
    return p;
  }
  static double N156409a61257(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -1.4996156591353522) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -1.4996156591353522) {
      p = 1;
    } 
    return p;
  }
  static double N5ab57c421258(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 51.384510626266234) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 51.384510626266234) {
    p = SpeechDetector.N40f0ff941259(i);
    } 
    return p;
  }
  static double N40f0ff941259(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 4.502062679634258) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > 4.502062679634258) {
      p = 1;
    } 
    return p;
  }
  static double Ne1b6edb1260(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 75.40677039799236) {
    p = SpeechDetector.N2b0af3191261(i);
    } else if (((Double) i[0]).doubleValue() > 75.40677039799236) {
    p = SpeechDetector.N1d49f69b1392(i);
    } 
    return p;
  }
  static double N2b0af3191261(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 5.843628399396315) {
    p = SpeechDetector.N5bde04621262(i);
    } else if (((Double) i[6]).doubleValue() > 5.843628399396315) {
    p = SpeechDetector.N717994001371(i);
    } 
    return p;
  }
  static double N5bde04621262(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.965399208496164) {
    p = SpeechDetector.N4cf1ed0c1263(i);
    } else if (((Double) i[1]).doubleValue() > 6.965399208496164) {
    p = SpeechDetector.N7c9e4f21342(i);
    } 
    return p;
  }
  static double N4cf1ed0c1263(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -5.480926441054232) {
    p = SpeechDetector.N1f01d64b1264(i);
    } else if (((Double) i[8]).doubleValue() > -5.480926441054232) {
    p = SpeechDetector.N7899615b1282(i);
    } 
    return p;
  }
  static double N1f01d64b1264(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 2.3002413290880455) {
    p = SpeechDetector.N319be5d41265(i);
    } else if (((Double) i[5]).doubleValue() > 2.3002413290880455) {
    p = SpeechDetector.N1715884e1277(i);
    } 
    return p;
  }
  static double N319be5d41265(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -2.372361049329831) {
    p = SpeechDetector.N720ddabd1266(i);
    } else if (((Double) i[11]).doubleValue() > -2.372361049329831) {
    p = SpeechDetector.N4c7ef9191272(i);
    } 
    return p;
  }
  static double N720ddabd1266(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -2.6977874024194297) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > -2.6977874024194297) {
    p = SpeechDetector.N6b93e8ca1267(i);
    } 
    return p;
  }
  static double N6b93e8ca1267(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -3.2440214447736513) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > -3.2440214447736513) {
    p = SpeechDetector.N3b985cf31268(i);
    } 
    return p;
  }
  static double N3b985cf31268(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 2.761166362426884) {
    p = SpeechDetector.Nffe74161269(i);
    } else if (((Double) i[6]).doubleValue() > 2.761166362426884) {
      p = 0;
    } 
    return p;
  }
  static double Nffe74161269(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -1.5624060178027575) {
    p = SpeechDetector.Na77588e1270(i);
    } else if (((Double) i[4]).doubleValue() > -1.5624060178027575) {
      p = 1;
    } 
    return p;
  }
  static double Na77588e1270(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 5.078553899518739) {
    p = SpeechDetector.N2156d8001271(i);
    } else if (((Double) i[1]).doubleValue() > 5.078553899518739) {
      p = 0;
    } 
    return p;
  }
  static double N2156d8001271(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.35799419089741324) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.35799419089741324) {
      p = 1;
    } 
    return p;
  }
  static double N4c7ef9191272(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 2.2186846441608323) {
    p = SpeechDetector.N2413ff8b1273(i);
    } else if (((Double) i[4]).doubleValue() > 2.2186846441608323) {
    p = SpeechDetector.N6c44c5ca1276(i);
    } 
    return p;
  }
  static double N2413ff8b1273(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 1.355953199991773) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 1.355953199991773) {
    p = SpeechDetector.N1cee112e1274(i);
    } 
    return p;
  }
  static double N1cee112e1274(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 3.143101451873227) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 3.143101451873227) {
    p = SpeechDetector.N51a9f1d81275(i);
    } 
    return p;
  }
  static double N51a9f1d81275(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.7760171306534482) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -0.7760171306534482) {
      p = 0;
    } 
    return p;
  }
  static double N6c44c5ca1276(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 66.90022397518406) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 66.90022397518406) {
      p = 0;
    } 
    return p;
  }
  static double N1715884e1277(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 0.16864553638870633) {
    p = SpeechDetector.N6a7c4b91278(i);
    } else if (((Double) i[4]).doubleValue() > 0.16864553638870633) {
    p = SpeechDetector.N4a08384d1280(i);
    } 
    return p;
  }
  static double N6a7c4b91278(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 1.3816407865763942) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 1.3816407865763942) {
    p = SpeechDetector.N706451181279(i);
    } 
    return p;
  }
  static double N706451181279(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 4.169401690491862) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > 4.169401690491862) {
      p = 0;
    } 
    return p;
  }
  static double N4a08384d1280(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -2.3456593927259903) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -2.3456593927259903) {
    p = SpeechDetector.N61a86d331281(i);
    } 
    return p;
  }
  static double N61a86d331281(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -2.380693525892069) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -2.380693525892069) {
      p = 1;
    } 
    return p;
  }
  static double N7899615b1282(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -5.259882502964214) {
    p = SpeechDetector.N1dc6db381283(i);
    } else if (((Double) i[9]).doubleValue() > -5.259882502964214) {
    p = SpeechDetector.N54d06dbd1303(i);
    } 
    return p;
  }
  static double N1dc6db381283(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -8.339555304399388) {
    p = SpeechDetector.N6a6248cd1284(i);
    } else if (((Double) i[9]).doubleValue() > -8.339555304399388) {
    p = SpeechDetector.N246151651286(i);
    } 
    return p;
  }
  static double N6a6248cd1284(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -4.694404987360911) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > -4.694404987360911) {
    p = SpeechDetector.N5a99c14b1285(i);
    } 
    return p;
  }
  static double N5a99c14b1285(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.46225113276969837) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -0.46225113276969837) {
      p = 1;
    } 
    return p;
  }
  static double N246151651286(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -2.1327686547005706) {
    p = SpeechDetector.N7126d08b1287(i);
    } else if (((Double) i[11]).doubleValue() > -2.1327686547005706) {
    p = SpeechDetector.N6e0a4861290(i);
    } 
    return p;
  }
  static double N7126d08b1287(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -1.3152173992567666) {
    p = SpeechDetector.N2b458fb61288(i);
    } else if (((Double) i[5]).doubleValue() > -1.3152173992567666) {
      p = 0;
    } 
    return p;
  }
  static double N2b458fb61288(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= -0.564672383186258) {
    p = SpeechDetector.N63de0beb1289(i);
    } else if (((Double) i[2]).doubleValue() > -0.564672383186258) {
      p = 1;
    } 
    return p;
  }
  static double N63de0beb1289(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -2.677555981124069) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -2.677555981124069) {
      p = 1;
    } 
    return p;
  }
  static double N6e0a4861290(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 72.3214368687053) {
    p = SpeechDetector.N6515cf11291(i);
    } else if (((Double) i[0]).doubleValue() > 72.3214368687053) {
    p = SpeechDetector.N4a693d501300(i);
    } 
    return p;
  }
  static double N6515cf11291(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.9413404178383624) {
    p = SpeechDetector.N47acd5741292(i);
    } else if (((Double) i[4]).doubleValue() > 1.9413404178383624) {
    p = SpeechDetector.N6d352fed1298(i);
    } 
    return p;
  }
  static double N47acd5741292(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 66.0081854089304) {
    p = SpeechDetector.N23f1d76f1293(i);
    } else if (((Double) i[0]).doubleValue() > 66.0081854089304) {
    p = SpeechDetector.N5a76cad81294(i);
    } 
    return p;
  }
  static double N23f1d76f1293(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.7860238300415743) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -0.7860238300415743) {
      p = 1;
    } 
    return p;
  }
  static double N5a76cad81294(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -2.7006402592172383) {
    p = SpeechDetector.N2cff594e1295(i);
    } else if (((Double) i[8]).doubleValue() > -2.7006402592172383) {
      p = 1;
    } 
    return p;
  }
  static double N2cff594e1295(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 3.6426702234113453) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 3.6426702234113453) {
    p = SpeechDetector.N304026f61296(i);
    } 
    return p;
  }
  static double N304026f61296(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 68.55611291781217) {
    p = SpeechDetector.N43bdf9391297(i);
    } else if (((Double) i[0]).doubleValue() > 68.55611291781217) {
      p = 1;
    } 
    return p;
  }
  static double N43bdf9391297(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -6.077215583304698) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > -6.077215583304698) {
      p = 0;
    } 
    return p;
  }
  static double N6d352fed1298(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -0.9709697301148807) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -0.9709697301148807) {
    p = SpeechDetector.N3edda89e1299(i);
    } 
    return p;
  }
  static double N3edda89e1299(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -0.24498344783673304) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > -0.24498344783673304) {
      p = 0;
    } 
    return p;
  }
  static double N4a693d501300(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.065821206981502) {
    p = SpeechDetector.N4338755a1301(i);
    } else if (((Double) i[1]).doubleValue() > 6.065821206981502) {
      p = 0;
    } 
    return p;
  }
  static double N4338755a1301(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 73.60415868798616) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 73.60415868798616) {
    p = SpeechDetector.N2fa08a301302(i);
    } 
    return p;
  }
  static double N2fa08a301302(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -1.6023069793662517) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -1.6023069793662517) {
      p = 0;
    } 
    return p;
  }
  static double N54d06dbd1303(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 4.044578887720067) {
    p = SpeechDetector.N3fd4becb1304(i);
    } else if (((Double) i[5]).doubleValue() > 4.044578887720067) {
    p = SpeechDetector.N378882a21332(i);
    } 
    return p;
  }
  static double N3fd4becb1304(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -0.8819083115564587) {
    p = SpeechDetector.N283a222a1305(i);
    } else if (((Double) i[11]).doubleValue() > -0.8819083115564587) {
    p = SpeechDetector.N14676c021321(i);
    } 
    return p;
  }
  static double N283a222a1305(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 1.0052083116372141) {
    p = SpeechDetector.N9908081306(i);
    } else if (((Double) i[2]).doubleValue() > 1.0052083116372141) {
    p = SpeechDetector.N4369e1671310(i);
    } 
    return p;
  }
  static double N9908081306(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 3.303715985119921) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 3.303715985119921) {
    p = SpeechDetector.N3ede45861307(i);
    } 
    return p;
  }
  static double N3ede45861307(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -3.932799203516157) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -3.932799203516157) {
    p = SpeechDetector.N72a680a81308(i);
    } 
    return p;
  }
  static double N72a680a81308(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 1.225556722521164) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 1.225556722521164) {
    p = SpeechDetector.N1148d0661309(i);
    } 
    return p;
  }
  static double N1148d0661309(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 3.835088971362203) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 3.835088971362203) {
      p = 1;
    } 
    return p;
  }
  static double N4369e1671310(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -3.1298611019123888) {
    p = SpeechDetector.N5c4d53c41311(i);
    } else if (((Double) i[3]).doubleValue() > -3.1298611019123888) {
    p = SpeechDetector.N3bc269c51313(i);
    } 
    return p;
  }
  static double N5c4d53c41311(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -3.728718360314695) {
    p = SpeechDetector.N58b698331312(i);
    } else if (((Double) i[11]).doubleValue() > -3.728718360314695) {
      p = 0;
    } 
    return p;
  }
  static double N58b698331312(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -0.5069300737031078) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -0.5069300737031078) {
      p = 1;
    } 
    return p;
  }
  static double N3bc269c51313(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.07754096047696801) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 0.07754096047696801) {
    p = SpeechDetector.N58ae23291314(i);
    } 
    return p;
  }
  static double N58ae23291314(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 0.8130858206073919) {
    p = SpeechDetector.N1086863b1315(i);
    } else if (((Double) i[10]).doubleValue() > 0.8130858206073919) {
      p = 1;
    } 
    return p;
  }
  static double N1086863b1315(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 3.598866895481745) {
    p = SpeechDetector.N6fd693f61316(i);
    } else if (((Double) i[8]).doubleValue() > 3.598866895481745) {
      p = 1;
    } 
    return p;
  }
  static double N6fd693f61316(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -7.2252828322890625) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -7.2252828322890625) {
    p = SpeechDetector.N708c34d61317(i);
    } 
    return p;
  }
  static double N708c34d61317(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -6.579571874471031) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -6.579571874471031) {
    p = SpeechDetector.N4e107541318(i);
    } 
    return p;
  }
  static double N4e107541318(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.7676284376032074) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.7676284376032074) {
    p = SpeechDetector.N51a81e4c1319(i);
    } 
    return p;
  }
  static double N51a81e4c1319(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.32622479148855776) {
    p = SpeechDetector.N745d39751320(i);
    } else if (((Double) i[3]).doubleValue() > -0.32622479148855776) {
      p = 1;
    } 
    return p;
  }
  static double N745d39751320(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -3.0175585868384185) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -3.0175585868384185) {
      p = 1;
    } 
    return p;
  }
  static double N14676c021321(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -1.5621495593608983) {
    p = SpeechDetector.N11e401c51322(i);
    } else if (((Double) i[10]).doubleValue() > -1.5621495593608983) {
    p = SpeechDetector.N390d3b2c1329(i);
    } 
    return p;
  }
  static double N11e401c51322(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.503180918991097) {
    p = SpeechDetector.N103035b01323(i);
    } else if (((Double) i[1]).doubleValue() > 6.503180918991097) {
    p = SpeechDetector.N9fb253d1326(i);
    } 
    return p;
  }
  static double N103035b01323(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.8719761912623504) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 0.8719761912623504) {
    p = SpeechDetector.N4d14be1d1324(i);
    } 
    return p;
  }
  static double N4d14be1d1324(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 73.88953010722506) {
    p = SpeechDetector.Nccd89741325(i);
    } else if (((Double) i[0]).doubleValue() > 73.88953010722506) {
      p = 0;
    } 
    return p;
  }
  static double Nccd89741325(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 4.612200790348929) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 4.612200790348929) {
      p = 0;
    } 
    return p;
  }
  static double N9fb253d1326(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -4.029084607908418) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -4.029084607908418) {
    p = SpeechDetector.N4749cce91327(i);
    } 
    return p;
  }
  static double N4749cce91327(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 65.12515767848761) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 65.12515767848761) {
    p = SpeechDetector.N3e2bf98f1328(i);
    } 
    return p;
  }
  static double N3e2bf98f1328(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= -2.1985163582114913) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > -2.1985163582114913) {
      p = 1;
    } 
    return p;
  }
  static double N390d3b2c1329(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 3.776283798983576) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 3.776283798983576) {
    p = SpeechDetector.N13a7e2f71330(i);
    } 
    return p;
  }
  static double N13a7e2f71330(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -0.389798056449829) {
    p = SpeechDetector.N7325d0351331(i);
    } else if (((Double) i[7]).doubleValue() > -0.389798056449829) {
      p = 1;
    } 
    return p;
  }
  static double N7325d0351331(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.04088871926712808) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -0.04088871926712808) {
      p = 0;
    } 
    return p;
  }
  static double N378882a21332(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 6.9087669359800765) {
    p = SpeechDetector.N633876291333(i);
    } else if (((Double) i[5]).doubleValue() > 6.9087669359800765) {
    p = SpeechDetector.N2a3527d41341(i);
    } 
    return p;
  }
  static double N633876291333(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -4.610031863707742) {
    p = SpeechDetector.Nfd5b0a31334(i);
    } else if (((Double) i[8]).doubleValue() > -4.610031863707742) {
    p = SpeechDetector.N163fa5741335(i);
    } 
    return p;
  }
  static double Nfd5b0a31334(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -0.00931602805212719) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -0.00931602805212719) {
      p = 1;
    } 
    return p;
  }
  static double N163fa5741335(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.6202860028908184) {
    p = SpeechDetector.N2c876e151336(i);
    } else if (((Double) i[7]).doubleValue() > 0.6202860028908184) {
    p = SpeechDetector.N52a665101340(i);
    } 
    return p;
  }
  static double N2c876e151336(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 0.7417677745718368) {
    p = SpeechDetector.N6f4c3b891337(i);
    } else if (((Double) i[2]).doubleValue() > 0.7417677745718368) {
      p = 0;
    } 
    return p;
  }
  static double N6f4c3b891337(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 3.2979162469837258) {
    p = SpeechDetector.N75d8d8741338(i);
    } else if (((Double) i[4]).doubleValue() > 3.2979162469837258) {
      p = 0;
    } 
    return p;
  }
  static double N75d8d8741338(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -3.23148897367994) {
    p = SpeechDetector.N6f6ae41d1339(i);
    } else if (((Double) i[4]).doubleValue() > -3.23148897367994) {
      p = 1;
    } 
    return p;
  }
  static double N6f6ae41d1339(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 0.09298620693823416) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 0.09298620693823416) {
      p = 0;
    } 
    return p;
  }
  static double N52a665101340(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 73.06825882759458) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 73.06825882759458) {
      p = 0;
    } 
    return p;
  }
  static double N2a3527d41341(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 1.4638390145761069) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 1.4638390145761069) {
      p = 1;
    } 
    return p;
  }
  static double N7c9e4f21342(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -3.7993647029139157) {
    p = SpeechDetector.N57d5cfdc1343(i);
    } else if (((Double) i[6]).doubleValue() > -3.7993647029139157) {
    p = SpeechDetector.N748767ac1346(i);
    } 
    return p;
  }
  static double N57d5cfdc1343(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -2.216711851997968) {
    p = SpeechDetector.N1641a1911344(i);
    } else if (((Double) i[5]).doubleValue() > -2.216711851997968) {
      p = 0;
    } 
    return p;
  }
  static double N1641a1911344(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 7.378396938871195) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 7.378396938871195) {
    p = SpeechDetector.N2ed642011345(i);
    } 
    return p;
  }
  static double N2ed642011345(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 67.93863349217739) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 67.93863349217739) {
      p = 0;
    } 
    return p;
  }
  static double N748767ac1346(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -5.615514394782061) {
    p = SpeechDetector.N65a788f81347(i);
    } else if (((Double) i[5]).doubleValue() > -5.615514394782061) {
    p = SpeechDetector.N3ddfcb511351(i);
    } 
    return p;
  }
  static double N65a788f81347(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 1.1543939386470607) {
    p = SpeechDetector.N5a1185eb1348(i);
    } else if (((Double) i[11]).doubleValue() > 1.1543939386470607) {
      p = 1;
    } 
    return p;
  }
  static double N5a1185eb1348(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 7.118094581603169) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 7.118094581603169) {
    p = SpeechDetector.N346f357f1349(i);
    } 
    return p;
  }
  static double N346f357f1349(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 4.070930794102308) {
    p = SpeechDetector.N71213fbd1350(i);
    } else if (((Double) i[7]).doubleValue() > 4.070930794102308) {
      p = 0;
    } 
    return p;
  }
  static double N71213fbd1350(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 1.2130708672549182) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 1.2130708672549182) {
      p = 0;
    } 
    return p;
  }
  static double N3ddfcb511351(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -4.455065939992835) {
    p = SpeechDetector.N2f9d52931352(i);
    } else if (((Double) i[9]).doubleValue() > -4.455065939992835) {
    p = SpeechDetector.N176c16011357(i);
    } 
    return p;
  }
  static double N2f9d52931352(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 2.184426128755604) {
    p = SpeechDetector.N19849511353(i);
    } else if (((Double) i[5]).doubleValue() > 2.184426128755604) {
      p = 0;
    } 
    return p;
  }
  static double N19849511353(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 0.33886486740872446) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 0.33886486740872446) {
    p = SpeechDetector.N34f565a81354(i);
    } 
    return p;
  }
  static double N34f565a81354(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.7098606600170907) {
    p = SpeechDetector.N5ae513c11355(i);
    } else if (((Double) i[4]).doubleValue() > 0.7098606600170907) {
      p = 0;
    } 
    return p;
  }
  static double N5ae513c11355(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.7875127490947995) {
    p = SpeechDetector.N757412851356(i);
    } else if (((Double) i[3]).doubleValue() > 2.7875127490947995) {
      p = 0;
    } 
    return p;
  }
  static double N757412851356(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -4.043852454038902) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -4.043852454038902) {
      p = 1;
    } 
    return p;
  }
  static double N176c16011357(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 72.69141254567033) {
    p = SpeechDetector.N3918a7aa1358(i);
    } else if (((Double) i[0]).doubleValue() > 72.69141254567033) {
    p = SpeechDetector.N12b2016d1369(i);
    } 
    return p;
  }
  static double N3918a7aa1358(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -4.661616130600038) {
    p = SpeechDetector.N1a7a72f1359(i);
    } else if (((Double) i[8]).doubleValue() > -4.661616130600038) {
    p = SpeechDetector.N2f4968271362(i);
    } 
    return p;
  }
  static double N1a7a72f1359(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -1.9132118715141468) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -1.9132118715141468) {
    p = SpeechDetector.N25d0ff821360(i);
    } 
    return p;
  }
  static double N25d0ff821360(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -2.169856477474784) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -2.169856477474784) {
    p = SpeechDetector.N3c36c3331361(i);
    } 
    return p;
  }
  static double N3c36c3331361(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 1.7846410945682505) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > 1.7846410945682505) {
      p = 1;
    } 
    return p;
  }
  static double N2f4968271362(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -4.072780348514888) {
    p = SpeechDetector.N7c54f0b11363(i);
    } else if (((Double) i[4]).doubleValue() > -4.072780348514888) {
      p = 1;
    } 
    return p;
  }
  static double N7c54f0b11363(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -3.525036005327491) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -3.525036005327491) {
    p = SpeechDetector.N2c86343c1364(i);
    } 
    return p;
  }
  static double N2c86343c1364(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 7.504485760524769) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 7.504485760524769) {
    p = SpeechDetector.N1ecf65fa1365(i);
    } 
    return p;
  }
  static double N1ecf65fa1365(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 1.193251908804924) {
    p = SpeechDetector.N42300fe31366(i);
    } else if (((Double) i[10]).doubleValue() > 1.193251908804924) {
    p = SpeechDetector.N334f2b841368(i);
    } 
    return p;
  }
  static double N42300fe31366(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -2.8260190875869333) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > -2.8260190875869333) {
    p = SpeechDetector.N616322071367(i);
    } 
    return p;
  }
  static double N616322071367(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= -1.8587701729764885) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > -1.8587701729764885) {
      p = 0;
    } 
    return p;
  }
  static double N334f2b841368(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -3.332872004574051) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -3.332872004574051) {
      p = 1;
    } 
    return p;
  }
  static double N12b2016d1369(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 7.131361276872409) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 7.131361276872409) {
    p = SpeechDetector.N647ba4b11370(i);
    } 
    return p;
  }
  static double N647ba4b11370(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -2.7930205797557384) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -2.7930205797557384) {
      p = 0;
    } 
    return p;
  }
  static double N717994001371(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -1.9605917216129234) {
    p = SpeechDetector.N64e3c6331372(i);
    } else if (((Double) i[8]).doubleValue() > -1.9605917216129234) {
    p = SpeechDetector.N16fef7941383(i);
    } 
    return p;
  }
  static double N64e3c6331372(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 2.4448354123922913) {
    p = SpeechDetector.N25e972041373(i);
    } else if (((Double) i[10]).doubleValue() > 2.4448354123922913) {
    p = SpeechDetector.Nddd93cf1379(i);
    } 
    return p;
  }
  static double N25e972041373(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.012247526234909446) {
    p = SpeechDetector.N13c780e1374(i);
    } else if (((Double) i[3]).doubleValue() > 0.012247526234909446) {
      p = 0;
    } 
    return p;
  }
  static double N13c780e1374(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 67.41324305765302) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 67.41324305765302) {
    p = SpeechDetector.N28eddfc41375(i);
    } 
    return p;
  }
  static double N28eddfc41375(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -5.335659859304273) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -5.335659859304273) {
    p = SpeechDetector.N18fdd1da1376(i);
    } 
    return p;
  }
  static double N18fdd1da1376(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 69.36521674743324) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 69.36521674743324) {
    p = SpeechDetector.N3fdc4c071377(i);
    } 
    return p;
  }
  static double N3fdc4c071377(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.079450355461381) {
    p = SpeechDetector.N180380521378(i);
    } else if (((Double) i[1]).doubleValue() > 6.079450355461381) {
      p = 0;
    } 
    return p;
  }
  static double N180380521378(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -3.7284736982334996) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -3.7284736982334996) {
      p = 1;
    } 
    return p;
  }
  static double Nddd93cf1379(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.785198920249593) {
    p = SpeechDetector.N4e1302251380(i);
    } else if (((Double) i[1]).doubleValue() > 6.785198920249593) {
      p = 0;
    } 
    return p;
  }
  static double N4e1302251380(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -0.844448339352096) {
    p = SpeechDetector.N41f1f32e1381(i);
    } else if (((Double) i[11]).doubleValue() > -0.844448339352096) {
      p = 1;
    } 
    return p;
  }
  static double N41f1f32e1381(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 70.36552814034893) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 70.36552814034893) {
    p = SpeechDetector.N739472d41382(i);
    } 
    return p;
  }
  static double N739472d41382(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 72.00659943266646) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 72.00659943266646) {
      p = 0;
    } 
    return p;
  }
  static double N16fef7941383(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 8.005754793441584) {
    p = SpeechDetector.N3d3021571384(i);
    } else if (((Double) i[1]).doubleValue() > 8.005754793441584) {
      p = 0;
    } 
    return p;
  }
  static double N3d3021571384(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -1.1008482868428577) {
    p = SpeechDetector.N22dcf6231385(i);
    } else if (((Double) i[9]).doubleValue() > -1.1008482868428577) {
    p = SpeechDetector.N1886750a1389(i);
    } 
    return p;
  }
  static double N22dcf6231385(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -7.093698760761169) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -7.093698760761169) {
    p = SpeechDetector.N58a385b61386(i);
    } 
    return p;
  }
  static double N58a385b61386(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -3.9375339210691664) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -3.9375339210691664) {
    p = SpeechDetector.N579f9d301387(i);
    } 
    return p;
  }
  static double N579f9d301387(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -1.145686600795112) {
    p = SpeechDetector.N3008e7411388(i);
    } else if (((Double) i[11]).doubleValue() > -1.145686600795112) {
      p = 1;
    } 
    return p;
  }
  static double N3008e7411388(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.08179281229355814) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -0.08179281229355814) {
      p = 0;
    } 
    return p;
  }
  static double N1886750a1389(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.277989640452778) {
    p = SpeechDetector.N236df01a1390(i);
    } else if (((Double) i[5]).doubleValue() > -0.277989640452778) {
      p = 1;
    } 
    return p;
  }
  static double N236df01a1390(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.09852320608331) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 2.09852320608331) {
    p = SpeechDetector.N6ae4d221391(i);
    } 
    return p;
  }
  static double N6ae4d221391(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 6.633059965305435) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 6.633059965305435) {
      p = 0;
    } 
    return p;
  }
  static double N1d49f69b1392(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 4.441340088203722) {
    p = SpeechDetector.N62dd49221393(i);
    } else if (((Double) i[1]).doubleValue() > 4.441340088203722) {
    p = SpeechDetector.N146f4ef81405(i);
    } 
    return p;
  }
  static double N62dd49221393(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 1.3065730096768964) {
    p = SpeechDetector.N2dec89e31394(i);
    } else if (((Double) i[5]).doubleValue() > 1.3065730096768964) {
    p = SpeechDetector.N35e3f0101403(i);
    } 
    return p;
  }
  static double N2dec89e31394(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 81.16555408121397) {
    p = SpeechDetector.N450ada31395(i);
    } else if (((Double) i[0]).doubleValue() > 81.16555408121397) {
      p = 0;
    } 
    return p;
  }
  static double N450ada31395(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 7.687555970821421) {
    p = SpeechDetector.N4cb7aa8b1396(i);
    } else if (((Double) i[6]).doubleValue() > 7.687555970821421) {
      p = 0;
    } 
    return p;
  }
  static double N4cb7aa8b1396(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.37879820645550705) {
    p = SpeechDetector.N2e1db3061397(i);
    } else if (((Double) i[7]).doubleValue() > 0.37879820645550705) {
    p = SpeechDetector.N3199c9ea1399(i);
    } 
    return p;
  }
  static double N2e1db3061397(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -3.8262905930665663) {
    p = SpeechDetector.N1fd466911398(i);
    } else if (((Double) i[9]).doubleValue() > -3.8262905930665663) {
      p = 1;
    } 
    return p;
  }
  static double N1fd466911398(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -2.841559228669523) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > -2.841559228669523) {
      p = 0;
    } 
    return p;
  }
  static double N3199c9ea1399(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.561197283422552) {
    p = SpeechDetector.N67973b161400(i);
    } else if (((Double) i[3]).doubleValue() > -0.561197283422552) {
      p = 0;
    } 
    return p;
  }
  static double N67973b161400(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -2.1294187522762744) {
    p = SpeechDetector.N79a8567b1401(i);
    } else if (((Double) i[2]).doubleValue() > -2.1294187522762744) {
    p = SpeechDetector.N1ac5e3a31402(i);
    } 
    return p;
  }
  static double N79a8567b1401(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -4.114959738408407) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -4.114959738408407) {
      p = 1;
    } 
    return p;
  }
  static double N1ac5e3a31402(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -2.397007864514402) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -2.397007864514402) {
      p = 0;
    } 
    return p;
  }
  static double N35e3f0101403(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -1.1763799992655415) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -1.1763799992655415) {
    p = SpeechDetector.N7a5c6141404(i);
    } 
    return p;
  }
  static double N7a5c6141404(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -3.629228305565922) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > -3.629228305565922) {
      p = 0;
    } 
    return p;
  }
  static double N146f4ef81405(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 76.46615285058344) {
    p = SpeechDetector.N17a986431406(i);
    } else if (((Double) i[0]).doubleValue() > 76.46615285058344) {
    p = SpeechDetector.N3e7e532b1411(i);
    } 
    return p;
  }
  static double N17a986431406(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 6.8916385440161445) {
    p = SpeechDetector.N7aada4d71407(i);
    } else if (((Double) i[1]).doubleValue() > 6.8916385440161445) {
      p = 0;
    } 
    return p;
  }
  static double N7aada4d71407(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.2647847788659879) {
    p = SpeechDetector.N1e215e2d1408(i);
    } else if (((Double) i[3]).doubleValue() > 0.2647847788659879) {
      p = 0;
    } 
    return p;
  }
  static double N1e215e2d1408(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 4.119225737247811) {
    p = SpeechDetector.N20adebcf1409(i);
    } else if (((Double) i[7]).doubleValue() > 4.119225737247811) {
      p = 0;
    } 
    return p;
  }
  static double N20adebcf1409(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 1.4360102605891238) {
    p = SpeechDetector.N7a5473cb1410(i);
    } else if (((Double) i[9]).doubleValue() > 1.4360102605891238) {
      p = 1;
    } 
    return p;
  }
  static double N7a5473cb1410(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -6.206422633523264) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -6.206422633523264) {
      p = 1;
    } 
    return p;
  }
  static double N3e7e532b1411(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -1.1363695372272562) {
    p = SpeechDetector.N57864c1a1412(i);
    } else if (((Double) i[7]).doubleValue() > -1.1363695372272562) {
    p = SpeechDetector.N1beaced21414(i);
    } 
    return p;
  }
  static double N57864c1a1412(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 1.0585423795895157) {
    p = SpeechDetector.N31ee6bda1413(i);
    } else if (((Double) i[6]).doubleValue() > 1.0585423795895157) {
      p = 0;
    } 
    return p;
  }
  static double N31ee6bda1413(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 1.0250615771605869) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 1.0250615771605869) {
      p = 0;
    } 
    return p;
  }
  static double N1beaced21414(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 5.202524609759491) {
    p = SpeechDetector.N54b04b4f1415(i);
    } else if (((Double) i[1]).doubleValue() > 5.202524609759491) {
      p = 0;
    } 
    return p;
  }
  static double N54b04b4f1415(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -4.267509441874554) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -4.267509441874554) {
    p = SpeechDetector.N2205af91416(i);
    } 
    return p;
  }
  static double N2205af91416(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -3.846968603931128) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > -3.846968603931128) {
    p = SpeechDetector.N1a3492861417(i);
    } 
    return p;
  }
  static double N1a3492861417(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -0.9270042577660724) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -0.9270042577660724) {
      p = 1;
    } 
    return p;
  }
  static double N717fa8da1418(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 50.91316709480072) {
    p = SpeechDetector.N7426ba6c1419(i);
    } else if (((Double) i[0]).doubleValue() > 50.91316709480072) {
    p = SpeechDetector.N6e235b01497(i);
    } 
    return p;
  }
  static double N7426ba6c1419(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -1.360752114714452) {
    p = SpeechDetector.N1a9944071420(i);
    } else if (((Double) i[5]).doubleValue() > -1.360752114714452) {
    p = SpeechDetector.N1c371c721442(i);
    } 
    return p;
  }
  static double N1a9944071420(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 2.0110253780258205) {
    p = SpeechDetector.N444135351421(i);
    } else if (((Double) i[6]).doubleValue() > 2.0110253780258205) {
    p = SpeechDetector.N2ad13d801436(i);
    } 
    return p;
  }
  static double N444135351421(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 7.106481004238175) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 7.106481004238175) {
    p = SpeechDetector.N150c4d951422(i);
    } 
    return p;
  }
  static double N150c4d951422(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.9777587012714769) {
    p = SpeechDetector.N5ab97bfe1423(i);
    } else if (((Double) i[3]).doubleValue() > 0.9777587012714769) {
    p = SpeechDetector.Ndc74fee1428(i);
    } 
    return p;
  }
  static double N5ab97bfe1423(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 1.0479213259409208) {
    p = SpeechDetector.N477b8f3a1424(i);
    } else if (((Double) i[7]).doubleValue() > 1.0479213259409208) {
    p = SpeechDetector.N2da80eff1426(i);
    } 
    return p;
  }
  static double N477b8f3a1424(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.0852137782891198) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 1.0852137782891198) {
    p = SpeechDetector.Nf84d801425(i);
    } 
    return p;
  }
  static double Nf84d801425(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.4561321164754878) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.4561321164754878) {
      p = 1;
    } 
    return p;
  }
  static double N2da80eff1426(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.4658001959044195) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 0.4658001959044195) {
    p = SpeechDetector.N74709ec31427(i);
    } 
    return p;
  }
  static double N74709ec31427(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -1.910240662588278) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -1.910240662588278) {
      p = 1;
    } 
    return p;
  }
  static double Ndc74fee1428(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -2.9775952937275094) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -2.9775952937275094) {
    p = SpeechDetector.N185099531429(i);
    } 
    return p;
  }
  static double N185099531429(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -1.6565524840281263) {
    p = SpeechDetector.N5382249d1430(i);
    } else if (((Double) i[11]).doubleValue() > -1.6565524840281263) {
    p = SpeechDetector.N100a126a1432(i);
    } 
    return p;
  }
  static double N5382249d1430(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 2.4954403861830143) {
    p = SpeechDetector.N531ea401431(i);
    } else if (((Double) i[7]).doubleValue() > 2.4954403861830143) {
      p = 0;
    } 
    return p;
  }
  static double N531ea401431(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -2.22704483729359) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -2.22704483729359) {
      p = 1;
    } 
    return p;
  }
  static double N100a126a1432(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -0.15638844754679074) {
    p = SpeechDetector.N53ef5601433(i);
    } else if (((Double) i[11]).doubleValue() > -0.15638844754679074) {
    p = SpeechDetector.N52cd65b81435(i);
    } 
    return p;
  }
  static double N53ef5601433(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 49.25521761685117) {
    p = SpeechDetector.N685f74501434(i);
    } else if (((Double) i[0]).doubleValue() > 49.25521761685117) {
      p = 0;
    } 
    return p;
  }
  static double N685f74501434(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 0.12710585926167578) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 0.12710585926167578) {
      p = 0;
    } 
    return p;
  }
  static double N52cd65b81435(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.2720619011054266) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 2.2720619011054266) {
      p = 0;
    } 
    return p;
  }
  static double N2ad13d801436(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.0584289298204397) {
    p = SpeechDetector.Nf1cb4761437(i);
    } else if (((Double) i[4]).doubleValue() > 1.0584289298204397) {
    p = SpeechDetector.N778980971439(i);
    } 
    return p;
  }
  static double Nf1cb4761437(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 4.119348180900936) {
    p = SpeechDetector.N258bb6ba1438(i);
    } else if (((Double) i[6]).doubleValue() > 4.119348180900936) {
      p = 1;
    } 
    return p;
  }
  static double N258bb6ba1438(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 4.394180387057205) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 4.394180387057205) {
      p = 0;
    } 
    return p;
  }
  static double N778980971439(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -1.3240678913912072) {
    p = SpeechDetector.N645976d01440(i);
    } else if (((Double) i[10]).doubleValue() > -1.3240678913912072) {
    p = SpeechDetector.N2d8785281441(i);
    } 
    return p;
  }
  static double N645976d01440(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5.293794574685847) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 5.293794574685847) {
      p = 0;
    } 
    return p;
  }
  static double N2d8785281441(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -0.7604817012062421) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -0.7604817012062421) {
      p = 0;
    } 
    return p;
  }
  static double N1c371c721442(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 5.427600109452815) {
    p = SpeechDetector.N662c8ed61443(i);
    } else if (((Double) i[1]).doubleValue() > 5.427600109452815) {
    p = SpeechDetector.N22c2c8d1447(i);
    } 
    return p;
  }
  static double N662c8ed61443(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 3.6488658687969395) {
    p = SpeechDetector.N7755b8011444(i);
    } else if (((Double) i[3]).doubleValue() > 3.6488658687969395) {
      p = 0;
    } 
    return p;
  }
  static double N7755b8011444(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 8.678128810348747) {
    p = SpeechDetector.N1ca386dc1445(i);
    } else if (((Double) i[2]).doubleValue() > 8.678128810348747) {
      p = 0;
    } 
    return p;
  }
  static double N1ca386dc1445(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 3.9431282736676123) {
    p = SpeechDetector.N33eae4341446(i);
    } else if (((Double) i[8]).doubleValue() > 3.9431282736676123) {
      p = 1;
    } 
    return p;
  }
  static double N33eae4341446(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 2.313864638600181) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > 2.313864638600181) {
      p = 1;
    } 
    return p;
  }
  static double N22c2c8d1447(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 0.057625316561345306) {
    p = SpeechDetector.N2220de181448(i);
    } else if (((Double) i[10]).doubleValue() > 0.057625316561345306) {
    p = SpeechDetector.N190900401478(i);
    } 
    return p;
  }
  static double N2220de181448(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 1.729005805958105) {
    p = SpeechDetector.N1bd50b291449(i);
    } else if (((Double) i[3]).doubleValue() > 1.729005805958105) {
    p = SpeechDetector.N56a176f41458(i);
    } 
    return p;
  }
  static double N1bd50b291449(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.9345686565892) {
    p = SpeechDetector.N3fcfbf051450(i);
    } else if (((Double) i[6]).doubleValue() > 0.9345686565892) {
      p = 1;
    } 
    return p;
  }
  static double N3fcfbf051450(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.5596371132625585) {
    p = SpeechDetector.N600601fd1451(i);
    } else if (((Double) i[9]).doubleValue() > 0.5596371132625585) {
    p = SpeechDetector.N6effba071455(i);
    } 
    return p;
  }
  static double N600601fd1451(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.36830188041484374) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.36830188041484374) {
    p = SpeechDetector.N2a6cba4b1452(i);
    } 
    return p;
  }
  static double N2a6cba4b1452(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -0.2902825605769554) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > -0.2902825605769554) {
    p = SpeechDetector.N483aa7af1453(i);
    } 
    return p;
  }
  static double N483aa7af1453(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.36255370660212843) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 0.36255370660212843) {
    p = SpeechDetector.N2d6f7351454(i);
    } 
    return p;
  }
  static double N2d6f7351454(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 0.6058444677831752) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > 0.6058444677831752) {
      p = 1;
    } 
    return p;
  }
  static double N6effba071455(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 6.03910020980589) {
    p = SpeechDetector.N570e5a7f1456(i);
    } else if (((Double) i[2]).doubleValue() > 6.03910020980589) {
      p = 1;
    } 
    return p;
  }
  static double N570e5a7f1456(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= 0.41396034386529135) {
    p = SpeechDetector.N6f57747f1457(i);
    } else if (((Double) i[11]).doubleValue() > 0.41396034386529135) {
      p = 0;
    } 
    return p;
  }
  static double N6f57747f1457(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.730654234933157) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 1.730654234933157) {
      p = 0;
    } 
    return p;
  }
  static double N56a176f41458(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.318817343732414) {
    p = SpeechDetector.N288b99b1459(i);
    } else if (((Double) i[1]).doubleValue() > 6.318817343732414) {
    p = SpeechDetector.N3a20ac491464(i);
    } 
    return p;
  }
  static double N288b99b1459(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.5089311435195694) {
    p = SpeechDetector.N5e5170691460(i);
    } else if (((Double) i[7]).doubleValue() > 0.5089311435195694) {
      p = 0;
    } 
    return p;
  }
  static double N5e5170691460(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -1.021877895421476) {
    p = SpeechDetector.N34ab2ddf1461(i);
    } else if (((Double) i[11]).doubleValue() > -1.021877895421476) {
      p = 1;
    } 
    return p;
  }
  static double N34ab2ddf1461(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -2.429695346965227) {
    p = SpeechDetector.N5250a67c1462(i);
    } else if (((Double) i[11]).doubleValue() > -2.429695346965227) {
      p = 0;
    } 
    return p;
  }
  static double N5250a67c1462(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 4.103392060839131) {
    p = SpeechDetector.N2ce2411c1463(i);
    } else if (((Double) i[2]).doubleValue() > 4.103392060839131) {
      p = 1;
    } 
    return p;
  }
  static double N2ce2411c1463(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 3.2224556281580137) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 3.2224556281580137) {
      p = 1;
    } 
    return p;
  }
  static double N3a20ac491464(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 1.2364438333050325) {
    p = SpeechDetector.N370f0a6f1465(i);
    } else if (((Double) i[5]).doubleValue() > 1.2364438333050325) {
      p = 1;
    } 
    return p;
  }
  static double N370f0a6f1465(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 8.060145224908135) {
    p = SpeechDetector.N3c7619a61466(i);
    } else if (((Double) i[1]).doubleValue() > 8.060145224908135) {
      p = 1;
    } 
    return p;
  }
  static double N3c7619a61466(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 3.4025085418401195) {
    p = SpeechDetector.N6d8e004c1467(i);
    } else if (((Double) i[6]).doubleValue() > 3.4025085418401195) {
    p = SpeechDetector.N58c7941f1476(i);
    } 
    return p;
  }
  static double N6d8e004c1467(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 4.42259850974352) {
    p = SpeechDetector.N5b5b5c51468(i);
    } else if (((Double) i[2]).doubleValue() > 4.42259850974352) {
    p = SpeechDetector.N474268351475(i);
    } 
    return p;
  }
  static double N5b5b5c51468(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 1.4007346141708648) {
    p = SpeechDetector.N5cb09b701469(i);
    } else if (((Double) i[6]).doubleValue() > 1.4007346141708648) {
    p = SpeechDetector.N6cf5e1591473(i);
    } 
    return p;
  }
  static double N5cb09b701469(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 1.8354039954164134) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 1.8354039954164134) {
    p = SpeechDetector.N4ead059a1470(i);
    } 
    return p;
  }
  static double N4ead059a1470(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 1.9999189715246883) {
    p = SpeechDetector.N414ae9d01471(i);
    } else if (((Double) i[7]).doubleValue() > 1.9999189715246883) {
      p = 0;
    } 
    return p;
  }
  static double N414ae9d01471(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -0.003651948598545028) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > -0.003651948598545028) {
    p = SpeechDetector.N1d3c782d1472(i);
    } 
    return p;
  }
  static double N1d3c782d1472(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.24695807336360484) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.24695807336360484) {
      p = 1;
    } 
    return p;
  }
  static double N6cf5e1591473(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 3.588592677071675) {
    p = SpeechDetector.N29dd1f21474(i);
    } else if (((Double) i[2]).doubleValue() > 3.588592677071675) {
      p = 1;
    } 
    return p;
  }
  static double N29dd1f21474(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 2.551666374771501) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 2.551666374771501) {
      p = 1;
    } 
    return p;
  }
  static double N474268351475(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 2.5949030672779876) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 2.5949030672779876) {
      p = 0;
    } 
    return p;
  }
  static double N58c7941f1476(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.750007546173764) {
    p = SpeechDetector.N16cdacc21477(i);
    } else if (((Double) i[1]).doubleValue() > 6.750007546173764) {
      p = 1;
    } 
    return p;
  }
  static double N16cdacc21477(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 4.411541774953073) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 4.411541774953073) {
      p = 0;
    } 
    return p;
  }
  static double N190900401478(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.5943785075800996) {
    p = SpeechDetector.N1def76971479(i);
    } else if (((Double) i[3]).doubleValue() > 2.5943785075800996) {
    p = SpeechDetector.N610fab1b1494(i);
    } 
    return p;
  }
  static double N1def76971479(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.9705455395060314) {
    p = SpeechDetector.N5452c2db1480(i);
    } else if (((Double) i[6]).doubleValue() > 0.9705455395060314) {
    p = SpeechDetector.N2286d401487(i);
    } 
    return p;
  }
  static double N5452c2db1480(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.5095477247764055) {
    p = SpeechDetector.N576e31d1481(i);
    } else if (((Double) i[4]).doubleValue() > 0.5095477247764055) {
      p = 0;
    } 
    return p;
  }
  static double N576e31d1481(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -1.9919903654399884) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -1.9919903654399884) {
    p = SpeechDetector.N403887b81482(i);
    } 
    return p;
  }
  static double N403887b81482(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.8694644518545903) {
    p = SpeechDetector.N3f5661f81483(i);
    } else if (((Double) i[7]).doubleValue() > 0.8694644518545903) {
    p = SpeechDetector.N403a01441484(i);
    } 
    return p;
  }
  static double N3f5661f81483(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 1.9902642221900175) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 1.9902642221900175) {
      p = 0;
    } 
    return p;
  }
  static double N403a01441484(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.8325775324604962) {
    p = SpeechDetector.N2029384d1485(i);
    } else if (((Double) i[3]).doubleValue() > 0.8325775324604962) {
      p = 1;
    } 
    return p;
  }
  static double N2029384d1485(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 3.0095595170391074) {
    p = SpeechDetector.N722f57b91486(i);
    } else if (((Double) i[8]).doubleValue() > 3.0095595170391074) {
      p = 1;
    } 
    return p;
  }
  static double N722f57b91486(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.3569988600827229) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.3569988600827229) {
      p = 1;
    } 
    return p;
  }
  static double N2286d401487(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.3304954888610076) {
    p = SpeechDetector.N2c1c85db1488(i);
    } else if (((Double) i[5]).doubleValue() > -0.3304954888610076) {
      p = 1;
    } 
    return p;
  }
  static double N2c1c85db1488(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.5119654517767076) {
    p = SpeechDetector.N498037d1489(i);
    } else if (((Double) i[9]).doubleValue() > 0.5119654517767076) {
    p = SpeechDetector.N180d05e61490(i);
    } 
    return p;
  }
  static double N498037d1489(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -1.183113822488115) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -1.183113822488115) {
      p = 1;
    } 
    return p;
  }
  static double N180d05e61490(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 3.4816804072506153) {
    p = SpeechDetector.N7efe4b5f1491(i);
    } else if (((Double) i[8]).doubleValue() > 3.4816804072506153) {
      p = 1;
    } 
    return p;
  }
  static double N7efe4b5f1491(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 1.9017107378478895) {
    p = SpeechDetector.N69068b1b1492(i);
    } else if (((Double) i[8]).doubleValue() > 1.9017107378478895) {
      p = 0;
    } 
    return p;
  }
  static double N69068b1b1492(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.4956303951167139) {
    p = SpeechDetector.N2c96cf7b1493(i);
    } else if (((Double) i[5]).doubleValue() > -0.4956303951167139) {
      p = 0;
    } 
    return p;
  }
  static double N2c96cf7b1493(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 1.9805377635137864) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 1.9805377635137864) {
      p = 1;
    } 
    return p;
  }
  static double N610fab1b1494(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 49.55889039329655) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 49.55889039329655) {
    p = SpeechDetector.N4baaab651495(i);
    } 
    return p;
  }
  static double N4baaab651495(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -2.4016737693182515) {
    p = SpeechDetector.N31da9ab21496(i);
    } else if (((Double) i[11]).doubleValue() > -2.4016737693182515) {
      p = 0;
    } 
    return p;
  }
  static double N31da9ab21496(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 7.191674730918413) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 7.191674730918413) {
      p = 0;
    } 
    return p;
  }
  static double N6e235b01497(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 3.722834490704673) {
    p = SpeechDetector.N6d32b9571498(i);
    } else if (((Double) i[4]).doubleValue() > 3.722834490704673) {
    p = SpeechDetector.N45b271cc1711(i);
    } 
    return p;
  }
  static double N6d32b9571498(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 4.9774416979318925) {
    p = SpeechDetector.N1d2636c31499(i);
    } else if (((Double) i[2]).doubleValue() > 4.9774416979318925) {
    p = SpeechDetector.Ne8f7a301642(i);
    } 
    return p;
  }
  static double N1d2636c31499(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 0.1492556046248877) {
    p = SpeechDetector.N37d54b281500(i);
    } else if (((Double) i[11]).doubleValue() > 0.1492556046248877) {
    p = SpeechDetector.N274399a31593(i);
    } 
    return p;
  }
  static double N37d54b281500(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 52.488041495023474) {
    p = SpeechDetector.N14394bbb1501(i);
    } else if (((Double) i[0]).doubleValue() > 52.488041495023474) {
    p = SpeechDetector.N33e2108b1523(i);
    } 
    return p;
  }
  static double N14394bbb1501(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 2.7186052255875106) {
    p = SpeechDetector.N3d9aec5c1502(i);
    } else if (((Double) i[6]).doubleValue() > 2.7186052255875106) {
      p = 1;
    } 
    return p;
  }
  static double N3d9aec5c1502(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.4549555363279661) {
    p = SpeechDetector.N613ab9d1503(i);
    } else if (((Double) i[3]).doubleValue() > 0.4549555363279661) {
    p = SpeechDetector.N35f430231508(i);
    } 
    return p;
  }
  static double N613ab9d1503(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -1.8417497143245534) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -1.8417497143245534) {
    p = SpeechDetector.N7567d3881504(i);
    } 
    return p;
  }
  static double N7567d3881504(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -0.791944594194927) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > -0.791944594194927) {
    p = SpeechDetector.N7370c1ef1505(i);
    } 
    return p;
  }
  static double N7370c1ef1505(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.8520286377293735) {
    p = SpeechDetector.N6fcc6d1e1506(i);
    } else if (((Double) i[6]).doubleValue() > 0.8520286377293735) {
      p = 1;
    } 
    return p;
  }
  static double N6fcc6d1e1506(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 1.0539743970588344) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 1.0539743970588344) {
    p = SpeechDetector.N561005e91507(i);
    } 
    return p;
  }
  static double N561005e91507(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 4.015332531248539) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 4.015332531248539) {
      p = 1;
    } 
    return p;
  }
  static double N35f430231508(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -0.7645740275888346) {
    p = SpeechDetector.N328465811509(i);
    } else if (((Double) i[10]).doubleValue() > -0.7645740275888346) {
    p = SpeechDetector.N6361f41e1522(i);
    } 
    return p;
  }
  static double N328465811509(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 0.34340554469316115) {
    p = SpeechDetector.N122412101510(i);
    } else if (((Double) i[5]).doubleValue() > 0.34340554469316115) {
    p = SpeechDetector.N54793c3d1521(i);
    } 
    return p;
  }
  static double N122412101510(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -2.1431853172329016) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -2.1431853172329016) {
    p = SpeechDetector.N7e1de1bd1511(i);
    } 
    return p;
  }
  static double N7e1de1bd1511(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -3.015899398853146) {
    p = SpeechDetector.N5bcf7ffa1512(i);
    } else if (((Double) i[11]).doubleValue() > -3.015899398853146) {
    p = SpeechDetector.N1865b78a1514(i);
    } 
    return p;
  }
  static double N5bcf7ffa1512(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -2.017869290986585) {
    p = SpeechDetector.N13db252d1513(i);
    } else if (((Double) i[5]).doubleValue() > -2.017869290986585) {
      p = 1;
    } 
    return p;
  }
  static double N13db252d1513(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 1.085439286257173) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > 1.085439286257173) {
      p = 1;
    } 
    return p;
  }
  static double N1865b78a1514(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -0.07371544471932968) {
    p = SpeechDetector.N3df4d1891515(i);
    } else if (((Double) i[9]).doubleValue() > -0.07371544471932968) {
    p = SpeechDetector.N1856766e1520(i);
    } 
    return p;
  }
  static double N3df4d1891515(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.617737593102512) {
    p = SpeechDetector.N13e899261516(i);
    } else if (((Double) i[7]).doubleValue() > 0.617737593102512) {
    p = SpeechDetector.N590d2df51518(i);
    } 
    return p;
  }
  static double N13e899261516(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -0.5351851608288918) {
    p = SpeechDetector.Nb9e98001517(i);
    } else if (((Double) i[7]).doubleValue() > -0.5351851608288918) {
      p = 1;
    } 
    return p;
  }
  static double Nb9e98001517(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -1.946768281176746) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -1.946768281176746) {
      p = 1;
    } 
    return p;
  }
  static double N590d2df51518(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -2.134570834938116) {
    p = SpeechDetector.N70445d7f1519(i);
    } else if (((Double) i[9]).doubleValue() > -2.134570834938116) {
      p = 0;
    } 
    return p;
  }
  static double N70445d7f1519(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 51.98254937081512) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 51.98254937081512) {
      p = 0;
    } 
    return p;
  }
  static double N1856766e1520(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 3.848936246813207) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 3.848936246813207) {
      p = 1;
    } 
    return p;
  }
  static double N54793c3d1521(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 2.563981324787993) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 2.563981324787993) {
      p = 0;
    } 
    return p;
  }
  static double N6361f41e1522(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 3.876067446666914) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 3.876067446666914) {
      p = 1;
    } 
    return p;
  }
  static double N33e2108b1523(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.8466698375439113) {
    p = SpeechDetector.N3eac30491524(i);
    } else if (((Double) i[8]).doubleValue() > 0.8466698375439113) {
    p = SpeechDetector.N7ff7a6d31569(i);
    } 
    return p;
  }
  static double N3eac30491524(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -2.102341426821257) {
    p = SpeechDetector.N1a9628c41525(i);
    } else if (((Double) i[11]).doubleValue() > -2.102341426821257) {
    p = SpeechDetector.N2170a3ab1541(i);
    } 
    return p;
  }
  static double N1a9628c41525(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 53.91719485722525) {
    p = SpeechDetector.N784e697e1526(i);
    } else if (((Double) i[0]).doubleValue() > 53.91719485722525) {
    p = SpeechDetector.N24df034c1528(i);
    } 
    return p;
  }
  static double N784e697e1526(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -0.8301347397812123) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -0.8301347397812123) {
    p = SpeechDetector.N63f00ce61527(i);
    } 
    return p;
  }
  static double N63f00ce61527(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -3.547495988067948) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -3.547495988067948) {
      p = 0;
    } 
    return p;
  }
  static double N24df034c1528(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 3.418484596344093) {
    p = SpeechDetector.N2d51857d1529(i);
    } else if (((Double) i[2]).doubleValue() > 3.418484596344093) {
      p = 0;
    } 
    return p;
  }
  static double N2d51857d1529(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 60.542683862010726) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 60.542683862010726) {
    p = SpeechDetector.N4312e8c91530(i);
    } 
    return p;
  }
  static double N4312e8c91530(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -4.172648148406295) {
    p = SpeechDetector.Ne7106861531(i);
    } else if (((Double) i[4]).doubleValue() > -4.172648148406295) {
    p = SpeechDetector.N310af6ac1539(i);
    } 
    return p;
  }
  static double Ne7106861531(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 6.633150113086966) {
    p = SpeechDetector.N1e634ed21532(i);
    } else if (((Double) i[1]).doubleValue() > 6.633150113086966) {
      p = 0;
    } 
    return p;
  }
  static double N1e634ed21532(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 1.3203883633980804) {
    p = SpeechDetector.N9cbcc941533(i);
    } else if (((Double) i[5]).doubleValue() > 1.3203883633980804) {
      p = 0;
    } 
    return p;
  }
  static double N9cbcc941533(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.3312468643741707) {
    p = SpeechDetector.N22e40d921534(i);
    } else if (((Double) i[6]).doubleValue() > 0.3312468643741707) {
    p = SpeechDetector.N66c17c1536(i);
    } 
    return p;
  }
  static double N22e40d921534(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 2.8585752363313186) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 2.8585752363313186) {
    p = SpeechDetector.N2a36fe231535(i);
    } 
    return p;
  }
  static double N2a36fe231535(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -7.7172824814635) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -7.7172824814635) {
      p = 0;
    } 
    return p;
  }
  static double N66c17c1536(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -4.35184911339077) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -4.35184911339077) {
    p = SpeechDetector.N5a28b4181537(i);
    } 
    return p;
  }
  static double N5a28b4181537(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 68.23667737192076) {
    p = SpeechDetector.N2647c1e61538(i);
    } else if (((Double) i[0]).doubleValue() > 68.23667737192076) {
      p = 0;
    } 
    return p;
  }
  static double N2647c1e61538(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 64.10163739652808) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 64.10163739652808) {
      p = 1;
    } 
    return p;
  }
  static double N310af6ac1539(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -1.4108117329799696) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -1.4108117329799696) {
    p = SpeechDetector.N46c8af5b1540(i);
    } 
    return p;
  }
  static double N46c8af5b1540(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -4.695911866373212) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -4.695911866373212) {
      p = 1;
    } 
    return p;
  }
  static double N2170a3ab1541(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 62.4912614558133) {
    p = SpeechDetector.N6a0940b31542(i);
    } else if (((Double) i[0]).doubleValue() > 62.4912614558133) {
    p = SpeechDetector.N21b2b7011556(i);
    } 
    return p;
  }
  static double N6a0940b31542(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 2.3179400789023052) {
    p = SpeechDetector.N576de281543(i);
    } else if (((Double) i[3]).doubleValue() > 2.3179400789023052) {
    p = SpeechDetector.N528f70e71550(i);
    } 
    return p;
  }
  static double N576de281543(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 57.28573560417988) {
    p = SpeechDetector.N3ef316e51544(i);
    } else if (((Double) i[0]).doubleValue() > 57.28573560417988) {
    p = SpeechDetector.N67bcadab1548(i);
    } 
    return p;
  }
  static double N3ef316e51544(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -1.6838944089391807) {
    p = SpeechDetector.N496434ac1545(i);
    } else if (((Double) i[11]).doubleValue() > -1.6838944089391807) {
      p = 0;
    } 
    return p;
  }
  static double N496434ac1545(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.9198595747760152) {
    p = SpeechDetector.N51be2dd81546(i);
    } else if (((Double) i[3]).doubleValue() > 0.9198595747760152) {
      p = 1;
    } 
    return p;
  }
  static double N51be2dd81546(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 3.67395243857188) {
    p = SpeechDetector.N1cb3e9d51547(i);
    } else if (((Double) i[2]).doubleValue() > 3.67395243857188) {
      p = 0;
    } 
    return p;
  }
  static double N1cb3e9d51547(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 0.7989834216243789) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 0.7989834216243789) {
      p = 0;
    } 
    return p;
  }
  static double N67bcadab1548(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 2.129971294003057) {
    p = SpeechDetector.N142deac21549(i);
    } else if (((Double) i[2]).doubleValue() > 2.129971294003057) {
      p = 0;
    } 
    return p;
  }
  static double N142deac21549(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 60.04021194506207) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 60.04021194506207) {
      p = 1;
    } 
    return p;
  }
  static double N528f70e71550(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 54.332013324148306) {
    p = SpeechDetector.N473d78091551(i);
    } else if (((Double) i[0]).doubleValue() > 54.332013324148306) {
    p = SpeechDetector.N14041fbd1554(i);
    } 
    return p;
  }
  static double N473d78091551(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 4.374358343909496) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 4.374358343909496) {
    p = SpeechDetector.N1493bb691552(i);
    } 
    return p;
  }
  static double N1493bb691552(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 5.169688790556561) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 5.169688790556561) {
    p = SpeechDetector.N6ef4f50c1553(i);
    } 
    return p;
  }
  static double N6ef4f50c1553(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -1.9466983627482723) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -1.9466983627482723) {
      p = 0;
    } 
    return p;
  }
  static double N14041fbd1554(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 2.921512605130641) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 2.921512605130641) {
    p = SpeechDetector.N1abfbb8f1555(i);
    } 
    return p;
  }
  static double N1abfbb8f1555(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 5.895616242741737) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 5.895616242741737) {
      p = 1;
    } 
    return p;
  }
  static double N21b2b7011556(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 1.8218155020962072) {
    p = SpeechDetector.N5c0cb3ef1557(i);
    } else if (((Double) i[5]).doubleValue() > 1.8218155020962072) {
    p = SpeechDetector.Nb37dab51568(i);
    } 
    return p;
  }
  static double N5c0cb3ef1557(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.662171529489324) {
    p = SpeechDetector.N45f93f1f1558(i);
    } else if (((Double) i[1]).doubleValue() > 6.662171529489324) {
    p = SpeechDetector.N2ae7ce021563(i);
    } 
    return p;
  }
  static double N45f93f1f1558(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 71.43522114120796) {
    p = SpeechDetector.N6e9f301c1559(i);
    } else if (((Double) i[0]).doubleValue() > 71.43522114120796) {
      p = 0;
    } 
    return p;
  }
  static double N6e9f301c1559(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -2.793773100519806) {
    p = SpeechDetector.N150fb7011560(i);
    } else if (((Double) i[8]).doubleValue() > -2.793773100519806) {
      p = 1;
    } 
    return p;
  }
  static double N150fb7011560(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 1.1179228915804902) {
    p = SpeechDetector.N3ab7ad741561(i);
    } else if (((Double) i[10]).doubleValue() > 1.1179228915804902) {
      p = 1;
    } 
    return p;
  }
  static double N3ab7ad741561(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -0.5297719043219506) {
    p = SpeechDetector.N70dcb8c91562(i);
    } else if (((Double) i[5]).doubleValue() > -0.5297719043219506) {
      p = 0;
    } 
    return p;
  }
  static double N70dcb8c91562(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 2.2641494272835723) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 2.2641494272835723) {
      p = 0;
    } 
    return p;
  }
  static double N2ae7ce021563(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 3.119473172867195) {
    p = SpeechDetector.N5885fb4f1564(i);
    } else if (((Double) i[2]).doubleValue() > 3.119473172867195) {
    p = SpeechDetector.N16c79d8a1567(i);
    } 
    return p;
  }
  static double N5885fb4f1564(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 66.44015081927358) {
    p = SpeechDetector.N44362cf01565(i);
    } else if (((Double) i[0]).doubleValue() > 66.44015081927358) {
    p = SpeechDetector.N40c0638c1566(i);
    } 
    return p;
  }
  static double N44362cf01565(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -0.515378773455174) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > -0.515378773455174) {
      p = 1;
    } 
    return p;
  }
  static double N40c0638c1566(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -1.7092415600822841) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > -1.7092415600822841) {
      p = 0;
    } 
    return p;
  }
  static double N16c79d8a1567(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 1.0427941644890966) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > 1.0427941644890966) {
      p = 1;
    } 
    return p;
  }
  static double Nb37dab51568(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 4.186257342194791) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > 4.186257342194791) {
      p = 1;
    } 
    return p;
  }
  static double N7ff7a6d31569(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 62.63652432366796) {
    p = SpeechDetector.N5be9a8471570(i);
    } else if (((Double) i[0]).doubleValue() > 62.63652432366796) {
    p = SpeechDetector.N11a1f6551576(i);
    } 
    return p;
  }
  static double N5be9a8471570(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 2.3345368591297464) {
    p = SpeechDetector.N4926fc751571(i);
    } else if (((Double) i[3]).doubleValue() > 2.3345368591297464) {
    p = SpeechDetector.N1e888ad81572(i);
    } 
    return p;
  }
  static double N4926fc751571(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 1.0320537162012087) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 1.0320537162012087) {
      p = 1;
    } 
    return p;
  }
  static double N1e888ad81572(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 2.8822682379193156) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 2.8822682379193156) {
    p = SpeechDetector.N16537a911573(i);
    } 
    return p;
  }
  static double N16537a911573(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 53.96423843107516) {
    p = SpeechDetector.N4293d10a1574(i);
    } else if (((Double) i[0]).doubleValue() > 53.96423843107516) {
    p = SpeechDetector.N768109ab1575(i);
    } 
    return p;
  }
  static double N4293d10a1574(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -1.2205116017514512) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > -1.2205116017514512) {
      p = 0;
    } 
    return p;
  }
  static double N768109ab1575(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 57.35203177416643) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 57.35203177416643) {
      p = 1;
    } 
    return p;
  }
  static double N11a1f6551576(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 7.267967662009049) {
    p = SpeechDetector.N20334f7e1577(i);
    } else if (((Double) i[1]).doubleValue() > 7.267967662009049) {
    p = SpeechDetector.N14d756731588(i);
    } 
    return p;
  }
  static double N20334f7e1577(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 70.74794117382112) {
    p = SpeechDetector.N8a7e9b61578(i);
    } else if (((Double) i[0]).doubleValue() > 70.74794117382112) {
    p = SpeechDetector.N377f96af1586(i);
    } 
    return p;
  }
  static double N8a7e9b61578(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -2.7387272151592503) {
    p = SpeechDetector.N47e0b02a1579(i);
    } else if (((Double) i[6]).doubleValue() > -2.7387272151592503) {
    p = SpeechDetector.N482734051582(i);
    } 
    return p;
  }
  static double N47e0b02a1579(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 64.37794043777672) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 64.37794043777672) {
    p = SpeechDetector.N704dba431580(i);
    } 
    return p;
  }
  static double N704dba431580(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 3.2392187515353474) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 3.2392187515353474) {
    p = SpeechDetector.N7effbe4e1581(i);
    } 
    return p;
  }
  static double N7effbe4e1581(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.3075260214169616) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.3075260214169616) {
      p = 0;
    } 
    return p;
  }
  static double N482734051582(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -2.4025399427183487) {
    p = SpeechDetector.N5c859451583(i);
    } else if (((Double) i[11]).doubleValue() > -2.4025399427183487) {
    p = SpeechDetector.N245cc3fa1584(i);
    } 
    return p;
  }
  static double N5c859451583(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -2.3909404266369014) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -2.3909404266369014) {
      p = 1;
    } 
    return p;
  }
  static double N245cc3fa1584(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -7.184754000210154) {
    p = SpeechDetector.N464664bc1585(i);
    } else if (((Double) i[4]).doubleValue() > -7.184754000210154) {
      p = 1;
    } 
    return p;
  }
  static double N464664bc1585(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.4421092991156639) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -0.4421092991156639) {
      p = 0;
    } 
    return p;
  }
  static double N377f96af1586(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 72.90879182022034) {
    p = SpeechDetector.N197dd7a01587(i);
    } else if (((Double) i[0]).doubleValue() > 72.90879182022034) {
      p = 0;
    } 
    return p;
  }
  static double N197dd7a01587(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 3.425562711151235) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 3.425562711151235) {
      p = 0;
    } 
    return p;
  }
  static double N14d756731588(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 66.52613290856576) {
    p = SpeechDetector.N456ca2b51589(i);
    } else if (((Double) i[0]).doubleValue() > 66.52613290856576) {
    p = SpeechDetector.N3a3fa0851592(i);
    } 
    return p;
  }
  static double N456ca2b51589(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 62.92286820866562) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 62.92286820866562) {
    p = SpeechDetector.N5f2e3cae1590(i);
    } 
    return p;
  }
  static double N5f2e3cae1590(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 1.0442608976358414) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 1.0442608976358414) {
    p = SpeechDetector.N5491f4531591(i);
    } 
    return p;
  }
  static double N5491f4531591(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -6.871998959720904) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -6.871998959720904) {
      p = 1;
    } 
    return p;
  }
  static double N3a3fa0851592(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 5.081851183022043) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 5.081851183022043) {
      p = 1;
    } 
    return p;
  }
  static double N274399a31593(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 61.748227926096924) {
    p = SpeechDetector.N471bb0781594(i);
    } else if (((Double) i[0]).doubleValue() > 61.748227926096924) {
    p = SpeechDetector.N775152a01612(i);
    } 
    return p;
  }
  static double N471bb0781594(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.7099176013904093) {
    p = SpeechDetector.N6adebac01595(i);
    } else if (((Double) i[3]).doubleValue() > 0.7099176013904093) {
    p = SpeechDetector.N95a38b51610(i);
    } 
    return p;
  }
  static double N6adebac01595(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -3.305166783393107) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -3.305166783393107) {
    p = SpeechDetector.N44b6ca101596(i);
    } 
    return p;
  }
  static double N44b6ca101596(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -3.5635905543871926) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -3.5635905543871926) {
    p = SpeechDetector.N3c8c03ae1597(i);
    } 
    return p;
  }
  static double N3c8c03ae1597(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 3.7875291526261075) {
    p = SpeechDetector.Nc45b3901598(i);
    } else if (((Double) i[2]).doubleValue() > 3.7875291526261075) {
    p = SpeechDetector.N66cd2e551605(i);
    } 
    return p;
  }
  static double Nc45b3901598(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -3.721742025977271) {
    p = SpeechDetector.N340fb93b1599(i);
    } else if (((Double) i[5]).doubleValue() > -3.721742025977271) {
    p = SpeechDetector.N7449eb301600(i);
    } 
    return p;
  }
  static double N340fb93b1599(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 56.77287170239008) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 56.77287170239008) {
      p = 1;
    } 
    return p;
  }
  static double N7449eb301600(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -1.5917332745891843) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > -1.5917332745891843) {
    p = SpeechDetector.N20efd7f51601(i);
    } 
    return p;
  }
  static double N20efd7f51601(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 0.25791113626507095) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 0.25791113626507095) {
    p = SpeechDetector.N624b26b71602(i);
    } 
    return p;
  }
  static double N624b26b71602(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 1.2613866669254385) {
    p = SpeechDetector.N33daeacb1603(i);
    } else if (((Double) i[10]).doubleValue() > 1.2613866669254385) {
      p = 1;
    } 
    return p;
  }
  static double N33daeacb1603(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 0.8479164381628852) {
    p = SpeechDetector.N696cd0051604(i);
    } else if (((Double) i[10]).doubleValue() > 0.8479164381628852) {
      p = 0;
    } 
    return p;
  }
  static double N696cd0051604(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 1.550503734045417) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 1.550503734045417) {
      p = 1;
    } 
    return p;
  }
  static double N66cd2e551605(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= 0.2133890488749795) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > 0.2133890488749795) {
    p = SpeechDetector.N289d032d1606(i);
    } 
    return p;
  }
  static double N289d032d1606(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -0.6550247632357037) {
    p = SpeechDetector.N5c3b942f1607(i);
    } else if (((Double) i[4]).doubleValue() > -0.6550247632357037) {
      p = 0;
    } 
    return p;
  }
  static double N5c3b942f1607(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 7.099019142977098) {
    p = SpeechDetector.N4b7dc8f71608(i);
    } else if (((Double) i[1]).doubleValue() > 7.099019142977098) {
      p = 1;
    } 
    return p;
  }
  static double N4b7dc8f71608(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 4.167929957454094) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 4.167929957454094) {
    p = SpeechDetector.N2f14f6d91609(i);
    } 
    return p;
  }
  static double N2f14f6d91609(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.595114484007637) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -0.595114484007637) {
      p = 1;
    } 
    return p;
  }
  static double N95a38b51610(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= -2.7255468303677635) {
    p = SpeechDetector.N240f7df1611(i);
    } else if (((Double) i[6]).doubleValue() > -2.7255468303677635) {
      p = 0;
    } 
    return p;
  }
  static double N240f7df1611(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 1.8915854604824933) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 1.8915854604824933) {
      p = 0;
    } 
    return p;
  }
  static double N775152a01612(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -1.5359231542115366) {
    p = SpeechDetector.N7c07c3921613(i);
    } else if (((Double) i[7]).doubleValue() > -1.5359231542115366) {
    p = SpeechDetector.N66c6d9251622(i);
    } 
    return p;
  }
  static double N7c07c3921613(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 2.5752209097943037) {
    p = SpeechDetector.N61b8e5db1614(i);
    } else if (((Double) i[5]).doubleValue() > 2.5752209097943037) {
      p = 0;
    } 
    return p;
  }
  static double N61b8e5db1614(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 5.73866425566435) {
    p = SpeechDetector.N31fabefc1615(i);
    } else if (((Double) i[1]).doubleValue() > 5.73866425566435) {
    p = SpeechDetector.N1c4fad41618(i);
    } 
    return p;
  }
  static double N31fabefc1615(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 4.628928691639439) {
    p = SpeechDetector.N4510ac061616(i);
    } else if (((Double) i[2]).doubleValue() > 4.628928691639439) {
      p = 0;
    } 
    return p;
  }
  static double N4510ac061616(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 1.2832496991058693) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 1.2832496991058693) {
    p = SpeechDetector.N498de1561617(i);
    } 
    return p;
  }
  static double N498de1561617(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -1.1113336600824972) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -1.1113336600824972) {
      p = 0;
    } 
    return p;
  }
  static double N1c4fad41618(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -5.2339853514023975) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -5.2339853514023975) {
    p = SpeechDetector.N2b2f75341619(i);
    } 
    return p;
  }
  static double N2b2f75341619(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -1.8101419539671293) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -1.8101419539671293) {
    p = SpeechDetector.N38b7bf121620(i);
    } 
    return p;
  }
  static double N38b7bf121620(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 1.2391243810332804) {
    p = SpeechDetector.N276153d51621(i);
    } else if (((Double) i[11]).doubleValue() > 1.2391243810332804) {
      p = 1;
    } 
    return p;
  }
  static double N276153d51621(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -2.2990292916139774) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -2.2990292916139774) {
      p = 0;
    } 
    return p;
  }
  static double N66c6d9251622(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.981206241567357) {
    p = SpeechDetector.N8da40da1623(i);
    } else if (((Double) i[1]).doubleValue() > 6.981206241567357) {
    p = SpeechDetector.N1df08c71638(i);
    } 
    return p;
  }
  static double N8da40da1623(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -2.7050723644310937) {
    p = SpeechDetector.N30d7acc01624(i);
    } else if (((Double) i[8]).doubleValue() > -2.7050723644310937) {
    p = SpeechDetector.N59a227651628(i);
    } 
    return p;
  }
  static double N30d7acc01624(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 72.40626965547143) {
    p = SpeechDetector.N1f8e8a4d1625(i);
    } else if (((Double) i[0]).doubleValue() > 72.40626965547143) {
      p = 0;
    } 
    return p;
  }
  static double N1f8e8a4d1625(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 67.54221833792123) {
    p = SpeechDetector.N4719d56a1626(i);
    } else if (((Double) i[0]).doubleValue() > 67.54221833792123) {
      p = 1;
    } 
    return p;
  }
  static double N4719d56a1626(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 3.6128686489906223) {
    p = SpeechDetector.N710a469d1627(i);
    } else if (((Double) i[6]).doubleValue() > 3.6128686489906223) {
      p = 1;
    } 
    return p;
  }
  static double N710a469d1627(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 0.30407701345535243) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > 0.30407701345535243) {
      p = 1;
    } 
    return p;
  }
  static double N59a227651628(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 3.0887513966957627) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 3.0887513966957627) {
    p = SpeechDetector.N24c885dc1629(i);
    } 
    return p;
  }
  static double N24c885dc1629(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 2.348601415380615) {
    p = SpeechDetector.N68cc41611630(i);
    } else if (((Double) i[10]).doubleValue() > 2.348601415380615) {
      p = 1;
    } 
    return p;
  }
  static double N68cc41611630(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.4174366466497175) {
    p = SpeechDetector.N39d87d071631(i);
    } else if (((Double) i[5]).doubleValue() > -0.4174366466497175) {
    p = SpeechDetector.N7c9729cb1633(i);
    } 
    return p;
  }
  static double N39d87d071631(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.099134206410838) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 6.099134206410838) {
    p = SpeechDetector.N33f8743c1632(i);
    } 
    return p;
  }
  static double N33f8743c1632(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -0.5218489091624884) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -0.5218489091624884) {
      p = 0;
    } 
    return p;
  }
  static double N7c9729cb1633(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 4.857259692711384) {
    p = SpeechDetector.N28390e541634(i);
    } else if (((Double) i[6]).doubleValue() > 4.857259692711384) {
      p = 1;
    } 
    return p;
  }
  static double N28390e541634(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 4.711507065819816) {
    p = SpeechDetector.N39dbc16d1635(i);
    } else if (((Double) i[2]).doubleValue() > 4.711507065819816) {
    p = SpeechDetector.N4a6e17d61637(i);
    } 
    return p;
  }
  static double N39dbc16d1635(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 3.8544698836955575) {
    p = SpeechDetector.Na77f8c81636(i);
    } else if (((Double) i[2]).doubleValue() > 3.8544698836955575) {
      p = 0;
    } 
    return p;
  }
  static double Na77f8c81636(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 1.368570356624382) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 1.368570356624382) {
      p = 1;
    } 
    return p;
  }
  static double N4a6e17d61637(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 1.2347677098504368) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 1.2347677098504368) {
      p = 1;
    } 
    return p;
  }
  static double N1df08c71638(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -1.1490856516259704) {
    p = SpeechDetector.N59b941c61639(i);
    } else if (((Double) i[5]).doubleValue() > -1.1490856516259704) {
      p = 1;
    } 
    return p;
  }
  static double N59b941c61639(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -0.41370560232392445) {
    p = SpeechDetector.N118d5c2f1640(i);
    } else if (((Double) i[8]).doubleValue() > -0.41370560232392445) {
    p = SpeechDetector.N579f1aa91641(i);
    } 
    return p;
  }
  static double N118d5c2f1640(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -0.31112658490462347) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -0.31112658490462347) {
      p = 0;
    } 
    return p;
  }
  static double N579f1aa91641(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 2.3579237529836465) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 2.3579237529836465) {
      p = 1;
    } 
    return p;
  }
  static double Ne8f7a301642(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -6.769174318481559) {
    p = SpeechDetector.N6d9eecc71643(i);
    } else if (((Double) i[7]).doubleValue() > -6.769174318481559) {
    p = SpeechDetector.N5ccb350a1644(i);
    } 
    return p;
  }
  static double N6d9eecc71643(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 67.57199859424405) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 67.57199859424405) {
      p = 1;
    } 
    return p;
  }
  static double N5ccb350a1644(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -4.243478938937216) {
    p = SpeechDetector.N2107531e1645(i);
    } else if (((Double) i[4]).doubleValue() > -4.243478938937216) {
    p = SpeechDetector.N64f1cc431656(i);
    } 
    return p;
  }
  static double N2107531e1645(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 58.63680022420188) {
    p = SpeechDetector.N67e1e7821646(i);
    } else if (((Double) i[0]).doubleValue() > 58.63680022420188) {
    p = SpeechDetector.Nb728b4b1653(i);
    } 
    return p;
  }
  static double N67e1e7821646(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 1.103257852971442) {
    p = SpeechDetector.N20263d161647(i);
    } else if (((Double) i[3]).doubleValue() > 1.103257852971442) {
    p = SpeechDetector.N74795f8b1650(i);
    } 
    return p;
  }
  static double N20263d161647(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -2.007219733532227) {
    p = SpeechDetector.N2e747fd71648(i);
    } else if (((Double) i[7]).doubleValue() > -2.007219733532227) {
      p = 0;
    } 
    return p;
  }
  static double N2e747fd71648(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -4.7183320641006565) {
    p = SpeechDetector.N627514141649(i);
    } else if (((Double) i[7]).doubleValue() > -4.7183320641006565) {
      p = 1;
    } 
    return p;
  }
  static double N627514141649(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 5.937529680966841) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 5.937529680966841) {
      p = 1;
    } 
    return p;
  }
  static double N74795f8b1650(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -5.045209542207477) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -5.045209542207477) {
    p = SpeechDetector.N4c6fda6a1651(i);
    } 
    return p;
  }
  static double N4c6fda6a1651(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -4.984000218619204) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -4.984000218619204) {
    p = SpeechDetector.N436c8c5a1652(i);
    } 
    return p;
  }
  static double N436c8c5a1652(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -3.4386836420433458) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -3.4386836420433458) {
      p = 0;
    } 
    return p;
  }
  static double Nb728b4b1653(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 3.684348320534654) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 3.684348320534654) {
    p = SpeechDetector.Nd16eecc1654(i);
    } 
    return p;
  }
  static double Nd16eecc1654(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.7367554761161222) {
    p = SpeechDetector.N5c9799ca1655(i);
    } else if (((Double) i[3]).doubleValue() > 0.7367554761161222) {
      p = 0;
    } 
    return p;
  }
  static double N5c9799ca1655(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 6.597976082009968) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 6.597976082009968) {
      p = 0;
    } 
    return p;
  }
  static double N64f1cc431656(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 0.9560622514707298) {
    p = SpeechDetector.N3e99767b1657(i);
    } else if (((Double) i[5]).doubleValue() > 0.9560622514707298) {
    p = SpeechDetector.N3729298c1691(i);
    } 
    return p;
  }
  static double N3e99767b1657(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 6.558273614142333) {
    p = SpeechDetector.N4d31a5581658(i);
    } else if (((Double) i[2]).doubleValue() > 6.558273614142333) {
    p = SpeechDetector.N7e7f73d21676(i);
    } 
    return p;
  }
  static double N4d31a5581658(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 4.493590811024938) {
    p = SpeechDetector.N765e5bff1659(i);
    } else if (((Double) i[6]).doubleValue() > 4.493590811024938) {
    p = SpeechDetector.N32f50bf41670(i);
    } 
    return p;
  }
  static double N765e5bff1659(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 2.2047584667559903) {
    p = SpeechDetector.N2ce9ff0f1660(i);
    } else if (((Double) i[3]).doubleValue() > 2.2047584667559903) {
    p = SpeechDetector.N85171e01667(i);
    } 
    return p;
  }
  static double N2ce9ff0f1660(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 7.642018702236157) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 7.642018702236157) {
    p = SpeechDetector.N366848d21661(i);
    } 
    return p;
  }
  static double N366848d21661(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 59.61752212161897) {
    p = SpeechDetector.N7884eee51662(i);
    } else if (((Double) i[0]).doubleValue() > 59.61752212161897) {
      p = 0;
    } 
    return p;
  }
  static double N7884eee51662(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 1.9216970394897936) {
    p = SpeechDetector.N5f603a331663(i);
    } else if (((Double) i[7]).doubleValue() > 1.9216970394897936) {
      p = 0;
    } 
    return p;
  }
  static double N5f603a331663(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.5803370033545091) {
    p = SpeechDetector.N268d1b301664(i);
    } else if (((Double) i[4]).doubleValue() > 0.5803370033545091) {
    p = SpeechDetector.N231a1401666(i);
    } 
    return p;
  }
  static double N268d1b301664(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 51.98104880553316) {
    p = SpeechDetector.N79f400151665(i);
    } else if (((Double) i[0]).doubleValue() > 51.98104880553316) {
      p = 1;
    } 
    return p;
  }
  static double N79f400151665(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 1.1055823974874424) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 1.1055823974874424) {
      p = 0;
    } 
    return p;
  }
  static double N231a1401666(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 52.6610313830833) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 52.6610313830833) {
      p = 0;
    } 
    return p;
  }
  static double N85171e01667(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -4.959659284095028) {
    p = SpeechDetector.N1b0b2d641668(i);
    } else if (((Double) i[5]).doubleValue() > -4.959659284095028) {
      p = 0;
    } 
    return p;
  }
  static double N1b0b2d641668(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5.675752382618912) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 5.675752382618912) {
    p = SpeechDetector.N7ad10e1a1669(i);
    } 
    return p;
  }
  static double N7ad10e1a1669(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 53.747156053120015) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 53.747156053120015) {
      p = 0;
    } 
    return p;
  }
  static double N32f50bf41670(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 52.42800196326704) {
    p = SpeechDetector.N75e3da4e1671(i);
    } else if (((Double) i[0]).doubleValue() > 52.42800196326704) {
    p = SpeechDetector.N7abf9f21673(i);
    } 
    return p;
  }
  static double N75e3da4e1671(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -1.6337799463542468) {
    p = SpeechDetector.N421173591672(i);
    } else if (((Double) i[10]).doubleValue() > -1.6337799463542468) {
      p = 1;
    } 
    return p;
  }
  static double N421173591672(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 6.697283473608929) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 6.697283473608929) {
      p = 1;
    } 
    return p;
  }
  static double N7abf9f21673(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 61.5798496131568) {
    p = SpeechDetector.N2ba682cd1674(i);
    } else if (((Double) i[0]).doubleValue() > 61.5798496131568) {
      p = 1;
    } 
    return p;
  }
  static double N2ba682cd1674(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 53.48418189832513) {
    p = SpeechDetector.N40d5771e1675(i);
    } else if (((Double) i[0]).doubleValue() > 53.48418189832513) {
      p = 0;
    } 
    return p;
  }
  static double N40d5771e1675(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 5.532670552865055) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 5.532670552865055) {
      p = 1;
    } 
    return p;
  }
  static double N7e7f73d21676(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -3.163839794037282) {
    p = SpeechDetector.N618d20df1677(i);
    } else if (((Double) i[7]).doubleValue() > -3.163839794037282) {
    p = SpeechDetector.N22d5acc31683(i);
    } 
    return p;
  }
  static double N618d20df1677(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.6117833437689878) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -0.6117833437689878) {
    p = SpeechDetector.N786942811678(i);
    } 
    return p;
  }
  static double N786942811678(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 54.15660374999363) {
    p = SpeechDetector.N468d60e91679(i);
    } else if (((Double) i[0]).doubleValue() > 54.15660374999363) {
    p = SpeechDetector.Nf1ac6511681(i);
    } 
    return p;
  }
  static double N468d60e91679(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.2696344954635412) {
    p = SpeechDetector.N6bd5852e1680(i);
    } else if (((Double) i[3]).doubleValue() > 2.2696344954635412) {
      p = 0;
    } 
    return p;
  }
  static double N6bd5852e1680(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -4.71440604453164) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -4.71440604453164) {
      p = 1;
    } 
    return p;
  }
  static double Nf1ac6511681(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -2.3298486024144047) {
    p = SpeechDetector.N26d1f7961682(i);
    } else if (((Double) i[9]).doubleValue() > -2.3298486024144047) {
      p = 0;
    } 
    return p;
  }
  static double N26d1f7961682(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -4.4160678996786595) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > -4.4160678996786595) {
      p = 1;
    } 
    return p;
  }
  static double N22d5acc31683(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -0.5975273286276517) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -0.5975273286276517) {
    p = SpeechDetector.N7a4148121684(i);
    } 
    return p;
  }
  static double N7a4148121684(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.4738427067772649) {
    p = SpeechDetector.N53e2d4721685(i);
    } else if (((Double) i[3]).doubleValue() > -0.4738427067772649) {
    p = SpeechDetector.N1f0093bc1687(i);
    } 
    return p;
  }
  static double N53e2d4721685(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.020824890975056694) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 0.020824890975056694) {
    p = SpeechDetector.N50e9b3641686(i);
    } 
    return p;
  }
  static double N50e9b3641686(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -1.896776003460755) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -1.896776003460755) {
      p = 0;
    } 
    return p;
  }
  static double N1f0093bc1687(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 3.870103990494834) {
    p = SpeechDetector.N5ee32b8a1688(i);
    } else if (((Double) i[8]).doubleValue() > 3.870103990494834) {
    p = SpeechDetector.N5d9075d91690(i);
    } 
    return p;
  }
  static double N5ee32b8a1688(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 51.8108455954841) {
    p = SpeechDetector.N143fa1b11689(i);
    } else if (((Double) i[0]).doubleValue() > 51.8108455954841) {
      p = 0;
    } 
    return p;
  }
  static double N143fa1b11689(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 7.219693671343996) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 7.219693671343996) {
      p = 0;
    } 
    return p;
  }
  static double N5d9075d91690(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 8.22941673446072) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 8.22941673446072) {
      p = 0;
    } 
    return p;
  }
  static double N3729298c1691(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.22409500372100383) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 0.22409500372100383) {
    p = SpeechDetector.N6f66c29e1692(i);
    } 
    return p;
  }
  static double N6f66c29e1692(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -0.522719714126866) {
    p = SpeechDetector.N43734c351693(i);
    } else if (((Double) i[11]).doubleValue() > -0.522719714126866) {
    p = SpeechDetector.N7a1b093c1698(i);
    } 
    return p;
  }
  static double N43734c351693(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -1.051527620903026) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -1.051527620903026) {
    p = SpeechDetector.N46904e2b1694(i);
    } 
    return p;
  }
  static double N46904e2b1694(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 52.96876845586247) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 52.96876845586247) {
    p = SpeechDetector.N2bfc0d3e1695(i);
    } 
    return p;
  }
  static double N2bfc0d3e1695(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 1.1965266075777627) {
    p = SpeechDetector.N30c978011696(i);
    } else if (((Double) i[9]).doubleValue() > 1.1965266075777627) {
    p = SpeechDetector.N7ae5a2ac1697(i);
    } 
    return p;
  }
  static double N30c978011696(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 54.02337686346643) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 54.02337686346643) {
      p = 1;
    } 
    return p;
  }
  static double N7ae5a2ac1697(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 2.56775092511614) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > 2.56775092511614) {
      p = 1;
    } 
    return p;
  }
  static double N7a1b093c1698(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.404212901090449) {
    p = SpeechDetector.N4fb80c51699(i);
    } else if (((Double) i[1]).doubleValue() > 6.404212901090449) {
    p = SpeechDetector.N21d9a4611705(i);
    } 
    return p;
  }
  static double N4fb80c51699(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -2.232397090297545) {
    p = SpeechDetector.N1bc308111700(i);
    } else if (((Double) i[4]).doubleValue() > -2.232397090297545) {
    p = SpeechDetector.N244b49dd1702(i);
    } 
    return p;
  }
  static double N1bc308111700(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 1.6753683148097869) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 1.6753683148097869) {
    p = SpeechDetector.N2146a2541701(i);
    } 
    return p;
  }
  static double N2146a2541701(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 3.392017507813561) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 3.392017507813561) {
      p = 0;
    } 
    return p;
  }
  static double N244b49dd1702(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 0.3986900353000863) {
    p = SpeechDetector.N4ade5ec81703(i);
    } else if (((Double) i[6]).doubleValue() > 0.3986900353000863) {
      p = 1;
    } 
    return p;
  }
  static double N4ade5ec81703(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 3.9017604136599937) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 3.9017604136599937) {
    p = SpeechDetector.N4d20c2de1704(i);
    } 
    return p;
  }
  static double N4d20c2de1704(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.07978670243520719) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 0.07978670243520719) {
      p = 0;
    } 
    return p;
  }
  static double N21d9a4611705(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 6.655499893751253) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 6.655499893751253) {
    p = SpeechDetector.N57b6eda31706(i);
    } 
    return p;
  }
  static double N57b6eda31706(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.8613894575974842) {
    p = SpeechDetector.N2aab95521707(i);
    } else if (((Double) i[4]).doubleValue() > 0.8613894575974842) {
    p = SpeechDetector.N66d850601708(i);
    } 
    return p;
  }
  static double N2aab95521707(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 4.032271291240019) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 4.032271291240019) {
      p = 0;
    } 
    return p;
  }
  static double N66d850601708(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 3.613278336021772) {
    p = SpeechDetector.N38503601709(i);
    } else if (((Double) i[4]).doubleValue() > 3.613278336021772) {
      p = 1;
    } 
    return p;
  }
  static double N38503601709(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 3.5918028645070033) {
    p = SpeechDetector.N11a0956e1710(i);
    } else if (((Double) i[3]).doubleValue() > 3.5918028645070033) {
      p = 0;
    } 
    return p;
  }
  static double N11a0956e1710(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 3.6103076688662297) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > 3.6103076688662297) {
      p = 0;
    } 
    return p;
  }
  static double N45b271cc1711(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 2.320605681566026) {
    p = SpeechDetector.N464d2bd31712(i);
    } else if (((Double) i[5]).doubleValue() > 2.320605681566026) {
    p = SpeechDetector.N43c74e721722(i);
    } 
    return p;
  }
  static double N464d2bd31712(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.027011308673230965) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -0.027011308673230965) {
    p = SpeechDetector.N74784db31713(i);
    } 
    return p;
  }
  static double N74784db31713(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -0.3375604757285184) {
    p = SpeechDetector.N6355e821714(i);
    } else if (((Double) i[10]).doubleValue() > -0.3375604757285184) {
    p = SpeechDetector.N11247c481716(i);
    } 
    return p;
  }
  static double N6355e821714(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -0.5935435244021487) {
    p = SpeechDetector.N19cfabfd1715(i);
    } else if (((Double) i[8]).doubleValue() > -0.5935435244021487) {
      p = 0;
    } 
    return p;
  }
  static double N19cfabfd1715(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 53.150150530360435) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 53.150150530360435) {
      p = 0;
    } 
    return p;
  }
  static double N11247c481716(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -2.874730909194123) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -2.874730909194123) {
    p = SpeechDetector.N725b63c21717(i);
    } 
    return p;
  }
  static double N725b63c21717(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 4.813707880904957) {
    p = SpeechDetector.N4df290351718(i);
    } else if (((Double) i[2]).doubleValue() > 4.813707880904957) {
    p = SpeechDetector.N3c948b591720(i);
    } 
    return p;
  }
  static double N4df290351718(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 3.3174617026557733) {
    p = SpeechDetector.N6fd9af8d1719(i);
    } else if (((Double) i[2]).doubleValue() > 3.3174617026557733) {
      p = 1;
    } 
    return p;
  }
  static double N6fd9af8d1719(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 3.0291700491846307) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 3.0291700491846307) {
      p = 0;
    } 
    return p;
  }
  static double N3c948b591720(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 4.244457352492648) {
    p = SpeechDetector.N3c489f211721(i);
    } else if (((Double) i[4]).doubleValue() > 4.244457352492648) {
      p = 0;
    } 
    return p;
  }
  static double N3c489f211721(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 5.582953147175678) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 5.582953147175678) {
      p = 0;
    } 
    return p;
  }
  static double N43c74e721722(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 2.4656226188768593) {
    p = SpeechDetector.N51ef41211723(i);
    } else if (((Double) i[7]).doubleValue() > 2.4656226188768593) {
      p = 1;
    } 
    return p;
  }
  static double N51ef41211723(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 1.467781056923914) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 1.467781056923914) {
    p = SpeechDetector.N329d078d1724(i);
    } 
    return p;
  }
  static double N329d078d1724(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 4.026358899881377) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 4.026358899881377) {
    p = SpeechDetector.N635ad3f01725(i);
    } 
    return p;
  }
  static double N635ad3f01725(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 2.7824035340053332) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 2.7824035340053332) {
      p = 1;
    } 
    return p;
  }
  static double N601064851726(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 55.84150298135508) {
    p = SpeechDetector.N543789081727(i);
    } else if (((Double) i[0]).doubleValue() > 55.84150298135508) {
    p = SpeechDetector.N25776ec71816(i);
    } 
    return p;
  }
  static double N543789081727(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.0712044679944315) {
    p = SpeechDetector.Na05976a1728(i);
    } else if (((Double) i[3]).doubleValue() > 2.0712044679944315) {
    p = SpeechDetector.N33d739741798(i);
    } 
    return p;
  }
  static double Na05976a1728(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -1.7703000309319918) {
    p = SpeechDetector.N7517b5491729(i);
    } else if (((Double) i[7]).doubleValue() > -1.7703000309319918) {
    p = SpeechDetector.N5fbfd6751750(i);
    } 
    return p;
  }
  static double N7517b5491729(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 1.627892868844787) {
    p = SpeechDetector.N677f07ad1730(i);
    } else if (((Double) i[9]).doubleValue() > 1.627892868844787) {
    p = SpeechDetector.N2a880c3e1742(i);
    } 
    return p;
  }
  static double N677f07ad1730(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -1.4005337847364319) {
    p = SpeechDetector.N44d123f01731(i);
    } else if (((Double) i[4]).doubleValue() > -1.4005337847364319) {
    p = SpeechDetector.N387ea5b01736(i);
    } 
    return p;
  }
  static double N44d123f01731(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 8.651691519416213) {
    p = SpeechDetector.N7e8e84db1732(i);
    } else if (((Double) i[1]).doubleValue() > 8.651691519416213) {
      p = 1;
    } 
    return p;
  }
  static double N7e8e84db1732(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= -2.2905497269001) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > -2.2905497269001) {
    p = SpeechDetector.N3eb486c61733(i);
    } 
    return p;
  }
  static double N3eb486c61733(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 51.265289767004504) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 51.265289767004504) {
    p = SpeechDetector.N3dfc51531734(i);
    } 
    return p;
  }
  static double N3dfc51531734(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -2.6690997240946026) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -2.6690997240946026) {
    p = SpeechDetector.N3f3ff01735(i);
    } 
    return p;
  }
  static double N3f3ff01735(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 52.80707654191742) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 52.80707654191742) {
      p = 1;
    } 
    return p;
  }
  static double N387ea5b01736(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 9.855423921105638) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 9.855423921105638) {
    p = SpeechDetector.N2afe2ca1737(i);
    } 
    return p;
  }
  static double N2afe2ca1737(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -3.6630178452593247) {
    p = SpeechDetector.N69523d261738(i);
    } else if (((Double) i[7]).doubleValue() > -3.6630178452593247) {
    p = SpeechDetector.N53e4ba681740(i);
    } 
    return p;
  }
  static double N69523d261738(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 50.150900709333065) {
    p = SpeechDetector.N162cbfcf1739(i);
    } else if (((Double) i[0]).doubleValue() > 50.150900709333065) {
      p = 1;
    } 
    return p;
  }
  static double N162cbfcf1739(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 49.504572149134034) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 49.504572149134034) {
      p = 0;
    } 
    return p;
  }
  static double N53e4ba681740(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.3104897310130104) {
    p = SpeechDetector.N4d8a2cdf1741(i);
    } else if (((Double) i[4]).doubleValue() > 1.3104897310130104) {
      p = 0;
    } 
    return p;
  }
  static double N4d8a2cdf1741(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -2.1378375235433977) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -2.1378375235433977) {
      p = 1;
    } 
    return p;
  }
  static double N2a880c3e1742(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -4.30851303149735) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > -4.30851303149735) {
    p = SpeechDetector.N49dbd0421743(i);
    } 
    return p;
  }
  static double N49dbd0421743(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -3.7281183780876077) {
    p = SpeechDetector.N7e45c2ef1744(i);
    } else if (((Double) i[4]).doubleValue() > -3.7281183780876077) {
    p = SpeechDetector.N160119ad1745(i);
    } 
    return p;
  }
  static double N7e45c2ef1744(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 54.44849152633715) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 54.44849152633715) {
      p = 0;
    } 
    return p;
  }
  static double N160119ad1745(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -2.4918572557028895) {
    p = SpeechDetector.N223cb8241746(i);
    } else if (((Double) i[7]).doubleValue() > -2.4918572557028895) {
      p = 0;
    } 
    return p;
  }
  static double N223cb8241746(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5.984503240622335) {
    p = SpeechDetector.N405d550b1747(i);
    } else if (((Double) i[2]).doubleValue() > 5.984503240622335) {
      p = 0;
    } 
    return p;
  }
  static double N405d550b1747(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 4.223973277750008) {
    p = SpeechDetector.N2f7a66301748(i);
    } else if (((Double) i[2]).doubleValue() > 4.223973277750008) {
      p = 1;
    } 
    return p;
  }
  static double N2f7a66301748(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -1.3469315639441728) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -1.3469315639441728) {
    p = SpeechDetector.Nccaf1aa1749(i);
    } 
    return p;
  }
  static double Nccaf1aa1749(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 1.1716807160246283) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 1.1716807160246283) {
      p = 1;
    } 
    return p;
  }
  static double N5fbfd6751750(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -0.5564117790283802) {
    p = SpeechDetector.N2b98cc6f1751(i);
    } else if (((Double) i[8]).doubleValue() > -0.5564117790283802) {
    p = SpeechDetector.N259bff1e1757(i);
    } 
    return p;
  }
  static double N2b98cc6f1751(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.5703971770042922) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.5703971770042922) {
    p = SpeechDetector.N3c95a1c51752(i);
    } 
    return p;
  }
  static double N3c95a1c51752(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 53.794537657496015) {
    p = SpeechDetector.N3afab961753(i);
    } else if (((Double) i[0]).doubleValue() > 53.794537657496015) {
      p = 0;
    } 
    return p;
  }
  static double N3afab961753(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 8.666775748919994) {
    p = SpeechDetector.N22a06be1754(i);
    } else if (((Double) i[1]).doubleValue() > 8.666775748919994) {
    p = SpeechDetector.N123444f81756(i);
    } 
    return p;
  }
  static double N22a06be1754(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -1.0080407066137087) {
    p = SpeechDetector.N1520a50e1755(i);
    } else if (((Double) i[5]).doubleValue() > -1.0080407066137087) {
      p = 1;
    } 
    return p;
  }
  static double N1520a50e1755(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 1.6911188294193347) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > 1.6911188294193347) {
      p = 1;
    } 
    return p;
  }
  static double N123444f81756(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 0.1474782473375167) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 0.1474782473375167) {
      p = 0;
    } 
    return p;
  }
  static double N259bff1e1757(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 2.1429567459585037) {
    p = SpeechDetector.N248a1ddc1758(i);
    } else if (((Double) i[7]).doubleValue() > 2.1429567459585037) {
    p = SpeechDetector.N734d2f931784(i);
    } 
    return p;
  }
  static double N248a1ddc1758(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 0.6683221079739887) {
    p = SpeechDetector.N67ae69411759(i);
    } else if (((Double) i[10]).doubleValue() > 0.6683221079739887) {
      p = 0;
    } 
    return p;
  }
  static double N67ae69411759(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 53.217481194301044) {
    p = SpeechDetector.N6b805f941760(i);
    } else if (((Double) i[0]).doubleValue() > 53.217481194301044) {
    p = SpeechDetector.N3cf4ad3a1775(i);
    } 
    return p;
  }
  static double N6b805f941760(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.13924159140317516) {
    p = SpeechDetector.N390324af1761(i);
    } else if (((Double) i[5]).doubleValue() > -0.13924159140317516) {
    p = SpeechDetector.N426628771770(i);
    } 
    return p;
  }
  static double N390324af1761(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.95852835382197) {
    p = SpeechDetector.N7d5d7a661762(i);
    } else if (((Double) i[4]).doubleValue() > 0.95852835382197) {
    p = SpeechDetector.N44476c561767(i);
    } 
    return p;
  }
  static double N7d5d7a661762(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -0.001486902057759066) {
    p = SpeechDetector.N40efed71763(i);
    } else if (((Double) i[7]).doubleValue() > -0.001486902057759066) {
      p = 1;
    } 
    return p;
  }
  static double N40efed71763(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= -0.8217198119285148) {
    p = SpeechDetector.N747cd7551764(i);
    } else if (((Double) i[6]).doubleValue() > -0.8217198119285148) {
      p = 1;
    } 
    return p;
  }
  static double N747cd7551764(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.973316150673128) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 0.973316150673128) {
    p = SpeechDetector.N301d49321765(i);
    } 
    return p;
  }
  static double N301d49321765(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 1.5126090667026644) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 1.5126090667026644) {
    p = SpeechDetector.N52b08a4b1766(i);
    } 
    return p;
  }
  static double N52b08a4b1766(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 9.729863397658757) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 9.729863397658757) {
      p = 0;
    } 
    return p;
  }
  static double N44476c561767(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -2.1996913173863426) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -2.1996913173863426) {
    p = SpeechDetector.N2d19a51f1768(i);
    } 
    return p;
  }
  static double N2d19a51f1768(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 50.40427994443626) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 50.40427994443626) {
    p = SpeechDetector.N6ea7ad5a1769(i);
    } 
    return p;
  }
  static double N6ea7ad5a1769(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 0.8156815579518006) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 0.8156815579518006) {
      p = 1;
    } 
    return p;
  }
  static double N426628771770(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 1.6056819403797156) {
    p = SpeechDetector.N40eabeaf1771(i);
    } else if (((Double) i[3]).doubleValue() > 1.6056819403797156) {
    p = SpeechDetector.N2b0526f01773(i);
    } 
    return p;
  }
  static double N40eabeaf1771(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -4.268213181205075) {
    p = SpeechDetector.N738cf4741772(i);
    } else if (((Double) i[11]).doubleValue() > -4.268213181205075) {
      p = 1;
    } 
    return p;
  }
  static double N738cf4741772(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 9.27352693759837) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 9.27352693759837) {
      p = 0;
    } 
    return p;
  }
  static double N2b0526f01773(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -0.12321475216594273) {
    p = SpeechDetector.N5f3f6ca01774(i);
    } else if (((Double) i[11]).doubleValue() > -0.12321475216594273) {
      p = 0;
    } 
    return p;
  }
  static double N5f3f6ca01774(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 1.1002000974434851) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 1.1002000974434851) {
      p = 1;
    } 
    return p;
  }
  static double N3cf4ad3a1775(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5.802525246757743) {
    p = SpeechDetector.N6398da191776(i);
    } else if (((Double) i[2]).doubleValue() > 5.802525246757743) {
      p = 0;
    } 
    return p;
  }
  static double N6398da191776(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -1.0250672650608221) {
    p = SpeechDetector.N4816d2641777(i);
    } else if (((Double) i[4]).doubleValue() > -1.0250672650608221) {
    p = SpeechDetector.N6f5f82dc1781(i);
    } 
    return p;
  }
  static double N4816d2641777(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 53.92829316114767) {
    p = SpeechDetector.N524ec8351778(i);
    } else if (((Double) i[0]).doubleValue() > 53.92829316114767) {
      p = 1;
    } 
    return p;
  }
  static double N524ec8351778(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -1.2044480736701202) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -1.2044480736701202) {
    p = SpeechDetector.N323a39ca1779(i);
    } 
    return p;
  }
  static double N323a39ca1779(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -5.767821671584325) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -5.767821671584325) {
    p = SpeechDetector.Nca816891780(i);
    } 
    return p;
  }
  static double Nca816891780(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 53.806742868320455) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 53.806742868320455) {
      p = 0;
    } 
    return p;
  }
  static double N6f5f82dc1781(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 54.06429883689427) {
    p = SpeechDetector.N678872a31782(i);
    } else if (((Double) i[0]).doubleValue() > 54.06429883689427) {
    p = SpeechDetector.N2f1e606f1783(i);
    } 
    return p;
  }
  static double N678872a31782(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.3370587490064865) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 0.3370587490064865) {
      p = 0;
    } 
    return p;
  }
  static double N2f1e606f1783(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -3.410198930263715) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > -3.410198930263715) {
      p = 0;
    } 
    return p;
  }
  static double N734d2f931784(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 50.06969772082226) {
    p = SpeechDetector.N506e97081785(i);
    } else if (((Double) i[0]).doubleValue() > 50.06969772082226) {
    p = SpeechDetector.N1ec507c61789(i);
    } 
    return p;
  }
  static double N506e97081785(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -1.7382354935735427) {
    p = SpeechDetector.Nc7db7791786(i);
    } else if (((Double) i[5]).doubleValue() > -1.7382354935735427) {
    p = SpeechDetector.N11986f571787(i);
    } 
    return p;
  }
  static double Nc7db7791786(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 2.260116877901547) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 2.260116877901547) {
      p = 0;
    } 
    return p;
  }
  static double N11986f571787(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 1.0980575414469524) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 1.0980575414469524) {
    p = SpeechDetector.N2eb5c1c71788(i);
    } 
    return p;
  }
  static double N2eb5c1c71788(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 1.0448288907859187) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 1.0448288907859187) {
      p = 1;
    } 
    return p;
  }
  static double N1ec507c61789(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 3.6856676844451246) {
    p = SpeechDetector.N198167f21790(i);
    } else if (((Double) i[8]).doubleValue() > 3.6856676844451246) {
    p = SpeechDetector.N31cb5b8b1793(i);
    } 
    return p;
  }
  static double N198167f21790(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 0.9038112877262379) {
    p = SpeechDetector.N7ecf4df21791(i);
    } else if (((Double) i[2]).doubleValue() > 0.9038112877262379) {
      p = 0;
    } 
    return p;
  }
  static double N7ecf4df21791(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -0.6932028854894123) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -0.6932028854894123) {
    p = SpeechDetector.N5c068be81792(i);
    } 
    return p;
  }
  static double N5c068be81792(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 52.27869839727694) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 52.27869839727694) {
      p = 1;
    } 
    return p;
  }
  static double N31cb5b8b1793(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 2.3057010625490566) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 2.3057010625490566) {
    p = SpeechDetector.N1de71c371794(i);
    } 
    return p;
  }
  static double N1de71c371794(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.6637376901203272) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 0.6637376901203272) {
    p = SpeechDetector.N2fed6e371795(i);
    } 
    return p;
  }
  static double N2fed6e371795(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 3.9125538924218928) {
    p = SpeechDetector.Ncdef5761796(i);
    } else if (((Double) i[7]).doubleValue() > 3.9125538924218928) {
      p = 0;
    } 
    return p;
  }
  static double Ncdef5761796(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 8.904961271318186) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 8.904961271318186) {
    p = SpeechDetector.N1c51c941797(i);
    } 
    return p;
  }
  static double N1c51c941797(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -1.7635398293041613) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -1.7635398293041613) {
      p = 0;
    } 
    return p;
  }
  static double N33d739741798(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -3.7706002562040286) {
    p = SpeechDetector.N76fd09421799(i);
    } else if (((Double) i[7]).doubleValue() > -3.7706002562040286) {
    p = SpeechDetector.N452172201801(i);
    } 
    return p;
  }
  static double N76fd09421799(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 0.7217489312045033) {
    p = SpeechDetector.N5e6b09151800(i);
    } else if (((Double) i[8]).doubleValue() > 0.7217489312045033) {
      p = 0;
    } 
    return p;
  }
  static double N5e6b09151800(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.620113335779785) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -0.620113335779785) {
      p = 0;
    } 
    return p;
  }
  static double N452172201801(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.7816045665494612) {
    p = SpeechDetector.N16cbb6551802(i);
    } else if (((Double) i[6]).doubleValue() > 0.7816045665494612) {
    p = SpeechDetector.N70e1c4d91812(i);
    } 
    return p;
  }
  static double N16cbb6551802(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 2.814283669048374) {
    p = SpeechDetector.N182f92241803(i);
    } else if (((Double) i[3]).doubleValue() > 2.814283669048374) {
      p = 0;
    } 
    return p;
  }
  static double N182f92241803(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 50.5171144176001) {
    p = SpeechDetector.N5b2385e31804(i);
    } else if (((Double) i[0]).doubleValue() > 50.5171144176001) {
    p = SpeechDetector.N39336db11807(i);
    } 
    return p;
  }
  static double N5b2385e31804(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -1.4481559116713898) {
    p = SpeechDetector.N792b28d31805(i);
    } else if (((Double) i[5]).doubleValue() > -1.4481559116713898) {
    p = SpeechDetector.N8572cb1806(i);
    } 
    return p;
  }
  static double N792b28d31805(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -4.546553100422429) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -4.546553100422429) {
      p = 0;
    } 
    return p;
  }
  static double N8572cb1806(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 49.33678309605034) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 49.33678309605034) {
      p = 1;
    } 
    return p;
  }
  static double N39336db11807(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -0.8074811446910902) {
    p = SpeechDetector.N5f669ccd1808(i);
    } else if (((Double) i[7]).doubleValue() > -0.8074811446910902) {
      p = 0;
    } 
    return p;
  }
  static double N5f669ccd1808(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -0.04416621503586198) {
    p = SpeechDetector.N49c087a91809(i);
    } else if (((Double) i[10]).doubleValue() > -0.04416621503586198) {
      p = 0;
    } 
    return p;
  }
  static double N49c087a91809(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -2.121583895323221) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > -2.121583895323221) {
    p = SpeechDetector.N7f0a8e121810(i);
    } 
    return p;
  }
  static double N7f0a8e121810(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -1.7210118397679104) {
    p = SpeechDetector.Ndf580e71811(i);
    } else if (((Double) i[6]).doubleValue() > -1.7210118397679104) {
      p = 1;
    } 
    return p;
  }
  static double Ndf580e71811(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -1.2369521442246947) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > -1.2369521442246947) {
      p = 0;
    } 
    return p;
  }
  static double N70e1c4d91812(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.8272504989906373) {
    p = SpeechDetector.N7642bc741813(i);
    } else if (((Double) i[8]).doubleValue() > 0.8272504989906373) {
    p = SpeechDetector.N4c0bf6ca1815(i);
    } 
    return p;
  }
  static double N7642bc741813(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -0.43321261320343685) {
    p = SpeechDetector.N1762a0541814(i);
    } else if (((Double) i[4]).doubleValue() > -0.43321261320343685) {
      p = 0;
    } 
    return p;
  }
  static double N1762a0541814(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -0.8573211146457586) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -0.8573211146457586) {
      p = 1;
    } 
    return p;
  }
  static double N4c0bf6ca1815(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 54.053919142463904) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 54.053919142463904) {
      p = 0;
    } 
    return p;
  }
  static double N25776ec71816(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -3.7640805632846557) {
    p = SpeechDetector.N4409de081817(i);
    } else if (((Double) i[7]).doubleValue() > -3.7640805632846557) {
    p = SpeechDetector.N4f6107341831(i);
    } 
    return p;
  }
  static double N4409de081817(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 57.719126910165585) {
    p = SpeechDetector.N63d0021d1818(i);
    } else if (((Double) i[0]).doubleValue() > 57.719126910165585) {
    p = SpeechDetector.N6ad731781824(i);
    } 
    return p;
  }
  static double N63d0021d1818(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 1.5802459868144023) {
    p = SpeechDetector.N6d3af11c1819(i);
    } else if (((Double) i[3]).doubleValue() > 1.5802459868144023) {
    p = SpeechDetector.N5e8223561822(i);
    } 
    return p;
  }
  static double N6d3af11c1819(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -3.485963379855543) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -3.485963379855543) {
    p = SpeechDetector.N38ab9d4a1820(i);
    } 
    return p;
  }
  static double N38ab9d4a1820(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 1.0080977691654522) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 1.0080977691654522) {
    p = SpeechDetector.Nae382571821(i);
    } 
    return p;
  }
  static double Nae382571821(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= -2.579511896848421) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > -2.579511896848421) {
      p = 0;
    } 
    return p;
  }
  static double N5e8223561822(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -3.7820950885568445) {
    p = SpeechDetector.N31de13931823(i);
    } else if (((Double) i[5]).doubleValue() > -3.7820950885568445) {
      p = 0;
    } 
    return p;
  }
  static double N31de13931823(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 1.314339048554221) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 1.314339048554221) {
      p = 0;
    } 
    return p;
  }
  static double N6ad731781824(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -1.1163760495394939) {
    p = SpeechDetector.N55f0f4141825(i);
    } else if (((Double) i[9]).doubleValue() > -1.1163760495394939) {
    p = SpeechDetector.N2687b8c51829(i);
    } 
    return p;
  }
  static double N55f0f4141825(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -1.173523490553422) {
    p = SpeechDetector.N3e2879201826(i);
    } else if (((Double) i[8]).doubleValue() > -1.173523490553422) {
    p = SpeechDetector.N532843c11827(i);
    } 
    return p;
  }
  static double N3e2879201826(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 8.872455062167575) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 8.872455062167575) {
      p = 1;
    } 
    return p;
  }
  static double N532843c11827(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -1.2303731502209787) {
    p = SpeechDetector.N78785e8d1828(i);
    } else if (((Double) i[3]).doubleValue() > -1.2303731502209787) {
      p = 0;
    } 
    return p;
  }
  static double N78785e8d1828(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -2.1560062084184217) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -2.1560062084184217) {
      p = 1;
    } 
    return p;
  }
  static double N2687b8c51829(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= -1.671533677252261) {
    p = SpeechDetector.N1873a1461830(i);
    } else if (((Double) i[2]).doubleValue() > -1.671533677252261) {
      p = 0;
    } 
    return p;
  }
  static double N1873a1461830(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 64.20103323947042) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 64.20103323947042) {
      p = 0;
    } 
    return p;
  }
  static double N4f6107341831(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 9.111160688544242) {
    p = SpeechDetector.N6b200fa21832(i);
    } else if (((Double) i[1]).doubleValue() > 9.111160688544242) {
    p = SpeechDetector.N5e89cd1e1855(i);
    } 
    return p;
  }
  static double N6b200fa21832(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -4.64263147578183) {
    p = SpeechDetector.N5e28ba01833(i);
    } else if (((Double) i[4]).doubleValue() > -4.64263147578183) {
    p = SpeechDetector.N166ddc8b1835(i);
    } 
    return p;
  }
  static double N5e28ba01833(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 56.81179324745837) {
    p = SpeechDetector.N5c3cb8641834(i);
    } else if (((Double) i[0]).doubleValue() > 56.81179324745837) {
      p = 0;
    } 
    return p;
  }
  static double N5c3cb8641834(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.20337819824995387) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 0.20337819824995387) {
      p = 0;
    } 
    return p;
  }
  static double N166ddc8b1835(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 4.219427828981056) {
    p = SpeechDetector.N6aa352e1836(i);
    } else if (((Double) i[10]).doubleValue() > 4.219427828981056) {
    p = SpeechDetector.Ndff69121852(i);
    } 
    return p;
  }
  static double N6aa352e1836(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -1.8551018090925724) {
    p = SpeechDetector.N1089626d1837(i);
    } else if (((Double) i[3]).doubleValue() > -1.8551018090925724) {
    p = SpeechDetector.N1aff6ef61840(i);
    } 
    return p;
  }
  static double N1089626d1837(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -1.3448792727681285) {
    p = SpeechDetector.N2b9cea961838(i);
    } else if (((Double) i[7]).doubleValue() > -1.3448792727681285) {
      p = 0;
    } 
    return p;
  }
  static double N2b9cea961838(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -1.675110286086325) {
    p = SpeechDetector.N4aed34381839(i);
    } else if (((Double) i[7]).doubleValue() > -1.675110286086325) {
      p = 1;
    } 
    return p;
  }
  static double N4aed34381839(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 62.53851410328572) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 62.53851410328572) {
      p = 0;
    } 
    return p;
  }
  static double N1aff6ef61840(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 2.7122712456623512) {
    p = SpeechDetector.N77cde6521841(i);
    } else if (((Double) i[2]).doubleValue() > 2.7122712456623512) {
    p = SpeechDetector.N256449551850(i);
    } 
    return p;
  }
  static double N77cde6521841(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 8.652741052509178) {
    p = SpeechDetector.N6ecc4ef01842(i);
    } else if (((Double) i[1]).doubleValue() > 8.652741052509178) {
      p = 0;
    } 
    return p;
  }
  static double N6ecc4ef01842(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 0.4534896180007544) {
    p = SpeechDetector.N2752a7641843(i);
    } else if (((Double) i[10]).doubleValue() > 0.4534896180007544) {
    p = SpeechDetector.N7180625b1845(i);
    } 
    return p;
  }
  static double N2752a7641843(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -2.15388756326627) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -2.15388756326627) {
    p = SpeechDetector.N236baa671844(i);
    } 
    return p;
  }
  static double N236baa671844(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 57.748535141551685) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 57.748535141551685) {
      p = 0;
    } 
    return p;
  }
  static double N7180625b1845(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 0.4531634544247527) {
    p = SpeechDetector.N23b97e941846(i);
    } else if (((Double) i[8]).doubleValue() > 0.4531634544247527) {
    p = SpeechDetector.N121dd41849(i);
    } 
    return p;
  }
  static double N23b97e941846(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.9128004350954376) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -0.9128004350954376) {
    p = SpeechDetector.N672538de1847(i);
    } 
    return p;
  }
  static double N672538de1847(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -2.714114048957146) {
    p = SpeechDetector.N3cb8abb91848(i);
    } else if (((Double) i[5]).doubleValue() > -2.714114048957146) {
      p = 0;
    } 
    return p;
  }
  static double N3cb8abb91848(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -7.135742370209778) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -7.135742370209778) {
      p = 1;
    } 
    return p;
  }
  static double N121dd41849(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 2.2641494272835723) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 2.2641494272835723) {
      p = 0;
    } 
    return p;
  }
  static double N256449551850(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 2.33431573757783) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > 2.33431573757783) {
    p = SpeechDetector.N5b0a7ea01851(i);
    } 
    return p;
  }
  static double N5b0a7ea01851(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -0.29306203560606553) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -0.29306203560606553) {
      p = 1;
    } 
    return p;
  }
  static double Ndff69121852(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 61.42292939694357) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 61.42292939694357) {
    p = SpeechDetector.N7b4b23eb1853(i);
    } 
    return p;
  }
  static double N7b4b23eb1853(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -0.4143479513107519) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > -0.4143479513107519) {
    p = SpeechDetector.N223588a1854(i);
    } 
    return p;
  }
  static double N223588a1854(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -1.1878363711180275) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -1.1878363711180275) {
      p = 1;
    } 
    return p;
  }
  static double N5e89cd1e1855(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 1.3794988392374081) {
    p = SpeechDetector.N28f99d0f1856(i);
    } else if (((Double) i[3]).doubleValue() > 1.3794988392374081) {
      p = 0;
    } 
    return p;
  }
  static double N28f99d0f1856(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 57.787750308758596) {
    p = SpeechDetector.N1bb658cd1857(i);
    } else if (((Double) i[0]).doubleValue() > 57.787750308758596) {
    p = SpeechDetector.N76710ab81866(i);
    } 
    return p;
  }
  static double N1bb658cd1857(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -0.8887145477592177) {
    p = SpeechDetector.N608008f11858(i);
    } else if (((Double) i[5]).doubleValue() > -0.8887145477592177) {
      p = 0;
    } 
    return p;
  }
  static double N608008f11858(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -1.7673449752669328) {
    p = SpeechDetector.N75cb37b51859(i);
    } else if (((Double) i[7]).doubleValue() > -1.7673449752669328) {
    p = SpeechDetector.N5fbb005a1861(i);
    } 
    return p;
  }
  static double N75cb37b51859(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 10.799868813309903) {
    p = SpeechDetector.N70b6887d1860(i);
    } else if (((Double) i[1]).doubleValue() > 10.799868813309903) {
      p = 0;
    } 
    return p;
  }
  static double N70b6887d1860(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5.847926936449131) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 5.847926936449131) {
      p = 0;
    } 
    return p;
  }
  static double N5fbb005a1861(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 2.0836662959871806) {
    p = SpeechDetector.N6e1445cf1862(i);
    } else if (((Double) i[2]).doubleValue() > 2.0836662959871806) {
    p = SpeechDetector.N126b632e1864(i);
    } 
    return p;
  }
  static double N6e1445cf1862(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -1.9311820083213989) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -1.9311820083213989) {
    p = SpeechDetector.N74f3517e1863(i);
    } 
    return p;
  }
  static double N74f3517e1863(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -2.487711481141539) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -2.487711481141539) {
      p = 1;
    } 
    return p;
  }
  static double N126b632e1864(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.039303923913579106) {
    p = SpeechDetector.N483c6a741865(i);
    } else if (((Double) i[8]).doubleValue() > 0.039303923913579106) {
      p = 0;
    } 
    return p;
  }
  static double N483c6a741865(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 0.4997004636848149) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 0.4997004636848149) {
      p = 1;
    } 
    return p;
  }
  static double N76710ab81866(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -3.3010095201704504) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -3.3010095201704504) {
    p = SpeechDetector.N7776f2c71867(i);
    } 
    return p;
  }
  static double N7776f2c71867(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -5.790412292400181) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -5.790412292400181) {
    p = SpeechDetector.N223d24171868(i);
    } 
    return p;
  }
  static double N223d24171868(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 1.8606341097392078) {
    p = SpeechDetector.N5c0c73901869(i);
    } else if (((Double) i[7]).doubleValue() > 1.8606341097392078) {
      p = 0;
    } 
    return p;
  }
  static double N5c0c73901869(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -1.0157067044720478) {
    p = SpeechDetector.N357722261870(i);
    } else if (((Double) i[9]).doubleValue() > -1.0157067044720478) {
      p = 0;
    } 
    return p;
  }
  static double N357722261870(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -4.2293399587307485) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -4.2293399587307485) {
    p = SpeechDetector.N206308361871(i);
    } 
    return p;
  }
  static double N206308361871(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 1.2832283293702482) {
    p = SpeechDetector.N45b021d61872(i);
    } else if (((Double) i[4]).doubleValue() > 1.2832283293702482) {
      p = 0;
    } 
    return p;
  }
  static double N45b021d61872(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.9980139778164213) {
    p = SpeechDetector.N2e7d8c581873(i);
    } else if (((Double) i[6]).doubleValue() > 0.9980139778164213) {
    p = SpeechDetector.N44c7e1d91881(i);
    } 
    return p;
  }
  static double N2e7d8c581873(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.5657718112000926) {
    p = SpeechDetector.N3488fd401874(i);
    } else if (((Double) i[3]).doubleValue() > 0.5657718112000926) {
      p = 0;
    } 
    return p;
  }
  static double N3488fd401874(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 0.6067493808857257) {
    p = SpeechDetector.Ndaa8fb21875(i);
    } else if (((Double) i[5]).doubleValue() > 0.6067493808857257) {
      p = 0;
    } 
    return p;
  }
  static double Ndaa8fb21875(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 0.10030199128199342) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 0.10030199128199342) {
    p = SpeechDetector.N38bff6201876(i);
    } 
    return p;
  }
  static double N38bff6201876(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 58.853289502611304) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 58.853289502611304) {
    p = SpeechDetector.N42b7cbfb1877(i);
    } 
    return p;
  }
  static double N42b7cbfb1877(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -2.8236663990366715) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -2.8236663990366715) {
    p = SpeechDetector.N30b0edf51878(i);
    } 
    return p;
  }
  static double N30b0edf51878(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -2.3690170548511036) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -2.3690170548511036) {
    p = SpeechDetector.N2fd688cc1879(i);
    } 
    return p;
  }
  static double N2fd688cc1879(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 9.807598404001073) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 9.807598404001073) {
    p = SpeechDetector.N2daf219d1880(i);
    } 
    return p;
  }
  static double N2daf219d1880(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 10.686431894229102) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 10.686431894229102) {
      p = 1;
    } 
    return p;
  }
  static double N44c7e1d91881(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 9.6510810939349) {
    p = SpeechDetector.N1ebc90d61882(i);
    } else if (((Double) i[1]).doubleValue() > 9.6510810939349) {
      p = 0;
    } 
    return p;
  }
  static double N1ebc90d61882(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.8005665967800466) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -0.8005665967800466) {
      p = 1;
    } 
    return p;
  }
}
