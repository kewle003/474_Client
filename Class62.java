/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class62 {
	public static int anInt1171;
	public static int anInt1172;
	public int anInt1173;
	public static int anInt1174;
	public static int anInt1175;
	public static int anInt1176;
	public static Class13 aClass13_1177 = new Class13(512);
	public int anInt1178;
	public byte aByte1179;
	public static int[] anIntArray1180;
	public static RSString aClass16_1181;
	public int anInt1182;
	public static int[] anIntArray1183 = new int[500];
	public int anInt1184;
	public static Class13 aClass13_1185;
	public int anInt1186;

	public static void method1170(int i) {
		aClass13_1185 = null;
		anIntArray1183 = null;
		anIntArray1180 = null;
		aClass16_1181 = null;
		if (i >= -90)
			anIntArray1180 = null;
		aClass13_1177 = null;
	}

	public int method1171(int i) {
		if (i != 1)
			return -104;
		anInt1175++;
		return aByte1179 & 0x7;
	}

	public int method1172(byte i) {
		anInt1171++;
		if (i < 24)
			method1170(11);
		if ((aByte1179 & 0x8) == 8)
			return 1;
		return 0;
	}

	public static void method1173(int i) {
		Class42.aClass37_Sub11_Sub1_936.method989(-1494101117, 151);
		Class37_Sub9_Sub34.anInt3542++;
		if (i != -9)
			anIntArray1183 = null;
		anInt1176++;
		for (Class37_Sub6 class37_sub6 = (Class37_Sub6) Class76.aClass13_1423
				.method94(-52); class37_sub6 != null; class37_sub6 = (Class37_Sub6) Class76.aClass13_1423
				.method102((byte) 54)) {
			if ((class37_sub6.anInt1882 ^ 0xffffffff) == -1
					|| class37_sub6.anInt1882 == 3)
				Class37_Sub11_Sub1.method992(-1494101117, class37_sub6, true);
		}
		if (Class79.aClass18_1489 != null) {
			Class73.refreshInterface(Class79.aClass18_1489, -1);
			Class79.aClass18_1489 = null;
		}
	}

	public Class62() {
		/* empty */
	}

	public Class62(ByteVector class37_sub11) {
		aByte1179 = class37_sub11.method982((byte) 97);
		anInt1182 = class37_sub11.getUnsignedShort();
		anInt1173 = class37_sub11.getInt(-27);
		anInt1186 = class37_sub11.getInt(-59);
		anInt1184 = class37_sub11.getInt(-115);
		anInt1178 = class37_sub11.getInt(-69);
	}

	static {
		aClass16_1181 = (Class37_Sub2.crateRSString((byte) 121,
				"Wir vermuten)1 dass Ihr Konto gestohlen wurde"));
	}
}
