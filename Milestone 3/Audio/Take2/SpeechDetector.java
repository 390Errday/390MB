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

    Correctly Classified Instances       22125               92.1875 %
    Incorrectly Classified Instances      1875                7.8125 %
    Kappa statistic                          0.8438
    Mean absolute error                      0.0944
    Root mean squared error                  0.2629
    Relative absolute error                 18.8786 %
    Root relative squared error             52.585  %
    Total Number of Instances            24000     

    === Detailed Accuracy By Class ===

                   TP Rate   FP Rate   Precision   Recall  F-Measure   ROC Area  Class
                     0.917     0.073      0.926     0.917     0.921      0.937    true
                     0.927     0.083      0.917     0.927     0.922      0.937    false
    Weighted Avg.    0.922     0.078      0.922     0.922     0.922      0.937

    === Confusion Matrix ===

         a     b   <-- classified as
     10999  1001 |     a = true
       874 11126 |     b = false

*/

import android.content.Context;

public class SpeechDetector {
    public static double classify(Object[] i)
            throws Exception {

    double p = Double.NaN;
    p = SpeechDetector.N36fa4ac9514(i);
    return p;
  }
  static double N36fa4ac9514(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 44.18382624281444) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 44.18382624281444) {
    p = SpeechDetector.N6a43ee51515(i);
    } 
    return p;
  }
  static double N6a43ee51515(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 61.91430044826494) {
    p = SpeechDetector.N11d33e58516(i);
    } else if (((Double) i[0]).doubleValue() > 61.91430044826494) {
    p = SpeechDetector.N192100c1571(i);
    } 
    return p;
  }
  static double N11d33e58516(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 3.8859338096002363) {
    p = SpeechDetector.N43a20c8c517(i);
    } else if (((Double) i[4]).doubleValue() > 3.8859338096002363) {
    p = SpeechDetector.Nb14f9b4563(i);
    } 
    return p;
  }
  static double N43a20c8c517(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 2.1295587642042406) {
    p = SpeechDetector.N43e5de04518(i);
    } else if (((Double) i[2]).doubleValue() > 2.1295587642042406) {
    p = SpeechDetector.Ne963b54542(i);
    } 
    return p;
  }
  static double N43e5de04518(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 8.611922475895796) {
    p = SpeechDetector.N2852fb6f519(i);
    } else if (((Double) i[1]).doubleValue() > 8.611922475895796) {
      p = 0;
    } 
    return p;
  }
  static double N2852fb6f519(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 3.978652212409917) {
    p = SpeechDetector.N5ff94917520(i);
    } else if (((Double) i[3]).doubleValue() > 3.978652212409917) {
      p = 0;
    } 
    return p;
  }
  static double N5ff94917520(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 58.217503398645235) {
    p = SpeechDetector.N672db63a521(i);
    } else if (((Double) i[0]).doubleValue() > 58.217503398645235) {
    p = SpeechDetector.N7d9ac684524(i);
    } 
    return p;
  }
  static double N672db63a521(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 3.213561542733302) {
    p = SpeechDetector.N6a16cec1522(i);
    } else if (((Double) i[1]).doubleValue() > 3.213561542733302) {
      p = 0;
    } 
    return p;
  }
  static double N6a16cec1522(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 53.977268341012994) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 53.977268341012994) {
    p = SpeechDetector.N7f601750523(i);
    } 
    return p;
  }
  static double N7f601750523(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -4.572689270107483) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -4.572689270107483) {
      p = 0;
    } 
    return p;
  }
  static double N7d9ac684524(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -1.448380763546224) {
    p = SpeechDetector.N3c5f4488525(i);
    } else if (((Double) i[8]).doubleValue() > -1.448380763546224) {
    p = SpeechDetector.N6692d022533(i);
    } 
    return p;
  }
  static double N3c5f4488525(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 7.102889310678639) {
    p = SpeechDetector.N128c5baf526(i);
    } else if (((Double) i[1]).doubleValue() > 7.102889310678639) {
      p = 0;
    } 
    return p;
  }
  static double N128c5baf526(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 0.48549043179428797) {
    p = SpeechDetector.N3cd747ac527(i);
    } else if (((Double) i[5]).doubleValue() > 0.48549043179428797) {
      p = 0;
    } 
    return p;
  }
  static double N3cd747ac527(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.6339572672736289) {
    p = SpeechDetector.N59a28c68528(i);
    } else if (((Double) i[7]).doubleValue() > 0.6339572672736289) {
    p = SpeechDetector.N53316ce5531(i);
    } 
    return p;
  }
  static double N59a28c68528(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -1.7147450961399786) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -1.7147450961399786) {
    p = SpeechDetector.N3eb02dd1529(i);
    } 
    return p;
  }
  static double N3eb02dd1529(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 2.5338686482201123) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 2.5338686482201123) {
    p = SpeechDetector.N2090147e530(i);
    } 
    return p;
  }
  static double N2090147e530(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 3.9689875118590225) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 3.9689875118590225) {
      p = 1;
    } 
    return p;
  }
  static double N53316ce5531(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 2.848083490098104) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 2.848083490098104) {
    p = SpeechDetector.N51e4590e532(i);
    } 
    return p;
  }
  static double N51e4590e532(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -1.7771406964706038) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -1.7771406964706038) {
      p = 1;
    } 
    return p;
  }
  static double N6692d022533(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -3.4961728285397693) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -3.4961728285397693) {
    p = SpeechDetector.N309e9cca534(i);
    } 
    return p;
  }
  static double N309e9cca534(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -1.369849699445869) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -1.369849699445869) {
    p = SpeechDetector.N7d47aab5535(i);
    } 
    return p;
  }
  static double N7d47aab5535(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.6292390026024056) {
    p = SpeechDetector.N6c189154536(i);
    } else if (((Double) i[3]).doubleValue() > -0.6292390026024056) {
      p = 1;
    } 
    return p;
  }
  static double N6c189154536(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 0.8268463896901556) {
    p = SpeechDetector.N40ed593d537(i);
    } else if (((Double) i[2]).doubleValue() > 0.8268463896901556) {
    p = SpeechDetector.N5ccfcea5540(i);
    } 
    return p;
  }
  static double N40ed593d537(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.9527787100500211) {
    p = SpeechDetector.N1e7dd518538(i);
    } else if (((Double) i[3]).doubleValue() > -0.9527787100500211) {
      p = 0;
    } 
    return p;
  }
  static double N1e7dd518538(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -1.8141223130761717) {
    p = SpeechDetector.N57312a4b539(i);
    } else if (((Double) i[3]).doubleValue() > -1.8141223130761717) {
      p = 1;
    } 
    return p;
  }
  static double N57312a4b539(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 1.735598311538711) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > 1.735598311538711) {
      p = 0;
    } 
    return p;
  }
  static double N5ccfcea5540(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 61.14188285892586) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 61.14188285892586) {
    p = SpeechDetector.N4f07e23d541(i);
    } 
    return p;
  }
  static double N4f07e23d541(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 61.482251805242726) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 61.482251805242726) {
      p = 0;
    } 
    return p;
  }
  static double Ne963b54542(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 60.00888481657937) {
    p = SpeechDetector.N29110f47543(i);
    } else if (((Double) i[0]).doubleValue() > 60.00888481657937) {
    p = SpeechDetector.N3d703c3560(i);
    } 
    return p;
  }
  static double N29110f47543(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 46.151824800542784) {
    p = SpeechDetector.N1f021361544(i);
    } else if (((Double) i[0]).doubleValue() > 46.151824800542784) {
    p = SpeechDetector.N7f8ca698547(i);
    } 
    return p;
  }
  static double N1f021361544(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.851330196198443) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 6.851330196198443) {
    p = SpeechDetector.N4146552e545(i);
    } 
    return p;
  }
  static double N4146552e545(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 7.514369816226027) {
    p = SpeechDetector.N7082607c546(i);
    } else if (((Double) i[1]).doubleValue() > 7.514369816226027) {
      p = 0;
    } 
    return p;
  }
  static double N7082607c546(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -2.2897021437788845) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -2.2897021437788845) {
      p = 0;
    } 
    return p;
  }
  static double N7f8ca698547(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -0.5550748015792206) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -0.5550748015792206) {
    p = SpeechDetector.N6b0d8693548(i);
    } 
    return p;
  }
  static double N6b0d8693548(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 3.4728521097334273) {
    p = SpeechDetector.N44fe53cd549(i);
    } else if (((Double) i[4]).doubleValue() > 3.4728521097334273) {
    p = SpeechDetector.N6880af18557(i);
    } 
    return p;
  }
  static double N44fe53cd549(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 48.77206193195135) {
    p = SpeechDetector.N152fdb1e550(i);
    } else if (((Double) i[0]).doubleValue() > 48.77206193195135) {
    p = SpeechDetector.Nf3d2fcc553(i);
    } 
    return p;
  }
  static double N152fdb1e550(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 5.041277416911897) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 5.041277416911897) {
    p = SpeechDetector.N78da996f551(i);
    } 
    return p;
  }
  static double N78da996f551(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -1.805433382403234) {
    p = SpeechDetector.N578f8465552(i);
    } else if (((Double) i[7]).doubleValue() > -1.805433382403234) {
      p = 0;
    } 
    return p;
  }
  static double N578f8465552(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -0.617297765518799) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > -0.617297765518799) {
      p = 0;
    } 
    return p;
  }
  static double Nf3d2fcc553(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.6786250305277896) {
    p = SpeechDetector.N7a0d01e4554(i);
    } else if (((Double) i[3]).doubleValue() > 0.6786250305277896) {
      p = 0;
    } 
    return p;
  }
  static double N7a0d01e4554(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -2.905742833109388) {
    p = SpeechDetector.N6bf75e55555(i);
    } else if (((Double) i[7]).doubleValue() > -2.905742833109388) {
      p = 0;
    } 
    return p;
  }
  static double N6bf75e55555(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.522377430958727) {
    p = SpeechDetector.N3d5255d3556(i);
    } else if (((Double) i[1]).doubleValue() > 6.522377430958727) {
      p = 0;
    } 
    return p;
  }
  static double N3d5255d3556(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -1.1075404545096197) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -1.1075404545096197) {
      p = 0;
    } 
    return p;
  }
  static double N6880af18557(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 4.443143531354571) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 4.443143531354571) {
    p = SpeechDetector.N58678641558(i);
    } 
    return p;
  }
  static double N58678641558(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 2.329457277580397) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > 2.329457277580397) {
    p = SpeechDetector.N749f42be559(i);
    } 
    return p;
  }
  static double N749f42be559(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 4.471290104319166) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 4.471290104319166) {
      p = 0;
    } 
    return p;
  }
  static double N3d703c3560(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 1.8890498797906394) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > 1.8890498797906394) {
    p = SpeechDetector.N1937f92d561(i);
    } 
    return p;
  }
  static double N1937f92d561(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.36475569162019233) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 0.36475569162019233) {
    p = SpeechDetector.N29c8064a562(i);
    } 
    return p;
  }
  static double N29c8064a562(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 5.534697475201163) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 5.534697475201163) {
      p = 0;
    } 
    return p;
  }
  static double Nb14f9b4563(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 3.4598029151097953) {
    p = SpeechDetector.Ne159e1b564(i);
    } else if (((Double) i[3]).doubleValue() > 3.4598029151097953) {
    p = SpeechDetector.N267e9564567(i);
    } 
    return p;
  }
  static double Ne159e1b564(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 3.3527942133295543) {
    p = SpeechDetector.N2d3f05d6565(i);
    } else if (((Double) i[1]).doubleValue() > 3.3527942133295543) {
      p = 0;
    } 
    return p;
  }
  static double N2d3f05d6565(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 6.47298691188711) {
    p = SpeechDetector.N4983bcf566(i);
    } else if (((Double) i[2]).doubleValue() > 6.47298691188711) {
      p = 0;
    } 
    return p;
  }
  static double N4983bcf566(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.5734341935974075) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.5734341935974075) {
      p = 1;
    } 
    return p;
  }
  static double N267e9564567(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 2.159444782759572) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > 2.159444782759572) {
    p = SpeechDetector.N4081ebfa568(i);
    } 
    return p;
  }
  static double N4081ebfa568(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 3.0117317551776486) {
    p = SpeechDetector.N11ab8b2c569(i);
    } else if (((Double) i[6]).doubleValue() > 3.0117317551776486) {
      p = 1;
    } 
    return p;
  }
  static double N11ab8b2c569(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 4.215799851779245) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 4.215799851779245) {
    p = SpeechDetector.N153dfec4570(i);
    } 
    return p;
  }
  static double N153dfec4570(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.496381137677489) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 6.496381137677489) {
      p = 0;
    } 
    return p;
  }
  static double N192100c1571(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 7.65592047543446) {
    p = SpeechDetector.N45b88bca572(i);
    } else if (((Double) i[1]).doubleValue() > 7.65592047543446) {
    p = SpeechDetector.N371f0123883(i);
    } 
    return p;
  }
  static double N45b88bca572(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -8.428500721581647) {
    p = SpeechDetector.N56e19e88573(i);
    } else if (((Double) i[4]).doubleValue() > -8.428500721581647) {
    p = SpeechDetector.N5f1f81b0592(i);
    } 
    return p;
  }
  static double N56e19e88573(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 3.2369524120897135) {
    p = SpeechDetector.N766f1f47574(i);
    } else if (((Double) i[2]).doubleValue() > 3.2369524120897135) {
      p = 0;
    } 
    return p;
  }
  static double N766f1f47574(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -0.21434501345261534) {
    p = SpeechDetector.N796eab0f575(i);
    } else if (((Double) i[11]).doubleValue() > -0.21434501345261534) {
    p = SpeechDetector.N6fe78bdd588(i);
    } 
    return p;
  }
  static double N796eab0f575(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.43974295381212836) {
    p = SpeechDetector.N50a0a411576(i);
    } else if (((Double) i[3]).doubleValue() > -0.43974295381212836) {
    p = SpeechDetector.N551895ca584(i);
    } 
    return p;
  }
  static double N50a0a411576(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 75.94531445814984) {
    p = SpeechDetector.N62738171577(i);
    } else if (((Double) i[0]).doubleValue() > 75.94531445814984) {
      p = 0;
    } 
    return p;
  }
  static double N62738171577(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 2.374915495647373) {
    p = SpeechDetector.Nd375436578(i);
    } else if (((Double) i[5]).doubleValue() > 2.374915495647373) {
      p = 0;
    } 
    return p;
  }
  static double Nd375436578(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 5.973221284404965) {
    p = SpeechDetector.N2b79ac01579(i);
    } else if (((Double) i[6]).doubleValue() > 5.973221284404965) {
      p = 0;
    } 
    return p;
  }
  static double N2b79ac01579(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 1.4931991943441663) {
    p = SpeechDetector.N410b8bf3580(i);
    } else if (((Double) i[2]).doubleValue() > 1.4931991943441663) {
    p = SpeechDetector.Nf441c83582(i);
    } 
    return p;
  }
  static double N410b8bf3580(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -9.907386981745862) {
    p = SpeechDetector.N5d111fe1581(i);
    } else if (((Double) i[4]).doubleValue() > -9.907386981745862) {
      p = 1;
    } 
    return p;
  }
  static double N5d111fe1581(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.31143523242031435) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -0.31143523242031435) {
      p = 1;
    } 
    return p;
  }
  static double Nf441c83582(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -2.798275157239501) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -2.798275157239501) {
    p = SpeechDetector.N40abe449583(i);
    } 
    return p;
  }
  static double N40abe449583(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 2.33929507486053) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 2.33929507486053) {
      p = 1;
    } 
    return p;
  }
  static double N551895ca584(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -1.1973537498420075) {
    p = SpeechDetector.N41122c6b585(i);
    } else if (((Double) i[7]).doubleValue() > -1.1973537498420075) {
      p = 0;
    } 
    return p;
  }
  static double N41122c6b585(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 1.483611239146567) {
    p = SpeechDetector.N1022462d586(i);
    } else if (((Double) i[2]).doubleValue() > 1.483611239146567) {
      p = 0;
    } 
    return p;
  }
  static double N1022462d586(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -2.447507217433442) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -2.447507217433442) {
    p = SpeechDetector.N3a2d3ca1587(i);
    } 
    return p;
  }
  static double N3a2d3ca1587(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.962662913045891) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 6.962662913045891) {
      p = 0;
    } 
    return p;
  }
  static double N6fe78bdd588(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 0.2251916210114581) {
    p = SpeechDetector.N4a8f9390589(i);
    } else if (((Double) i[10]).doubleValue() > 0.2251916210114581) {
      p = 1;
    } 
    return p;
  }
  static double N4a8f9390589(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 3.028654764304361) {
    p = SpeechDetector.N1820f92e590(i);
    } else if (((Double) i[6]).doubleValue() > 3.028654764304361) {
      p = 0;
    } 
    return p;
  }
  static double N1820f92e590(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 70.19861070017079) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 70.19861070017079) {
    p = SpeechDetector.N1cc74762591(i);
    } 
    return p;
  }
  static double N1cc74762591(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -2.2032860056631356) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -2.2032860056631356) {
      p = 0;
    } 
    return p;
  }
  static double N5f1f81b0592(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 2.0842681476260165) {
    p = SpeechDetector.Nd7b7a9a593(i);
    } else if (((Double) i[1]).doubleValue() > 2.0842681476260165) {
    p = SpeechDetector.N29505af6603(i);
    } 
    return p;
  }
  static double Nd7b7a9a593(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 0.574755329135788) {
    p = SpeechDetector.N25ae1b60594(i);
    } else if (((Double) i[5]).doubleValue() > 0.574755329135788) {
    p = SpeechDetector.N28bc2522601(i);
    } 
    return p;
  }
  static double N25ae1b60594(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= -0.17510986037887033) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > -0.17510986037887033) {
    p = SpeechDetector.N49874ef3595(i);
    } 
    return p;
  }
  static double N49874ef3595(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -2.5413840570001094) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -2.5413840570001094) {
    p = SpeechDetector.N5250593b596(i);
    } 
    return p;
  }
  static double N5250593b596(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -4.41077448601659) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -4.41077448601659) {
    p = SpeechDetector.N19125ab5597(i);
    } 
    return p;
  }
  static double N19125ab5597(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 3.253759020343679) {
    p = SpeechDetector.N4012def598(i);
    } else if (((Double) i[2]).doubleValue() > 3.253759020343679) {
    p = SpeechDetector.N5fd53d8d600(i);
    } 
    return p;
  }
  static double N4012def598(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= -1.6049089486160326) {
    p = SpeechDetector.N696ea7f6599(i);
    } else if (((Double) i[2]).doubleValue() > -1.6049089486160326) {
      p = 1;
    } 
    return p;
  }
  static double N696ea7f6599(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 78.36057631358864) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 78.36057631358864) {
      p = 1;
    } 
    return p;
  }
  static double N5fd53d8d600(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -4.423652623869805) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -4.423652623869805) {
      p = 0;
    } 
    return p;
  }
  static double N28bc2522601(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 2.09554781259362) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > 2.09554781259362) {
    p = SpeechDetector.N5829f012602(i);
    } 
    return p;
  }
  static double N5829f012602(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -3.1189891270065706) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -3.1189891270065706) {
      p = 0;
    } 
    return p;
  }
  static double N29505af6603(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 75.52473804583872) {
    p = SpeechDetector.N5a83e1aa604(i);
    } else if (((Double) i[0]).doubleValue() > 75.52473804583872) {
    p = SpeechDetector.N53a7b9d6856(i);
    } 
    return p;
  }
  static double N5a83e1aa604(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 2.5278185391356764) {
    p = SpeechDetector.N8548e53605(i);
    } else if (((Double) i[2]).doubleValue() > 2.5278185391356764) {
    p = SpeechDetector.N61666b97779(i);
    } 
    return p;
  }
  static double N8548e53605(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 5.187657374714913) {
    p = SpeechDetector.N674bef6a606(i);
    } else if (((Double) i[6]).doubleValue() > 5.187657374714913) {
    p = SpeechDetector.N7eb22dcf758(i);
    } 
    return p;
  }
  static double N674bef6a606(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -5.456955616381601) {
    p = SpeechDetector.N2a534d21607(i);
    } else if (((Double) i[9]).doubleValue() > -5.456955616381601) {
    p = SpeechDetector.N6242ad27628(i);
    } 
    return p;
  }
  static double N2a534d21607(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -2.4237703379774813) {
    p = SpeechDetector.N42ecc73c608(i);
    } else if (((Double) i[3]).doubleValue() > -2.4237703379774813) {
    p = SpeechDetector.N6f06d02d611(i);
    } 
    return p;
  }
  static double N42ecc73c608(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.4543004842028472) {
    p = SpeechDetector.N470c5677609(i);
    } else if (((Double) i[5]).doubleValue() > -0.4543004842028472) {
      p = 0;
    } 
    return p;
  }
  static double N470c5677609(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 3.8865397548283567) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 3.8865397548283567) {
    p = SpeechDetector.N7b00c311610(i);
    } 
    return p;
  }
  static double N7b00c311610(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -1.800127353838911) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -1.800127353838911) {
      p = 0;
    } 
    return p;
  }
  static double N6f06d02d611(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -3.8227639750303815) {
    p = SpeechDetector.N284d734d612(i);
    } else if (((Double) i[11]).doubleValue() > -3.8227639750303815) {
    p = SpeechDetector.N74ccd8e6613(i);
    } 
    return p;
  }
  static double N284d734d612(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -1.0126734774476251) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > -1.0126734774476251) {
      p = 0;
    } 
    return p;
  }
  static double N74ccd8e6613(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.019232926888364) {
    p = SpeechDetector.N34b41ff2614(i);
    } else if (((Double) i[1]).doubleValue() > 6.019232926888364) {
    p = SpeechDetector.N7b46060619(i);
    } 
    return p;
  }
  static double N34b41ff2614(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -1.6804592523283997) {
    p = SpeechDetector.N1d9d63e6615(i);
    } else if (((Double) i[8]).doubleValue() > -1.6804592523283997) {
      p = 1;
    } 
    return p;
  }
  static double N1d9d63e6615(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 4.036460348001274) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 4.036460348001274) {
    p = SpeechDetector.N4809a03a616(i);
    } 
    return p;
  }
  static double N4809a03a616(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 66.06868674922026) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 66.06868674922026) {
    p = SpeechDetector.N6ff664c8617(i);
    } 
    return p;
  }
  static double N6ff664c8617(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -6.348682660660047) {
    p = SpeechDetector.N1952bfe5618(i);
    } else if (((Double) i[8]).doubleValue() > -6.348682660660047) {
      p = 1;
    } 
    return p;
  }
  static double N1952bfe5618(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 0.37813675227680027) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > 0.37813675227680027) {
      p = 0;
    } 
    return p;
  }
  static double N7b46060619(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 1.6932825443779593) {
    p = SpeechDetector.N53234293620(i);
    } else if (((Double) i[5]).doubleValue() > 1.6932825443779593) {
      p = 0;
    } 
    return p;
  }
  static double N53234293620(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -0.4876634988654442) {
    p = SpeechDetector.N2fe7eb89621(i);
    } else if (((Double) i[11]).doubleValue() > -0.4876634988654442) {
    p = SpeechDetector.N50f8620b624(i);
    } 
    return p;
  }
  static double N2fe7eb89621(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.9793269804454249) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.9793269804454249) {
    p = SpeechDetector.N231887f1622(i);
    } 
    return p;
  }
  static double N231887f1622(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -1.9995201190720093) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -1.9995201190720093) {
    p = SpeechDetector.N1f84f137623(i);
    } 
    return p;
  }
  static double N1f84f137623(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 5.269937027918292) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > 5.269937027918292) {
      p = 0;
    } 
    return p;
  }
  static double N50f8620b624(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.8826371956779776) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -0.8826371956779776) {
    p = SpeechDetector.N62ece9b4625(i);
    } 
    return p;
  }
  static double N62ece9b4625(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -6.336102486016996) {
    p = SpeechDetector.N2fe35b29626(i);
    } else if (((Double) i[9]).doubleValue() > -6.336102486016996) {
      p = 1;
    } 
    return p;
  }
  static double N2fe35b29626(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 2.6931567841501107) {
    p = SpeechDetector.N7775f94e627(i);
    } else if (((Double) i[7]).doubleValue() > 2.6931567841501107) {
      p = 1;
    } 
    return p;
  }
  static double N7775f94e627(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -4.2824564547005695) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > -4.2824564547005695) {
      p = 0;
    } 
    return p;
  }
  static double N6242ad27628(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -4.382056607077795) {
    p = SpeechDetector.N7760dd7629(i);
    } else if (((Double) i[8]).doubleValue() > -4.382056607077795) {
    p = SpeechDetector.N3dd43860669(i);
    } 
    return p;
  }
  static double N7760dd7629(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 2.7543657749083232) {
    p = SpeechDetector.N5786a214630(i);
    } else if (((Double) i[5]).doubleValue() > 2.7543657749083232) {
    p = SpeechDetector.N7ad7e784661(i);
    } 
    return p;
  }
  static double N5786a214630(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.609779864434538) {
    p = SpeechDetector.N47fafbf0631(i);
    } else if (((Double) i[1]).doubleValue() > 6.609779864434538) {
    p = SpeechDetector.N576662f6652(i);
    } 
    return p;
  }
  static double N47fafbf0631(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 1.105368853180157) {
    p = SpeechDetector.N2eb26e7b632(i);
    } else if (((Double) i[2]).doubleValue() > 1.105368853180157) {
    p = SpeechDetector.N180d367d647(i);
    } 
    return p;
  }
  static double N2eb26e7b632(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -7.977827356860438) {
    p = SpeechDetector.N44736530633(i);
    } else if (((Double) i[8]).doubleValue() > -7.977827356860438) {
    p = SpeechDetector.N2e01f568637(i);
    } 
    return p;
  }
  static double N44736530633(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.760858473072208) {
    p = SpeechDetector.N73f8556b634(i);
    } else if (((Double) i[3]).doubleValue() > 0.760858473072208) {
      p = 0;
    } 
    return p;
  }
  static double N73f8556b634(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -1.6468140084387692) {
    p = SpeechDetector.N34b01f48635(i);
    } else if (((Double) i[9]).doubleValue() > -1.6468140084387692) {
      p = 1;
    } 
    return p;
  }
  static double N34b01f48635(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -4.43224658492628) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > -4.43224658492628) {
    p = SpeechDetector.N16d5cafe636(i);
    } 
    return p;
  }
  static double N16d5cafe636(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.8952507894360882) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -0.8952507894360882) {
      p = 1;
    } 
    return p;
  }
  static double N2e01f568637(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -3.909003673701538) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > -3.909003673701538) {
    p = SpeechDetector.N2969671638(i);
    } 
    return p;
  }
  static double N2969671638(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -1.0386941300168309) {
    p = SpeechDetector.N6c6ed60a639(i);
    } else if (((Double) i[11]).doubleValue() > -1.0386941300168309) {
    p = SpeechDetector.N4cd5c92a645(i);
    } 
    return p;
  }
  static double N6c6ed60a639(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 0.9930666525300981) {
    p = SpeechDetector.N60a66223640(i);
    } else if (((Double) i[5]).doubleValue() > 0.9930666525300981) {
    p = SpeechDetector.N47052da9643(i);
    } 
    return p;
  }
  static double N60a66223640(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.8419376307120602) {
    p = SpeechDetector.N4b751967641(i);
    } else if (((Double) i[5]).doubleValue() > -0.8419376307120602) {
      p = 1;
    } 
    return p;
  }
  static double N4b751967641(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 5.923807950677643) {
    p = SpeechDetector.N74d6dfe4642(i);
    } else if (((Double) i[1]).doubleValue() > 5.923807950677643) {
      p = 1;
    } 
    return p;
  }
  static double N74d6dfe4642(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -1.0733562113713953) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -1.0733562113713953) {
      p = 0;
    } 
    return p;
  }
  static double N47052da9643(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -2.131654107256856) {
    p = SpeechDetector.N24f8d6ac644(i);
    } else if (((Double) i[4]).doubleValue() > -2.131654107256856) {
      p = 0;
    } 
    return p;
  }
  static double N24f8d6ac644(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 3.900742350984502) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > 3.900742350984502) {
      p = 0;
    } 
    return p;
  }
  static double N4cd5c92a645(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 2.3186094527633574) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 2.3186094527633574) {
    p = SpeechDetector.N678a0bce646(i);
    } 
    return p;
  }
  static double N678a0bce646(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= -3.295001572783647) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > -3.295001572783647) {
      p = 1;
    } 
    return p;
  }
  static double N180d367d647(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -4.04421754039588) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -4.04421754039588) {
    p = SpeechDetector.Nb7454e1648(i);
    } 
    return p;
  }
  static double Nb7454e1648(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 1.150329632287094) {
    p = SpeechDetector.N27085a7649(i);
    } else if (((Double) i[10]).doubleValue() > 1.150329632287094) {
      p = 1;
    } 
    return p;
  }
  static double N27085a7649(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.06795867225115874) {
    p = SpeechDetector.N29569831650(i);
    } else if (((Double) i[5]).doubleValue() > -0.06795867225115874) {
    p = SpeechDetector.N7421ce2a651(i);
    } 
    return p;
  }
  static double N29569831650(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -2.128151262529246) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -2.128151262529246) {
      p = 0;
    } 
    return p;
  }
  static double N7421ce2a651(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 0.22210978077552634) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 0.22210978077552634) {
      p = 1;
    } 
    return p;
  }
  static double N576662f6652(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -2.5987995241285944) {
    p = SpeechDetector.N2eb314e653(i);
    } else if (((Double) i[11]).doubleValue() > -2.5987995241285944) {
    p = SpeechDetector.N202b5f26655(i);
    } 
    return p;
  }
  static double N2eb314e653(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -3.1233110230251855) {
    p = SpeechDetector.N1ef1f961654(i);
    } else if (((Double) i[9]).doubleValue() > -3.1233110230251855) {
      p = 0;
    } 
    return p;
  }
  static double N1ef1f961654(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 65.25718309298425) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 65.25718309298425) {
      p = 1;
    } 
    return p;
  }
  static double N202b5f26655(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.3830150563640964) {
    p = SpeechDetector.N7f73c849656(i);
    } else if (((Double) i[3]).doubleValue() > 2.3830150563640964) {
      p = 0;
    } 
    return p;
  }
  static double N7f73c849656(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 71.89179427175655) {
    p = SpeechDetector.Na6271fe657(i);
    } else if (((Double) i[0]).doubleValue() > 71.89179427175655) {
      p = 0;
    } 
    return p;
  }
  static double Na6271fe657(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 0.6035991047601347) {
    p = SpeechDetector.N4529e005658(i);
    } else if (((Double) i[10]).doubleValue() > 0.6035991047601347) {
      p = 1;
    } 
    return p;
  }
  static double N4529e005658(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -3.8904289630193314) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -3.8904289630193314) {
    p = SpeechDetector.N40328bbc659(i);
    } 
    return p;
  }
  static double N40328bbc659(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.758821409325534) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 6.758821409325534) {
    p = SpeechDetector.N36740491660(i);
    } 
    return p;
  }
  static double N36740491660(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -4.69661040147129) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > -4.69661040147129) {
      p = 0;
    } 
    return p;
  }
  static double N7ad7e784661(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -4.823391895249738) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > -4.823391895249738) {
    p = SpeechDetector.N74a0ca1d662(i);
    } 
    return p;
  }
  static double N74a0ca1d662(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -0.9542426741482992) {
    p = SpeechDetector.N683571bc663(i);
    } else if (((Double) i[11]).doubleValue() > -0.9542426741482992) {
    p = SpeechDetector.Ncbe2317664(i);
    } 
    return p;
  }
  static double N683571bc663(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 0.3914222019541628) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > 0.3914222019541628) {
      p = 1;
    } 
    return p;
  }
  static double Ncbe2317664(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -0.5995032245434142) {
    p = SpeechDetector.N16f1c18a665(i);
    } else if (((Double) i[7]).doubleValue() > -0.5995032245434142) {
    p = SpeechDetector.N59d956ca666(i);
    } 
    return p;
  }
  static double N16f1c18a665(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -0.023815211547665163) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > -0.023815211547665163) {
      p = 0;
    } 
    return p;
  }
  static double N59d956ca666(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.9494124872066368) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.9494124872066368) {
    p = SpeechDetector.N4bd115db667(i);
    } 
    return p;
  }
  static double N4bd115db667(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -2.0315179369628136) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -2.0315179369628136) {
    p = SpeechDetector.Nbf203c0668(i);
    } 
    return p;
  }
  static double Nbf203c0668(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -6.663312226890972) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -6.663312226890972) {
      p = 1;
    } 
    return p;
  }
  static double N3dd43860669(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 65.1792498887203) {
    p = SpeechDetector.N37c14656670(i);
    } else if (((Double) i[0]).doubleValue() > 65.1792498887203) {
    p = SpeechDetector.N76be3c9701(i);
    } 
    return p;
  }
  static double N37c14656670(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -4.281383086182605) {
    p = SpeechDetector.N71f0d4b2671(i);
    } else if (((Double) i[11]).doubleValue() > -4.281383086182605) {
    p = SpeechDetector.N12046eb8678(i);
    } 
    return p;
  }
  static double N71f0d4b2671(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -4.742819327441749) {
    p = SpeechDetector.N7a1c2c8e672(i);
    } else if (((Double) i[4]).doubleValue() > -4.742819327441749) {
    p = SpeechDetector.N5620295674(i);
    } 
    return p;
  }
  static double N7a1c2c8e672(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 2.2012045398024744) {
    p = SpeechDetector.N4fb15d43673(i);
    } else if (((Double) i[3]).doubleValue() > 2.2012045398024744) {
      p = 1;
    } 
    return p;
  }
  static double N4fb15d43673(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 1.0555279685677788) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 1.0555279685677788) {
      p = 1;
    } 
    return p;
  }
  static double N5620295674(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 5.5630708377655775) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 5.5630708377655775) {
    p = SpeechDetector.N659786f5675(i);
    } 
    return p;
  }
  static double N659786f5675(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 64.7658746791494) {
    p = SpeechDetector.N3f1d72ee676(i);
    } else if (((Double) i[0]).doubleValue() > 64.7658746791494) {
      p = 1;
    } 
    return p;
  }
  static double N3f1d72ee676(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 1.546005436584114) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 1.546005436584114) {
    p = SpeechDetector.N266487a1677(i);
    } 
    return p;
  }
  static double N266487a1677(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -1.72552547844802) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -1.72552547844802) {
      p = 0;
    } 
    return p;
  }
  static double N12046eb8678(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 3.723297070351631) {
    p = SpeechDetector.N6100fb45679(i);
    } else if (((Double) i[1]).doubleValue() > 3.723297070351631) {
    p = SpeechDetector.N6c371bc8683(i);
    } 
    return p;
  }
  static double N6100fb45679(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 63.688430226984856) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 63.688430226984856) {
    p = SpeechDetector.N770a0c4680(i);
    } 
    return p;
  }
  static double N770a0c4680(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -0.23831128577236704) {
    p = SpeechDetector.N734aa7ac681(i);
    } else if (((Double) i[7]).doubleValue() > -0.23831128577236704) {
      p = 1;
    } 
    return p;
  }
  static double N734aa7ac681(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 3.2785666426605458) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 3.2785666426605458) {
    p = SpeechDetector.N2a464856682(i);
    } 
    return p;
  }
  static double N2a464856682(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.7491172381249321) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 0.7491172381249321) {
      p = 0;
    } 
    return p;
  }
  static double N6c371bc8683(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 1.2832098561868148) {
    p = SpeechDetector.N16011ef9684(i);
    } else if (((Double) i[5]).doubleValue() > 1.2832098561868148) {
    p = SpeechDetector.N5c03f391700(i);
    } 
    return p;
  }
  static double N16011ef9684(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -1.3755470782906363) {
    p = SpeechDetector.N239878b8685(i);
    } else if (((Double) i[7]).doubleValue() > -1.3755470782906363) {
    p = SpeechDetector.N1717dde0689(i);
    } 
    return p;
  }
  static double N239878b8685(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 1.7722312168762144) {
    p = SpeechDetector.N6f1d8a49686(i);
    } else if (((Double) i[2]).doubleValue() > 1.7722312168762144) {
    p = SpeechDetector.N3c76290688(i);
    } 
    return p;
  }
  static double N6f1d8a49686(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.3888082555829332) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 0.3888082555829332) {
    p = SpeechDetector.N7c61f79c687(i);
    } 
    return p;
  }
  static double N7c61f79c687(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -1.8594012966717826) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -1.8594012966717826) {
      p = 0;
    } 
    return p;
  }
  static double N3c76290688(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -3.6280457562751636) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -3.6280457562751636) {
      p = 0;
    } 
    return p;
  }
  static double N1717dde0689(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -1.3002898480060436) {
    p = SpeechDetector.N1fe7a8f8690(i);
    } else if (((Double) i[3]).doubleValue() > -1.3002898480060436) {
    p = SpeechDetector.N584b1a88698(i);
    } 
    return p;
  }
  static double N1fe7a8f8690(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -0.5482921955141182) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > -0.5482921955141182) {
    p = SpeechDetector.N22064225691(i);
    } 
    return p;
  }
  static double N22064225691(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -1.2126573324205734) {
    p = SpeechDetector.N48e09c96692(i);
    } else if (((Double) i[9]).doubleValue() > -1.2126573324205734) {
    p = SpeechDetector.N15e48c20695(i);
    } 
    return p;
  }
  static double N48e09c96692(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -3.285330454186165) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -3.285330454186165) {
    p = SpeechDetector.N1248613b693(i);
    } 
    return p;
  }
  static double N1248613b693(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -1.544349919631114) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -1.544349919631114) {
    p = SpeechDetector.N4de771dd694(i);
    } 
    return p;
  }
  static double N4de771dd694(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.6624516033671158) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.6624516033671158) {
      p = 1;
    } 
    return p;
  }
  static double N15e48c20695(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= 0.4986351914645025) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > 0.4986351914645025) {
    p = SpeechDetector.N4fab941a696(i);
    } 
    return p;
  }
  static double N4fab941a696(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 63.66774246105105) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 63.66774246105105) {
    p = SpeechDetector.N9885fd3697(i);
    } 
    return p;
  }
  static double N9885fd3697(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= -1.1877414371754724) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > -1.1877414371754724) {
      p = 0;
    } 
    return p;
  }
  static double N584b1a88698(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 62.43959446209384) {
    p = SpeechDetector.N2abb0401699(i);
    } else if (((Double) i[0]).doubleValue() > 62.43959446209384) {
      p = 1;
    } 
    return p;
  }
  static double N2abb0401699(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -5.637976154100365) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -5.637976154100365) {
      p = 1;
    } 
    return p;
  }
  static double N5c03f391700(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -2.0163446659841266) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -2.0163446659841266) {
      p = 1;
    } 
    return p;
  }
  static double N76be3c9701(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.91727531364177) {
    p = SpeechDetector.N3c37a4ed702(i);
    } else if (((Double) i[1]).doubleValue() > 6.91727531364177) {
    p = SpeechDetector.N68b78a67736(i);
    } 
    return p;
  }
  static double N3c37a4ed702(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -0.8767103608595991) {
    p = SpeechDetector.N692ce27d703(i);
    } else if (((Double) i[11]).doubleValue() > -0.8767103608595991) {
    p = SpeechDetector.N7c61d4d722(i);
    } 
    return p;
  }
  static double N692ce27d703(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 1.0316038428045928) {
    p = SpeechDetector.N1c9b27d704(i);
    } else if (((Double) i[2]).doubleValue() > 1.0316038428045928) {
    p = SpeechDetector.N991e9a707(i);
    } 
    return p;
  }
  static double N1c9b27d704(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 3.3137580583619566) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 3.3137580583619566) {
    p = SpeechDetector.N60e52d75705(i);
    } 
    return p;
  }
  static double N60e52d75705(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -3.964875353828099) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -3.964875353828099) {
    p = SpeechDetector.N660b8e05706(i);
    } 
    return p;
  }
  static double N660b8e05706(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -4.914083137321348) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -4.914083137321348) {
      p = 1;
    } 
    return p;
  }
  static double N991e9a707(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -3.028405488378853) {
    p = SpeechDetector.N44a810c4708(i);
    } else if (((Double) i[11]).doubleValue() > -3.028405488378853) {
    p = SpeechDetector.N6b6c9334713(i);
    } 
    return p;
  }
  static double N44a810c4708(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 0.9590537343418161) {
    p = SpeechDetector.N75e4d712709(i);
    } else if (((Double) i[5]).doubleValue() > 0.9590537343418161) {
      p = 0;
    } 
    return p;
  }
  static double N75e4d712709(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.6519869369807756) {
    p = SpeechDetector.N2e41b36710(i);
    } else if (((Double) i[3]).doubleValue() > 2.6519869369807756) {
      p = 0;
    } 
    return p;
  }
  static double N2e41b36710(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -2.0216768299589525) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > -2.0216768299589525) {
    p = SpeechDetector.N4db677b5711(i);
    } 
    return p;
  }
  static double N4db677b5711(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -0.6200712566761565) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > -0.6200712566761565) {
    p = SpeechDetector.N66d33ef712(i);
    } 
    return p;
  }
  static double N66d33ef712(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -1.6136828286489227) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -1.6136828286489227) {
      p = 1;
    } 
    return p;
  }
  static double N6b6c9334713(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 0.6287302028002755) {
    p = SpeechDetector.N25347205714(i);
    } else if (((Double) i[10]).doubleValue() > 0.6287302028002755) {
      p = 1;
    } 
    return p;
  }
  static double N25347205714(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 67.2407512153643) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 67.2407512153643) {
    p = SpeechDetector.N1629b958715(i);
    } 
    return p;
  }
  static double N1629b958715(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 74.0189451999276) {
    p = SpeechDetector.Nd474bc6716(i);
    } else if (((Double) i[0]).doubleValue() > 74.0189451999276) {
      p = 0;
    } 
    return p;
  }
  static double Nd474bc6716(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 1.6910375732094345) {
    p = SpeechDetector.N43bfbaf9717(i);
    } else if (((Double) i[6]).doubleValue() > 1.6910375732094345) {
    p = SpeechDetector.N7a54cce5720(i);
    } 
    return p;
  }
  static double N43bfbaf9717(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 68.94135016120478) {
    p = SpeechDetector.N608c542e718(i);
    } else if (((Double) i[0]).doubleValue() > 68.94135016120478) {
      p = 1;
    } 
    return p;
  }
  static double N608c542e718(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 1.753639096067356) {
    p = SpeechDetector.N1ceac987719(i);
    } else if (((Double) i[8]).doubleValue() > 1.753639096067356) {
      p = 1;
    } 
    return p;
  }
  static double N1ceac987719(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 5.20292769605572) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 5.20292769605572) {
      p = 0;
    } 
    return p;
  }
  static double N7a54cce5720(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 2.0396885550990387) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 2.0396885550990387) {
    p = SpeechDetector.N55580d21721(i);
    } 
    return p;
  }
  static double N55580d21721(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -4.463864603589003) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -4.463864603589003) {
      p = 1;
    } 
    return p;
  }
  static double N7c61d4d722(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 3.767501112568553) {
    p = SpeechDetector.N5fadae37723(i);
    } else if (((Double) i[4]).doubleValue() > 3.767501112568553) {
    p = SpeechDetector.N12fb7943734(i);
    } 
    return p;
  }
  static double N5fadae37723(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= -1.5709147419437817) {
    p = SpeechDetector.N388cdf4724(i);
    } else if (((Double) i[10]).doubleValue() > -1.5709147419437817) {
    p = SpeechDetector.N653c3723728(i);
    } 
    return p;
  }
  static double N388cdf4724(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.371201668175686) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 6.371201668175686) {
    p = SpeechDetector.Na894ffc725(i);
    } 
    return p;
  }
  static double Na894ffc725(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() <= -2.6494235172338354) {
      p = 1;
    } else if (((Double) i[9]).doubleValue() > -2.6494235172338354) {
    p = SpeechDetector.N3ce22ecb726(i);
    } 
    return p;
  }
  static double N3ce22ecb726(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -3.701533472497865) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -3.701533472497865) {
    p = SpeechDetector.N256e30a7727(i);
    } 
    return p;
  }
  static double N256e30a7727(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -2.1963068454477908) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -2.1963068454477908) {
      p = 1;
    } 
    return p;
  }
  static double N653c3723728(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 1.1761528213241599) {
    p = SpeechDetector.N54480ec1729(i);
    } else if (((Double) i[5]).doubleValue() > 1.1761528213241599) {
    p = SpeechDetector.N6a4297f732(i);
    } 
    return p;
  }
  static double N54480ec1729(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 3.367835599774625) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 3.367835599774625) {
    p = SpeechDetector.N46c0cc21730(i);
    } 
    return p;
  }
  static double N46c0cc21730(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 71.01532020477404) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 71.01532020477404) {
    p = SpeechDetector.N1b99aed1731(i);
    } 
    return p;
  }
  static double N1b99aed1731(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -2.799083788154145) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > -2.799083788154145) {
      p = 0;
    } 
    return p;
  }
  static double N6a4297f732(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 65.9964797701328) {
    p = SpeechDetector.N3a05441733(i);
    } else if (((Double) i[0]).doubleValue() > 65.9964797701328) {
      p = 1;
    } 
    return p;
  }
  static double N3a05441733(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.9093145687559695) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -0.9093145687559695) {
      p = 1;
    } 
    return p;
  }
  static double N12fb7943734(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 2.1096787820026464) {
    p = SpeechDetector.N3bd62771735(i);
    } else if (((Double) i[7]).doubleValue() > 2.1096787820026464) {
      p = 1;
    } 
    return p;
  }
  static double N3bd62771735(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= -1.6924588613396858) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > -1.6924588613396858) {
      p = 0;
    } 
    return p;
  }
  static double N68b78a67736(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -4.584759224228336) {
    p = SpeechDetector.N69dfa5e6737(i);
    } else if (((Double) i[5]).doubleValue() > -4.584759224228336) {
    p = SpeechDetector.N4c920f6c743(i);
    } 
    return p;
  }
  static double N69dfa5e6737(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -0.38224543207703676) {
    p = SpeechDetector.N5a04d557738(i);
    } else if (((Double) i[11]).doubleValue() > -0.38224543207703676) {
    p = SpeechDetector.N72a51738741(i);
    } 
    return p;
  }
  static double N5a04d557738(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -0.246699114045593) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -0.246699114045593) {
    p = SpeechDetector.N735270ec739(i);
    } 
    return p;
  }
  static double N735270ec739(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.23947442967918925) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 0.23947442967918925) {
    p = SpeechDetector.N2973d11a740(i);
    } 
    return p;
  }
  static double N2973d11a740(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -3.53611337863619) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -3.53611337863619) {
      p = 1;
    } 
    return p;
  }
  static double N72a51738741(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 0.8402257307405031) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 0.8402257307405031) {
    p = SpeechDetector.N34979855742(i);
    } 
    return p;
  }
  static double N34979855742(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 1.0932196364509468) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 1.0932196364509468) {
      p = 1;
    } 
    return p;
  }
  static double N4c920f6c743(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -3.143122977795835) {
    p = SpeechDetector.N932a2ba744(i);
    } else if (((Double) i[11]).doubleValue() > -3.143122977795835) {
    p = SpeechDetector.N708a1178749(i);
    } 
    return p;
  }
  static double N932a2ba744(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 4.851268976454914) {
    p = SpeechDetector.N5b59660d745(i);
    } else if (((Double) i[7]).doubleValue() > 4.851268976454914) {
      p = 0;
    } 
    return p;
  }
  static double N5b59660d745(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 67.05281495356304) {
    p = SpeechDetector.N4a3b0e55746(i);
    } else if (((Double) i[0]).doubleValue() > 67.05281495356304) {
    p = SpeechDetector.N6b2a1485747(i);
    } 
    return p;
  }
  static double N4a3b0e55746(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -4.953025172196528) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -4.953025172196528) {
      p = 1;
    } 
    return p;
  }
  static double N6b2a1485747(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 7.370317615689217) {
    p = SpeechDetector.N17a95eba748(i);
    } else if (((Double) i[1]).doubleValue() > 7.370317615689217) {
      p = 0;
    } 
    return p;
  }
  static double N17a95eba748(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 0.9341264665650056) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 0.9341264665650056) {
      p = 0;
    } 
    return p;
  }
  static double N708a1178749(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 70.05516906945593) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 70.05516906945593) {
    p = SpeechDetector.N78811700750(i);
    } 
    return p;
  }
  static double N78811700750(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -0.18291592948601992) {
    p = SpeechDetector.N630d3ece751(i);
    } else if (((Double) i[2]).doubleValue() > -0.18291592948601992) {
    p = SpeechDetector.N36d2a90d756(i);
    } 
    return p;
  }
  static double N630d3ece751(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 4.326180672798974) {
    p = SpeechDetector.N7a96792f752(i);
    } else if (((Double) i[6]).doubleValue() > 4.326180672798974) {
      p = 0;
    } 
    return p;
  }
  static double N7a96792f752(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.7186977311959754) {
    p = SpeechDetector.N2cee3b89753(i);
    } else if (((Double) i[4]).doubleValue() > 0.7186977311959754) {
    p = SpeechDetector.N20321066755(i);
    } 
    return p;
  }
  static double N2cee3b89753(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 1.591054209210997) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > 1.591054209210997) {
    p = SpeechDetector.N4c86b66a754(i);
    } 
    return p;
  }
  static double N4c86b66a754(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -1.9236215521480384) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -1.9236215521480384) {
      p = 1;
    } 
    return p;
  }
  static double N20321066755(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -1.6010579375007445) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -1.6010579375007445) {
      p = 1;
    } 
    return p;
  }
  static double N36d2a90d756(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.12263917710281425) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 0.12263917710281425) {
    p = SpeechDetector.N4058b099757(i);
    } 
    return p;
  }
  static double N4058b099757(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -2.9907859774714747) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -2.9907859774714747) {
      p = 1;
    } 
    return p;
  }
  static double N7eb22dcf758(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -2.7845776921772813) {
    p = SpeechDetector.N63ddb204759(i);
    } else if (((Double) i[8]).doubleValue() > -2.7845776921772813) {
    p = SpeechDetector.N5a31d727772(i);
    } 
    return p;
  }
  static double N63ddb204759(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 6.2096091168941845) {
    p = SpeechDetector.N6fd257d4760(i);
    } else if (((Double) i[1]).doubleValue() > 6.2096091168941845) {
    p = SpeechDetector.N23f891ae770(i);
    } 
    return p;
  }
  static double N6fd257d4760(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -2.4813437229953843) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -2.4813437229953843) {
    p = SpeechDetector.N5a8458a6761(i);
    } 
    return p;
  }
  static double N5a8458a6761(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 0.5236743596846148) {
    p = SpeechDetector.N26d828b7762(i);
    } else if (((Double) i[10]).doubleValue() > 0.5236743596846148) {
    p = SpeechDetector.Nc05327765(i);
    } 
    return p;
  }
  static double N26d828b7762(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= -2.595283650400677) {
    p = SpeechDetector.N39591a4d763(i);
    } else if (((Double) i[2]).doubleValue() > -2.595283650400677) {
      p = 0;
    } 
    return p;
  }
  static double N39591a4d763(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.12438186027480304) {
    p = SpeechDetector.N8cdd2a5764(i);
    } else if (((Double) i[3]).doubleValue() > -0.12438186027480304) {
      p = 0;
    } 
    return p;
  }
  static double N8cdd2a5764(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 5.178395149694622) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 5.178395149694622) {
      p = 0;
    } 
    return p;
  }
  static double Nc05327765(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -3.0075421764208694) {
    p = SpeechDetector.N529325d3766(i);
    } else if (((Double) i[11]).doubleValue() > -3.0075421764208694) {
    p = SpeechDetector.N3a9869ff767(i);
    } 
    return p;
  }
  static double N529325d3766(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -5.754624270300797) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() > -5.754624270300797) {
      p = 0;
    } 
    return p;
  }
  static double N3a9869ff767(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.8033822636425206) {
    p = SpeechDetector.N6c570266768(i);
    } else if (((Double) i[7]).doubleValue() > 0.8033822636425206) {
      p = 1;
    } 
    return p;
  }
  static double N6c570266768(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -4.625854027997575) {
    p = SpeechDetector.N445eae1b769(i);
    } else if (((Double) i[8]).doubleValue() > -4.625854027997575) {
      p = 1;
    } 
    return p;
  }
  static double N445eae1b769(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.14836188043124604) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 0.14836188043124604) {
      p = 0;
    } 
    return p;
  }
  static double N23f891ae770(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 4.462085572832993) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 4.462085572832993) {
    p = SpeechDetector.N142448f5771(i);
    } 
    return p;
  }
  static double N142448f5771(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.4296662604276799) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -0.4296662604276799) {
      p = 1;
    } 
    return p;
  }
  static double N5a31d727772(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -2.795648753337389) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > -2.795648753337389) {
    p = SpeechDetector.N7e246fb3773(i);
    } 
    return p;
  }
  static double N7e246fb3773(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -5.313889810004775) {
    p = SpeechDetector.Na219178774(i);
    } else if (((Double) i[4]).doubleValue() > -5.313889810004775) {
      p = 1;
    } 
    return p;
  }
  static double Na219178774(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -2.025640716294751) {
    p = SpeechDetector.N21d5627a775(i);
    } else if (((Double) i[9]).doubleValue() > -2.025640716294751) {
    p = SpeechDetector.N403448f0776(i);
    } 
    return p;
  }
  static double N21d5627a775(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -2.021908617895403) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > -2.021908617895403) {
      p = 0;
    } 
    return p;
  }
  static double N403448f0776(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -6.284804925718374) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -6.284804925718374) {
    p = SpeechDetector.N28a0a57e777(i);
    } 
    return p;
  }
  static double N28a0a57e777(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 63.47567587439542) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 63.47567587439542) {
    p = SpeechDetector.N4ad10808778(i);
    } 
    return p;
  }
  static double N4ad10808778(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 72.4627043397665) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 72.4627043397665) {
      p = 0;
    } 
    return p;
  }
  static double N61666b97779(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -1.890998893183652) {
    p = SpeechDetector.Nb21b876780(i);
    } else if (((Double) i[6]).doubleValue() > -1.890998893183652) {
    p = SpeechDetector.N5e42bef1789(i);
    } 
    return p;
  }
  static double Nb21b876780(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 5.206919220368187) {
    p = SpeechDetector.N52d550af781(i);
    } else if (((Double) i[2]).doubleValue() > 5.206919220368187) {
      p = 0;
    } 
    return p;
  }
  static double N52d550af781(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -0.3279714263147776) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > -0.3279714263147776) {
    p = SpeechDetector.N32a43ba5782(i);
    } 
    return p;
  }
  static double N32a43ba5782(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -3.061764972934077) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -3.061764972934077) {
    p = SpeechDetector.N3c47e79c783(i);
    } 
    return p;
  }
  static double N3c47e79c783(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -0.9376895124926447) {
    p = SpeechDetector.N14b6d1af784(i);
    } else if (((Double) i[7]).doubleValue() > -0.9376895124926447) {
    p = SpeechDetector.N26a09125786(i);
    } 
    return p;
  }
  static double N14b6d1af784(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 5.685053270560327) {
    p = SpeechDetector.N6e8042c8785(i);
    } else if (((Double) i[1]).doubleValue() > 5.685053270560327) {
      p = 0;
    } 
    return p;
  }
  static double N6e8042c8785(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 69.92749018647267) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 69.92749018647267) {
      p = 0;
    } 
    return p;
  }
  static double N26a09125786(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.174552535266754) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 6.174552535266754) {
    p = SpeechDetector.N779927f2787(i);
    } 
    return p;
  }
  static double N779927f2787(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 2.699178460326213) {
    p = SpeechDetector.N680dbe35788(i);
    } else if (((Double) i[8]).doubleValue() > 2.699178460326213) {
      p = 1;
    } 
    return p;
  }
  static double N680dbe35788(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 4.411354341302728) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() > 4.411354341302728) {
      p = 1;
    } 
    return p;
  }
  static double N5e42bef1789(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= -2.124499209149194) {
    p = SpeechDetector.N7005f08f790(i);
    } else if (((Double) i[11]).doubleValue() > -2.124499209149194) {
    p = SpeechDetector.N33ce2e13802(i);
    } 
    return p;
  }
  static double N7005f08f790(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 1.4826653203359892) {
    p = SpeechDetector.N15f475be791(i);
    } else if (((Double) i[8]).doubleValue() > 1.4826653203359892) {
    p = SpeechDetector.N65080c4a795(i);
    } 
    return p;
  }
  static double N15f475be791(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -4.1404381826673236) {
    p = SpeechDetector.N645e1834792(i);
    } else if (((Double) i[4]).doubleValue() > -4.1404381826673236) {
    p = SpeechDetector.N56bc4f82794(i);
    } 
    return p;
  }
  static double N645e1834792(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 4.305014917064652) {
    p = SpeechDetector.N5d873166793(i);
    } else if (((Double) i[1]).doubleValue() > 4.305014917064652) {
      p = 0;
    } 
    return p;
  }
  static double N5d873166793(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 3.2485187801724926) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > 3.2485187801724926) {
      p = 1;
    } 
    return p;
  }
  static double N56bc4f82794(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 3.555280401346098) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 3.555280401346098) {
      p = 0;
    } 
    return p;
  }
  static double N65080c4a795(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -2.0411995216650602) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -2.0411995216650602) {
    p = SpeechDetector.N735f0217796(i);
    } 
    return p;
  }
  static double N735f0217796(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 62.24592241414936) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 62.24592241414936) {
    p = SpeechDetector.N62826f2d797(i);
    } 
    return p;
  }
  static double N62826f2d797(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 1.507246064217649) {
    p = SpeechDetector.N615125e1798(i);
    } else if (((Double) i[7]).doubleValue() > 1.507246064217649) {
      p = 1;
    } 
    return p;
  }
  static double N615125e1798(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 4.124229480831266) {
    p = SpeechDetector.N168e08b1799(i);
    } else if (((Double) i[2]).doubleValue() > 4.124229480831266) {
      p = 0;
    } 
    return p;
  }
  static double N168e08b1799(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -0.8267591359116541) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -0.8267591359116541) {
    p = SpeechDetector.N46dca808800(i);
    } 
    return p;
  }
  static double N46dca808800(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 67.88959041320231) {
    p = SpeechDetector.N409bc990801(i);
    } else if (((Double) i[0]).doubleValue() > 67.88959041320231) {
      p = 1;
    } 
    return p;
  }
  static double N409bc990801(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 64.94991266686958) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 64.94991266686958) {
      p = 0;
    } 
    return p;
  }
  static double N33ce2e13802(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 0.9937365681750953) {
    p = SpeechDetector.N2532fbf7803(i);
    } else if (((Double) i[10]).doubleValue() > 0.9937365681750953) {
    p = SpeechDetector.N1336c8c7838(i);
    } 
    return p;
  }
  static double N2532fbf7803(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 4.408081523457731) {
    p = SpeechDetector.N363c2835804(i);
    } else if (((Double) i[2]).doubleValue() > 4.408081523457731) {
    p = SpeechDetector.N536fe399828(i);
    } 
    return p;
  }
  static double N363c2835804(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 1.1152858830133696) {
    p = SpeechDetector.N2773cb64805(i);
    } else if (((Double) i[5]).doubleValue() > 1.1152858830133696) {
    p = SpeechDetector.N3c12a5aa823(i);
    } 
    return p;
  }
  static double N2773cb64805(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 5.9326628267966015) {
    p = SpeechDetector.N232e2678806(i);
    } else if (((Double) i[1]).doubleValue() > 5.9326628267966015) {
    p = SpeechDetector.N57543875812(i);
    } 
    return p;
  }
  static double N232e2678806(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= 0.7051460642410392) {
    p = SpeechDetector.N2adfa253807(i);
    } else if (((Double) i[11]).doubleValue() > 0.7051460642410392) {
      p = 1;
    } 
    return p;
  }
  static double N2adfa253807(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -7.319223936736054) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -7.319223936736054) {
    p = SpeechDetector.N401a0d22808(i);
    } 
    return p;
  }
  static double N401a0d22808(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 0.011683528861261542) {
    p = SpeechDetector.N6e54540e809(i);
    } else if (((Double) i[10]).doubleValue() > 0.011683528861261542) {
      p = 1;
    } 
    return p;
  }
  static double N6e54540e809(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -2.435999363777488) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -2.435999363777488) {
    p = SpeechDetector.N625a9bb8810(i);
    } 
    return p;
  }
  static double N625a9bb8810(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 71.80627752329939) {
    p = SpeechDetector.N2aa57f7a811(i);
    } else if (((Double) i[0]).doubleValue() > 71.80627752329939) {
      p = 0;
    } 
    return p;
  }
  static double N2aa57f7a811(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= 0.3338186228790356) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > 0.3338186228790356) {
      p = 0;
    } 
    return p;
  }
  static double N57543875812(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 70.29120462211468) {
    p = SpeechDetector.N5a46b61d813(i);
    } else if (((Double) i[0]).doubleValue() > 70.29120462211468) {
      p = 0;
    } 
    return p;
  }
  static double N5a46b61d813(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 1.0368419518767533) {
    p = SpeechDetector.N585e5838814(i);
    } else if (((Double) i[8]).doubleValue() > 1.0368419518767533) {
    p = SpeechDetector.N257dfa83820(i);
    } 
    return p;
  }
  static double N585e5838814(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -5.455373926319945) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -5.455373926319945) {
    p = SpeechDetector.N19f1f1db815(i);
    } 
    return p;
  }
  static double N19f1f1db815(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -0.43898232986802066) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -0.43898232986802066) {
    p = SpeechDetector.N5b3d6e2b816(i);
    } 
    return p;
  }
  static double N5b3d6e2b816(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 1.6553507648005839) {
    p = SpeechDetector.N1e0bf7d9817(i);
    } else if (((Double) i[11]).doubleValue() > 1.6553507648005839) {
      p = 1;
    } 
    return p;
  }
  static double N1e0bf7d9817(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.10770584853796512) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 0.10770584853796512) {
    p = SpeechDetector.N23bcd6f8818(i);
    } 
    return p;
  }
  static double N23bcd6f8818(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 3.123771917835168) {
    p = SpeechDetector.N42c5461c819(i);
    } else if (((Double) i[2]).doubleValue() > 3.123771917835168) {
      p = 0;
    } 
    return p;
  }
  static double N42c5461c819(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 0.11111374848228422) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() > 0.11111374848228422) {
      p = 0;
    } 
    return p;
  }
  static double N257dfa83820(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -2.5527821198754603) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -2.5527821198754603) {
    p = SpeechDetector.N71c9c1af821(i);
    } 
    return p;
  }
  static double N71c9c1af821(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -5.0099507395980645) {
    p = SpeechDetector.N74cb0285822(i);
    } else if (((Double) i[4]).doubleValue() > -5.0099507395980645) {
      p = 1;
    } 
    return p;
  }
  static double N74cb0285822(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 3.1084224851488917) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 3.1084224851488917) {
      p = 0;
    } 
    return p;
  }
  static double N3c12a5aa823(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.14253382437624007) {
    p = SpeechDetector.N6c3a5ab5824(i);
    } else if (((Double) i[7]).doubleValue() > 0.14253382437624007) {
    p = SpeechDetector.N4d06d521826(i);
    } 
    return p;
  }
  static double N6c3a5ab5824(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -0.6666951036056689) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -0.6666951036056689) {
    p = SpeechDetector.N6b195895825(i);
    } 
    return p;
  }
  static double N6b195895825(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -1.8346884274701727) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -1.8346884274701727) {
      p = 0;
    } 
    return p;
  }
  static double N4d06d521826(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -2.674062911248959) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -2.674062911248959) {
    p = SpeechDetector.N7b929108827(i);
    } 
    return p;
  }
  static double N7b929108827(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -1.3892387316308774) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -1.3892387316308774) {
      p = 1;
    } 
    return p;
  }
  static double N536fe399828(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -2.581756308216972) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -2.581756308216972) {
    p = SpeechDetector.N56c77c9a829(i);
    } 
    return p;
  }
  static double N56c77c9a829(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 6.539290615659279) {
    p = SpeechDetector.N42c58ef8830(i);
    } else if (((Double) i[2]).doubleValue() > 6.539290615659279) {
      p = 0;
    } 
    return p;
  }
  static double N42c58ef8830(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -2.716170992846115) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -2.716170992846115) {
    p = SpeechDetector.N382d5e07831(i);
    } 
    return p;
  }
  static double N382d5e07831(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 3.073056870436291) {
    p = SpeechDetector.N2a783a61832(i);
    } else if (((Double) i[7]).doubleValue() > 3.073056870436291) {
      p = 0;
    } 
    return p;
  }
  static double N2a783a61832(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.471458332878073) {
    p = SpeechDetector.N3b40cc0f833(i);
    } else if (((Double) i[1]).doubleValue() > 6.471458332878073) {
    p = SpeechDetector.N290c53f835(i);
    } 
    return p;
  }
  static double N3b40cc0f833(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 1.768914314048666) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() > 1.768914314048666) {
    p = SpeechDetector.N1b150b2d834(i);
    } 
    return p;
  }
  static double N1b150b2d834(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 4.471902116977981) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 4.471902116977981) {
      p = 0;
    } 
    return p;
  }
  static double N290c53f835(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -3.6633104637112353) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -3.6633104637112353) {
    p = SpeechDetector.N6e85ac69836(i);
    } 
    return p;
  }
  static double N6e85ac69836(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= -0.7271445647433223) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > -0.7271445647433223) {
    p = SpeechDetector.N9fa5a2f837(i);
    } 
    return p;
  }
  static double N9fa5a2f837(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 3.091407365915973) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > 3.091407365915973) {
      p = 1;
    } 
    return p;
  }
  static double N1336c8c7838(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -0.7955864094976717) {
    p = SpeechDetector.N71b78aab839(i);
    } else if (((Double) i[7]).doubleValue() > -0.7955864094976717) {
    p = SpeechDetector.N4be944eb842(i);
    } 
    return p;
  }
  static double N71b78aab839(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -0.9362338552602042) {
    p = SpeechDetector.N48f11ae0840(i);
    } else if (((Double) i[4]).doubleValue() > -0.9362338552602042) {
      p = 0;
    } 
    return p;
  }
  static double N48f11ae0840(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 4.952872383585387) {
    p = SpeechDetector.N4d1b8d89841(i);
    } else if (((Double) i[2]).doubleValue() > 4.952872383585387) {
      p = 0;
    } 
    return p;
  }
  static double N4d1b8d89841(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.949115491003473) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 6.949115491003473) {
      p = 0;
    } 
    return p;
  }
  static double N4be944eb842(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 65.24157762166085) {
    p = SpeechDetector.N3fabc73c843(i);
    } else if (((Double) i[0]).doubleValue() > 65.24157762166085) {
    p = SpeechDetector.N7fdceb52854(i);
    } 
    return p;
  }
  static double N3fabc73c843(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= 1.26052000020133) {
    p = SpeechDetector.N26a554cc844(i);
    } else if (((Double) i[11]).doubleValue() > 1.26052000020133) {
    p = SpeechDetector.N550f0d5a848(i);
    } 
    return p;
  }
  static double N26a554cc844(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 1;
    } else if (((Double) i[10]).doubleValue() <= 3.112133371001933) {
    p = SpeechDetector.N306230e6845(i);
    } else if (((Double) i[10]).doubleValue() > 3.112133371001933) {
      p = 1;
    } 
    return p;
  }
  static double N306230e6845(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 1;
    } else if (((Double) i[11]).doubleValue() <= -0.23846856657389776) {
    p = SpeechDetector.N7e7864da846(i);
    } else if (((Double) i[11]).doubleValue() > -0.23846856657389776) {
      p = 0;
    } 
    return p;
  }
  static double N7e7864da846(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 0.5454118259843396) {
    p = SpeechDetector.N12256514847(i);
    } else if (((Double) i[8]).doubleValue() > 0.5454118259843396) {
      p = 1;
    } 
    return p;
  }
  static double N12256514847(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= -0.7864665388644534) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() > -0.7864665388644534) {
      p = 0;
    } 
    return p;
  }
  static double N550f0d5a848(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 6.996640424696205) {
    p = SpeechDetector.N4f35bb56849(i);
    } else if (((Double) i[1]).doubleValue() > 6.996640424696205) {
    p = SpeechDetector.N425621af851(i);
    } 
    return p;
  }
  static double N4f35bb56849(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 3.6751543526553454) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 3.6751543526553454) {
    p = SpeechDetector.N509e33ba850(i);
    } 
    return p;
  }
  static double N509e33ba850(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 3.849092801905675) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 3.849092801905675) {
      p = 0;
    } 
    return p;
  }
  static double N425621af851(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 2.434853406734175) {
    p = SpeechDetector.N24bd8a2f852(i);
    } else if (((Double) i[10]).doubleValue() > 2.434853406734175) {
      p = 1;
    } 
    return p;
  }
  static double N24bd8a2f852(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 2.936530959400155) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 2.936530959400155) {
    p = SpeechDetector.N17bb2681853(i);
    } 
    return p;
  }
  static double N17bb2681853(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 7.1917789319053) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 7.1917789319053) {
      p = 0;
    } 
    return p;
  }
  static double N7fdceb52854(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 0.46193917232355214) {
    p = SpeechDetector.Ndd9613855(i);
    } else if (((Double) i[7]).doubleValue() > 0.46193917232355214) {
      p = 1;
    } 
    return p;
  }
  static double Ndd9613855(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -4.346709407719996) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -4.346709407719996) {
      p = 1;
    } 
    return p;
  }
  static double N53a7b9d6856(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 80.0360892457469) {
    p = SpeechDetector.N2899bb82857(i);
    } else if (((Double) i[0]).doubleValue() > 80.0360892457469) {
    p = SpeechDetector.N6813cc41880(i);
    } 
    return p;
  }
  static double N2899bb82857(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 4.4156571446871276) {
    p = SpeechDetector.N4e568a1858(i);
    } else if (((Double) i[1]).doubleValue() > 4.4156571446871276) {
    p = SpeechDetector.N6f0c66e9869(i);
    } 
    return p;
  }
  static double N4e568a1858(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 1.3142964644648936) {
    p = SpeechDetector.N71382489859(i);
    } else if (((Double) i[5]).doubleValue() > 1.3142964644648936) {
    p = SpeechDetector.N506660c2867(i);
    } 
    return p;
  }
  static double N71382489859(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -0.1975269435658846) {
    p = SpeechDetector.N1ce6d871860(i);
    } else if (((Double) i[2]).doubleValue() > -0.1975269435658846) {
    p = SpeechDetector.N1da35dd9866(i);
    } 
    return p;
  }
  static double N1ce6d871860(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (((Double) i[6]).doubleValue() <= 7.400876394439024) {
    p = SpeechDetector.N778bf189861(i);
    } else if (((Double) i[6]).doubleValue() > 7.400876394439024) {
      p = 0;
    } 
    return p;
  }
  static double N778bf189861(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -3.819389786638913) {
    p = SpeechDetector.N49e96b0862(i);
    } else if (((Double) i[9]).doubleValue() > -3.819389786638913) {
    p = SpeechDetector.N3f2b49ca864(i);
    } 
    return p;
  }
  static double N49e96b0862(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= -3.3820858715440947) {
    p = SpeechDetector.N47b6ff2e863(i);
    } else if (((Double) i[2]).doubleValue() > -3.3820858715440947) {
      p = 0;
    } 
    return p;
  }
  static double N47b6ff2e863(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 77.89980869468458) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 77.89980869468458) {
      p = 0;
    } 
    return p;
  }
  static double N3f2b49ca864(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -0.7112318977683851) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -0.7112318977683851) {
    p = SpeechDetector.N32f98d2c865(i);
    } 
    return p;
  }
  static double N32f98d2c865(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 1.0907960668779575) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 1.0907960668779575) {
      p = 0;
    } 
    return p;
  }
  static double N1da35dd9866(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 1.7751430931740544) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 1.7751430931740544) {
      p = 1;
    } 
    return p;
  }
  static double N506660c2867(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= -3.6471868738610884) {
    p = SpeechDetector.N715a89ca868(i);
    } else if (((Double) i[2]).doubleValue() > -3.6471868738610884) {
      p = 0;
    } 
    return p;
  }
  static double N715a89ca868(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.7705710382194717) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -0.7705710382194717) {
      p = 1;
    } 
    return p;
  }
  static double N6f0c66e9869(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 76.70449322242054) {
    p = SpeechDetector.N173883f4870(i);
    } else if (((Double) i[0]).doubleValue() > 76.70449322242054) {
    p = SpeechDetector.N3dbc562e877(i);
    } 
    return p;
  }
  static double N173883f4870(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 6.40755216917476) {
    p = SpeechDetector.N7f5f1414871(i);
    } else if (((Double) i[1]).doubleValue() > 6.40755216917476) {
      p = 0;
    } 
    return p;
  }
  static double N7f5f1414871(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 3.9325209699074115) {
    p = SpeechDetector.N3b1f6e60872(i);
    } else if (((Double) i[7]).doubleValue() > 3.9325209699074115) {
      p = 0;
    } 
    return p;
  }
  static double N3b1f6e60872(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= -0.7517674703099537) {
    p = SpeechDetector.Nc877ef3873(i);
    } else if (((Double) i[5]).doubleValue() > -0.7517674703099537) {
    p = SpeechDetector.N4f1978ee875(i);
    } 
    return p;
  }
  static double Nc877ef3873(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -0.39937737846601823) {
    p = SpeechDetector.N139f89f2874(i);
    } else if (((Double) i[4]).doubleValue() > -0.39937737846601823) {
      p = 0;
    } 
    return p;
  }
  static double N139f89f2874(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -2.9974705739838017) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -2.9974705739838017) {
      p = 1;
    } 
    return p;
  }
  static double N4f1978ee875(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -1.8862352903135853) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -1.8862352903135853) {
    p = SpeechDetector.N115279d4876(i);
    } 
    return p;
  }
  static double N115279d4876(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -1.6535196386153674) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -1.6535196386153674) {
      p = 0;
    } 
    return p;
  }
  static double N3dbc562e877(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= -4.012001391148095) {
    p = SpeechDetector.N17be05ac878(i);
    } else if (((Double) i[2]).doubleValue() > -4.012001391148095) {
      p = 0;
    } 
    return p;
  }
  static double N17be05ac878(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -4.506508269527553) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -4.506508269527553) {
    p = SpeechDetector.N3c666b61879(i);
    } 
    return p;
  }
  static double N3c666b61879(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -1.3667448821473867) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -1.3667448821473867) {
      p = 0;
    } 
    return p;
  }
  static double N6813cc41880(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= -0.737068279371733) {
    p = SpeechDetector.N6bc6f4c8881(i);
    } else if (((Double) i[7]).doubleValue() > -0.737068279371733) {
      p = 0;
    } 
    return p;
  }
  static double N6bc6f4c8881(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -4.82997366522718) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -4.82997366522718) {
    p = SpeechDetector.N52f0adbf882(i);
    } 
    return p;
  }
  static double N52f0adbf882(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 0.6694926755987491) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 0.6694926755987491) {
      p = 0;
    } 
    return p;
  }
  static double N371f0123883(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 8.738978036860187) {
    p = SpeechDetector.N5483bd1a884(i);
    } else if (((Double) i[1]).doubleValue() > 8.738978036860187) {
    p = SpeechDetector.N222cd36e932(i);
    } 
    return p;
  }
  static double N5483bd1a884(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -2.348776278847106) {
    p = SpeechDetector.N14f4214f885(i);
    } else if (((Double) i[6]).doubleValue() > -2.348776278847106) {
    p = SpeechDetector.N3387d243891(i);
    } 
    return p;
  }
  static double N14f4214f885(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 1.0767838850560922) {
    p = SpeechDetector.N27b6d448886(i);
    } else if (((Double) i[2]).doubleValue() > 1.0767838850560922) {
      p = 0;
    } 
    return p;
  }
  static double N27b6d448886(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= -2.170174255275153) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > -2.170174255275153) {
    p = SpeechDetector.N542ad756887(i);
    } 
    return p;
  }
  static double N542ad756887(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 0.1945082766155169) {
    p = SpeechDetector.N489f7a45888(i);
    } else if (((Double) i[10]).doubleValue() > 0.1945082766155169) {
      p = 1;
    } 
    return p;
  }
  static double N489f7a45888(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 67.92322377659596) {
    p = SpeechDetector.N5e146d42889(i);
    } else if (((Double) i[0]).doubleValue() > 67.92322377659596) {
      p = 0;
    } 
    return p;
  }
  static double N5e146d42889(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 0.3832646954225891) {
    p = SpeechDetector.Nf11384f890(i);
    } else if (((Double) i[5]).doubleValue() > 0.3832646954225891) {
      p = 0;
    } 
    return p;
  }
  static double Nf11384f890(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 3.5944667131720847) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 3.5944667131720847) {
      p = 0;
    } 
    return p;
  }
  static double N3387d243891(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -4.25000255209019) {
    p = SpeechDetector.N19fd4723892(i);
    } else if (((Double) i[4]).doubleValue() > -4.25000255209019) {
    p = SpeechDetector.N3803cac8897(i);
    } 
    return p;
  }
  static double N19fd4723892(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 4.512198449316209) {
    p = SpeechDetector.N43495829893(i);
    } else if (((Double) i[2]).doubleValue() > 4.512198449316209) {
      p = 0;
    } 
    return p;
  }
  static double N43495829893(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= -0.08905697801058081) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() > -0.08905697801058081) {
    p = SpeechDetector.N43b0e42894(i);
    } 
    return p;
  }
  static double N43b0e42894(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -2.278685739024366) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > -2.278685739024366) {
    p = SpeechDetector.N41251139895(i);
    } 
    return p;
  }
  static double N41251139895(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= -1.4426755853382327) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > -1.4426755853382327) {
    p = SpeechDetector.N688dd698896(i);
    } 
    return p;
  }
  static double N688dd698896(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 0.8629139211732807) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 0.8629139211732807) {
      p = 1;
    } 
    return p;
  }
  static double N3803cac8897(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 4.7903204220350295) {
    p = SpeechDetector.Nf62d33898(i);
    } else if (((Double) i[10]).doubleValue() > 4.7903204220350295) {
    p = SpeechDetector.N376645b8930(i);
    } 
    return p;
  }
  static double Nf62d33898(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 71.57646252113075) {
    p = SpeechDetector.N22116fc3899(i);
    } else if (((Double) i[0]).doubleValue() > 71.57646252113075) {
      p = 0;
    } 
    return p;
  }
  static double N22116fc3899(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (((Double) i[2]).doubleValue() <= 3.8776678347345594) {
    p = SpeechDetector.N26c07cae900(i);
    } else if (((Double) i[2]).doubleValue() > 3.8776678347345594) {
    p = SpeechDetector.N6bcc0a63926(i);
    } 
    return p;
  }
  static double N26c07cae900(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= -3.5407038925812855) {
    p = SpeechDetector.N27399762901(i);
    } else if (((Double) i[8]).doubleValue() > -3.5407038925812855) {
    p = SpeechDetector.N2a989087903(i);
    } 
    return p;
  }
  static double N27399762901(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 65.4231157875184) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 65.4231157875184) {
    p = SpeechDetector.N3601b70c902(i);
    } 
    return p;
  }
  static double N3601b70c902(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= -0.955026453262924) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > -0.955026453262924) {
      p = 0;
    } 
    return p;
  }
  static double N2a989087903(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -2.1752663137620334) {
    p = SpeechDetector.N638a4ea904(i);
    } else if (((Double) i[9]).doubleValue() > -2.1752663137620334) {
    p = SpeechDetector.N6021de52911(i);
    } 
    return p;
  }
  static double N638a4ea904(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 0.6672271637267725) {
    p = SpeechDetector.N70d301d6905(i);
    } else if (((Double) i[5]).doubleValue() > 0.6672271637267725) {
    p = SpeechDetector.N7cca6b6b907(i);
    } 
    return p;
  }
  static double N70d301d6905(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 5.665131852035662) {
    p = SpeechDetector.N2d1dc278906(i);
    } else if (((Double) i[7]).doubleValue() > 5.665131852035662) {
      p = 0;
    } 
    return p;
  }
  static double N2d1dc278906(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 7.879186951627345) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 7.879186951627345) {
      p = 0;
    } 
    return p;
  }
  static double N7cca6b6b907(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 3.1621347085358136) {
    p = SpeechDetector.N4d527dce908(i);
    } else if (((Double) i[7]).doubleValue() > 3.1621347085358136) {
      p = 0;
    } 
    return p;
  }
  static double N4d527dce908(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -1.728457784375447) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -1.728457784375447) {
    p = SpeechDetector.N62c1870a909(i);
    } 
    return p;
  }
  static double N62c1870a909(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 3.034777251398726) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 3.034777251398726) {
    p = SpeechDetector.Nf88d42d910(i);
    } 
    return p;
  }
  static double Nf88d42d910(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 66.21470935001052) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 66.21470935001052) {
      p = 0;
    } 
    return p;
  }
  static double N6021de52911(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 0.45360436187725195) {
    p = SpeechDetector.N4f8b0acc912(i);
    } else if (((Double) i[10]).doubleValue() > 0.45360436187725195) {
    p = SpeechDetector.N2e04d436918(i);
    } 
    return p;
  }
  static double N4f8b0acc912(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -5.233351233329099) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -5.233351233329099) {
    p = SpeechDetector.N3171ffe0913(i);
    } 
    return p;
  }
  static double N3171ffe0913(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 8.23533712921654) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 8.23533712921654) {
    p = SpeechDetector.N3355e47c914(i);
    } 
    return p;
  }
  static double N3355e47c914(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= -0.5707625414476644) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > -0.5707625414476644) {
    p = SpeechDetector.N4c0ba338915(i);
    } 
    return p;
  }
  static double N4c0ba338915(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 68.24961449863362) {
    p = SpeechDetector.N1008d889916(i);
    } else if (((Double) i[0]).doubleValue() > 68.24961449863362) {
      p = 1;
    } 
    return p;
  }
  static double N1008d889916(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= -3.8147515177089977) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > -3.8147515177089977) {
    p = SpeechDetector.N34c01298917(i);
    } 
    return p;
  }
  static double N34c01298917(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 2.331016080280992) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 2.331016080280992) {
      p = 1;
    } 
    return p;
  }
  static double N2e04d436918(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 1.728202497099517) {
    p = SpeechDetector.N3f083cd4919(i);
    } else if (((Double) i[2]).doubleValue() > 1.728202497099517) {
    p = SpeechDetector.N2206a038922(i);
    } 
    return p;
  }
  static double N3f083cd4919(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 70.24823307192784) {
    p = SpeechDetector.N35d1a2a0920(i);
    } else if (((Double) i[0]).doubleValue() > 70.24823307192784) {
    p = SpeechDetector.N560bd1fa921(i);
    } 
    return p;
  }
  static double N35d1a2a0920(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 2.45567708256663) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 2.45567708256663) {
      p = 0;
    } 
    return p;
  }
  static double N560bd1fa921(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 71.10417807118473) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() > 71.10417807118473) {
      p = 1;
    } 
    return p;
  }
  static double N2206a038922(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.37996279718609655) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.37996279718609655) {
    p = SpeechDetector.N6100cdfb923(i);
    } 
    return p;
  }
  static double N6100cdfb923(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 1.7967444447985599) {
    p = SpeechDetector.N7bd34b7d924(i);
    } else if (((Double) i[9]).doubleValue() > 1.7967444447985599) {
      p = 1;
    } 
    return p;
  }
  static double N7bd34b7d924(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 2.73406663184275) {
    p = SpeechDetector.N6d013b0d925(i);
    } else if (((Double) i[2]).doubleValue() > 2.73406663184275) {
      p = 0;
    } 
    return p;
  }
  static double N6d013b0d925(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() <= 8.169649154967756) {
      p = 1;
    } else if (((Double) i[1]).doubleValue() > 8.169649154967756) {
      p = 0;
    } 
    return p;
  }
  static double N6bcc0a63926(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= -0.6918430824454035) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() > -0.6918430824454035) {
    p = SpeechDetector.N20be20df927(i);
    } 
    return p;
  }
  static double N20be20df927(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 0.3653805202037184) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() > 0.3653805202037184) {
    p = SpeechDetector.N22602144928(i);
    } 
    return p;
  }
  static double N22602144928(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 2.3334210083935245) {
    p = SpeechDetector.N552808fd929(i);
    } else if (((Double) i[6]).doubleValue() > 2.3334210083935245) {
      p = 1;
    } 
    return p;
  }
  static double N552808fd929(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 1.0057884278465037) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() > 1.0057884278465037) {
      p = 0;
    } 
    return p;
  }
  static double N376645b8930(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() <= 5.1730758607818155) {
      p = 1;
    } else if (((Double) i[7]).doubleValue() > 5.1730758607818155) {
    p = SpeechDetector.N1b6b4f72931(i);
    } 
    return p;
  }
  static double N1b6b4f72931(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 0.6599380989528472) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 0.6599380989528472) {
      p = 1;
    } 
    return p;
  }
  static double N222cd36e932(Object []i) {
    double p = Double.NaN;
    if (i[10] == null) {
      p = 0;
    } else if (((Double) i[10]).doubleValue() <= 4.149217032000205) {
    p = SpeechDetector.N2cecec49933(i);
    } else if (((Double) i[10]).doubleValue() > 4.149217032000205) {
    p = SpeechDetector.N31784413944(i);
    } 
    return p;
  }
  static double N2cecec49933(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.41835280249903467) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.41835280249903467) {
    p = SpeechDetector.N768cc3a9934(i);
    } 
    return p;
  }
  static double N768cc3a9934(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -4.180179647370296) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -4.180179647370296) {
    p = SpeechDetector.N1381c90d935(i);
    } 
    return p;
  }
  static double N1381c90d935(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (((Double) i[0]).doubleValue() <= 67.51946723004951) {
    p = SpeechDetector.N2db67e7c936(i);
    } else if (((Double) i[0]).doubleValue() > 67.51946723004951) {
      p = 0;
    } 
    return p;
  }
  static double N2db67e7c936(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 9.896829986780407) {
    p = SpeechDetector.N282a1656937(i);
    } else if (((Double) i[1]).doubleValue() > 9.896829986780407) {
      p = 0;
    } 
    return p;
  }
  static double N282a1656937(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 2.2185611351717958) {
    p = SpeechDetector.N63207cb3938(i);
    } else if (((Double) i[8]).doubleValue() > 2.2185611351717958) {
    p = SpeechDetector.N2f32c73b942(i);
    } 
    return p;
  }
  static double N63207cb3938(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 1.9970352654390366) {
    p = SpeechDetector.N69dafe9c939(i);
    } else if (((Double) i[7]).doubleValue() > 1.9970352654390366) {
      p = 0;
    } 
    return p;
  }
  static double N69dafe9c939(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 0.21964113094570087) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 0.21964113094570087) {
    p = SpeechDetector.N2881ea0f940(i);
    } 
    return p;
  }
  static double N2881ea0f940(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (((Double) i[5]).doubleValue() <= 1.675087091448636) {
    p = SpeechDetector.N692d938f941(i);
    } else if (((Double) i[5]).doubleValue() > 1.675087091448636) {
      p = 1;
    } 
    return p;
  }
  static double N692d938f941(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() <= -3.7847666056016647) {
      p = 1;
    } else if (((Double) i[4]).doubleValue() > -3.7847666056016647) {
      p = 0;
    } 
    return p;
  }
  static double N2f32c73b942(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 1;
    } else if (((Double) i[5]).doubleValue() <= 4.6470049049925475) {
    p = SpeechDetector.N2eb60ab2943(i);
    } else if (((Double) i[5]).doubleValue() > 4.6470049049925475) {
      p = 0;
    } 
    return p;
  }
  static double N2eb60ab2943(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 2.284254435131454) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() > 2.284254435131454) {
      p = 0;
    } 
    return p;
  }
  static double N31784413944(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() <= 0.44608817779267673) {
      p = 0;
    } else if (((Double) i[6]).doubleValue() > 0.44608817779267673) {
    p = SpeechDetector.N4ebd54c4945(i);
    } 
    return p;
  }
  static double N4ebd54c4945(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= -4.393864296231454) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > -4.393864296231454) {
      p = 1;
    } 
    return p;
  }
}