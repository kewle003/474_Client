/* Class37_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub5 extends Class37 {
	public byte[] aByteArray1863;
	public static int anInt1864;
	public static int anInt1865;
	public Class69 aClass69_1866;
	public int anInt1867;
	public Class15_Sub1 aClass15_Sub1_1868;
	public static int anInt1869;
	public static int anInt1870;
	public static Class37_Sub14 aClass37_Sub14_1871 = new Class37_Sub14(0, 0);
	public static RSString aClass16_1872;
	public static RSString aClass16_1873;
	public static RSString aClass16_1874 = (Class37_Sub2.crateRSString((byte) 114,
			"Zu viele Anmelde)2Versuche von Ihrer Adresse"));
	public static int anInt1875;
	public static RSString aClass16_1876;
	public static int anInt1877;
	public static int anInt1878;
	public static int[] anIntArray1879 = { -1, -1, -1, -1, -1, -1, -1, -1, 85,
			80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1,
			-1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1,
			-1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1,
			-1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55,
			56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1,
			-1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89,
			87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1,
			-1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1 };

	public static void method734(int i, RSInterface[] class18s, int i_0_) {
		anInt1865++;
		for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (class18s.length ^ 0xffffffff); i_1_++) {
			RSInterface rSInterface = class18s[i_1_];
			if (rSInterface != null
					&& (i_0_ ^ 0xffffffff) == (rSInterface.anInt394 ^ 0xffffffff)
					&& (!rSInterface.aBoolean374 || !Class66.method1188(0, rSInterface))) {
				if ((rSInterface.anInt354 ^ 0xffffffff) == -1) {
					if (!rSInterface.aBoolean374 && Class66.method1188(0, rSInterface)
							&& Class42.aClass18_942 != rSInterface)
						continue;
					method734(1115623280, class18s, rSInterface.anInt402);
					if (rSInterface.aClass18Array450 != null)
						method734(1115623280, rSInterface.aClass18Array450,
								rSInterface.anInt402);
					Class37_Sub6 class37_sub6 = ((Class37_Sub6) (Class76.aClass13_1423
							.method100((byte) 111, (long) rSInterface.anInt402)));
					if (class37_sub6 != null)
						Class37_Sub4_Sub15.method712((byte) 61,
								class37_sub6.anInt1884);
				}
				if (rSInterface.anInt354 == 6) {
					if ((rSInterface.anInt390 ^ 0xffffffff) != 0
							|| rSInterface.anInt419 != -1) {
						boolean bool = Class37_Sub4_Sub3.method470(rSInterface, i
								+ -1115623276);
						int i_2_;
						if (!bool)
							i_2_ = rSInterface.anInt390;
						else
							i_2_ = rSInterface.anInt419;
						if ((i_2_ ^ 0xffffffff) != 0) {
							Class37_Sub4_Sub12 class37_sub4_sub12 = Class37_Sub9_Sub22
									.method861(123, i_2_);
							rSInterface.anInt323 += Class37_Sub9_Sub37.anInt3589;
							while (((class37_sub4_sub12.anIntArray2780[rSInterface.anInt443]) ^ 0xffffffff) > (rSInterface.anInt323 ^ 0xffffffff)) {
								rSInterface.anInt323 -= (class37_sub4_sub12.anIntArray2780[rSInterface.anInt443]);
								rSInterface.anInt443++;
								if ((rSInterface.anInt443 ^ 0xffffffff) <= ((class37_sub4_sub12.anIntArray2761).length ^ 0xffffffff)) {
									rSInterface.anInt443 -= class37_sub4_sub12.anInt2777;
									if ((rSInterface.anInt443 ^ 0xffffffff) > -1
											|| (rSInterface.anInt443 >= (class37_sub4_sub12.anIntArray2761).length))
										rSInterface.anInt443 = 0;
								}
								Class73.refreshInterface(rSInterface, -1);
							}
						}
					}
					if (rSInterface.anInt344 != 0 && !rSInterface.aBoolean374) {
						int i_3_ = rSInterface.anInt344 >> -481958480;
						i_3_ *= Class37_Sub9_Sub37.anInt3589;
						int i_4_ = rSInterface.anInt344 << 1115623280 >> 1189254256;
						i_4_ *= Class37_Sub9_Sub37.anInt3589;
						rSInterface.anInt405 = i_4_ + rSInterface.anInt405 & 0x7ff;
						rSInterface.anInt319 = i_3_ + rSInterface.anInt319 & 0x7ff;
						Class73.refreshInterface(rSInterface, -1);
					}
				}
			}
		}
		if (i != 1115623280)
			method737(-64);
	}

	public static void method735(int i, Class15 class15) {
		anInt1870++;
		Class37_Sub16.aClass15_2152 = class15;
		if (i > -31)
			method736(null, 85, 97, -90, null, -69, 105);
	}

	public static void method736(byte[] is, int i, int i_5_, int i_6_,
			Class20[] class20s, int i_7_, int i_8_) {
		do {
			try {
				for (int i_9_ = 0; i_9_ < 4; i_9_++) {
					for (int i_10_ = 0; i_10_ < 64; i_10_++) {
						for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -65; i_11_++) {
							if (i_10_ + i_8_ > 0 && i_8_ + i_10_ < 103
									&& i_6_ + i_11_ > 0
									&& (i_6_ + i_11_ ^ 0xffffffff) > -104)
								class20s[i_9_].anIntArrayArray554[i_10_ + i_8_][i_6_
										+ i_11_] = (Class37_Sub4_Sub7
										.method490(
												(class20s[i_9_].anIntArrayArray554[i_10_
														+ i_8_][i_6_ + i_11_]),
												-16777217));
						}
					}
				}
				anInt1869++;
				ByteVector class37_sub11 = new ByteVector(is);
				for (int i_12_ = 0; i_12_ < 4; i_12_++) {
					for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -65; i_13_++) {
						for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -65; i_14_++)
							Class87.method1325(i_5_, i_7_, 0, i_8_ + i_13_,
									i_12_, -9890, class37_sub11, i_14_ - -i_6_);
					}
				}
				if (i == -1)
					break;
				method738((byte) -105, 9);
			} catch (RuntimeException runtimeexception) {
				throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						("dh.B(" + (is != null ? "{...}" : "null") + ',' + i
								+ ',' + i_5_ + ',' + i_6_ + ','
								+ (class20s != null ? "{...}" : "null") + ','
								+ i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method737(int i) {
		anIntArray1879 = null;
		int i_15_ = -43 % ((i - 3) / 44);
		aClass16_1873 = null;
		aClass16_1872 = null;
		aClass16_1876 = null;
		aClass37_Sub14_1871 = null;
		aClass16_1874 = null;
	}

	public static void method738(byte i, int i_16_) {
		anInt1864++;
		if ((i_16_ ^ 0xffffffff) <= -1) {
			int i_17_ = Landscape.anIntArray1128[i_16_];
			int i_18_ = Class37_Sub4_Sub14.anIntArray2809[i_16_];
			int i_19_ = Class37_Sub9_Sub20.anIntArray3300[i_16_];
			if (i >= -47)
				method734(1, null, 94);
			if ((i_19_ ^ 0xffffffff) <= -2001)
				i_19_ -= 2000;
			int i_20_ = Class62.anIntArray1183[i_16_];
			if (i_19_ == 1) {
				Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]);
				if (class37_sub4_sub7_sub1_sub1 != null) {
					Class37_Sub4_Sub8.anInt2646++;
					ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false,
									2,
									0,
									1,
									0,
									class37_sub4_sub7_sub1_sub1.anIntArray3669[0],
									0, 1, true);
					Class37_Sub9_Sub8.anInt3057 = 0;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class19.anInt490 = 2;
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 160);
					Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false);
				}
			}
			if ((i_19_ ^ 0xffffffff) == -44) {
				Class50.anInt1024++;
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 141);
				Class42.aClass37_Sub11_Sub1_936.method945(19058, i_20_);
				Class42.aClass37_Sub11_Sub1_936.method945(19058, i_17_);
				Class42.aClass37_Sub11_Sub1_936.method947((byte) 87, i_18_);
				Class42.anInt939 = 0;
				Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
						.getInterface(i_18_, 4096);
				Class2.anInt75 = i_17_;
			}
			if (i_19_ == 1005) {
				RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_18_, 4096);
				if (rSInterface != null && rSInterface.anIntArray422[i_17_] >= 100000)
					Class37_Sub4_Sub7_Sub1_Sub1
							.method505(
									Class37_Sub9_Sub8.aClass16_3045,
									0,
									(Class37_Sub9_Sub27
											.method881(
													116,
													(new RSString[] {
															Class37_Sub9_Sub24
																	.method870(
																			(rSInterface.anIntArray422[i_17_]),
																			(byte) -114),
															Class37_Sub9_Sub7.aClass16_3040,
															(Class46
																	.loadItem(
																			i_20_,
																			(byte) 92).itemName) }))),
									(byte) -26);
				else {
					Class37_Sub9_Sub22.anInt3339++;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 47);
					Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
				}
				Class42.anInt939 = 0;
				Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
						.getInterface(i_18_, 4096);
				Class2.anInt75 = i_17_;
			}
			if ((i_19_ ^ 0xffffffff) == -51
					&& Class37_Sub4_Sub10.method676(i_20_, i_17_, i_18_, 0)) {
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 134);
				Class42.aClass37_Sub11_Sub1_936.method945(19058, i_17_
						+ Class37_Sub18.anInt2200);
				Class42.aClass37_Sub11_Sub1_936.method945(19058,
						Class9.anInt174);
				Class37_Sub9_Sub7.anInt3028++;
				Class42.aClass37_Sub11_Sub1_936.method962(
						0x7fff & i_20_ >> 196251534, false);
				Class42.aClass37_Sub11_Sub1_936.method957(true, i_18_
						+ Class15_Sub1.anInt1738);
				Class42.aClass37_Sub11_Sub1_936.method943(
						Class37_Sub9_Sub21.anInt3317, -103);
				Class42.aClass37_Sub11_Sub1_936.method962(Class57.anInt1101,
						false);
			}
			if ((i_19_ ^ 0xffffffff) == -59) {
				Class37_Sub9_Sub34.anInt3543++;
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 55);
				Class42.aClass37_Sub11_Sub1_936.method965(848881960, i_17_);
				Class42.aClass37_Sub11_Sub1_936.method966(false, i_18_);
				Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false);
				Class42.anInt939 = 0;
				Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
						.getInterface(i_18_, 4096);
				Class2.anInt75 = i_17_;
			}
			if (i_19_ == 6) {
				Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]);
				if (class37_sub4_sub7_sub1_sub1 != null) {
					ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false,
									2,
									0,
									1,
									0,
									class37_sub4_sub7_sub1_sub1.anIntArray3669[0],
									0, 1, true);
					Class37_Sub7.anInt1900++;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Class37_Sub9_Sub8.anInt3057 = 0;
					Class19.anInt490 = 2;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 157);
					Class42.aClass37_Sub11_Sub1_936.method965(848881960,
							Class21.anInt558);
					Class42.aClass37_Sub11_Sub1_936.method973(Class32.anInt737,
							-1629130328);
					Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
				}
			}
			if (i_19_ == 47) {
				Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_];
				if (class37_sub4_sub7_sub1_sub2 != null) {
					ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false,
									2,
									0,
									1,
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3669[0],
									0, 1, true);
					Class37_Sub9_Sub8.anInt3057 = 0;
					Class62.anInt1174++;
					Class19.anInt490 = 2;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 244);
					Class42.aClass37_Sub11_Sub1_936.method945(19058, i_20_);
				}
			}
			if (i_19_ == 15) {
				Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_];
				if (class37_sub4_sub7_sub1_sub2 != null) {
					Applet_Sub1.anInt20++;
					ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false,
									2,
									0,
									1,
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3669[0],
									0, 1, true);
					Class19.anInt490 = 2;
					Class37_Sub9_Sub8.anInt3057 = 0;
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 84);
					Class42.aClass37_Sub11_Sub1_936.method965(848881960, i_20_);
				}
			}
			if ((i_19_ ^ 0xffffffff) == -39) {
				Class36.anInt806++;
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 89);
				Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
				Class42.aClass37_Sub11_Sub1_936.method947((byte) -114, i_18_);
				Class42.aClass37_Sub11_Sub1_936.method945(19058, i_17_);
				Class42.anInt939 = 0;
				Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
						.getInterface(i_18_, 4096);
				Class2.anInt75 = i_17_;
			}
			if ((i_19_ ^ 0xffffffff) == -50) {
				Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_];
				if (class37_sub4_sub7_sub1_sub2 != null) {
					Class37_Sub9_Sub19.anInt3270++;
					ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false,
									2,
									0,
									1,
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3669[0],
									0, 1, true);
					Class37_Sub9_Sub8.anInt3057 = 0;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Class19.anInt490 = 2;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 214);
					Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
				}
			}
			if (i_19_ == 24) {
				boolean bool = (ByteVector_Sub1
						.method434(
								(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
								0,
								i_17_,
								(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
								false, 2, 0, 0, 0, i_18_, 0, 0, true));
				Class8.anInt159++;
				if (!bool)
					bool = (ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									i_17_,
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false, 2, 0, 1, 0, i_18_, 0, 1, true));
				Class37_Sub9_Sub8.anInt3057 = 0;
				Applet_Sub1.anInt8 = Class33.anInt764;
				Class19.anInt490 = 2;
				Class27.anInt676 = Class37_Sub13.anInt2113;
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 105);
				Class42.aClass37_Sub11_Sub1_936.method945(19058, i_20_);
				Class42.aClass37_Sub11_Sub1_936.method962(
						Class37_Sub18.anInt2200 + i_17_, false);
				Class42.aClass37_Sub11_Sub1_936.method962(i_18_
						+ Class15_Sub1.anInt1738, false);
			}
			if ((i_19_ ^ 0xffffffff) == -19) {
				Class37_Sub9_Sub19.anInt3268++;
				boolean bool = (ByteVector_Sub1
						.method434(
								(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
								0,
								i_17_,
								(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
								false, 2, 0, 0, 0, i_18_, 0, 0, true));
				if (!bool)
					bool = (ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									i_17_,
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false, 2, 0, 1, 0, i_18_, 0, 1, true));
				Applet_Sub1.anInt8 = Class33.anInt764;
				Class27.anInt676 = Class37_Sub13.anInt2113;
				Class19.anInt490 = 2;
				Class37_Sub9_Sub8.anInt3057 = 0;
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 230);
				Class42.aClass37_Sub11_Sub1_936.method945(19058, i_20_);
				Class42.aClass37_Sub11_Sub1_936.method962(i_17_
						+ Class37_Sub18.anInt2200, false);
				Class42.aClass37_Sub11_Sub1_936.method945(19058, i_18_
						+ Class15_Sub1.anInt1738);
			}
			if (i_19_ == 34) {
				Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_];
				if (class37_sub4_sub7_sub1_sub2 != null) {
					Class85.anInt1543++;
					ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false,
									2,
									0,
									1,
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3669[0],
									0, 1, true);
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class37_Sub9_Sub8.anInt3057 = 0;
					Class19.anInt490 = 2;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 35);
					Class42.aClass37_Sub11_Sub1_936.method947((byte) 46,
							Class32.anInt737);
					Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
					Class42.aClass37_Sub11_Sub1_936.method957(true,
							Class21.anInt558);
				}
			}
			if ((i_19_ ^ 0xffffffff) == -58) {
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 71);
				Class42.aClass37_Sub11_Sub1_936.method973(i_18_, -1629130328);
				Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
				RSItem.anInt2513++;
				Class42.aClass37_Sub11_Sub1_936.method962(i_17_, false);
				Class42.anInt939 = 0;
				Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
						.getInterface(i_18_, 4096);
				Class2.anInt75 = i_17_;
			}
			if (i_19_ == 25 && Class79.aClass18_1489 == null) {
				Class37_Sub9_Sub11.method808(false, i_17_, i_18_);
				Class79.aClass18_1489 = Class37_Sub9_Sub35.method914(i_18_,
						(byte) 125, i_17_);
				Class73.refreshInterface(Class79.aClass18_1489, -1);
			}
			if ((i_19_ ^ 0xffffffff) == -10) {
				Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]);
				if (class37_sub4_sub7_sub1_sub1 != null) {
					ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false,
									2,
									0,
									1,
									0,
									class37_sub4_sub7_sub1_sub1.anIntArray3669[0],
									0, 1, true);
					Class37_Sub9_Sub8.anInt3057 = 0;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class37_Sub9_Sub29.anInt3445++;
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Class19.anInt490 = 2;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 24);
					Class42.aClass37_Sub11_Sub1_936.method945(19058, i_20_);
				}
			}
			if ((i_19_ ^ 0xffffffff) == -22) {
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 125);
				Class42.aClass37_Sub11_Sub1_936.method973(i_18_, -1629130328);
				Class42.aClass37_Sub11_Sub1_936.method945(19058, i_17_);
				Class42.aClass37_Sub11_Sub1_936.method945(19058, i_20_);
				Class37_Sub9_Sub2.anInt2929++;
				Class42.anInt939 = 0;
				Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
						.getInterface(i_18_, 4096);
				Class2.anInt75 = i_17_;
			}
			if ((i_19_ ^ 0xffffffff) == -45) {
				Class37_Sub9_Sub17.anInt3221++;
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 206);
				Class42.aClass37_Sub11_Sub1_936.method965(848881960,
						Class9.anInt174);
				Class42.aClass37_Sub11_Sub1_936.method943(i_18_, 125);
				Class42.aClass37_Sub11_Sub1_936.method957(true,
						Class57.anInt1101);
				Class42.aClass37_Sub11_Sub1_936.method962(i_17_, false);
				Class42.aClass37_Sub11_Sub1_936.method943(
						Class37_Sub9_Sub21.anInt3317, 125);
				Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
				Class42.anInt939 = 0;
				Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
						.getInterface(i_18_, 4096);
				Class2.anInt75 = i_17_;
			}
			if (i_19_ == 36) {
				Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_];
				if (class37_sub4_sub7_sub1_sub2 != null) {
					ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false,
									2,
									0,
									1,
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3669[0],
									0, 1, true);
					Class37_Sub9_Sub4.anInt2960++;
					Class37_Sub9_Sub8.anInt3057 = 0;
					Class19.anInt490 = 2;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 211);
					Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
				}
			}
			if (i_19_ == 1001) {
				Class21.anInt562++;
				Class37_Sub4_Sub10.method676(i_20_, i_17_, i_18_, 0);
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 4);
				Class42.aClass37_Sub11_Sub1_936.method957(true,
						Class37_Sub18.anInt2200 + i_17_);
				Class42.aClass37_Sub11_Sub1_936.method962(
						i_20_ >> -1202336402 & 0x7fff, false);
				Class42.aClass37_Sub11_Sub1_936.method962(
						Class15_Sub1.anInt1738 + i_18_, false);
			}
			if (i_19_ == 1007) {
				Class37_Sub9_Sub8.anInt3057 = 0;
				Class27.anInt676 = Class37_Sub13.anInt2113;
				Class19.anInt490 = 2;
				Applet_Sub1.anInt8 = Class33.anInt764;
				Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]);
				if (class37_sub4_sub7_sub1_sub1 != null) {
					Class37_Sub4_Sub15 class37_sub4_sub15 = class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955;
					if (class37_sub4_sub15.anIntArray2824 != null)
						class37_sub4_sub15 = class37_sub4_sub15
								.method719((byte) -114);
					if (class37_sub4_sub15 != null) {
						Class37_Sub9_Sub26.anInt3393++;
						Class42.aClass37_Sub11_Sub1_936.method989(-1494101117,
								178);
						Class42.aClass37_Sub11_Sub1_936.method945(19058,
								class37_sub4_sub15.anInt2842);
					}
				}
			}
			if ((i_19_ ^ 0xffffffff) == -41) {
				Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_];
				if (class37_sub4_sub7_sub1_sub2 != null) {
					ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false,
									2,
									0,
									1,
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3669[0],
									0, 1, true);
					RSItem.anInt2448++;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class37_Sub9_Sub8.anInt3057 = 0;
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Class19.anInt490 = 2;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 116);
					Class42.aClass37_Sub11_Sub1_936.method965(848881960, i_20_);
				}
			}
			if (i_19_ == 7) {
				Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_];
				if (class37_sub4_sub7_sub1_sub2 != null) {
					Class37_Sub23.anInt2223++;
					ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false,
									2,
									0,
									1,
									0,
									class37_sub4_sub7_sub1_sub2.anIntArray3669[0],
									0, 1, true);
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Class37_Sub9_Sub8.anInt3057 = 0;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class19.anInt490 = 2;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 185);
					Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
				}
			}
			if (i_19_ == 12) {
				Class37_Sub10.anInt1989++;
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 41);
				Class42.aClass37_Sub11_Sub1_936.method945(19058, i_17_);
				Class42.aClass37_Sub11_Sub1_936.method945(19058, i_20_);
				Class42.aClass37_Sub11_Sub1_936.method947((byte) 21, i_18_);
				Class42.anInt939 = 0;
				Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
						.getInterface(i_18_, 4096);
				Class2.anInt75 = i_17_;
			}
			if (i_19_ == 30) {
				client.anInt1724++;
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 124);
				Class42.aClass37_Sub11_Sub1_936.method957(true, i_17_);
				Class42.aClass37_Sub11_Sub1_936.method965(848881960, i_20_);
				Class42.aClass37_Sub11_Sub1_936.method966(false, i_18_);
				Class42.anInt939 = 0;
				Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
						.getInterface(i_18_, 4096);
				Class2.anInt75 = i_17_;
			}
			if ((i_19_ ^ 0xffffffff) == -30) {
				Class64.anInt1215++;
				boolean bool = (ByteVector_Sub1
						.method434(
								(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
								0,
								i_17_,
								(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
								false, 2, 0, 0, 0, i_18_, 0, 0, true));
				if (!bool)
					bool = (ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									i_17_,
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false, 2, 0, 1, 0, i_18_, 0, 1, true));
				Class27.anInt676 = Class37_Sub13.anInt2113;
				Applet_Sub1.anInt8 = Class33.anInt764;
				Class37_Sub9_Sub8.anInt3057 = 0;
				Class19.anInt490 = 2;
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 208);
				Class42.aClass37_Sub11_Sub1_936.method965(848881960,
						Class9.anInt174);
				Class42.aClass37_Sub11_Sub1_936.method945(19058,
						Class15_Sub1.anInt1738 + i_18_);
				Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false);
				Class42.aClass37_Sub11_Sub1_936.method957(true, i_17_
						+ Class37_Sub18.anInt2200);
				Class42.aClass37_Sub11_Sub1_936.method966(false,
						Class37_Sub9_Sub21.anInt3317);
				Class42.aClass37_Sub11_Sub1_936.method945(19058,
						Class57.anInt1101);
			}
			if ((i_19_ ^ 0xffffffff) == -18) {
				Class4.anInt100++;
				Class37_Sub4_Sub10.method676(i_20_, i_17_, i_18_, 0);
				Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 145);
				Class42.aClass37_Sub11_Sub1_936.method965(848881960, i_17_
						- -Class37_Sub18.anInt2200);
				Class42.aClass37_Sub11_Sub1_936.method962(i_18_
						- -Class15_Sub1.anInt1738, false);
				Class42.aClass37_Sub11_Sub1_936.method965(848881960,
						(0x1fffd1cc & i_20_) >> 169262414);
			}
			if (i_19_ == 13) {
				RSInterface rSInterface = Class37_Sub9_Sub35.method914(i_18_,
						(byte) -82, i_17_);
				if (rSInterface != null) {
					ByteVector_Sub1.method436(1);
					Class37_Sub11_Sub1.method987(i_17_, i_18_, Class10
							.method85(RuntimeException_Sub1.method1339(rSInterface,
									25), false), 18193);
					Class37_Sub14.anInt2122 = 0;
					Class37_Sub9_Sub1.aClass16_2912 = Class37_Sub9_Sub37
							.method924(rSInterface, (byte) 57);
					if (Class37_Sub9_Sub1.aClass16_2912 == null)
						Class37_Sub9_Sub1.aClass16_2912 = Class35.aClass16_790;
					if (rSInterface.aBoolean374)
						Class60.aClass16_1142 = (Class37_Sub9_Sub27.method881(
								-20, new RSString[] { rSInterface.aClass16_391,
										Class25.aClass16_636 }));
					else
						Class60.aClass16_1142 = (Class37_Sub9_Sub27.method881(
								-49, new RSString[] { Class82.aClass16_1690,
										rSInterface.aClass16_436,
										Class25.aClass16_636 }));
				}
			} else {
				if (i_19_ == 14)
					Class62.method1173(-9);
				if (i_19_ == 1002) {
					Class37_Sub9_Sub22.anInt3339++;
					Class19.anInt490 = 2;
					Class37_Sub9_Sub8.anInt3057 = 0;
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 47);
					Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
				}
				if (i_19_ == 20) {
					Class37_Sub9_Sub12.anInt3114++;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 215);
					Class42.aClass37_Sub11_Sub1_936.method947((byte) -114,
							i_18_);
					RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_18_, 4096);
					if (rSInterface.anIntArrayArray434 != null
							&& ((rSInterface.anIntArrayArray434[0][0] ^ 0xffffffff) == -6)) {
						int i_21_ = rSInterface.anIntArrayArray434[0][1];
						Class37_Sub23.anIntArray2237[i_21_] = 1 - Class37_Sub23.anIntArray2237[i_21_];
						Class65.method1183(i_21_, (byte) -3);
					}
				}
				if ((i_19_ ^ 0xffffffff) == -3)
					Class38.aClass67_847.method1204(
							Class37_Sub9_Sub1.anInt2916, i_17_, i_18_);
				if ((i_19_ ^ 0xffffffff) == -40) {
					Class19.anInt473++;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 107);
					Class42.aClass37_Sub11_Sub1_936.method945(19058, i_17_);
					Class42.aClass37_Sub11_Sub1_936.method947((byte) 68, i_18_);
					Class42.aClass37_Sub11_Sub1_936.method965(848881960, i_20_);
					Class42.anInt939 = 0;
					Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
							.getInterface(i_18_, 4096);
					Class2.anInt75 = i_17_;
				}
				if (i_19_ == 46) {
					boolean bool = true;
					RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_18_, 4096);
					if ((rSInterface.anInt376 ^ 0xffffffff) < -1)
						bool = Class37_Sub25.method1042(3, rSInterface);
					if (bool) {
						Class42.aClass37_Sub11_Sub1_936.method989(-1494101117,
								215);
						Class37_Sub9_Sub12.anInt3114++;
						Class42.aClass37_Sub11_Sub1_936.method947((byte) 101,
								i_18_);
					}
				}
				if ((i_19_ ^ 0xffffffff) == -38) {
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 241);
					Class37_Sub7.anInt1916++;
					Class42.aClass37_Sub11_Sub1_936.method965(848881960, i_17_);
					Class42.aClass37_Sub11_Sub1_936.method973(i_18_, -1629130328);
					Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
					Class42.anInt939 = 0;
					Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14.getInterface(i_18_, 4096);
					Class2.anInt75 = i_17_;
				}
				if ((i_19_ ^ 0xffffffff) == -27) {
					Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]);
					if (class37_sub4_sub7_sub1_sub1 != null) {
						ByteVector_Sub1
								.method434(
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
										0,
										class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
										false,
										2,
										0,
										1,
										0,
										class37_sub4_sub7_sub1_sub1.anIntArray3669[0],
										0, 1, true);
						Class37_Sub9_Sub8.anInt3057 = 0;
						Class27.anInt676 = Class37_Sub13.anInt2113;
						Class37_Sub9_Sub25.anInt3384++;
						Class19.anInt490 = 2;
						Applet_Sub1.anInt8 = Class33.anInt764;
						Class42.aClass37_Sub11_Sub1_936.method989(-1494101117,
								196);
						Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false);
					}
				}
				if (i_19_ == 48) {
					Class37_Sub4_Sub10.method676(i_20_, i_17_, i_18_, 0);
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 31);
					Class42.aClass37_Sub11_Sub1_936.method957(true, i_17_
							- -Class37_Sub18.anInt2200);
					Class37_Sub13.anInt2107++;
					Class42.aClass37_Sub11_Sub1_936.method965(848881960,
							0x7fff & i_20_ >> -2014034258);
					Class42.aClass37_Sub11_Sub1_936.method965(848881960, i_18_
							- -Class15_Sub1.anInt1738);
				}
				if ((i_19_ ^ 0xffffffff) == -42) {
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 102);
					Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
					Class15.anInt262++;
					Class42.aClass37_Sub11_Sub1_936.method943(i_18_, 127);
					Class42.aClass37_Sub11_Sub1_936.method965(848881960, i_17_);
					Class42.anInt939 = 0;
					Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
							.getInterface(i_18_, 4096);
					Class2.anInt75 = i_17_;
				}
				if (i_19_ == 11) {
					Class37_Sub4_Sub10.method676(i_20_, i_17_, i_18_, 0);
					Class14.anInt243++;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 203);
					Class42.aClass37_Sub11_Sub1_936.method965(848881960, i_17_
							- -Class37_Sub18.anInt2200);
					Class42.aClass37_Sub11_Sub1_936.method962(
							i_20_ >> -2083371858 & 0x7fff, false);
					Class42.aClass37_Sub11_Sub1_936.method945(19058,
							Class15_Sub1.anInt1738 + i_18_);
				}
				if (i_19_ == 23
						&& Class37_Sub4_Sub10.method676(i_20_, i_17_, i_18_, 0)) {
					Class66.anInt1244++;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 205);
					Class42.aClass37_Sub11_Sub1_936.method945(19058,
							(i_20_ & 0x1fffcfc5) >> -2025098802);
					Class42.aClass37_Sub11_Sub1_936.method957(true, i_17_
							+ Class37_Sub18.anInt2200);
					Class42.aClass37_Sub11_Sub1_936.method966(false,
							Class32.anInt737);
					Class42.aClass37_Sub11_Sub1_936.method945(19058,
							Class21.anInt558);
					Class42.aClass37_Sub11_Sub1_936.method957(true,
							Class15_Sub1.anInt1738 + i_18_);
				}
				if ((i_19_ ^ 0xffffffff) == -9) {
					Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]);
					if (class37_sub4_sub7_sub1_sub1 != null) {
						Class55.anInt1068++;
						ByteVector_Sub1
								.method434(
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
										0,
										class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
										false,
										2,
										0,
										1,
										0,
										class37_sub4_sub7_sub1_sub1.anIntArray3669[0],
										0, 1, true);
						Class37_Sub9_Sub8.anInt3057 = 0;
						Class27.anInt676 = Class37_Sub13.anInt2113;
						Class19.anInt490 = 2;
						Applet_Sub1.anInt8 = Class33.anInt764;
						Class42.aClass37_Sub11_Sub1_936.method989(-1494101117,
								56);
						Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false);
					}
				}
				if ((i_19_ ^ 0xffffffff) == -29) {
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 238);
					Class37_Sub1.anInt1800++;
					Class42.aClass37_Sub11_Sub1_936.method966(false, i_18_);
					Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false);
					Class42.aClass37_Sub11_Sub1_936.method962(Class21.anInt558,
							false);
					Class42.aClass37_Sub11_Sub1_936.method965(848881960, i_17_);
					Class42.aClass37_Sub11_Sub1_936.method947((byte) -111,
							Class32.anInt737);
					Class42.anInt939 = 0;
					Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
							.getInterface(i_18_, 4096);
					Class2.anInt75 = i_17_;
				}
				if ((i_19_ ^ 0xffffffff) == -4) {
					Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_];
					if (class37_sub4_sub7_sub1_sub2 != null) {
						ByteVector_Sub1
								.method434(
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
										0,
										class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
										false,
										2,
										0,
										1,
										0,
										class37_sub4_sub7_sub1_sub2.anIntArray3669[0],
										0, 1, true);
						Class9.anInt184++;
						Class27.anInt676 = Class37_Sub13.anInt2113;
						Class19.anInt490 = 2;
						Class37_Sub9_Sub8.anInt3057 = 0;
						Applet_Sub1.anInt8 = Class33.anInt764;
						Class42.aClass37_Sub11_Sub1_936.method989(-1494101117,
								96);
						Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
					}
				}
				if ((i_19_ ^ 0xffffffff) == -36) {
					Class17.anInt305++;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 242);
					Class42.aClass37_Sub11_Sub1_936.method965(848881960,
							Class21.anInt558);
					Class42.aClass37_Sub11_Sub1_936.method943(i_18_, 125);
					Class42.aClass37_Sub11_Sub1_936.method965(848881960, i_17_);
					Class42.aClass37_Sub11_Sub1_936.method966(false,
							Class32.anInt737);
				}
				if ((i_19_ ^ 0xffffffff) == -43) {
					boolean bool = (ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									i_17_,
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false, 2, 0, 0, 0, i_18_, 0, 0, true));
					if (!bool)
						bool = (ByteVector_Sub1
								.method434(
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
										0,
										i_17_,
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
										false, 2, 0, 1, 0, i_18_, 0, 1, true));
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class19.anInt490 = 2;
					Class37_Sub9_Sub8.anInt3057 = 0;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 254);
					Class42.aClass37_Sub11_Sub1_936.method945(19058,
							Class37_Sub18.anInt2200 + i_17_);
					Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
					Class37_Sub4_Sub7_Sub3.anInt3743++;
					Class42.aClass37_Sub11_Sub1_936.method965(848881960, i_18_
							+ Class15_Sub1.anInt1738);
				}
				if ((i_19_ ^ 0xffffffff) == -17 || i_19_ == 1006)
					Class37_Sub4_Sub5.method485(i_20_, i_18_, i_17_,
							(byte) 108,
							(Class37_Sub9_Sub37.aClass16Array3593[i_16_]));
				if (i_19_ == 4) {
					Class37_Sub4_Sub15.anInt2843++;
					boolean bool = (ByteVector_Sub1
							.method434(
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
									0,
									i_17_,
									(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
									false, 2, 0, 0, 0, i_18_, 0, 0, true));
					if (!bool)
						bool = (ByteVector_Sub1
								.method434(
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
										0,
										i_17_,
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
										false, 2, 0, 1, 0, i_18_, 0, 1, true));
					Class37_Sub9_Sub8.anInt3057 = 0;
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class19.anInt490 = 2;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 8);
					Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false);
					Class42.aClass37_Sub11_Sub1_936.method962(i_18_
							- -Class15_Sub1.anInt1738, false);
					Class42.aClass37_Sub11_Sub1_936.method962(i_17_
							+ Class37_Sub18.anInt2200, false);
				}
				if ((i_19_ ^ 0xffffffff) == -1004) {
					Class19.anInt490 = 2;
					Applet_Sub1.anInt8 = Class33.anInt764;
					Class37_Sub2.anInt1814++;
					Class37_Sub9_Sub8.anInt3057 = 0;
					Class27.anInt676 = Class37_Sub13.anInt2113;
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 226);
					Class42.aClass37_Sub11_Sub1_936.method962(
							i_20_ >> 938302542 & 0x7fff, false);
				}
				if (i_19_ == 5) {
					ByteVector_Sub1.method436(1);
					RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_18_, 4096);
					Class37_Sub14.anInt2122 = 1;
					Class37_Sub9_Sub21.anInt3317 = i_18_;
					Class57.anInt1101 = i_20_;
					Class9.anInt174 = i_17_;
					Class73.refreshInterface(rSInterface, -1);
					Class64.aClass16_1218 = (Class37_Sub9_Sub27
							.method881(110,
									new RSString[] {
											Class37_Sub4_Sub2.aClass16_2537,
											(Class46.loadItem(i_20_,
													(byte) 96).itemName),
											Class25.aClass16_636 }));
					if (Class64.aClass16_1218 == null)
						Class64.aClass16_1218 = Class37_Sub9_Sub17.aClass16_3226;
				} else {
					if ((i_19_ ^ 0xffffffff) == -34) {
						Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]);
						if (class37_sub4_sub7_sub1_sub1 != null) {
							Class37_Sub9_Sub30.anInt3467++;
							ByteVector_Sub1
									.method434(
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
											0,
											class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
											false,
											2,
											0,
											1,
											0,
											class37_sub4_sub7_sub1_sub1.anIntArray3669[0],
											0, 1, true);
							Applet_Sub1.anInt8 = Class33.anInt764;
							Class37_Sub9_Sub8.anInt3057 = 0;
							Class19.anInt490 = 2;
							Class27.anInt676 = Class37_Sub13.anInt2113;
							Class42.aClass37_Sub11_Sub1_936.method989(
									-1494101117, 13);
							Class42.aClass37_Sub11_Sub1_936.method962(i_20_,
									false);
							Class42.aClass37_Sub11_Sub1_936.method973(
									Class37_Sub9_Sub21.anInt3317, -1629130328);
							Class42.aClass37_Sub11_Sub1_936.method962(
									Class9.anInt174, false);
							Class42.aClass37_Sub11_Sub1_936.method945(19058,
									Class57.anInt1101);
						}
					}
					if ((i_19_ ^ 0xffffffff) == -11) {
						Class37_Sub9_Sub12.anInt3114++;
						Class42.aClass37_Sub11_Sub1_936.method989(-1494101117,
								215);
						Class42.aClass37_Sub11_Sub1_936.method947((byte) 118,
								i_18_);
						RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_18_,
								4096);
						if (rSInterface.anIntArrayArray434 != null
								&& ((rSInterface.anIntArrayArray434[0][0] ^ 0xffffffff) == -6)) {
							int i_22_ = rSInterface.anIntArrayArray434[0][1];
							if (rSInterface.anIntArray451[0] != Class37_Sub23.anIntArray2237[i_22_]) {
								Class37_Sub23.anIntArray2237[i_22_] = rSInterface.anIntArray451[0];
								Class65.method1183(i_22_, (byte) -3);
							}
						}
					}
					if ((i_19_ ^ 0xffffffff) == -23) {
						Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_]);
						if (class37_sub4_sub7_sub1_sub2 != null) {
							Class39.anInt862++;
							ByteVector_Sub1
									.method434(
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
											0,
											class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
											false,
											2,
											0,
											1,
											0,
											class37_sub4_sub7_sub1_sub2.anIntArray3669[0],
											0, 1, true);
							Class27.anInt676 = Class37_Sub13.anInt2113;
							Class37_Sub9_Sub8.anInt3057 = 0;
							Class19.anInt490 = 2;
							Applet_Sub1.anInt8 = Class33.anInt764;
							Class42.aClass37_Sub11_Sub1_936.method989(
									-1494101117, 204);
							Class42.aClass37_Sub11_Sub1_936.method965(
									848881960, Class57.anInt1101);
							Class42.aClass37_Sub11_Sub1_936.method945(19058,
									i_20_);
							Class42.aClass37_Sub11_Sub1_936.method943(
									Class37_Sub9_Sub21.anInt3317, -14);
							Class42.aClass37_Sub11_Sub1_936.method945(19058,
									Class9.anInt174);
						}
					}
					if (i_19_ == 51) {
						Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]);
						if (class37_sub4_sub7_sub1_sub1 != null) {
							ByteVector_Sub1
									.method434(
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
											0,
											class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
											false,
											2,
											0,
											1,
											0,
											class37_sub4_sub7_sub1_sub1.anIntArray3669[0],
											0, 1, true);
							Class37_Sub7.anInt1915++;
							Class19.anInt490 = 2;
							Applet_Sub1.anInt8 = Class33.anInt764;
							Class27.anInt676 = Class37_Sub13.anInt2113;
							Class37_Sub9_Sub8.anInt3057 = 0;
							Class42.aClass37_Sub11_Sub1_936.method989(
									-1494101117, 21);
							Class42.aClass37_Sub11_Sub1_936.method965(
									848881960, i_20_);
						}
					}
					if (i_19_ == 45) {
						Class37_Sub9_Sub8.anInt3047++;
						boolean bool = (ByteVector_Sub1
								.method434(
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
										0,
										i_17_,
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
										false, 2, 0, 0, 0, i_18_, 0, 0, true));
						if (!bool)
							bool = (ByteVector_Sub1
									.method434(
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
											0,
											i_17_,
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
											false, 2, 0, 1, 0, i_18_, 0, 1, true));
						Class19.anInt490 = 2;
						Class37_Sub9_Sub8.anInt3057 = 0;
						Class27.anInt676 = Class37_Sub13.anInt2113;
						Applet_Sub1.anInt8 = Class33.anInt764;
						Class42.aClass37_Sub11_Sub1_936.method989(-1494101117,
								175);
						Class42.aClass37_Sub11_Sub1_936.method945(19058, i_20_);
						Class42.aClass37_Sub11_Sub1_936.method965(848881960,
								Class15_Sub1.anInt1738 + i_18_);
						Class42.aClass37_Sub11_Sub1_936.method957(true, i_17_
								- -Class37_Sub18.anInt2200);
					}
					if ((i_19_ ^ 0xffffffff) == -33) {
						Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_]);
						if (class37_sub4_sub7_sub1_sub2 != null) {
							Class37_Sub9_Sub13.anInt3127++;
							ByteVector_Sub1
									.method434(
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
											0,
											class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
											false,
											2,
											0,
											1,
											0,
											class37_sub4_sub7_sub1_sub2.anIntArray3669[0],
											0, 1, true);
							Class19.anInt490 = 2;
							Applet_Sub1.anInt8 = Class33.anInt764;
							Class27.anInt676 = Class37_Sub13.anInt2113;
							Class37_Sub9_Sub8.anInt3057 = 0;
							Class42.aClass37_Sub11_Sub1_936.method989(
									-1494101117, 247);
							Class42.aClass37_Sub11_Sub1_936.method945(19058,
									i_20_);
						}
					}
					if ((i_19_ ^ 0xffffffff) == -20) {
						Class49.anInt1010++;
						Class37_Sub4_Sub10.method676(i_20_, i_17_, i_18_, 0);
						Class42.aClass37_Sub11_Sub1_936.method989(-1494101117,
								174);
						Class42.aClass37_Sub11_Sub1_936.method957(true, i_17_
								- -Class37_Sub18.anInt2200);
						Class42.aClass37_Sub11_Sub1_936.method962(
								i_20_ >> -771723058 & 0x7fff, false);
						Class42.aClass37_Sub11_Sub1_936.method962(
								Class15_Sub1.anInt1738 + i_18_, false);
					}
					if ((i_19_ ^ 0xffffffff) == -32) {
						boolean bool = (ByteVector_Sub1
								.method434(
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
										0,
										i_17_,
										(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
										false, 2, 0, 0, 0, i_18_, 0, 0, true));
						Class37_Sub9_Sub33.anInt3515++;
						if (!bool)
							bool = (ByteVector_Sub1
									.method434(
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
											0,
											i_17_,
											(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
											false, 2, 0, 1, 0, i_18_, 0, 1, true));
						Class37_Sub9_Sub8.anInt3057 = 0;
						Applet_Sub1.anInt8 = Class33.anInt764;
						Class19.anInt490 = 2;
						Class27.anInt676 = Class37_Sub13.anInt2113;
						Class42.aClass37_Sub11_Sub1_936.method989(-1494101117,
								190);
						Class42.aClass37_Sub11_Sub1_936.method945(19058,
								Class37_Sub18.anInt2200 + i_17_);
						Class42.aClass37_Sub11_Sub1_936.method945(19058, i_20_);
						Class42.aClass37_Sub11_Sub1_936.method962(
								Class15_Sub1.anInt1738 + i_18_, false);
						Class42.aClass37_Sub11_Sub1_936.method973(
								Class32.anInt737, -1629130328);
						Class42.aClass37_Sub11_Sub1_936.method945(19058,
								Class21.anInt558);
					}
					if (Class37_Sub14.anInt2122 != 0) {
						Class37_Sub14.anInt2122 = 0;
						Class73.refreshInterface((Class37_Sub9_Sub14.getInterface(
								Class37_Sub9_Sub21.anInt3317, 4096)), -1);
					}
					if (Class37_Sub4_Sub5.aBoolean2595)
						ByteVector_Sub1.method436(1);
					if (Class37_Sub4_Sub13.aClass18_2797 != null
							&& Class42.anInt939 == 0)
						Class73
								.refreshInterface(Class37_Sub4_Sub13.aClass18_2797,
										-1);
				}
			}
		}
	}

	static {
		anInt1875 = -1;
		aClass16_1876 = Class37_Sub2.crateRSString((byte) 127, "cyan:");
		aClass16_1873 = aClass16_1876;
		aClass16_1872 = aClass16_1876;
	}
}
