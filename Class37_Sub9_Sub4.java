/* Class37_Sub9_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;
import java.util.Random;

public class Class37_Sub9_Sub4 extends Class37_Sub9 {
	public int[] anIntArray2957;
	public int anInt2958;
	public int[][] anIntArrayArray2959;
	public static int anInt2960;
	public static int anInt2961;
	public int[][] anIntArrayArray2962;
	public static int anInt2963;
	public static int anInt2964;
	public int anInt2965;
	public int anInt2966;
	public static RSString aClass16_2967 = Class37_Sub2.crateRSString((byte) 101,
			"Schlie-8en");
	public int anInt2968;
	public static int anInt2969;
	public int anInt2970;
	public int anInt2971 = 4;
	public int anInt2972;
	public static Class65 aClass65_2973;
	public static int anInt2974;
	public static RSString aClass16_2975 = Class37_Sub2.crateRSString((byte) 118,
			"Lade Eingabe)2Steuerungsprogramm)3)3)3");
	public static int anInt2976;
	public int anInt2977;
	public int anInt2978;
	public int anInt2979;
	public int anInt2980;
	public static int[] anIntArray2981;
	public static int[] anIntArray2982;
	public static int[] anIntArray2983;
	public static RSString aClass16_2984;

	public Class37_Sub9_Sub4() {
		super(0, true);
		anInt2958 = 409;
		anInt2972 = 81;
		anInt2977 = 1024;
		anInt2978 = 0;
		anInt2965 = 8;
		anInt2979 = 1024;
		anInt2966 = 204;
	}

	public int[] method761(int i, int i_0_) {
		anInt2963++;
		int[] is = aClass38_1966.method1049(i_0_, true);
		if (aClass38_1966.aBoolean850) {
			int i_1_;
			for (i_1_ = Class37_Sub4_Sub16.anIntArray2871[i_0_] + anInt2978; (i_1_ ^ 0xffffffff) > -1; i_1_ += 4096) {
				/* empty */
			}
			int i_2_ = 0;
			for (/**/; i_1_ > 4096; i_1_ -= 4096) {
				/* empty */
			}
			for (/**/; i_2_ < anInt2965; i_2_++) {
				if ((i_1_ ^ 0xffffffff) > (anIntArray2957[i_2_] ^ 0xffffffff))
					break;
			}
			float f = (float) anIntArray2957[i_2_];
			float f_3_ = (float) anIntArray2957[i_2_ - 1];
			if (!((float) anInt2970 + f_3_ < (float) i_1_)
					|| !(f - (float) anInt2970 > (float) i_1_))
				Class53.method1134(is, 0, Class32.anInt743, 0);
			else {
				for (int i_4_ = 0; i_4_ < Class32.anInt743; i_4_++) {
					int i_5_ = 0;
					int i_6_ = i_2_ % 2 != 0 ? -anInt2977 : anInt2977;
					int i_7_;
					for (i_7_ = ((i_6_ * anInt2968 >> -807841428) + Class84.anIntArray1528[i_4_]); (i_7_ ^ 0xffffffff) > -1; i_7_ += 4096) {
						/* empty */
					}
					for (/**/; i_7_ > 4096; i_7_ -= 4096) {
						/* empty */
					}
					for (/**/; anInt2971 > i_5_; i_5_++) {
						if ((i_7_ ^ 0xffffffff) > (anIntArrayArray2962[i_2_
								+ -1][i_5_] ^ 0xffffffff))
							break;
					}
					float f_8_ = (float) anIntArrayArray2962[i_2_ + -1][i_5_];
					float f_9_ = (float) anIntArrayArray2962[-1 + i_2_][-1
							+ i_5_];
					if (f_9_ + (float) anInt2970 < (float) i_7_
							&& (float) i_7_ < (float) -anInt2970 + f_8_)
						is[i_4_] = anIntArrayArray2959[i_2_ + -1][-1 + i_5_];
					else
						is[i_4_] = 0;
				}
			}
		}
		if (i >= -125)
			anInt2978 = 25;
		return is;
	}

	public void method775(byte i) {
		anInt2961++;
		Random random = new Random((long) anInt2965);
		anIntArrayArray2959 = new int[anInt2965][anInt2971];
		anInt2970 = anInt2972 / 2;
		if (i != -55)
			aClass65_2973 = null;
		anInt2980 = 4096 / anInt2965;
		anIntArrayArray2962 = new int[anInt2965][1 + anInt2971];
		anIntArray2957 = new int[1 + anInt2965];
		anIntArray2957[0] = 0;
		int i_10_ = anInt2980 / 2;
		anInt2968 = 4096 / anInt2971;
		int i_11_ = anInt2968 / 2;
		for (int i_12_ = 0; i_12_ < anInt2965; i_12_++) {
			if (i_12_ > 0) {
				int i_13_ = anInt2980;
				int i_14_ = (((-2048 + Class20.method216(4096, random,
						(byte) -118)) * anInt2966) >> -1292583892);
				i_13_ += i_10_ * i_14_ >> -223772084;
				anIntArray2957[i_12_] = i_13_ + anIntArray2957[i_12_ - 1];
			}
			anIntArrayArray2962[i_12_][0] = 0;
			for (int i_15_ = 0; anInt2971 > i_15_; i_15_++) {
				if ((i_15_ ^ 0xffffffff) < -1) {
					int i_16_ = anInt2968;
					int i_17_ = ((-2048 + Class20.method216(4096, random,
							(byte) -108))
							* anInt2958 >> -662697140);
					i_16_ += i_11_ * i_17_ >> 1928009836;
					anIntArrayArray2962[i_12_][i_15_] = anIntArrayArray2962[i_12_][i_15_ - 1]
							+ i_16_;
				}
				anIntArrayArray2959[i_12_][i_15_] = 4096 - Class20.method216(
						anInt2979, random, (byte) -56);
			}
			anIntArrayArray2962[i_12_][anInt2971] = 4096;
		}
		anIntArray2957[anInt2965] = 4096;
	}

	public static void method776(Class37_Sub8 class37_sub8, int i, int i_18_) {
		anInt2976++;
		Object[] objects = class37_sub8.anObjectArray1938;
		int i_19_ = ((Integer) objects[0]).intValue();
		Class37_Sub4_Sub6 class37_sub4_sub6 = Class37_Sub9_Sub20.method850(
				true, i_19_);
		if (class37_sub4_sub6 != null) {
			Class37_Sub9_Sub29.anInt3457 = 0;
			if (i <= -11) {
				int i_20_ = 0;
				int i_21_ = 0;
				int i_22_ = -1;
				int[] is = class37_sub4_sub6.anIntArray2615;
				int[] is_23_ = class37_sub4_sub6.anIntArray2611;
				int i_24_ = -1;
				try {
					Class37_Sub3_Sub3.aClass16Array2390 = new RSString[class37_sub4_sub6.anInt2616];
					int i_25_ = 0;
					RSInterface.anIntArray341 = new int[class37_sub4_sub6.anInt2614];
					int i_26_ = 0;
					for (int i_27_ = 1; (objects.length ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++) {
						if (!(objects[i_27_] instanceof Integer)) {
							if (objects[i_27_] instanceof RSString) {
								RSString rSString = (RSString) objects[i_27_];
								if (rSString
										.equalsRSString(-79, Class32.aClass16_729))
									rSString = class37_sub8.aClass16_1937;
								Class37_Sub3_Sub3.aClass16Array2390[i_26_++] = rSString;
							}
						} else {
							int i_28_ = ((Integer) objects[i_27_]).intValue();
							if ((i_28_ ^ 0xffffffff) == 2147483646)
								i_28_ = class37_sub8.anInt1927;
							if ((i_28_ ^ 0xffffffff) == 2147483645)
								i_28_ = class37_sub8.anInt1923;
							if (i_28_ == -2147483645)
								i_28_ = (class37_sub8.aClass18_1925 != null ? class37_sub8.aClass18_1925.anInt402
										: -1);
							if (i_28_ == -2147483644)
								i_28_ = class37_sub8.anInt1936;
							if (i_28_ == -2147483643)
								i_28_ = (class37_sub8.aClass18_1925 != null ? class37_sub8.aClass18_1925.anInt334
										: -1);
							if (i_28_ == -2147483642)
								i_28_ = (class37_sub8.aClass18_1922 != null ? class37_sub8.aClass18_1922.anInt402
										: -1);
							if ((i_28_ ^ 0xffffffff) == 2147483640)
								i_28_ = (class37_sub8.aClass18_1922 == null ? -1
										: class37_sub8.aClass18_1922.anInt334);
							if ((i_28_ ^ 0xffffffff) == 2147483639)
								i_28_ = class37_sub8.anInt1928;
							if ((i_28_ ^ 0xffffffff) == 2147483638)
								i_28_ = class37_sub8.anInt1929;
							RSInterface.anIntArray341[i_25_++] = i_28_;
						}
					}
					int i_29_ = 0;
					for (;;) {
						if ((++i_29_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff))
							throw new RuntimeException("slow");
						i_24_ = is[++i_22_];
						if (i_24_ < 100) {
							if (i_24_ == 0) {
								Class14.anIntArray248[i_20_++] = is_23_[i_22_];
								continue;
							}
							if (i_24_ == 1) {
								int i_30_ = is_23_[i_22_];
								Class14.anIntArray248[i_20_++] = Class37_Sub23.anIntArray2237[i_30_];
								continue;
							}
							if ((i_24_ ^ 0xffffffff) == -3) {
								int i_31_ = is_23_[i_22_];
								Class37_Sub23.anIntArray2237[i_31_] = Class14.anIntArray248[--i_20_];
								continue;
							}
							if ((i_24_ ^ 0xffffffff) == -4) {
								Class60.aClass16Array1148[i_21_++] = (class37_sub4_sub6.aClass16Array2617[i_22_]);
								continue;
							}
							if (i_24_ == 6) {
								i_22_ += is_23_[i_22_];
								continue;
							}
							if (i_24_ == 7) {
								i_20_ -= 2;
								if (Class14.anIntArray248[i_20_] != Class14.anIntArray248[i_20_
										- -1])
									i_22_ += is_23_[i_22_];
								continue;
							}
							if (i_24_ == 8) {
								i_20_ -= 2;
								if (Class14.anIntArray248[i_20_ + 1] == Class14.anIntArray248[i_20_])
									i_22_ += is_23_[i_22_];
								continue;
							}
							if ((i_24_ ^ 0xffffffff) == -10) {
								i_20_ -= 2;
								if ((Class14.anIntArray248[i_20_] ^ 0xffffffff) > (Class14.anIntArray248[i_20_
										- -1] ^ 0xffffffff))
									i_22_ += is_23_[i_22_];
								continue;
							}
							if (i_24_ == 10) {
								i_20_ -= 2;
								if (Class14.anIntArray248[i_20_] > Class14.anIntArray248[1 + i_20_])
									i_22_ += is_23_[i_22_];
								continue;
							}
							if ((i_24_ ^ 0xffffffff) == -22) {
								if (Class37_Sub9_Sub29.anInt3457 != 0) {
									Class78 class78 = (Class37_Sub1.aClass78Array1807[--Class37_Sub9_Sub29.anInt3457]);
									Class37_Sub3_Sub3.aClass16Array2390 = class78.aClass16Array1463;
									RSInterface.anIntArray341 = class78.anIntArray1457;
									i_22_ = class78.anInt1465;
									class37_sub4_sub6 = class78.aClass37_Sub4_Sub6_1455;
									is = class37_sub4_sub6.anIntArray2615;
									is_23_ = class37_sub4_sub6.anIntArray2611;
									continue;
								}
								return;
							}
							if (i_24_ == 25) {
								int i_32_ = is_23_[i_22_];
								Class14.anIntArray248[i_20_++] = ByteVector
										.method983(i_32_, 117);
								continue;
							}
							if ((i_24_ ^ 0xffffffff) == -28) {
								int i_33_ = is_23_[i_22_];
								Class37_Sub4_Sub13.method705(-105, i_33_,
										(Class14.anIntArray248[--i_20_]));
								continue;
							}
							if (i_24_ == 31) {
								i_20_ -= 2;
								if ((Class14.anIntArray248[i_20_] ^ 0xffffffff) >= (Class14.anIntArray248[i_20_ + 1] ^ 0xffffffff))
									i_22_ += is_23_[i_22_];
								continue;
							}
							if (i_24_ == 32) {
								i_20_ -= 2;
								if ((Class14.anIntArray248[1 + i_20_] ^ 0xffffffff) >= (Class14.anIntArray248[i_20_] ^ 0xffffffff))
									i_22_ += is_23_[i_22_];
								continue;
							}
							if (i_24_ == 33) {
								Class14.anIntArray248[i_20_++] = RSInterface.anIntArray341[is_23_[i_22_]];
								continue;
							}
							if ((i_24_ ^ 0xffffffff) == -35) {
								RSInterface.anIntArray341[is_23_[i_22_]] = Class14.anIntArray248[--i_20_];
								continue;
							}
							if (i_24_ == 35) {
								Class60.aClass16Array1148[i_21_++] = (Class37_Sub3_Sub3.aClass16Array2390[is_23_[i_22_]]);
								continue;
							}
							if (i_24_ == 36) {
								Class37_Sub3_Sub3.aClass16Array2390[(is_23_[i_22_])] = Class60.aClass16Array1148[--i_21_];
								continue;
							}
							if ((i_24_ ^ 0xffffffff) == -38) {
								int i_34_ = is_23_[i_22_];
								i_21_ -= i_34_;
								RSString rSString = Class43.method1090(i_34_,
										i_21_, 79, (Class60.aClass16Array1148));
								Class60.aClass16Array1148[i_21_++] = rSString;
								continue;
							}
							if ((i_24_ ^ 0xffffffff) == -39) {
								i_20_--;
								continue;
							}
							if (i_24_ == 39) {
								i_21_--;
								continue;
							}
							if ((i_24_ ^ 0xffffffff) == -41) {
								int i_35_ = is_23_[i_22_];
								Class37_Sub4_Sub6 class37_sub4_sub6_36_ = Class37_Sub9_Sub20
										.method850(true, i_35_);
								int[] is_37_ = new int[class37_sub4_sub6_36_.anInt2614];
								RSString[] class16s = (new RSString[class37_sub4_sub6_36_.anInt2616]);
								for (int i_38_ = 0; class37_sub4_sub6_36_.anInt2623 > i_38_; i_38_++)
									is_37_[i_38_] = (Class14.anIntArray248[i_38_
											+ (-(class37_sub4_sub6_36_.anInt2623) + i_20_)]);
								for (int i_39_ = 0; ((i_39_ ^ 0xffffffff) > (class37_sub4_sub6_36_.anInt2618 ^ 0xffffffff)); i_39_++)
									class16s[i_39_] = (Class60.aClass16Array1148[(i_39_
											+ i_21_ - (class37_sub4_sub6_36_.anInt2618))]);
								i_20_ -= class37_sub4_sub6_36_.anInt2623;
								i_21_ -= class37_sub4_sub6_36_.anInt2618;
								Class78 class78 = new Class78();
								class78.anIntArray1457 = RSInterface.anIntArray341;
								class78.aClass37_Sub4_Sub6_1455 = class37_sub4_sub6;
								class37_sub4_sub6 = class37_sub4_sub6_36_;
								class78.anInt1465 = i_22_;
								class78.aClass16Array1463 = Class37_Sub3_Sub3.aClass16Array2390;
								Class37_Sub1.aClass78Array1807[Class37_Sub9_Sub29.anInt3457++] = class78;
								Class37_Sub3_Sub3.aClass16Array2390 = class16s;
								i_22_ = -1;
								is = class37_sub4_sub6.anIntArray2615;
								RSInterface.anIntArray341 = is_37_;
								is_23_ = class37_sub4_sub6.anIntArray2611;
								continue;
							}
							if ((i_24_ ^ 0xffffffff) == -43) {
								Class14.anIntArray248[i_20_++] = (Class37_Sub8.anIntArray1939[is_23_[i_22_]]);
								continue;
							}
							if ((i_24_ ^ 0xffffffff) == -44) {
								Class37_Sub8.anIntArray1939[is_23_[i_22_]] = Class14.anIntArray248[--i_20_];
								continue;
							}
							if (i_24_ == 44) {
								int i_40_ = is_23_[i_22_] >> 827420080;
								int i_41_ = is_23_[i_22_] & 0xffff;
								int i_42_ = Class14.anIntArray248[--i_20_];
								if (i_42_ < 0 || i_42_ > 5000)
									throw new RuntimeException();
								Class26.anIntArray664[i_40_] = i_42_;
								int i_43_ = -1;
								if ((i_41_ ^ 0xffffffff) == -106)
									i_43_ = 0;
								for (int i_44_ = 0; ((i_44_ ^ 0xffffffff) > (i_42_ ^ 0xffffffff)); i_44_++)
									Class37.anIntArrayArray813[i_40_][i_44_] = i_43_;
								continue;
							}
							if (i_24_ == 45) {
								int i_45_ = Class14.anIntArray248[--i_20_];
								int i_46_ = is_23_[i_22_];
								if ((i_45_ ^ 0xffffffff) > -1
										|| Class26.anIntArray664[i_46_] <= i_45_)
									throw new RuntimeException();
								Class14.anIntArray248[i_20_++] = Class37.anIntArrayArray813[i_46_][i_45_];
								continue;
							}
							if ((i_24_ ^ 0xffffffff) == -47) {
								i_20_ -= 2;
								int i_47_ = is_23_[i_22_];
								int i_48_ = Class14.anIntArray248[i_20_];
								if (i_48_ < 0
										|| (Class26.anIntArray664[i_47_] ^ 0xffffffff) >= (i_48_ ^ 0xffffffff))
									throw new RuntimeException();
								Class37.anIntArrayArray813[i_47_][i_48_] = Class14.anIntArray248[i_20_
										- -1];
								continue;
							}
							if (i_24_ == 47) {
								RSString rSString = Class84.aClass16Array1532[is_23_[i_22_]];
								if (rSString == null)
									rSString = Class37_Sub14.aClass16_2123;
								Class60.aClass16Array1148[i_21_++] = rSString;
								continue;
							}
							if (i_24_ == 48) {
								Class84.aClass16Array1532[is_23_[i_22_]] = Class60.aClass16Array1148[--i_21_];
								continue;
							}
						}
						boolean bool;
						if (is_23_[i_22_] == 1)
							bool = true;
						else
							bool = false;
						if (i_24_ >= 1000) {
							if ((i_24_ < 1000 || i_24_ >= 1100)
									&& ((i_24_ ^ 0xffffffff) > -2001 || i_24_ >= 2100)) {
								if (((i_24_ ^ 0xffffffff) > -1101 || i_24_ >= 1200)
										&& (i_24_ < 2100 || (i_24_ ^ 0xffffffff) <= -2201)) {
									if (((i_24_ ^ 0xffffffff) <= -1201 && (i_24_ ^ 0xffffffff) > -1301)
											|| (i_24_ >= 2200 && (i_24_ ^ 0xffffffff) > -2301)) {
										RSInterface rSInterface;
										if (i_24_ >= 2000) {
											rSInterface = (Class37_Sub9_Sub14
													.getInterface(
															(Class14.anIntArray248[--i_20_]),
															4096));
											i_24_ -= 1000;
										} else
											rSInterface = (!bool ? Class47.aClass18_995
													: Class1.aClass18_61);
										Class73.refreshInterface(rSInterface, -1);
										if (i_24_ == 1200) {
											i_20_ -= 2;
											int i_49_ = (Class14.anIntArray248[i_20_
													- -1]);
											int i_50_ = Class14.anIntArray248[i_20_];
											rSInterface.anInt368 = i_49_;
											rSInterface.anInt367 = i_50_;
											RSItem class37_sub4_sub1 = (Class46
													.loadItem(i_50_,
															(byte) 88));
											rSInterface.anInt410 = class37_sub4_sub1.modelOffset2;
											rSInterface.anInt319 = class37_sub4_sub1.modelRotation1;
											rSInterface.anInt405 = class37_sub4_sub1.modelRotation2;
											rSInterface.anInt395 = class37_sub4_sub1.modelOffset1;
											rSInterface.anInt387 = class37_sub4_sub1.modelZoom;
											if (rSInterface.anInt441 > 0)
												rSInterface.anInt387 = (rSInterface.anInt387 * 32 / rSInterface.anInt441);
											rSInterface.anInt359 = class37_sub4_sub1.anInt2517;
										} else if ((i_24_ ^ 0xffffffff) == -1202) {
											rSInterface.anInt408 = 2;
											rSInterface.anInt369 = (Class14.anIntArray248[--i_20_]);
										} else {
											if (i_24_ != 1202)
												break;
											rSInterface.anInt408 = 3;
											rSInterface.anInt369 = Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass29_3985
													.method268(4);
										}
									} else if (((i_24_ ^ 0xffffffff) > -1301 || i_24_ >= 1400)
											&& ((i_24_ ^ 0xffffffff) > -2301 || ((i_24_ ^ 0xffffffff) <= -2401))) {
										if (i_24_ >= 1400
												&& i_24_ < 1500
												|| ((i_24_ ^ 0xffffffff) <= -2401 && ((i_24_ ^ 0xffffffff) > -2501))) {
											RSInterface rSInterface;
											if (i_24_ >= 2000) {
												i_24_ -= 1000;
												rSInterface = (Class37_Sub9_Sub14
														.getInterface(
																(Class14.anIntArray248[--i_20_]),
																4096));
											} else
												rSInterface = (!bool ? Class47.aClass18_995
														: Class1.aClass18_61);
											RSString rSString = (Class60.aClass16Array1148[--i_21_]);
											int[] is_51_ = null;
											if ((rSString.method172((byte) 38) > 0)
													&& ((rSString
															.method161(
																	-1
																			+ (rSString
																					.method172((byte) 38)),
																	125)) ^ 0xffffffff) == -90) {
												int i_52_ = (Class14.anIntArray248[--i_20_]);
												if ((i_52_ ^ 0xffffffff) < -1) {
													is_51_ = new int[i_52_];
													while ((i_52_-- ^ 0xffffffff) < -1)
														is_51_[i_52_] = (Class14.anIntArray248[--i_20_]);
												}
												rSString = (rSString
														.method169(
																0,
																0,
																-1
																		+ (rSString
																				.method172((byte) 38))));
											}
											Object[] objects_53_ = (new Object[(rSString
													.method172((byte) 38) + 1)]);
											for (int i_54_ = -1
													+ objects_53_.length; i_54_ >= 1; i_54_--) {
												if (((rSString.method161(-1
														+ i_54_, 49)) ^ 0xffffffff) != -116)
													objects_53_[i_54_] = (new Integer(
															Class14.anIntArray248[--i_20_]));
												else
													objects_53_[i_54_] = (Class60.aClass16Array1148[--i_21_]);
											}
											int i_55_ = (Class14.anIntArray248[--i_20_]);
											if (i_55_ == -1)
												objects_53_ = null;
											else
												objects_53_[0] = new Integer(
														i_55_);
											if (i_24_ == 1406)
												rSInterface.anObjectArray358 = objects_53_;
											if ((i_24_ ^ 0xffffffff) == -1418)
												rSInterface.anObjectArray455 = objects_53_;
											if ((i_24_ ^ 0xffffffff) == -1404)
												rSInterface.anObjectArray429 = objects_53_;
											if (i_24_ == 1420)
												rSInterface.anObjectArray328 = objects_53_;
											if (i_24_ == 1401)
												rSInterface.anObjectArray425 = objects_53_;
											if ((i_24_ ^ 0xffffffff) == -1422)
												rSInterface.anObjectArray357 = objects_53_;
											if (i_24_ == 1410)
												rSInterface.anObjectArray456 = objects_53_;
											if ((i_24_ ^ 0xffffffff) == -1425)
												rSInterface.anObjectArray407 = objects_53_;
											if (i_24_ == 1419)
												rSInterface.anObjectArray349 = objects_53_;
											if ((i_24_ ^ 0xffffffff) == -1424)
												rSInterface.anObjectArray333 = objects_53_;
											if ((i_24_ ^ 0xffffffff) == -1415) {
												rSInterface.anObjectArray346 = objects_53_;
												rSInterface.anIntArray331 = is_51_;
											}
											if (i_24_ == 1412)
												rSInterface.anObjectArray366 = objects_53_;
											if ((i_24_ ^ 0xffffffff) == -1408) {
												rSInterface.anIntArray444 = is_51_;
												rSInterface.anObjectArray347 = objects_53_;
											}
											if ((i_24_ ^ 0xffffffff) == -1426)
												rSInterface.anObjectArray327 = objects_53_;
											if ((i_24_ ^ 0xffffffff) == -1423)
												rSInterface.anObjectArray352 = objects_53_;
											if ((i_24_ ^ 0xffffffff) == -1409)
												rSInterface.anObjectArray318 = objects_53_;
											if ((i_24_ ^ 0xffffffff) == -1417)
												rSInterface.anObjectArray386 = objects_53_;
											if (i_24_ == 1415) {
												rSInterface.anObjectArray416 = objects_53_;
												rSInterface.anIntArray375 = is_51_;
											}
											if (i_24_ == 1404)
												rSInterface.anObjectArray355 = objects_53_;
											if ((i_24_ ^ 0xffffffff) == -1403)
												rSInterface.anObjectArray418 = objects_53_;
											if ((i_24_ ^ 0xffffffff) == -1412)
												rSInterface.anObjectArray393 = objects_53_;
											rSInterface.aBoolean452 = true;
											if ((i_24_ ^ 0xffffffff) == -1419)
												rSInterface.anObjectArray362 = objects_53_;
											if (i_24_ == 1400)
												rSInterface.anObjectArray430 = objects_53_;
											if (i_24_ == 1409)
												rSInterface.anObjectArray363 = objects_53_;
											if ((i_24_ ^ 0xffffffff) == -1406)
												rSInterface.anObjectArray409 = objects_53_;
										} else if ((i_24_ ^ 0xffffffff) <= -1601) {
											if ((i_24_ ^ 0xffffffff) <= -1701) {
												if (i_24_ >= 1800) {
													if ((i_24_ ^ 0xffffffff) <= -1901) {
														if ((i_24_ ^ 0xffffffff) <= -2601) {
															if (i_24_ < 2700) {
																RSInterface rSInterface = (Class37_Sub9_Sub14
																		.getInterface(
																				(Class14.anIntArray248[--i_20_]),
																				4096));
																if ((i_24_ ^ 0xffffffff) == -2601)
																	Class14.anIntArray248[i_20_++] = (rSInterface.anInt371);
																else if (i_24_ == 2601)
																	Class14.anIntArray248[i_20_++] = (rSInterface.anInt432);
																else if (i_24_ == 2602)
																	Class60.aClass16Array1148[i_21_++] = (rSInterface.interfaceString);
																else if (i_24_ == 2603)
																	Class14.anIntArray248[i_20_++] = (rSInterface.anInt324);
																else if (i_24_ == 2604)
																	Class14.anIntArray248[i_20_++] = (rSInterface.anInt348);
																else if ((i_24_ ^ 0xffffffff) == -2606)
																	Class14.anIntArray248[i_20_++] = (rSInterface.anInt387);
																else if ((i_24_ ^ 0xffffffff) == -2607)
																	Class14.anIntArray248[i_20_++] = (rSInterface.anInt319);
																else if (i_24_ == 2607)
																	Class14.anIntArray248[i_20_++] = (rSInterface.anInt359);
																else {
																	if ((i_24_ ^ 0xffffffff) != -2609)
																		break;
																	Class14.anIntArray248[i_20_++] = (rSInterface.anInt405);
																}
															} else if (i_24_ >= 2800) {
																if ((i_24_ ^ 0xffffffff) > -2901) {
																	RSInterface rSInterface = (Class37_Sub9_Sub14
																			.getInterface(
																					(Class14.anIntArray248[--i_20_]),
																					4096));
																	if ((i_24_ ^ 0xffffffff) == -2801)
																		Class14.anIntArray248[i_20_++] = Class10
																				.method85(
																						RuntimeException_Sub1
																								.method1339(
																										rSInterface,
																										25),
																						false);
																	else if (i_24_ == 2801) {
																		int i_56_ = Class14.anIntArray248[--i_20_];
																		i_56_--;
																		if ((rSInterface.aClass16Array453 == null)
																				|| (rSInterface.aClass16Array453.length ^ 0xffffffff) >= (i_56_ ^ 0xffffffff)
																				|| rSInterface.aClass16Array453[i_56_] == null)
																			Class60.aClass16Array1148[i_21_++] = Class3.aClass16_87;
																		else
																			Class60.aClass16Array1148[i_21_++] = rSInterface.aClass16Array453[i_56_];
																	} else {
																		if ((i_24_ ^ 0xffffffff) != -2803)
																			break;
																		if (rSInterface.aClass16_391 == null)
																			Class60.aClass16Array1148[i_21_++] = Class3.aClass16_87;
																		else
																			Class60.aClass16Array1148[i_21_++] = rSInterface.aClass16_391;
																	}
																} else if (i_24_ < 3200) {
																	if ((i_24_ ^ 0xffffffff) == -3101) {
																		RSString rSString = Class60.aClass16Array1148[--i_21_];
																		Class37_Sub4_Sub7_Sub1_Sub1
																				.method505(
																						Class3.aClass16_87,
																						0,
																						rSString,
																						(byte) -75);
																	} else if ((i_24_ ^ 0xffffffff) == -3102) {
																		i_20_ -= 2;
																		Class37
																				.method324(
																						Class14.anIntArray248[i_20_
																								- -1],
																						Class14.anIntArray248[i_20_],
																						Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234,
																						0);
																	} else if (i_24_ == 3103)
																		Class62
																				.method1173(-9);
																	else if ((i_24_ ^ 0xffffffff) == -3105) {
																		Class2.anInt76++;
																		RSString rSString = Class60.aClass16Array1148[--i_21_];
																		int i_57_ = 0;
																		if (rSString
																				.method145(-63))
																			i_57_ = rSString
																					.method175(8109);
																		Class42.aClass37_Sub11_Sub1_936
																				.method989(
																						-1494101117,
																						249);
																		Class42.aClass37_Sub11_Sub1_936
																				.method947(
																						(byte) 97,
																						i_57_);
																	} else if (i_24_ == 3105) {
																		Class83.anInt1516++;
																		RSString rSString = Class60.aClass16Array1148[--i_21_];
																		Class42.aClass37_Sub11_Sub1_936
																				.method989(
																						-1494101117,
																						82);
																		Class42.aClass37_Sub11_Sub1_936
																				.method949(
																						rSString
																								.method152(-69),
																						(byte) -57);
																	} else if (i_24_ == 3106) {
																		Class82.anInt1709++;
																		RSString rSString = Class60.aClass16Array1148[--i_21_];
																		Class42.aClass37_Sub11_Sub1_936
																				.method989(
																						-1494101117,
																						88);
																		Class42.aClass37_Sub11_Sub1_936
																				.method964(
																						126,
																						rSString
																								.method172((byte) 38)
																								- -1);
																		Class42.aClass37_Sub11_Sub1_936
																				.method977(
																						rSString,
																						0);
																	} else if ((i_24_ ^ 0xffffffff) == -3108) {
																		int i_58_ = Class14.anIntArray248[--i_20_];
																		RSString rSString = Class60.aClass16Array1148[--i_21_];
																		Class2
																				.method43(
																						i_58_,
																						rSString,
																						-128);
																	} else if ((i_24_ ^ 0xffffffff) == -3109) {
																		i_20_ -= 3;
																		int i_59_ = Class14.anIntArray248[1 + i_20_];
																		int i_60_ = Class14.anIntArray248[i_20_];
																		int i_61_ = Class14.anIntArray248[2 + i_20_];
																		RSInterface rSInterface = Class37_Sub9_Sub14
																				.getInterface(
																						i_61_,
																						4096);
																		Class37_Sub25
																				.method1044(
																						i_60_,
																						rSInterface,
																						(byte) -69,
																						i_59_);
																	} else if ((i_24_ ^ 0xffffffff) == -3110) {
																		i_20_ -= 2;
																		int i_62_ = Class14.anIntArray248[i_20_];
																		int i_63_ = Class14.anIntArray248[i_20_
																				- -1];
																		RSInterface rSInterface = bool ? Class1.aClass18_61
																				: Class47.aClass18_995;
																		Class37_Sub25
																				.method1044(
																						i_62_,
																						rSInterface,
																						(byte) -69,
																						i_63_);
																	} else {
																		if ((i_24_ ^ 0xffffffff) != -3111)
																			break;
																		Class37_Sub9_Sub24.anInt3372++;
																		int i_64_ = Class14.anIntArray248[--i_20_];
																		Class42.aClass37_Sub11_Sub1_936
																				.method989(
																						-1494101117,
																						171);
																		Class42.aClass37_Sub11_Sub1_936
																				.method965(
																						848881960,
																						i_64_);
																	}
																} else if (i_24_ >= 3300) {
																	if ((i_24_ ^ 0xffffffff) <= -3401) {
																		if ((i_24_ ^ 0xffffffff) > -3501) {
																			if (i_24_ == 3400) {
																				i_20_ -= 2;
																				int i_65_ = Class14.anIntArray248[i_20_ + 1];
																				int i_66_ = Class14.anIntArray248[i_20_];
																				Class37_Sub4_Sub10 class37_sub4_sub10 = Class84
																						.method1317(
																								i_66_,
																								-85);
																				for (int i_67_ = 0; class37_sub4_sub10.anInt2676 > i_67_; i_67_++) {
																					if (i_65_ == class37_sub4_sub10.anIntArray2683[i_67_]) {
																						Class60.aClass16Array1148[i_21_++] = class37_sub4_sub10.aClass16Array2675[i_67_];
																						class37_sub4_sub10 = null;
																						break;
																					}
																				}
																				if (class37_sub4_sub10 != null)
																					Class60.aClass16Array1148[i_21_++] = class37_sub4_sub10.aClass16_2673;
																			} else {
																				if ((i_24_ ^ 0xffffffff) != -3409)
																					break;
																				i_20_ -= 4;
																				int i_68_ = Class14.anIntArray248[i_20_];
																				int i_69_ = Class14.anIntArray248[1 + i_20_];
																				int i_70_ = Class14.anIntArray248[2 + i_20_];
																				int i_71_ = Class14.anIntArray248[3 + i_20_];
																				Class37_Sub4_Sub10 class37_sub4_sub10 = Class84
																						.method1317(
																								i_70_,
																								112);
																				if ((class37_sub4_sub10.anInt2668 ^ 0xffffffff) != (i_68_ ^ 0xffffffff)
																						|| i_69_ != class37_sub4_sub10.anInt2682) {
																					if ((i_69_ ^ 0xffffffff) == -116)
																						Class60.aClass16Array1148[i_21_++] = Class37_Sub14.aClass16_2123;
																					else
																						Class14.anIntArray248[i_20_++] = 0;
																				} else {
																					for (int i_72_ = 0; (class37_sub4_sub10.anInt2676 ^ 0xffffffff) < (i_72_ ^ 0xffffffff); i_72_++) {
																						if (class37_sub4_sub10.anIntArray2683[i_72_] == i_71_) {
																							if ((i_69_ ^ 0xffffffff) != -116)
																								Class14.anIntArray248[i_20_++] = class37_sub4_sub10.anIntArray2684[i_72_];
																							else
																								Class60.aClass16Array1148[i_21_++] = class37_sub4_sub10.aClass16Array2675[i_72_];
																							class37_sub4_sub10 = null;
																							break;
																						}
																					}
																					if (class37_sub4_sub10 != null) {
																						if (i_69_ == 115)
																							Class60.aClass16Array1148[i_21_++] = class37_sub4_sub10.aClass16_2673;
																						else
																							Class14.anIntArray248[i_20_++] = class37_sub4_sub10.anInt2680;
																					}
																				}
																			}
																		} else if ((i_24_ ^ 0xffffffff) > -3701) {
																			if ((i_24_ ^ 0xffffffff) == -3601) {
																				if ((Class37_Sub4_Sub12.anInt2783 ^ 0xffffffff) != -1) {
																					if (Class37_Sub4_Sub12.anInt2783 != 1)
																						Class14.anIntArray248[i_20_++] = Class9.anInt173;
																					else
																						Class14.anIntArray248[i_20_++] = -1;
																				} else
																					Class14.anIntArray248[i_20_++] = -2;
																			} else if ((i_24_ ^ 0xffffffff) == -3602) {
																				int i_73_ = Class14.anIntArray248[--i_20_];
																				if ((Class37_Sub4_Sub12.anInt2783 ^ 0xffffffff) != -3
																						|| Class9.anInt173 <= i_73_)
																					Class60.aClass16Array1148[i_21_++] = Class3.aClass16_87;
																				else
																					Class60.aClass16Array1148[i_21_++] = Class69.aClass16Array1342[i_73_];
																			} else if ((i_24_ ^ 0xffffffff) == -3603) {
																				int i_74_ = Class14.anIntArray248[--i_20_];
																				if (Class37_Sub4_Sub12.anInt2783 == 2
																						&& (Class9.anInt173 ^ 0xffffffff) < (i_74_ ^ 0xffffffff))
																					Class14.anIntArray248[i_20_++] = Class9.anIntArray176[i_74_];
																				else
																					Class14.anIntArray248[i_20_++] = 0;
																			} else if (i_24_ == 3603) {
																				int i_75_ = Class14.anIntArray248[--i_20_];
																				if (Class37_Sub4_Sub12.anInt2783 != 2
																						|| (Class9.anInt173 ^ 0xffffffff) >= (i_75_ ^ 0xffffffff))
																					Class14.anIntArray248[i_20_++] = 0;
																				else
																					Class14.anIntArray248[i_20_++] = Class37_Sub9_Sub31.anIntArray3484[i_75_];
																			} else if (i_24_ == 3604) {
																				RSString rSString = Class60.aClass16Array1148[--i_21_];
																				int i_76_ = Class14.anIntArray248[--i_20_];
																				Class37_Sub2
																						.method336(
																								31613,
																								rSString,
																								i_76_);
																			} else if ((i_24_ ^ 0xffffffff) == -3606) {
																				RSString rSString = Class60.aClass16Array1148[--i_21_];
																				Class37_Sub9_Sub8
																						.method797(
																								rSString
																										.method152(-62),
																								false);
																			} else if ((i_24_ ^ 0xffffffff) == -3607) {
																				RSString rSString = Class60.aClass16Array1148[--i_21_];
																				Class72
																						.method1268(
																								rSString
																										.method152(-78),
																								122);
																			} else if (i_24_ == 3607) {
																				RSString rSString = Class60.aClass16Array1148[--i_21_];
																				Class80
																						.method1299(
																								0,
																								rSString
																										.method152(-105));
																			} else if (i_24_ == 3608) {
																				RSString rSString = Class60.aClass16Array1148[--i_21_];
																				Class37_Sub9_Sub30
																						.method895(
																								-108,
																								rSString
																										.method152(-41));
																			} else if (i_24_ == 3609) {
																				RSString rSString = Class60.aClass16Array1148[--i_21_];
																				if (rSString
																						.method165(
																								Class37_Sub7.aClass16_1906,
																								52)
																						|| rSString
																								.method165(
																										Class42.aClass16_945,
																										52))
																					rSString = rSString
																							.method158(
																									7,
																									-1);
																				Class14.anIntArray248[i_20_++] = !Class87
																						.method1327(
																								rSString,
																								-91) ? 0
																						: 1;
																			} else if (i_24_ == 3611) {
																				if (Class14.aClass16_252 == null)
																					Class60.aClass16Array1148[i_21_++] = Class3.aClass16_87;
																				else
																					Class60.aClass16Array1148[i_21_++] = Class14.aClass16_252
																							.method164(70);
																			} else if (i_24_ == 3612) {
																				if (Class14.aClass16_252 == null)
																					Class14.anIntArray248[i_20_++] = 0;
																				else
																					Class14.anIntArray248[i_20_++] = Class35.anInt783;
																			} else if ((i_24_ ^ 0xffffffff) == -3614) {
																				int i_77_ = Class14.anIntArray248[--i_20_];
																				if (Class14.aClass16_252 == null
																						|| (Class35.anInt783 ^ 0xffffffff) >= (i_77_ ^ 0xffffffff))
																					Class60.aClass16Array1148[i_21_++] = Class3.aClass16_87;
																				else
																					Class60.aClass16Array1148[i_21_++] = Class14.aClass37_Sub18Array240[i_77_].aClass16_2197
																							.method164(70);
																			} else if ((i_24_ ^ 0xffffffff) == -3615) {
																				int i_78_ = Class14.anIntArray248[--i_20_];
																				if (Class14.aClass16_252 != null
																						&& Class35.anInt783 > i_78_)
																					Class14.anIntArray248[i_20_++] = Class14.aClass37_Sub18Array240[i_78_].anInt2192;
																				else
																					Class14.anIntArray248[i_20_++] = 0;
																			} else if ((i_24_ ^ 0xffffffff) == -3616) {
																				int i_79_ = Class14.anIntArray248[--i_20_];
																				if (Class14.aClass16_252 != null
																						&& (Class35.anInt783 ^ 0xffffffff) < (i_79_ ^ 0xffffffff))
																					Class14.anIntArray248[i_20_++] = Class14.aClass37_Sub18Array240[i_79_].aByte2194;
																				else
																					Class14.anIntArray248[i_20_++] = 0;
																			} else if (i_24_ == 3616)
																				Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub4.aByte2573;
																			else if ((i_24_ ^ 0xffffffff) == -3618) {
																				RSString rSString = Class60.aClass16Array1148[--i_21_];
																				Class37_Sub23
																						.method1027(
																								rSString,
																								0);
																			} else if ((i_24_ ^ 0xffffffff) == -3619)
																				Class14.anIntArray248[i_20_++] = Class83.aByte1519;
																			else if (i_24_ == 3619) {
																				RSString rSString = Class60.aClass16Array1148[--i_21_];
																				Class3
																						.method48(
																								(byte) 117,
																								rSString
																										.method152(-118));
																			} else if (i_24_ == 3620)
																				Class37_Sub9_Sub16
																						.method827(true);
																			else if (i_24_ == 3621) {
																				if ((Class37_Sub4_Sub12.anInt2783 ^ 0xffffffff) == -1)
																					Class14.anIntArray248[i_20_++] = -1;
																				else
																					Class14.anIntArray248[i_20_++] = RSInterface.anInt340;
																			} else if (i_24_ == 3622) {
																				int i_80_ = Class14.anIntArray248[--i_20_];
																				if (Class37_Sub4_Sub12.anInt2783 != 0
																						&& RSInterface.anInt340 > i_80_)
																					Class60.aClass16Array1148[i_21_++] = Class37_Sub4_Sub13
																							.method708(
																									37,
																									Class80.aLongArray1504[i_80_])
																							.method164(
																									70);
																				else
																					Class60.aClass16Array1148[i_21_++] = Class3.aClass16_87;
																			} else if (i_24_ == 3623) {
																				RSString rSString = Class60.aClass16Array1148[--i_21_];
																				if (rSString
																						.method165(
																								Class37_Sub7.aClass16_1906,
																								52)
																						|| rSString
																								.method165(
																										Class42.aClass16_945,
																										52))
																					rSString = rSString
																							.method158(
																									7,
																									-1);
																				Class14.anIntArray248[i_20_++] = !Class37_Sub4_Sub3
																						.method467(
																								(byte) -35,
																								rSString) ? 0
																						: 1;
																			} else if (i_24_ == 3624) {
																				int i_81_ = Class14.anIntArray248[--i_20_];
																				if (Class14.aClass37_Sub18Array240 == null
																						|| i_81_ >= Class35.anInt783
																						|| !Class14.aClass37_Sub18Array240[i_81_].aClass16_2197
																								.method159(
																										Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass16_3993,
																										(byte) 125))
																					Class14.anIntArray248[i_20_++] = 0;
																				else
																					Class14.anIntArray248[i_20_++] = 1;
																			} else {
																				if ((i_24_ ^ 0xffffffff) != -3626)
																					break;
																				if (Class37_Sub9_Sub1.aClass16_2911 == null)
																					Class60.aClass16Array1148[i_21_++] = Class3.aClass16_87;
																				else
																					Class60.aClass16Array1148[i_21_++] = Class37_Sub9_Sub1.aClass16_2911
																							.method164(70);
																			}
																		} else if ((i_24_ ^ 0xffffffff) > -4001) {
																			if (i_24_ == 3903) {
																				int i_82_ = Class14.anIntArray248[--i_20_];
																				Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub8.aClass62Array2643[i_82_]
																						.method1172((byte) 55);
																			} else if ((i_24_ ^ 0xffffffff) == -3905) {
																				int i_83_ = Class14.anIntArray248[--i_20_];
																				Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub8.aClass62Array2643[i_83_].anInt1182;
																			} else if ((i_24_ ^ 0xffffffff) == -3906) {
																				int i_84_ = Class14.anIntArray248[--i_20_];
																				Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub8.aClass62Array2643[i_84_].anInt1173;
																			} else if ((i_24_ ^ 0xffffffff) == -3907) {
																				int i_85_ = Class14.anIntArray248[--i_20_];
																				Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub8.aClass62Array2643[i_85_].anInt1186;
																			} else if ((i_24_ ^ 0xffffffff) == -3908) {
																				int i_86_ = Class14.anIntArray248[--i_20_];
																				Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub8.aClass62Array2643[i_86_].anInt1184;
																			} else if (i_24_ == 3908) {
																				int i_87_ = Class14.anIntArray248[--i_20_];
																				Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub8.aClass62Array2643[i_87_].anInt1178;
																			} else if ((i_24_ ^ 0xffffffff) == -3911) {
																				int i_88_ = Class14.anIntArray248[--i_20_];
																				int i_89_ = Class37_Sub4_Sub8.aClass62Array2643[i_88_]
																						.method1171(1);
																				Class14.anIntArray248[i_20_++] = (i_89_ ^ 0xffffffff) != -1 ? 0
																						: 1;
																			} else if (i_24_ == 3911) {
																				int i_90_ = Class14.anIntArray248[--i_20_];
																				int i_91_ = Class37_Sub4_Sub8.aClass62Array2643[i_90_]
																						.method1171(1);
																				Class14.anIntArray248[i_20_++] = (i_91_ ^ 0xffffffff) != -3 ? 0
																						: 1;
																			} else {
																				if ((i_24_ ^ 0xffffffff) != -3913)
																					break;
																				int i_92_ = Class14.anIntArray248[--i_20_];
																				int i_93_ = Class37_Sub4_Sub8.aClass62Array2643[i_92_]
																						.method1171(1);
																				Class14.anIntArray248[i_20_++] = i_93_ != 5 ? 0
																						: 1;
																			}
																		} else if (i_24_ >= 4100) {
																			if ((i_24_ ^ 0xffffffff) > -4201) {
																				if ((i_24_ ^ 0xffffffff) == -4101) {
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					int i_94_ = Class14.anIntArray248[--i_20_];
																					Class60.aClass16Array1148[i_21_++] = Class37_Sub9_Sub27
																							.method881(
																									124,
																									new RSString[] {
																											rSString,
																											Class37_Sub9_Sub24
																													.method870(
																															i_94_,
																															(byte) -114) });
																				} else if ((i_24_ ^ 0xffffffff) == -4102) {
																					i_21_ -= 2;
																					RSString rSString = Class60.aClass16Array1148[i_21_];
																					RSString class16_95_ = Class60.aClass16Array1148[1 + i_21_];
																					Class60.aClass16Array1148[i_21_++] = Class37_Sub9_Sub27
																							.method881(
																									124,
																									new RSString[] {
																											rSString,
																											class16_95_ });
																				} else if ((i_24_ ^ 0xffffffff) == -4103) {
																					int i_96_ = Class14.anIntArray248[--i_20_];
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					Class60.aClass16Array1148[i_21_++] = Class37_Sub9_Sub27
																							.method881(
																									-54,
																									new RSString[] {
																											rSString,
																											Class37_Sub9_Sub27
																													.method882(
																															i_96_,
																															true,
																															10) });
																				} else if ((i_24_ ^ 0xffffffff) == -4104) {
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					Class60.aClass16Array1148[i_21_++] = rSString
																							.method147(12131);
																				} else if (i_24_ == 4104) {
																					int i_97_ = Class14.anIntArray248[--i_20_];
																					long l = 86400000L * (long) i_97_ + 1014768000000L;
																					Class37_Sub4_Sub12.aCalendar2782
																							.setTime(new Date(
																									l));
																					int i_98_ = Class37_Sub4_Sub12.aCalendar2782
																							.get(5);
																					int i_99_ = Class37_Sub4_Sub12.aCalendar2782
																							.get(2);
																					int i_100_ = Class37_Sub4_Sub12.aCalendar2782
																							.get(1);
																					Class60.aClass16Array1148[i_21_++] = Class37_Sub9_Sub27
																							.method881(
																									-118,
																									new RSString[] {
																											Class37_Sub9_Sub24
																													.method870(
																															i_98_,
																															(byte) -114),
																											Class37_Sub9_Sub3.aClass16_2949,
																											Class37_Sub4_Sub7_Sub1_Sub1.aClass16Array3951[i_99_],
																											Class37_Sub9_Sub3.aClass16_2949,
																											Class37_Sub9_Sub24
																													.method870(
																															i_100_,
																															(byte) -114) });
																				} else if (i_24_ == 4105) {
																					i_21_ -= 2;
																					RSString rSString = Class60.aClass16Array1148[i_21_ + 1];
																					RSString class16_101_ = Class60.aClass16Array1148[i_21_];
																					if (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass29_3985 == null
																							|| !Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass29_3985.aBoolean700)
																						Class60.aClass16Array1148[i_21_++] = class16_101_;
																					else
																						Class60.aClass16Array1148[i_21_++] = rSString;
																				} else if (i_24_ == 4106) {
																					int i_102_ = Class14.anIntArray248[--i_20_];
																					Class60.aClass16Array1148[i_21_++] = Class37_Sub9_Sub24
																							.method870(
																									i_102_,
																									(byte) -114);
																				} else if (i_24_ == 4107) {
																					i_21_ -= 2;
																					Class14.anIntArray248[i_20_++] = Class60.aClass16Array1148[i_21_]
																							.method170(
																									true,
																									Class60.aClass16Array1148[i_21_
																											- -1]);
																				} else if (i_24_ == 4108) {
																					i_20_ -= 2;
																					int i_103_ = Class14.anIntArray248[i_20_];
																					int i_104_ = Class14.anIntArray248[1 + i_20_];
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					byte[] is_105_ = Class37_Sub9_Sub2.aClass15_Sub1_2932
																							.method131(
																									0,
																									i_104_,
																									1);
																					Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1 = new Class37_Sub4_Sub9_Sub2_Sub1(
																							is_105_);
																					Class14.anIntArray248[i_20_++] = class37_sub4_sub9_sub2_sub1
																							.method612(
																									rSString,
																									i_103_);
																				} else if (i_24_ == 4109) {
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					i_20_ -= 2;
																					int i_106_ = Class14.anIntArray248[1 + i_20_];
																					int i_107_ = Class14.anIntArray248[i_20_];
																					byte[] is_108_ = Class37_Sub9_Sub2.aClass15_Sub1_2932
																							.method131(
																									0,
																									i_106_,
																									1);
																					Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1 = new Class37_Sub4_Sub9_Sub2_Sub1(
																							is_108_);
																					Class14.anIntArray248[i_20_++] = class37_sub4_sub9_sub2_sub1
																							.method628(
																									rSString,
																									i_107_);
																				} else if (i_24_ == 4110) {
																					i_21_ -= 2;
																					RSString rSString = Class60.aClass16Array1148[1 + i_21_];
																					RSString class16_109_ = Class60.aClass16Array1148[i_21_];
																					if ((Class14.anIntArray248[--i_20_] ^ 0xffffffff) != -2)
																						Class60.aClass16Array1148[i_21_++] = rSString;
																					else
																						Class60.aClass16Array1148[i_21_++] = class16_109_;
																				} else if ((i_24_ ^ 0xffffffff) == -4112) {
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					Class60.aClass16Array1148[i_21_++] = Class37_Sub4_Sub9_Sub2
																							.method605(rSString);
																				} else if ((i_24_ ^ 0xffffffff) == -4113) {
																					int i_110_ = Class14.anIntArray248[--i_20_];
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					Class60.aClass16Array1148[i_21_++] = rSString
																							.method144(
																									i_110_,
																									false);
																				} else if (i_24_ == 4113) {
																					int i_111_ = Class14.anIntArray248[--i_20_];
																					Class14.anIntArray248[i_20_++] = Class37_Sub25
																							.method1045(
																									i_111_,
																									-127) ? 1
																							: 0;
																				} else if ((i_24_ ^ 0xffffffff) == -4115) {
																					int i_112_ = Class14.anIntArray248[--i_20_];
																					Class14.anIntArray248[i_20_++] = !Class66
																							.method1192(
																									-115,
																									i_112_) ? 0
																							: 1;
																				} else if (i_24_ == 4115) {
																					int i_113_ = Class14.anIntArray248[--i_20_];
																					Class14.anIntArray248[i_20_++] = !Class19
																							.method202(
																									i_113_,
																									65) ? 0
																							: 1;
																				} else if (i_24_ == 4116) {
																					int i_114_ = Class14.anIntArray248[--i_20_];
																					Class14.anIntArray248[i_20_++] = Class37_Sub9_Sub22
																							.method862(
																									i_114_,
																									false) ? 1
																							: 0;
																				} else if (i_24_ == 4117) {
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					if (rSString == null)
																						Class14.anIntArray248[i_20_++] = 0;
																					else
																						Class14.anIntArray248[i_20_++] = rSString
																								.method172((byte) 38);
																				} else if ((i_24_ ^ 0xffffffff) == -4119) {
																					i_20_ -= 2;
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					int i_115_ = Class14.anIntArray248[i_20_];
																					int i_116_ = Class14.anIntArray248[1 + i_20_];
																					Class60.aClass16Array1148[i_21_++] = rSString
																							.method169(
																									0,
																									i_115_,
																									i_116_);
																				} else if ((i_24_ ^ 0xffffffff) == -4120) {
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					RSString class16_117_ = Class37_Sub4_Sub7
																							.method491(
																									rSString
																											.method172((byte) 38),
																									0);
																					boolean bool_118_ = false;
																					for (int i_119_ = 0; (i_119_ ^ 0xffffffff) > (rSString
																							.method172((byte) 38) ^ 0xffffffff); i_119_++) {
																						int i_120_ = rSString
																								.method161(
																										i_119_,
																										119);
																						if (i_120_ != 60) {
																							if (i_120_ == 62)
																								bool_118_ = false;
																							else if (!bool_118_)
																								class16_117_
																										.method154(
																												0,
																												i_120_);
																						} else
																							bool_118_ = true;
																					}
																					class16_117_
																							.method173((byte) 125);
																					Class60.aClass16Array1148[i_21_++] = class16_117_;
																				} else if (i_24_ == 4120) {
																					i_20_ -= 2;
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					int i_121_ = Class14.anIntArray248[i_20_];
																					int i_122_ = Class14.anIntArray248[i_20_ + 1];
																					Class14.anIntArray248[i_20_++] = rSString
																							.method160(
																									i_122_,
																									i_121_,
																									25356);
																				} else {
																					if ((i_24_ ^ 0xffffffff) != -4122)
																						break;
																					i_21_ -= 2;
																					RSString rSString = Class60.aClass16Array1148[i_21_];
																					int i_123_ = Class14.anIntArray248[--i_20_];
																					RSString class16_124_ = Class60.aClass16Array1148[1 + i_21_];
																					Class14.anIntArray248[i_20_++] = rSString
																							.method168(
																									(byte) 58,
																									class16_124_,
																									i_123_);
																				}
																			} else if ((i_24_ ^ 0xffffffff) > -4301) {
																				if (i_24_ == 4200) {
																					int i_125_ = Class14.anIntArray248[--i_20_];
																					Class60.aClass16Array1148[i_21_++] = Class46
																							.loadItem(
																									i_125_,
																									(byte) 91).itemName;
																				} else if ((i_24_ ^ 0xffffffff) == -4202) {
																					i_20_ -= 2;
																					int i_126_ = Class14.anIntArray248[i_20_];
																					int i_127_ = Class14.anIntArray248[1 + i_20_];
																					RSItem class37_sub4_sub1 = Class46
																							.loadItem(
																									i_126_,
																									(byte) 99);
																					if ((i_127_ ^ 0xffffffff) <= -2
																							&& i_127_ <= 5
																							&& class37_sub4_sub1.groundActions[-1
																									+ i_127_] != null)
																						Class60.aClass16Array1148[i_21_++] = class37_sub4_sub1.groundActions[i_127_ - 1];
																					else
																						Class60.aClass16Array1148[i_21_++] = Class3.aClass16_87;
																				} else if (i_24_ == 4202) {
																					i_20_ -= 2;
																					int i_128_ = Class14.anIntArray248[i_20_];
																					int i_129_ = Class14.anIntArray248[1 + i_20_];
																					RSItem class37_sub4_sub1 = Class46
																							.loadItem(
																									i_128_,
																									(byte) 105);
																					if ((i_129_ ^ 0xffffffff) <= -2
																							&& (i_129_ ^ 0xffffffff) >= -6
																							&& class37_sub4_sub1.actions[-1
																									+ i_129_] != null)
																						Class60.aClass16Array1148[i_21_++] = class37_sub4_sub1.actions[i_129_ - 1];
																					else
																						Class60.aClass16Array1148[i_21_++] = Class3.aClass16_87;
																				} else if (i_24_ == 4203) {
																					int i_130_ = Class14.anIntArray248[--i_20_];
																					Class14.anIntArray248[i_20_++] = Class46
																							.loadItem(
																									i_130_,
																									(byte) 89).value;
																				} else if ((i_24_ ^ 0xffffffff) == -4205) {
																					int i_131_ = Class14.anIntArray248[--i_20_];
																					Class14.anIntArray248[i_20_++] = (Class46
																							.loadItem(
																									i_131_,
																									(byte) 125).stackable ^ 0xffffffff) == -2 ? 1
																							: 0;
																				} else if ((i_24_ ^ 0xffffffff) == -4206) {
																					int i_132_ = Class14.anIntArray248[--i_20_];
																					RSItem class37_sub4_sub1 = Class46
																							.loadItem(
																									i_132_,
																									(byte) 107);
																					if (class37_sub4_sub1.certTemplateID == -1
																							&& class37_sub4_sub1.certID >= 0)
																						Class14.anIntArray248[i_20_++] = class37_sub4_sub1.certID;
																					else
																						Class14.anIntArray248[i_20_++] = i_132_;
																				} else if (i_24_ == 4206) {
																					int i_133_ = Class14.anIntArray248[--i_20_];
																					RSItem class37_sub4_sub1 = Class46
																							.loadItem(
																									i_133_,
																									(byte) 108);
																					if ((class37_sub4_sub1.certTemplateID ^ 0xffffffff) <= -1
																							&& class37_sub4_sub1.certID >= 0)
																						Class14.anIntArray248[i_20_++] = class37_sub4_sub1.certID;
																					else
																						Class14.anIntArray248[i_20_++] = i_133_;
																				} else if ((i_24_ ^ 0xffffffff) == -4208) {
																					int i_134_ = Class14.anIntArray248[--i_20_];
																					Class14.anIntArray248[i_20_++] = !Class46
																							.loadItem(
																									i_134_,
																									(byte) 108).membersObject ? 0
																							: 1;
																				} else if (i_24_ == 4210) {
																					int i_135_ = Class14.anIntArray248[--i_20_];
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					Class86
																							.method1323(
																									(byte) 103,
																									rSString,
																									i_135_ == 1);
																					Class14.anIntArray248[i_20_++] = Class37_Sub10.anInt1980;
																				} else if (i_24_ == 4211) {
																					if (Class78.aShortArray1459 != null
																							&& (Class37_Sub10.anInt1980 ^ 0xffffffff) < (Class9.anInt172 ^ 0xffffffff))
																						Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub7
																								.method490(
																										Class78.aShortArray1459[Class9.anInt172++],
																										65535);
																					else
																						Class14.anIntArray248[i_20_++] = -1;
																				} else {
																					if ((i_24_ ^ 0xffffffff) != -4213)
																						break;
																					Class9.anInt172 = 0;
																				}
																			} else {
																				if ((i_24_ ^ 0xffffffff) <= -5101)
																					break;
																				if (i_24_ == 5000)
																					Class14.anIntArray248[i_20_++] = Class37_Sub9_Sub24.anInt3361;
																				else if ((i_24_ ^ 0xffffffff) == -5002) {
																					i_20_ -= 3;
																					Class37_Sub9_Sub24.anInt3361 = Class14.anIntArray248[i_20_];
																					Class8.anInt165 = Class14.anIntArray248[1 + i_20_];
																					Class37_Sub9_Sub15.anInt3169 = Class14.anIntArray248[i_20_ + 2];
																					Class42.aClass37_Sub11_Sub1_936
																							.method989(
																									-1494101117,
																									251);
																					Class42.aClass37_Sub11_Sub1_936
																							.method964(
																									119,
																									Class37_Sub9_Sub24.anInt3361);
																					Class2.anInt73++;
																					Class42.aClass37_Sub11_Sub1_936
																							.method964(
																									105,
																									Class8.anInt165);
																					Class42.aClass37_Sub11_Sub1_936
																							.method964(
																									108,
																									Class37_Sub9_Sub15.anInt3169);
																				} else if (i_24_ == 5002) {
																					i_20_ -= 2;
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					int i_136_ = Class14.anIntArray248[i_20_
																							- -1];
																					Class87.anInt1591++;
																					int i_137_ = Class14.anIntArray248[i_20_];
																					Class42.aClass37_Sub11_Sub1_936
																							.method989(
																									-1494101117,
																									198);
																					Class42.aClass37_Sub11_Sub1_936
																							.method949(
																									rSString
																											.method152(-96),
																									(byte) -93);
																					Class42.aClass37_Sub11_Sub1_936
																							.method964(
																									124,
																									i_137_ - 1);
																					Class42.aClass37_Sub11_Sub1_936
																							.method964(
																									108,
																									i_136_);
																				} else if ((i_24_ ^ 0xffffffff) == -5004) {
																					int i_138_ = Class14.anIntArray248[--i_20_];
																					RSString rSString = null;
																					if (i_138_ < 100)
																						rSString = ByteVector.aClass16Array2041[i_138_];
																					if (rSString == null)
																						rSString = Class3.aClass16_87;
																					Class60.aClass16Array1148[i_21_++] = rSString;
																				} else if (i_24_ == 5004) {
																					int i_139_ = Class14.anIntArray248[--i_20_];
																					int i_140_ = -1;
																					if (i_139_ < 100
																							&& ByteVector.aClass16Array2041[i_139_] != null)
																						i_140_ = Class41.anIntArray902[i_139_];
																					Class14.anIntArray248[i_20_++] = i_140_;
																				} else if ((i_24_ ^ 0xffffffff) == -5006)
																					Class14.anIntArray248[i_20_++] = Class8.anInt165;
																				else if (i_24_ == 5008) {
																					RSString rSString = Class60.aClass16Array1148[--i_21_];
																					if (rSString
																							.method165(
																									Class89.aClass16_1612,
																									52))
																						Class37_Sub9_Sub22
																								.method860(
																										rSString,
																										false);
																					else {
																						Class78.anInt1460++;
																						RSString class16_141_ = rSString
																								.method147(12131);
																						int i_142_ = 0;
																						int i_143_ = 0;
																						if (!class16_141_
																								.method165(
																										Class37_Sub9_Sub15.aClass16_3181,
																										52)) {
																							if (!class16_141_
																									.method165(
																											Class37_Sub4_Sub17.aClass16_2878,
																											52)) {
																								if (!class16_141_
																										.method165(
																												Class37_Sub9_Sub18.aClass16_3235,
																												52)) {
																									if (!class16_141_
																											.method165(
																													Class37_Sub5.aClass16_1873,
																													52)) {
																										if (class16_141_
																												.method165(
																														Class37_Sub9_Sub18.aClass16_3243,
																														52)) {
																											i_142_ = 4;
																											rSString = rSString
																													.method158(
																															Class37_Sub9_Sub18.aClass16_3243
																																	.method172((byte) 38),
																															-1);
																										} else if (class16_141_
																												.method165(
																														Class20.aClass16_539,
																														52)) {
																											rSString = rSString
																													.method158(
																															Class20.aClass16_539
																																	.method172((byte) 38),
																															-1);
																											i_142_ = 5;
																										} else if (class16_141_
																												.method165(
																														Class37_Sub9_Sub37.aClass16_3592,
																														52)) {
																											i_142_ = 6;
																											rSString = rSString
																													.method158(
																															Class37_Sub9_Sub37.aClass16_3592
																																	.method172((byte) 38),
																															-1);
																										} else if (class16_141_
																												.method165(
																														Applet_Sub1.aClass16_35,
																														52)) {
																											rSString = rSString
																													.method158(
																															Applet_Sub1.aClass16_35
																																	.method172((byte) 38),
																															-1);
																											i_142_ = 7;
																										} else if (class16_141_
																												.method165(
																														Class73.aClass16_1386,
																														52)) {
																											i_142_ = 8;
																											rSString = rSString
																													.method158(
																															Class73.aClass16_1386
																																	.method172((byte) 38),
																															-1);
																										} else if (!class16_141_
																												.method165(
																														Class37_Sub9_Sub7.aClass16_3030,
																														52)) {
																											if (!class16_141_
																													.method165(
																															Class17.aClass16_310,
																															52)) {
																												if (!class16_141_
																														.method165(
																																Landscape.aClass16_1115,
																																52)) {
																													if (Class37_Sub9_Sub25.anInt3382 != 0) {
																														if (class16_141_
																																.method165(
																																		Class37_Sub9_Sub15.aClass16_3178,
																																		52)) {
																															rSString = rSString
																																	.method158(
																																			Class37_Sub9_Sub15.aClass16_3178
																																					.method172((byte) 38),
																																			-1);
																															i_142_ = 0;
																														} else if (!class16_141_
																																.method165(
																																		Class37_Sub4_Sub17.aClass16_2882,
																																		52)) {
																															if (class16_141_
																																	.method165(
																																			Class37_Sub9_Sub18.aClass16_3230,
																																			52)) {
																																i_142_ = 2;
																																rSString = rSString
																																		.method158(
																																				Class37_Sub9_Sub18.aClass16_3230
																																						.method172((byte) 38),
																																				-1);
																															} else if (class16_141_
																																	.method165(
																																			Class37_Sub5.aClass16_1872,
																																			52)) {
																																i_142_ = 3;
																																rSString = rSString
																																		.method158(
																																				Class37_Sub5.aClass16_1872
																																						.method172((byte) 38),
																																				-1);
																															} else if (!class16_141_
																																	.method165(
																																			Class37_Sub9_Sub18.aClass16_3234,
																																			52)) {
																																if (!class16_141_
																																		.method165(
																																				Class20.aClass16_557,
																																				52)) {
																																	if (!class16_141_
																																			.method165(
																																					Class37_Sub9_Sub37.aClass16_3588,
																																					52)) {
																																		if (class16_141_
																																				.method165(
																																						Applet_Sub1.aClass16_4,
																																						52)) {
																																			i_142_ = 7;
																																			rSString = rSString
																																					.method158(
																																							Applet_Sub1.aClass16_4
																																									.method172((byte) 38),
																																							-1);
																																		} else if (class16_141_
																																				.method165(
																																						Class73.aClass16_1392,
																																						52)) {
																																			rSString = rSString
																																					.method158(
																																							Class73.aClass16_1392
																																									.method172((byte) 38),
																																							-1);
																																			i_142_ = 8;
																																		} else if (!class16_141_
																																				.method165(
																																						Class37_Sub9_Sub7.aClass16_3042,
																																						52)) {
																																			if (class16_141_
																																					.method165(
																																							Class17.aClass16_311,
																																							52)) {
																																				rSString = rSString
																																						.method158(
																																								Class17.aClass16_311
																																										.method172((byte) 38),
																																								-1);
																																				i_142_ = 10;
																																			} else if (class16_141_
																																					.method165(
																																							Landscape.aClass16_1104,
																																							52)) {
																																				i_142_ = 11;
																																				rSString = rSString
																																						.method158(
																																								Landscape.aClass16_1104
																																										.method172((byte) 38),
																																								-1);
																																			}
																																		} else {
																																			rSString = rSString
																																					.method158(
																																							Class37_Sub9_Sub7.aClass16_3042
																																									.method172((byte) 38),
																																							-1);
																																			i_142_ = 9;
																																		}
																																	} else {
																																		rSString = rSString
																																				.method158(
																																						Class37_Sub9_Sub37.aClass16_3588
																																								.method172((byte) 38),
																																						-1);
																																		i_142_ = 6;
																																	}
																																} else {
																																	rSString = rSString
																																			.method158(
																																					Class20.aClass16_557
																																							.method172((byte) 38),
																																					-1);
																																	i_142_ = 5;
																																}
																															} else {
																																i_142_ = 4;
																																rSString = rSString
																																		.method158(
																																				Class37_Sub9_Sub18.aClass16_3234
																																						.method172((byte) 38),
																																				-1);
																															}
																														} else {
																															i_142_ = 1;
																															rSString = rSString
																																	.method158(
																																			Class37_Sub4_Sub17.aClass16_2882
																																					.method172((byte) 38),
																																			-1);
																														}
																													}
																												} else {
																													i_142_ = 11;
																													rSString = rSString
																															.method158(
																																	Landscape.aClass16_1115
																																			.method172((byte) 38),
																																	-1);
																												}
																											} else {
																												i_142_ = 10;
																												rSString = rSString
																														.method158(
																																Class17.aClass16_310
																																		.method172((byte) 38),
																																-1);
																											}
																										} else {
																											rSString = rSString
																													.method158(
																															Class37_Sub9_Sub7.aClass16_3030
																																	.method172((byte) 38),
																															-1);
																											i_142_ = 9;
																										}
																									} else {
																										i_142_ = 3;
																										rSString = rSString
																												.method158(
																														Class37_Sub5.aClass16_1873
																																.method172((byte) 38),
																														-1);
																									}
																								} else {
																									rSString = rSString
																											.method158(
																													Class37_Sub9_Sub18.aClass16_3235
																															.method172((byte) 38),
																													-1);
																									i_142_ = 2;
																								}
																							} else {
																								rSString = rSString
																										.method158(
																												Class37_Sub4_Sub17.aClass16_2878
																														.method172((byte) 38),
																												-1);
																								i_142_ = 1;
																							}
																						} else {
																							rSString = rSString
																									.method158(
																											Class37_Sub9_Sub15.aClass16_3181
																													.method172((byte) 38),
																											-1);
																							i_142_ = 0;
																						}
																						class16_141_ = rSString
																								.method147(12131);
																						if (!class16_141_
																								.method165(
																										Class37_Sub4_Sub15.aClass16_2827,
																										52)) {
																							if (class16_141_
																									.method165(
																											Class60.aClass16_1159,
																											52)) {
																								i_143_ = 2;
																								rSString = rSString
																										.method158(
																												Class60.aClass16_1159
																														.method172((byte) 38),
																												-1);
																							} else if (class16_141_
																									.method165(
																											Class37_Sub9_Sub6.aClass16_3017,
																											52)) {
																								i_143_ = 3;
																								rSString = rSString
																										.method158(
																												Class37_Sub9_Sub6.aClass16_3017
																														.method172((byte) 38),
																												-1);
																							} else if (class16_141_
																									.method165(
																											Class6.aClass16_140,
																											52)) {
																								i_143_ = 4;
																								rSString = rSString
																										.method158(
																												Class6.aClass16_140
																														.method172((byte) 38),
																												-1);
																							} else if (class16_141_
																									.method165(
																											Class37_Sub10.aClass16_1983,
																											52)) {
																								i_143_ = 5;
																								rSString = rSString
																										.method158(
																												Class37_Sub10.aClass16_1983
																														.method172((byte) 38),
																												-1);
																							} else if ((Class37_Sub9_Sub25.anInt3382 ^ 0xffffffff) != -1) {
																								if (class16_141_
																										.method165(
																												Class37_Sub4_Sub15.aClass16_2816,
																												52)) {
																									i_143_ = 1;
																									rSString = rSString
																											.method158(
																													Class37_Sub4_Sub15.aClass16_2816
																															.method172((byte) 38),
																													-1);
																								} else if (!class16_141_
																										.method165(
																												Class60.aClass16_1147,
																												52)) {
																									if (class16_141_
																											.method165(
																													Class37_Sub9_Sub6.aClass16_3024,
																													52)) {
																										rSString = rSString
																												.method158(
																														Class37_Sub9_Sub6.aClass16_3024
																																.method172((byte) 38),
																														-1);
																										i_143_ = 3;
																									} else if (!class16_141_
																											.method165(
																													Class6.aClass16_134,
																													52)) {
																										if (class16_141_
																												.method165(
																														Class37_Sub10.aClass16_1999,
																														52)) {
																											rSString = rSString
																													.method158(
																															Class37_Sub10.aClass16_1999
																																	.method172((byte) 38),
																															-1);
																											i_143_ = 5;
																										}
																									} else {
																										i_143_ = 4;
																										rSString = rSString
																												.method158(
																														Class6.aClass16_134
																																.method172((byte) 38),
																														-1);
																									}
																								} else {
																									i_143_ = 2;
																									rSString = rSString
																											.method158(
																													Class60.aClass16_1147
																															.method172((byte) 38),
																													-1);
																								}
																							}
																						} else {
																							i_143_ = 1;
																							rSString = rSString
																									.method158(
																											Class37_Sub4_Sub15.aClass16_2827
																													.method172((byte) 38),
																											-1);
																						}
																						Class42.aClass37_Sub11_Sub1_936
																								.method989(
																										-1494101117,
																										52);
																						Class42.aClass37_Sub11_Sub1_936
																								.method964(
																										124,
																										0);
																						int i_144_ = Class42.aClass37_Sub11_Sub1_936.currentOffset;
																						Class42.aClass37_Sub11_Sub1_936
																								.method964(
																										103,
																										i_142_);
																						Class42.aClass37_Sub11_Sub1_936
																								.method964(
																										120,
																										i_143_);
																						Class37_Sub9_Sub18
																								.method837(
																										Class42.aClass37_Sub11_Sub1_936,
																										1,
																										rSString);
																						Class42.aClass37_Sub11_Sub1_936
																								.method948(
																										-i_144_
																												+ Class42.aClass37_Sub11_Sub1_936.currentOffset,
																										128);
																					}
																				} else if ((i_24_ ^ 0xffffffff) == -5010) {
																					i_21_ -= 2;
																					RSString rSString = Class60.aClass16Array1148[i_21_ + 1];
																					RSString class16_145_ = Class60.aClass16Array1148[i_21_];
																					Class37_Sub9_Sub36.anInt3581++;
																					Class42.aClass37_Sub11_Sub1_936
																							.method989(
																									-1494101117,
																									252);
																					Class42.aClass37_Sub11_Sub1_936
																							.method964(
																									101,
																									0);
																					int i_146_ = Class42.aClass37_Sub11_Sub1_936.currentOffset;
																					Class42.aClass37_Sub11_Sub1_936
																							.method949(
																									class16_145_
																											.method152(-89),
																									(byte) -104);
																					Class37_Sub9_Sub18
																							.method837(
																									Class42.aClass37_Sub11_Sub1_936,
																									1,
																									rSString);
																					Class42.aClass37_Sub11_Sub1_936
																							.method948(
																									-i_146_
																											+ Class42.aClass37_Sub11_Sub1_936.currentOffset,
																									128);
																				} else if (i_24_ == 5010) {
																					int i_147_ = Class14.anIntArray248[--i_20_];
																					RSString rSString = null;
																					if ((i_147_ ^ 0xffffffff) > -101)
																						rSString = Class37_Sub9_Sub29.aClass16Array3450[i_147_];
																					if (rSString == null)
																						rSString = Class3.aClass16_87;
																					Class60.aClass16Array1148[i_21_++] = rSString;
																				} else if (i_24_ == 5011) {
																					int i_148_ = Class14.anIntArray248[--i_20_];
																					RSString rSString = null;
																					if (i_148_ < 100)
																						rSString = Class37_Sub12.aClass16Array2093[i_148_];
																					if (rSString == null)
																						rSString = Class3.aClass16_87;
																					Class60.aClass16Array1148[i_21_++] = rSString;
																				} else if (i_24_ == 5015) {
																					RSString rSString;
																					if (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234 != null
																							&& Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass16_3993 != null)
																						rSString = Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass16_3993;
																					else
																						rSString = Class37_Sub9_Sub33.aClass16_3526;
																					Class60.aClass16Array1148[i_21_++] = rSString;
																				} else if (i_24_ == 5016)
																					Class14.anIntArray248[i_20_++] = Class37_Sub9_Sub15.anInt3169;
																				else {
																					if (i_24_ != 5017)
																						break;
																					Class14.anIntArray248[i_20_++] = Class8.anInt168;
																				}
																			}
																		} else if ((i_24_ ^ 0xffffffff) == -4001) {
																			i_20_ -= 2;
																			int i_149_ = Class14.anIntArray248[i_20_];
																			int i_150_ = Class14.anIntArray248[i_20_
																					- -1];
																			Class14.anIntArray248[i_20_++] = i_150_
																					+ i_149_;
																		} else if ((i_24_ ^ 0xffffffff) == -4002) {
																			i_20_ -= 2;
																			int i_151_ = Class14.anIntArray248[1 + i_20_];
																			int i_152_ = Class14.anIntArray248[i_20_];
																			Class14.anIntArray248[i_20_++] = -i_151_
																					+ i_152_;
																		} else if ((i_24_ ^ 0xffffffff) == -4003) {
																			i_20_ -= 2;
																			int i_153_ = Class14.anIntArray248[i_20_];
																			int i_154_ = Class14.anIntArray248[1 + i_20_];
																			Class14.anIntArray248[i_20_++] = i_154_
																					* i_153_;
																		} else if (i_24_ == 4003) {
																			i_20_ -= 2;
																			int i_155_ = Class14.anIntArray248[1 + i_20_];
																			int i_156_ = Class14.anIntArray248[i_20_];
																			Class14.anIntArray248[i_20_++] = i_156_
																					/ i_155_;
																		} else if ((i_24_ ^ 0xffffffff) == -4005) {
																			int i_157_ = Class14.anIntArray248[--i_20_];
																			Class14.anIntArray248[i_20_++] = (int) (Math
																					.random() * (double) i_157_);
																		} else if ((i_24_ ^ 0xffffffff) == -4006) {
																			int i_158_ = Class14.anIntArray248[--i_20_];
																			Class14.anIntArray248[i_20_++] = (int) (Math
																					.random() * (double) (1 + i_158_));
																		} else if (i_24_ == 4006) {
																			i_20_ -= 5;
																			int i_159_ = Class14.anIntArray248[i_20_];
																			int i_160_ = Class14.anIntArray248[2 + i_20_];
																			int i_161_ = Class14.anIntArray248[i_20_
																					- -1];
																			int i_162_ = Class14.anIntArray248[3 + i_20_];
																			int i_163_ = Class14.anIntArray248[i_20_ + 4];
																			Class14.anIntArray248[i_20_++] = (-i_159_ + i_161_)
																					* (i_163_ - i_160_)
																					/ (i_162_ - i_160_)
																					+ i_159_;
																		} else if (i_24_ == 4007) {
																			i_20_ -= 2;
																			int i_164_ = Class14.anIntArray248[i_20_];
																			int i_165_ = Class14.anIntArray248[i_20_
																					- -1];
																			Class14.anIntArray248[i_20_++] = i_164_
																					+ i_164_
																					* i_165_
																					/ 100;
																		} else if ((i_24_ ^ 0xffffffff) == -4009) {
																			i_20_ -= 2;
																			int i_166_ = Class14.anIntArray248[i_20_];
																			int i_167_ = Class14.anIntArray248[i_20_ + 1];
																			Class14.anIntArray248[i_20_++] = Class37_Sub9_Sub13
																					.method817(
																							i_166_,
																							1 << i_167_);
																		} else if ((i_24_ ^ 0xffffffff) == -4010) {
																			i_20_ -= 2;
																			int i_168_ = Class14.anIntArray248[i_20_];
																			int i_169_ = Class14.anIntArray248[1 + i_20_];
																			Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub7
																					.method490(
																							i_168_,
																							-(1 << i_169_)
																									+ -1);
																		} else if (i_24_ == 4010) {
																			i_20_ -= 2;
																			int i_170_ = Class14.anIntArray248[i_20_];
																			int i_171_ = Class14.anIntArray248[1 + i_20_];
																			Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub7
																					.method490(
																							1 << i_171_,
																							i_170_) == 0 ? 0
																					: 1;
																		} else if ((i_24_ ^ 0xffffffff) == -4012) {
																			i_20_ -= 2;
																			int i_172_ = Class14.anIntArray248[i_20_
																					- -1];
																			int i_173_ = Class14.anIntArray248[i_20_];
																			Class14.anIntArray248[i_20_++] = i_173_
																					% i_172_;
																		} else if (i_24_ == 4012) {
																			i_20_ -= 2;
																			int i_174_ = Class14.anIntArray248[i_20_];
																			int i_175_ = Class14.anIntArray248[1 + i_20_];
																			if (i_174_ == 0)
																				Class14.anIntArray248[i_20_++] = 0;
																			else
																				Class14.anIntArray248[i_20_++] = (int) Math
																						.pow(
																								(double) i_174_,
																								(double) i_175_);
																		} else if ((i_24_ ^ 0xffffffff) == -4014) {
																			i_20_ -= 2;
																			int i_176_ = Class14.anIntArray248[i_20_
																					- -1];
																			int i_177_ = Class14.anIntArray248[i_20_];
																			if (i_177_ != 0) {
																				if ((i_176_ ^ 0xffffffff) == -1)
																					Class14.anIntArray248[i_20_++] = 2147483647;
																				else
																					Class14.anIntArray248[i_20_++] = (int) Math
																							.pow(
																									(double) i_177_,
																									1.0 / (double) i_176_);
																			} else
																				Class14.anIntArray248[i_20_++] = 0;
																		} else if ((i_24_ ^ 0xffffffff) == -4015) {
																			i_20_ -= 2;
																			int i_178_ = Class14.anIntArray248[i_20_];
																			int i_179_ = Class14.anIntArray248[1 + i_20_];
																			Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub7
																					.method490(
																							i_178_,
																							i_179_);
																		} else if ((i_24_ ^ 0xffffffff) == -4016) {
																			i_20_ -= 2;
																			int i_180_ = Class14.anIntArray248[i_20_];
																			int i_181_ = Class14.anIntArray248[i_20_ + 1];
																			Class14.anIntArray248[i_20_++] = Class37_Sub9_Sub13
																					.method817(
																							i_180_,
																							i_181_);
																		} else if ((i_24_ ^ 0xffffffff) == -4017) {
																			i_20_ -= 2;
																			int i_182_ = Class14.anIntArray248[i_20_
																					- -1];
																			int i_183_ = Class14.anIntArray248[i_20_];
																			Class14.anIntArray248[i_20_++] = i_182_ > i_183_ ? i_183_
																					: i_182_;
																		} else if ((i_24_ ^ 0xffffffff) == -4018) {
																			i_20_ -= 2;
																			int i_184_ = Class14.anIntArray248[1 + i_20_];
																			int i_185_ = Class14.anIntArray248[i_20_];
																			Class14.anIntArray248[i_20_++] = i_184_ >= i_185_ ? i_184_
																					: i_185_;
																		} else {
																			if ((i_24_ ^ 0xffffffff) != -4019)
																				break;
																			i_20_ -= 3;
																			long l = (long) Class14.anIntArray248[i_20_];
																			long l_186_ = (long) Class14.anIntArray248[i_20_
																					- -1];
																			long l_187_ = (long) Class14.anIntArray248[i_20_ + 2];
																			Class14.anIntArray248[i_20_++] = (int) (l
																					* l_187_ / l_186_);
																		}
																	} else if (i_24_ == 3300)
																		Class14.anIntArray248[i_20_++] = Class37_Sub7.anInt1898;
																	else if ((i_24_ ^ 0xffffffff) == -3302) {
																		i_20_ -= 2;
																		int i_188_ = Class14.anIntArray248[i_20_];
																		int i_189_ = Class14.anIntArray248[1 + i_20_];
																		Class14.anIntArray248[i_20_++] = Class37_Sub9_Sub36
																				.method919(
																						i_189_,
																						i_188_,
																						-32594);
																	} else if ((i_24_ ^ 0xffffffff) == -3303) {
																		i_20_ -= 2;
																		int i_190_ = Class14.anIntArray248[1 + i_20_];
																		int i_191_ = Class14.anIntArray248[i_20_];
																		Class14.anIntArray248[i_20_++] = Class66
																				.method1189(
																						i_191_,
																						true,
																						i_190_);
																	} else if ((i_24_ ^ 0xffffffff) == -3304) {
																		i_20_ -= 2;
																		int i_192_ = Class14.anIntArray248[i_20_ + 1];
																		int i_193_ = Class14.anIntArray248[i_20_];
																		Class14.anIntArray248[i_20_++] = Class13
																				.method95(
																						i_193_,
																						i_192_,
																						-1);
																	} else if ((i_24_ ^ 0xffffffff) == -3305) {
																		int i_194_ = Class14.anIntArray248[--i_20_];
																		Class14.anIntArray248[i_20_++] = Class17
																				.method185(
																						5,
																						i_194_).anInt2874;
																	} else if (i_24_ == 3305) {
																		int i_195_ = Class14.anIntArray248[--i_20_];
																		Class14.anIntArray248[i_20_++] = Class82.anIntArray1696[i_195_];
																	} else if ((i_24_ ^ 0xffffffff) == -3307) {
																		int i_196_ = Class14.anIntArray248[--i_20_];
																		Class14.anIntArray248[i_20_++] = Class68.anIntArray1324[i_196_];
																	} else if ((i_24_ ^ 0xffffffff) == -3308) {
																		int i_197_ = Class14.anIntArray248[--i_20_];
																		Class14.anIntArray248[i_20_++] = Class37_Sub12.anIntArray2104[i_197_];
																	} else if ((i_24_ ^ 0xffffffff) == -3309) {
																		int i_198_ = Class37_Sub9_Sub1.anInt2916;
																		int i_199_ = Class37_Sub18.anInt2200
																				+ (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666 >> -651563033);
																		int i_200_ = (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642 >> 1281074887)
																				- -Class15_Sub1.anInt1738;
																		Class14.anIntArray248[i_20_++] = (i_199_ << -329142386)
																				+ ((i_198_ << 2035032892) + i_200_);
																	} else if (i_24_ == 3309) {
																		int i_201_ = Class14.anIntArray248[--i_20_];
																		Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub7
																				.method490(
																						268423538,
																						i_201_) >> -733611250;
																	} else if ((i_24_ ^ 0xffffffff) == -3311) {
																		int i_202_ = Class14.anIntArray248[--i_20_];
																		Class14.anIntArray248[i_20_++] = i_202_ >> -1791349668;
																	} else if ((i_24_ ^ 0xffffffff) == -3312) {
																		int i_203_ = Class14.anIntArray248[--i_20_];
																		Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub7
																				.method490(
																						i_203_,
																						16383);
																	} else if ((i_24_ ^ 0xffffffff) == -3313)
																		Class14.anIntArray248[i_20_++] = !Class37_Sub4_Sub13.aBoolean2791 ? 0
																				: 1;
																	else if (i_24_ == 3313) {
																		i_20_ -= 2;
																		int i_204_ = Class14.anIntArray248[i_20_] + 32768;
																		int i_205_ = Class14.anIntArray248[i_20_ + 1];
																		Class14.anIntArray248[i_20_++] = Class37_Sub9_Sub36
																				.method919(
																						i_205_,
																						i_204_,
																						-32594);
																	} else if ((i_24_ ^ 0xffffffff) == -3315) {
																		i_20_ -= 2;
																		int i_206_ = 32768 + Class14.anIntArray248[i_20_];
																		int i_207_ = Class14.anIntArray248[1 + i_20_];
																		Class14.anIntArray248[i_20_++] = Class66
																				.method1189(
																						i_206_,
																						true,
																						i_207_);
																	} else if ((i_24_ ^ 0xffffffff) == -3316) {
																		i_20_ -= 2;
																		int i_208_ = Class14.anIntArray248[i_20_ + 1];
																		int i_209_ = Class14.anIntArray248[i_20_]
																				- -32768;
																		Class14.anIntArray248[i_20_++] = Class13
																				.method95(
																						i_209_,
																						i_208_,
																						-1);
																	} else if (i_24_ == 3316) {
																		if ((Class37_Sub9_Sub20.anInt3301 ^ 0xffffffff) > -3)
																			Class14.anIntArray248[i_20_++] = 0;
																		else
																			Class14.anIntArray248[i_20_++] = Class37_Sub9_Sub20.anInt3301;
																	} else if ((i_24_ ^ 0xffffffff) == -3318)
																		Class14.anIntArray248[i_20_++] = Class37_Sub9_Sub16.anInt3201;
																	else if ((i_24_ ^ 0xffffffff) == -3319)
																		Class14.anIntArray248[i_20_++] = Class37_Sub9_Sub19.anInt3272;
																	else if ((i_24_ ^ 0xffffffff) == -3322)
																		Class14.anIntArray248[i_20_++] = Class37_Sub4_Sub16.anInt2864;
																	else if (i_24_ == 3322)
																		Class14.anIntArray248[i_20_++] = Class33.anInt761;
																	else if (i_24_ == 3323) {
																		if ((Class37_Sub9_Sub20.anInt3301 ^ 0xffffffff) == -2)
																			Class14.anIntArray248[i_20_++] = 1;
																		else
																			Class14.anIntArray248[i_20_++] = 0;
																	} else {
																		if (i_24_ != 3325)
																			break;
																		if (Class37_Sub12.anInt2077 > 0)
																			Class14.anIntArray248[i_20_++] = 1;
																		else
																			Class14.anIntArray248[i_20_++] = 0;
																	}
																} else if (i_24_ == 3200) {
																	i_20_ -= 3;
																	Class66
																			.method1190(
																					(byte) -100,
																					(Class14.anIntArray248[2 + i_20_]),
																					(Class14.anIntArray248[1 + i_20_]),
																					(Class14.anIntArray248[i_20_]));
																} else if (i_24_ == 3201)
																	Class37_Sub9_Sub10
																			.method805(
																					(byte) -75,
																					(Class14.anIntArray248[--i_20_]));
																else {
																	if ((i_24_ ^ 0xffffffff) != -3203)
																		break;
																	i_20_ -= 2;
																	Class37_Sub4_Sub8
																			.method574(
																					(Class14.anIntArray248[1 + i_20_]),
																					true,
																					(Class14.anIntArray248[i_20_]));
																}
															} else if ((i_24_ ^ 0xffffffff) == -2701) {
																RSInterface rSInterface = (Class37_Sub9_Sub14
																		.getInterface(
																				(Class14.anIntArray248[--i_20_]),
																				4096));
																Class14.anIntArray248[i_20_++] = (rSInterface.anInt367);
															} else if (i_24_ == 2701) {
																RSInterface rSInterface = (Class37_Sub9_Sub14
																		.getInterface(
																				(Class14.anIntArray248[--i_20_]),
																				4096));
																if ((rSInterface.anInt367) == -1)
																	Class14.anIntArray248[i_20_++] = 0;
																else
																	Class14.anIntArray248[i_20_++] = (rSInterface.anInt368);
															} else if (i_24_ == 2702) {
																int i_210_ = (Class14.anIntArray248[--i_20_]);
																Class37_Sub6 class37_sub6 = ((Class37_Sub6) (Class76.aClass13_1423
																		.method100(
																				(byte) 72,
																				(long) i_210_)));
																if (class37_sub6 != null)
																	Class14.anIntArray248[i_20_++] = 1;
																else
																	Class14.anIntArray248[i_20_++] = 0;
															} else {
																if ((i_24_ ^ 0xffffffff) != -2704)
																	break;
																RSInterface rSInterface = (Class37_Sub9_Sub14
																		.getInterface(
																				(Class14.anIntArray248[--i_20_]),
																				4096));
																if ((rSInterface.aClass18Array450) == null)
																	Class14.anIntArray248[i_20_++] = 0;
																else {
																	int i_211_ = (rSInterface.aClass18Array450).length;
																	for (int i_212_ = 0; (i_212_ < rSInterface.aClass18Array450.length); i_212_++) {
																		if ((rSInterface.aClass18Array450[i_212_]) == null) {
																			i_211_ = i_212_;
																			break;
																		}
																	}
																	Class14.anIntArray248[i_20_++] = i_211_;
																}
															}
														} else {
															RSInterface rSInterface = (Class37_Sub9_Sub14
																	.getInterface(
																			(Class14.anIntArray248[--i_20_]),
																			4096));
															if (i_24_ == 2500)
																Class14.anIntArray248[i_20_++] = (rSInterface.anInt329);
															else if (i_24_ == 2501)
																Class14.anIntArray248[i_20_++] = (rSInterface.anInt415);
															else if (i_24_ == 2502)
																Class14.anIntArray248[i_20_++] = (rSInterface.anInt441);
															else if (i_24_ == 2503)
																Class14.anIntArray248[i_20_++] = (rSInterface.anInt353);
															else if (i_24_ == 2504)
																Class14.anIntArray248[i_20_++] = (!(rSInterface.aBoolean445) ? 0
																		: 1);
															else {
																if (i_24_ != 2505)
																	break;
																Class14.anIntArray248[i_20_++] = (rSInterface.anInt394);
															}
														}
													} else {
														RSInterface rSInterface = (bool ? (Class1.aClass18_61)
																: (Class47.aClass18_995));
														if ((i_24_ ^ 0xffffffff) == -1801)
															Class14.anIntArray248[i_20_++] = (Class10
																	.method85(
																			(RuntimeException_Sub1
																					.method1339(
																							rSInterface,
																							25)),
																			false));
														else if (i_24_ == 1801) {
															int i_213_ = (Class14.anIntArray248[--i_20_]);
															i_213_--;
															if (((rSInterface.aClass16Array453) != null)
																	&& ((rSInterface.aClass16Array453).length > i_213_)
																	&& ((rSInterface.aClass16Array453[i_213_]) != null))
																Class60.aClass16Array1148[i_21_++] = (rSInterface.aClass16Array453[i_213_]);
															else
																Class60.aClass16Array1148[i_21_++] = (Class3.aClass16_87);
														} else {
															if ((i_24_ ^ 0xffffffff) != -1803)
																break;
															if ((rSInterface.aClass16_391) != null)
																Class60.aClass16Array1148[i_21_++] = (rSInterface.aClass16_391);
															else
																Class60.aClass16Array1148[i_21_++] = (Class3.aClass16_87);
														}
													}
												} else {
													RSInterface rSInterface = (bool ? Class1.aClass18_61
															: (Class47.aClass18_995));
													if (i_24_ == 1700)
														Class14.anIntArray248[i_20_++] = rSInterface.anInt367;
													else if ((i_24_ ^ 0xffffffff) == -1702) {
														if (rSInterface.anInt367 == -1)
															Class14.anIntArray248[i_20_++] = 0;
														else
															Class14.anIntArray248[i_20_++] = (rSInterface.anInt368);
													} else {
														if ((i_24_ ^ 0xffffffff) != -1703)
															break;
														Class14.anIntArray248[i_20_++] = rSInterface.anInt334;
													}
												}
											} else {
												RSInterface rSInterface = (!bool ? Class47.aClass18_995
														: Class1.aClass18_61);
												if (i_24_ == 1600)
													Class14.anIntArray248[i_20_++] = rSInterface.anInt371;
												else if (i_24_ == 1601)
													Class14.anIntArray248[i_20_++] = rSInterface.anInt432;
												else if ((i_24_ ^ 0xffffffff) == -1603)
													Class60.aClass16Array1148[i_21_++] = rSInterface.interfaceString;
												else if (i_24_ == 1603)
													Class14.anIntArray248[i_20_++] = rSInterface.anInt324;
												else if (i_24_ == 1604)
													Class14.anIntArray248[i_20_++] = rSInterface.anInt348;
												else if (i_24_ == 1605)
													Class14.anIntArray248[i_20_++] = rSInterface.anInt387;
												else if (i_24_ == 1606)
													Class14.anIntArray248[i_20_++] = rSInterface.anInt319;
												else if (i_24_ == 1607)
													Class14.anIntArray248[i_20_++] = rSInterface.anInt359;
												else {
													if ((i_24_ ^ 0xffffffff) != -1609)
														break;
													Class14.anIntArray248[i_20_++] = rSInterface.anInt405;
												}
											}
										} else {
											RSInterface rSInterface = (bool ? Class1.aClass18_61
													: Class47.aClass18_995);
											if ((i_24_ ^ 0xffffffff) == -1501)
												Class14.anIntArray248[i_20_++] = rSInterface.anInt329;
											else if ((i_24_ ^ 0xffffffff) == -1502)
												Class14.anIntArray248[i_20_++] = rSInterface.anInt415;
											else if (i_24_ == 1502)
												Class14.anIntArray248[i_20_++] = rSInterface.anInt441;
											else if ((i_24_ ^ 0xffffffff) == -1504)
												Class14.anIntArray248[i_20_++] = rSInterface.anInt353;
											else if ((i_24_ ^ 0xffffffff) == -1505)
												Class14.anIntArray248[i_20_++] = (!rSInterface.aBoolean445 ? 0
														: 1);
											else {
												if ((i_24_ ^ 0xffffffff) != -1506)
													break;
												Class14.anIntArray248[i_20_++] = rSInterface.anInt394;
											}
										}
									} else {
										RSInterface rSInterface;
										if ((i_24_ ^ 0xffffffff) <= -2001) {
											i_24_ -= 1000;
											rSInterface = (Class37_Sub9_Sub14
													.getInterface(
															(Class14.anIntArray248[--i_20_]),
															4096));
										} else
											rSInterface = (bool ? Class1.aClass18_61
													: Class47.aClass18_995);
										if ((i_24_ ^ 0xffffffff) == -1301) {
											int i_214_ = (Class14.anIntArray248[--i_20_]) - 1;
											if ((i_214_ ^ 0xffffffff) > -1
													|| i_214_ > 9)
												i_21_--;
											else
												rSInterface
														.method195(
																(Class60.aClass16Array1148[--i_21_]),
																(byte) 119,
																i_214_);
										} else if (i_24_ == 1301) {
											i_20_ -= 2;
											int i_215_ = (Class14.anIntArray248[i_20_ + 1]);
											int i_216_ = Class14.anIntArray248[i_20_];
											rSInterface.aClass18_413 = (Class37_Sub9_Sub35
													.method914(i_216_,
															(byte) -108, i_215_));
										} else if (i_24_ == 1302)
											rSInterface.aBoolean372 = (Class14.anIntArray248[--i_20_]) == 1;
										else if ((i_24_ ^ 0xffffffff) == -1304)
											rSInterface.anInt378 = (Class14.anIntArray248[--i_20_]);
										else if ((i_24_ ^ 0xffffffff) == -1305)
											rSInterface.anInt350 = (Class14.anIntArray248[--i_20_]);
										else if (i_24_ == 1305)
											rSInterface.aClass16_391 = (Class60.aClass16Array1148[--i_21_]);
										else if ((i_24_ ^ 0xffffffff) == -1307)
											rSInterface.aClass16_360 = (Class60.aClass16Array1148[--i_21_]);
										else {
											if ((i_24_ ^ 0xffffffff) != -1308)
												break;
											rSInterface.aClass16Array453 = null;
										}
									}
								} else {
									RSInterface rSInterface;
									if (i_24_ < 2000)
										rSInterface = (bool ? Class1.aClass18_61
												: Class47.aClass18_995);
									else {
										i_24_ -= 1000;
										rSInterface = (Class37_Sub9_Sub14
												.getInterface(
														Class14.anIntArray248[--i_20_],
														4096));
									}
									if (i_24_ == 1100) {
										i_20_ -= 2;
										rSInterface.anInt371 = Class14.anIntArray248[i_20_];
										if ((rSInterface.anInt371 ^ 0xffffffff) < ((-rSInterface.anInt441 + rSInterface.anInt324) ^ 0xffffffff))
											rSInterface.anInt371 = (-rSInterface.anInt441 + rSInterface.anInt324);
										if (rSInterface.anInt371 < 0)
											rSInterface.anInt371 = 0;
										rSInterface.anInt432 = Class14.anIntArray248[1 + i_20_];
										if (((-rSInterface.anInt353 + rSInterface.anInt348) ^ 0xffffffff) > (rSInterface.anInt432 ^ 0xffffffff))
											rSInterface.anInt432 = (rSInterface.anInt348 + -rSInterface.anInt353);
										if ((rSInterface.anInt432 ^ 0xffffffff) > -1)
											rSInterface.anInt432 = 0;
										Class73.refreshInterface(rSInterface, -1);
									} else if ((i_24_ ^ 0xffffffff) == -1102) {
										rSInterface.anInt442 = Class14.anIntArray248[--i_20_];
										Class73.refreshInterface(rSInterface, -1);
									} else if (i_24_ == 1102) {
										rSInterface.aBoolean321 = (Class14.anIntArray248[--i_20_] == 1);
										Class73.refreshInterface(rSInterface, -1);
									} else if (i_24_ == 1103) {
										rSInterface.anInt320 = Class14.anIntArray248[--i_20_];
										Class73.refreshInterface(rSInterface, -1);
									} else if (i_24_ == 1104) {
										rSInterface.anInt337 = Class14.anIntArray248[--i_20_];
										Class73.refreshInterface(rSInterface, -1);
									} else if (i_24_ == 1105) {
										rSInterface.anInt385 = Class14.anIntArray248[--i_20_];
										Class73.refreshInterface(rSInterface, -1);
									} else if ((i_24_ ^ 0xffffffff) == -1107) {
										rSInterface.anInt398 = Class14.anIntArray248[--i_20_];
										Class73.refreshInterface(rSInterface, -1);
									} else if ((i_24_ ^ 0xffffffff) == -1108) {
										rSInterface.aBoolean336 = (Class14.anIntArray248[--i_20_] ^ 0xffffffff) == -2;
										Class73.refreshInterface(rSInterface, -1);
									} else if ((i_24_ ^ 0xffffffff) == -1109) {
										rSInterface.anInt408 = 1;
										rSInterface.anInt369 = Class14.anIntArray248[--i_20_];
										Class73.refreshInterface(rSInterface, -1);
									} else if ((i_24_ ^ 0xffffffff) == -1110) {
										i_20_ -= 6;
										rSInterface.anInt395 = Class14.anIntArray248[i_20_];
										rSInterface.anInt410 = (Class14.anIntArray248[i_20_
												- -1]);
										rSInterface.anInt319 = Class14.anIntArray248[2 + i_20_];
										rSInterface.anInt405 = Class14.anIntArray248[i_20_ + 3];
										rSInterface.anInt359 = Class14.anIntArray248[i_20_ + 4];
										rSInterface.anInt387 = Class14.anIntArray248[i_20_ + 5];
										Class73.refreshInterface(rSInterface, -1);
									} else if ((i_24_ ^ 0xffffffff) == -1111) {
										int i_217_ = Class14.anIntArray248[--i_20_];
										if ((i_217_ ^ 0xffffffff) != (rSInterface.anInt390 ^ 0xffffffff)) {
											rSInterface.anInt390 = i_217_;
											rSInterface.anInt323 = 0;
											rSInterface.anInt443 = 0;
											Class73.refreshInterface(rSInterface, -1);
										}
									} else if ((i_24_ ^ 0xffffffff) == -1112) {
										rSInterface.aBoolean364 = (Class14.anIntArray248[--i_20_] ^ 0xffffffff) == -2;
										Class73.refreshInterface(rSInterface, -1);
									} else if (i_24_ == 1112) {
										RSString rSString = (Class60.aClass16Array1148[--i_21_]);
										if (!rSString.equalsRSString(-112,
												rSInterface.interfaceString)) {
											rSInterface.interfaceString = rSString;
											Class73.refreshInterface(rSInterface, -1);
										}
									} else if ((i_24_ ^ 0xffffffff) == -1114) {
										rSInterface.anInt338 = Class14.anIntArray248[--i_20_];
										Class73.refreshInterface(rSInterface, -1);
									} else if (i_24_ == 1114) {
										i_20_ -= 3;
										rSInterface.anInt406 = Class14.anIntArray248[i_20_];
										rSInterface.anInt379 = Class14.anIntArray248[1 + i_20_];
										rSInterface.anInt420 = Class14.anIntArray248[2 + i_20_];
										Class73.refreshInterface(rSInterface, -1);
									} else if (i_24_ == 1115) {
										rSInterface.aBoolean403 = (Class14.anIntArray248[--i_20_] == 1);
										Class73.refreshInterface(rSInterface, -1);
									} else if ((i_24_ ^ 0xffffffff) == -1117) {
										rSInterface.anInt449 = Class14.anIntArray248[--i_20_];
										Class73.refreshInterface(rSInterface, -1);
									} else if ((i_24_ ^ 0xffffffff) == -1118) {
										rSInterface.anInt335 = Class14.anIntArray248[--i_20_];
										Class73.refreshInterface(rSInterface, -1);
									} else if ((i_24_ ^ 0xffffffff) == -1119) {
										rSInterface.aBoolean389 = (Class14.anIntArray248[--i_20_] ^ 0xffffffff) == -2;
										Class73.refreshInterface(rSInterface, -1);
									} else if ((i_24_ ^ 0xffffffff) == -1120) {
										rSInterface.aBoolean401 = (Class14.anIntArray248[--i_20_] == 1);
										Class73.refreshInterface(rSInterface, -1);
									} else {
										if (i_24_ != 1120)
											break;
										i_20_ -= 2;
										rSInterface.anInt324 = Class14.anIntArray248[i_20_];
										rSInterface.anInt348 = Class14.anIntArray248[i_20_ + 1];
										Class73.refreshInterface(rSInterface, -1);
									}
								}
							} else {
								RSInterface rSInterface;
								if (i_24_ >= 2000) {
									i_24_ -= 1000;
									rSInterface = (Class37_Sub9_Sub14.getInterface(
											Class14.anIntArray248[--i_20_],
											4096));
								} else
									rSInterface = (!bool ? Class47.aClass18_995
											: Class1.aClass18_61);
								if (i_24_ == 1000) {
									i_20_ -= 2;
									rSInterface.anInt329 = Class14.anIntArray248[i_20_];
									rSInterface.anInt415 = Class14.anIntArray248[1 + i_20_];
									Class73.refreshInterface(rSInterface, -1);
								} else if (i_24_ == 1001) {
									i_20_ -= 2;
									rSInterface.anInt441 = Class14.anIntArray248[i_20_];
									rSInterface.anInt353 = Class14.anIntArray248[i_20_ + 1];
									Class73.refreshInterface(rSInterface, -1);
								} else {
									if (i_24_ != 1003)
										break;
									boolean bool_218_ = Class14.anIntArray248[--i_20_] == 1;
									if (bool_218_ == !rSInterface.aBoolean445) {
										rSInterface.aBoolean445 = bool_218_;
										Class73.refreshInterface(rSInterface, -1);
									}
								}
							}
						} else if (i_24_ == 100) {
							i_20_ -= 3;
							int i_219_ = Class14.anIntArray248[i_20_];
							int i_220_ = Class14.anIntArray248[1 + i_20_];
							int i_221_ = Class14.anIntArray248[i_20_ - -2];
							if ((i_220_ ^ 0xffffffff) == -1)
								throw new RuntimeException();
							RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(
									i_219_, 4096);
							if (rSInterface.aClass18Array450 == null)
								rSInterface.aClass18Array450 = new RSInterface[1 + i_221_];
							if (rSInterface.aClass18Array450.length <= i_221_) {
								RSInterface[] class18s = new RSInterface[1 + i_221_];
								for (int i_222_ = 0; ((rSInterface.aClass18Array450.length ^ 0xffffffff) < (i_222_ ^ 0xffffffff)); i_222_++)
									class18s[i_222_] = rSInterface.aClass18Array450[i_222_];
								rSInterface.aClass18Array450 = class18s;
							}
							if ((i_221_ ^ 0xffffffff) < -1
									&& (rSInterface.aClass18Array450[i_221_ + -1] == null))
								throw new RuntimeException("Gap at:"
										+ (-1 + i_221_));
							RSInterface class18_223_ = new RSInterface();
							class18_223_.anInt334 = i_221_;
							class18_223_.anInt354 = i_220_;
							class18_223_.aBoolean374 = true;
							class18_223_.anInt394 = class18_223_.anInt402 = rSInterface.anInt402;
							rSInterface.aClass18Array450[i_221_] = class18_223_;
							if (bool)
								Class1.aClass18_61 = class18_223_;
							else
								Class47.aClass18_995 = class18_223_;
							Class73.refreshInterface(rSInterface, -1);
						} else if (i_24_ == 101) {
							RSInterface rSInterface = (bool ? Class1.aClass18_61
									: Class47.aClass18_995);
							RSInterface class18_224_ = Class37_Sub9_Sub14
									.getInterface(rSInterface.anInt402, 4096);
							class18_224_.aClass18Array450[rSInterface.anInt334] = null;
							Class73.refreshInterface(class18_224_, -1);
						} else if (i_24_ == 102) {
							RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(
									(Class14.anIntArray248[--i_20_]), 4096);
							rSInterface.aClass18Array450 = null;
							Class73.refreshInterface(rSInterface, -1);
						} else {
							if (i_24_ != 200)
								break;
							i_20_ -= 2;
							int i_225_ = Class14.anIntArray248[i_20_ + 1];
							int i_226_ = Class14.anIntArray248[i_20_];
							RSInterface rSInterface = Class37_Sub9_Sub35.method914(
									i_226_, (byte) -52, i_225_);
							if (rSInterface != null && (i_225_ ^ 0xffffffff) != 0) {
								Class14.anIntArray248[i_20_++] = 1;
								if (!bool)
									Class47.aClass18_995 = rSInterface;
								else
									Class1.aClass18_61 = rSInterface;
							} else
								Class14.anIntArray248[i_20_++] = 0;
						}
					}
					throw new IllegalStateException();
				} catch (Exception exception) {
					if (class37_sub4_sub6.aClass16_2620 == null) {
						if ((Class37_Sub9_Sub17.anInt3219 ^ 0xffffffff) != -1)
							Class37_Sub4_Sub7_Sub1_Sub1.method505(
									Class3.aClass16_87, 0,
									Class37_Sub4_Sub14.aClass16_2806,
									(byte) 115);
						Class37_Sub9_Sub3.method768(-73,
								("CS2 - scr:" + (class37_sub4_sub6.aLong818)
										+ " op:" + i_24_), exception);
					} else {
						RSString rSString = Class37_Sub4_Sub7.method491(30, 0);
						rSString.method157(Class37_Sub16.aClass16_2150, -20035)
								.method157(class37_sub4_sub6.aClass16_2620,
										-20035);
						for (int i_227_ = Class37_Sub9_Sub29.anInt3457 - 1; i_227_ >= 0; i_227_--)
							rSString
									.method157(Class25.aClass16_638, -20035)
									.method157(
											(Class37_Sub1.aClass78Array1807[i_227_].aClass37_Sub4_Sub6_1455.aClass16_2620),
											-20035);
						if ((i_24_ ^ 0xffffffff) == -41) {
							int i_228_ = is_23_[i_22_];
							rSString.method157(Class76.aClass16_1421, -20035)
									.method157(
											Class37_Sub9_Sub24.method870(
													i_228_, (byte) -114),
											-20035);
						}
						if ((Class37_Sub9_Sub17.anInt3219 ^ 0xffffffff) != -1)
							Class37_Sub4_Sub7_Sub1_Sub1
									.method505(
											Class3.aClass16_87,
											0,
											(Class37_Sub9_Sub27
													.method881(
															9,
															(new RSString[] {
																	Class15_Sub1.aClass16_1763,
																	class37_sub4_sub6.aClass16_2620 }))),
											(byte) 123);
						Class37_Sub9_Sub3.method768(-52,
								("CS2 - scr:" + class37_sub4_sub6.aLong818
										+ " op:" + i_24_ + new String(rSString
										.method179((byte) -103))), exception);
					}
				}
			}
		}
	}

	public static void method777(int i) {
		aClass16_2975 = null;
		aClass16_2967 = null;
		anIntArray2983 = null;
		anIntArray2982 = null;
		anIntArray2981 = null;
		aClass16_2984 = null;
		aClass65_2973 = null;
		if (i != -90)
			method778(false);
	}

	public static void method778(boolean bool) {
		anInt2964++;
		Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method363(127);
		Class84.aClass15_1534 = null;
		Class37_Sub7.anInt1904 = 1;
		if (bool != false)
			aClass16_2984 = null;
	}

	public void method752(int i) {
		anInt2969++;
		method775((byte) -55);
		if (i != -2)
			method777(80);
	}

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		anInt2974++;
		int i_229_ = i;
		while_13_: do {
			while_12_: do {
				while_11_: do {
					while_10_: do {
						while_9_: do {
							while_8_: do {
								do {
									if (i_229_ != 0) {
										if (i_229_ != 1) {
											if ((i_229_ ^ 0xffffffff) != -3) {
												if ((i_229_ ^ 0xffffffff) != -4) {
													if (i_229_ != 4) {
														if ((i_229_ ^ 0xffffffff) != -6) {
															if ((i_229_ ^ 0xffffffff) != -7) {
																if (i_229_ != 7)
																	break while_13_;
															} else
																break while_11_;
															break while_12_;
														}
													} else
														break while_9_;
													break while_10_;
												}
											} else
												break;
											break while_8_;
										}
									} else {
										anInt2971 = class37_sub11
												.getUnsignedByte(121);
										break while_13_;
									}
									anInt2965 = class37_sub11.getUnsignedByte(126);
									break while_13_;
								} while (false);
								anInt2958 = class37_sub11.getUnsignedShort();
								break while_13_;
							} while (false);
							anInt2966 = class37_sub11.getUnsignedShort();
							break while_13_;
						} while (false);
						anInt2977 = class37_sub11.getUnsignedShort();
						break while_13_;
					} while (false);
					anInt2978 = class37_sub11.getUnsignedShort();
					break while_13_;
				} while (false);
				anInt2972 = class37_sub11.getUnsignedShort();
				break while_13_;
			} while (false);
			anInt2979 = class37_sub11.getUnsignedShort();
		} while (false);
		if (bool != true)
			method777(70);
	}

	static {
		aClass65_2973 = new Class65(64);
		anIntArray2981 = (new int[] { 5, 0, 0, 0, 20, 1, 0, 5, 0, 0, 6, 0, 0,
				0, 0, 3, 0, 7, 14, 0, 0, 0, 4, 0, 0, 0, 0, 0, 3, 0, 1, 0, 11,
				6, 0, -1, 10, 0, 15, 0, 0, 0, 1, 0, 6, 0, 0, 0, 6, 6, 0, 0, 0,
				0, 24, 4, -2, -1, 0, 0, 0, -2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 5, 0,
				0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 6,
				0, 0, -1, 0, -2, 0, 2, 0, 0, 0, 0, 0, 6, -2, 0, 0, 0, 0, 12, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -2, 6, 0, 4, 0,
				0, 0, 0, 2, 0, 0, 0, 0, -2, 0, 0, 0, 6, 2, 2, 0, 0, 0, -2, 4,
				-2, 0, 0, 8, 6, 0, 0, 0, 0, 5, 0, 0, -2, 4, 0, 0, 7, 0, 0, 0,
				0, 6, 0, 0, 0, 11, 0, 0, 0, 0, 5, 0, 2, 0, -1, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 7, 0, 0, 0, 0, -1, 0, 0, 0, 0, 3, -2, 0, 0, 0,
				0, 4, -2, -2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 10, 0, 2, 0, 3, 0,
				6 });
		anIntArray2982 = new int[5];
		anIntArray2983 = new int[] { 0, -1, 0, 1 };
		aClass16_2984 = Class37_Sub2.crateRSString((byte) 123, "jolt");
	}
}
