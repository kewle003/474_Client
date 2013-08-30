/* Class37_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub23 extends Class37 {
	public static int anInt2223;
	public static Class42 aClass42_2224;
	public byte[] aByteArray2225;
	public static int anInt2226;
	public static RSString aClass16_2227 = Class37_Sub2.crateRSString((byte) 120,
			"Loading textures )2 ");
	public static RSString aClass16_2228;
	public static int anInt2229;
	public static int anInt2230;
	public static int anInt2231;
	public static int anInt2232 = -1;
	public static RSString aClass16_2233 = Class37_Sub2.crateRSString((byte) 101,
			")1j");
	public static Class37_Sub4_Sub7_Sub1_Sub2 aClass37_Sub4_Sub7_Sub1_Sub2_2234;
	public static RSString aClass16_2235;
	public static int anInt2236;
	public static int[] anIntArray2237;
	public static RSString aClass16_2238;
	public static RSString aClass16_2239;

	public static void method1027(RSString rSString, int i) {
		anInt2236++;
		if (Class14.aClass37_Sub18Array240 != null) {
			int i_0_ = i;
			long l = rSString.method152(i ^ ~0x42);
			if ((l ^ 0xffffffffffffffffL) != -1L) {
				for (/**/; ((Class14.aClass37_Sub18Array240.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
					if (l == Class14.aClass37_Sub18Array240[i_0_].aLong818)
						break;
				}
				if (((i_0_ ^ 0xffffffff) > (Class14.aClass37_Sub18Array240.length ^ 0xffffffff))
						&& Class14.aClass37_Sub18Array240[i_0_] != null) {
					Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 22);
					Class68.anInt1321++;
					Class42.aClass37_Sub11_Sub1_936.method949(
							Class14.aClass37_Sub18Array240[i_0_].aLong818,
							(byte) 44);
				}
			}
		}
	}

	public static void method1028(int i) {
		if (i != -101)
			aClass16_2239 = null;
		anInt2231++;
		Class37_Sub4_Sub7.aClass58_2633 = new Landscape();
	}

	public static void method1029(boolean bool) {
		anIntArray2237 = null;
		aClass16_2227 = null;
		aClass16_2233 = null;
		aClass16_2235 = null;
		aClass37_Sub4_Sub7_Sub1_Sub2_2234 = null;
		if (bool != true)
			aClass16_2239 = null;
		aClass42_2224 = null;
		aClass16_2228 = null;
		aClass16_2239 = null;
		aClass16_2238 = null;
	}

	public Class37_Sub23(byte[] is) {
		aByteArray2225 = is;
	}

	public static void method1030(int i, int i_1_, int i_2_, int i_3_,
			byte i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		anInt2230++;
		if (!Class37_Sub10.loadExists(i_1_, i_4_ + 27212)) {
			if (i_6_ == -1) {
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -101; i_9_++)
					Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_9_] = true;
			} else
				Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_6_] = true;
		} else {
			Class78.aClass18Array1456 = null;
			Class54.method1139(i, i_6_,
					Class37_Sub9_Sub29.mainInterfaceArray[i_1_], i_3_,
					i_7_, i_8_, -26787, i_5_, i_2_, -1);
			if (i_4_ == 111) {
				if (Class78.aClass18Array1456 != null) {
					Class54.method1139(Class37_Sub4_Sub4.anInt2588, i_6_,
							Class78.aClass18Array1456, i_3_, i_7_, i_8_, i_4_
									^ ~0x68cd, Class32.anInt742, i_2_,
							-1412584499);
					Class78.aClass18Array1456 = null;
				}
			}
		}
	}

	static {
		aClass16_2228 = (Class37_Sub2.crateRSString((byte) 109,
				"You can(Wt add yourself to your own ignore list)3"));
		aClass16_2235 = Class37_Sub2.crateRSString((byte) 126, " <col=ffffff>");
		aClass16_2238 = aClass16_2227;
		anIntArray2237 = new int[2000];
		aClass16_2239 = aClass16_2228;
	}
}
