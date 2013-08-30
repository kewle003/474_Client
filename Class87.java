/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87 {
	public static int anInt1584;
	public static int anInt1585;
	public static int anInt1586;
	public static int[] anIntArray1587 = { 0, 1, 2, 3 };
	public static volatile long aLong1588;
	public static int anInt1589;
	public static RSString aClass16_1590 = Class37_Sub2.crateRSString((byte) 105,
			"Wordpack geladen)3");
	public static int anInt1591;
	public static RSString aClass16_1592;
	public static int anInt1593;

	public static void method1325(int i, int i_0_, int i_1_, int i_2_,
			int i_3_, int i_4_, ByteVector class37_sub11, int i_5_) {
		anInt1586++;
		if (i_2_ >= 0 && i_2_ < 104 && i_5_ >= 0 && i_5_ < 104) {
			Class1.aByteArrayArrayArray63[i_3_][i_2_][i_5_] = (byte) 0;
			for (;;) {
				int i_6_ = class37_sub11.getUnsignedByte(120);
				if ((i_6_ ^ 0xffffffff) == -1) {
					if ((i_3_ ^ 0xffffffff) != -1)
						Class64.anIntArrayArrayArray1217[i_3_][i_2_][i_5_] = -240
								+ (Class64.anIntArrayArrayArray1217[-1 + i_3_][i_2_][i_5_]);
					else
						Class64.anIntArrayArrayArray1217[0][i_2_][i_5_] = 8 * -Class82
								.method1305(i_0_ + i_5_ + 556238, true, i
										+ 932731 + i_2_);
					break;
				}
				if (i_6_ == 1) {
					int i_7_ = class37_sub11.getUnsignedByte(120);
					if ((i_7_ ^ 0xffffffff) == -2)
						i_7_ = 0;
					if (i_3_ == 0)
						Class64.anIntArrayArrayArray1217[0][i_2_][i_5_] = -i_7_ * 8;
					else
						Class64.anIntArrayArrayArray1217[i_3_][i_2_][i_5_] = -(8 * i_7_)
								+ (Class64.anIntArrayArrayArray1217[i_3_ + -1][i_2_][i_5_]);
					break;
				}
				if ((i_6_ ^ 0xffffffff) >= -50) {
					Class15.aByteArrayArrayArray283[i_3_][i_2_][i_5_] = class37_sub11
							.method982((byte) 110);
					Class52_Sub1.aByteArrayArrayArray2306[i_3_][i_2_][i_5_] = (byte) ((-2 + i_6_) / 4);
					Class37_Sub3_Sub3.aByteArrayArrayArray2391[i_3_][i_2_][i_5_] = (byte) Class37_Sub4_Sub7
							.method490(3, i_1_ + (-2 + i_6_));
				} else if (i_6_ <= 81)
					Class1.aByteArrayArrayArray63[i_3_][i_2_][i_5_] = (byte) (-49 + i_6_);
				else
					Class84.aByteArrayArrayArray1526[i_3_][i_2_][i_5_] = (byte) (-81 + i_6_);
			}
		} else {
			for (;;) {
				int i_8_ = class37_sub11.getUnsignedByte(120);
				if (i_8_ == 0)
					break;
				if ((i_8_ ^ 0xffffffff) == -2) {
					class37_sub11.getUnsignedByte(i_4_ + 10012);
					break;
				}
				if ((i_8_ ^ 0xffffffff) >= -50)
					class37_sub11.getUnsignedByte(122);
			}
		}
		if (i_4_ != -9890)
			aClass16_1592 = null;
	}

	public static void method1326(boolean bool) {
		aClass16_1592 = null;
		anIntArray1587 = null;
		if (bool != true)
			method1329(36, false);
		aClass16_1590 = null;
	}

	public static boolean method1327(RSString rSString, int i) {
		anInt1589++;
		if (rSString == null)
			return false;
		int i_9_ = -109 / ((i - 21) / 57);
		for (int i_10_ = 0; (Class9.anInt173 ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
			if (rSString.method159(Class69.aClass16Array1342[i_10_], (byte) 124))
				return true;
		}
		if (rSString
				.method159(
						(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass16_3993),
						(byte) 95))
			return true;
		return false;
	}

	public static void method1328(boolean bool) {
		if (bool != true)
			aClass16_1590 = null;
		anInt1593++;
		Class37_Sub4_Sub7_Sub1.aClass13_3670 = new Class13(32);
	}

	public static int method1329(int i, boolean bool) {
		int i_11_ = (i * i >> -1531677876) * i >> -358131636;
		anInt1585++;
		if (bool != true)
			method1327(null, -23);
		int i_12_ = 6 * i + -61440;
		int i_13_ = 40960 + (i * i_12_ >> 1812148076);
		return i_11_ * i_13_ >> -997591796;
	}

	public static void method1330(int i, int i_14_) {
		anInt1584++;
		if (i != -1 && Class37_Sub10.loadExists(i, i_14_ + 27373)) {
			RSInterface[] class18s = Class37_Sub9_Sub29.mainInterfaceArray[i];
			if (i_14_ == -50) {
				for (int i_15_ = 0; (class18s.length ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
					RSInterface rSInterface = class18s[i_15_];
					if (rSInterface.anObjectArray433 != null) {
						Class37_Sub8 class37_sub8 = new Class37_Sub8();
						class37_sub8.aClass18_1925 = rSInterface;
						class37_sub8.anObjectArray1938 = rSInterface.anObjectArray433;
						Class37_Sub9_Sub4.method776(class37_sub8, -53, 2000000);
					}
				}
			}
		}
	}

	static {
		aLong1588 = 0L;
		aClass16_1592 = Class37_Sub2.crateRSString((byte) 110, "<br>(X");
	}
}
