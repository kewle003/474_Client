/* Class37_Sub9_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub14 extends Class37_Sub9 {
	public static RSString aClass16_3143;
	public static RSString aClass16_3144;
	public static Class15 aClass15_3145;
	public static int anInt3146;
	public static int anInt3147;
	public static RSString aClass16_3148 = (Class37_Sub2.crateRSString((byte) 116,
			"Benutzen Sie die (WPasswort -=ndern(W Option"));
	public static RSString aClass16_3149 = Class37_Sub2.crateRSString((byte) 105,
			"sch-Utteln:");
	public static RSString aClass16_3150;
	public static RSString[] aClass16Array3151;
	public static int anInt3152;
	public static int anInt3153;
	public int anInt3154 = 4096;
	public static int anInt3155;
	public static RSString aClass16_3156;

	public static void method818(boolean bool) {
		anInt3147++;
		synchronized (Class65.aClass9_1221) {
			Class60.anInt1140 = Class71.anInt1356;
			Class37_Sub4_Sub7_Sub7.anInt3851 = Class37_Sub9_Sub17.anInt3215;
			Class37_Sub9_Sub1.anInt2914 = Class37_Sub9_Sub23.anInt3359;
			Class37_Sub9_Sub28.anInt3440 = Class37_Sub9_Sub29.anInt3452;
			if (bool != false) {
				/* empty */
			} else {
				Class33.anInt764 = Class37_Sub9_Sub19.anInt3258;
				Class37_Sub13.anInt2113 = Class1.anInt67;
				Class89.aLong1619 = Class87.aLong1588;
				Class37_Sub9_Sub29.anInt3452 = 0;
			}
		}
	}

	public static void method819(int i) {
		aClass16_3144 = null;
		aClass16_3149 = null;
		aClass16Array3151 = null;
		aClass16_3143 = null;
		aClass16_3156 = null;
		if (i == 4096) {
			aClass16_3150 = null;
			aClass15_3145 = null;
			aClass16_3148 = null;
		}
	}

	public Class37_Sub9_Sub14() {
		this(4096);
	}

	public Class37_Sub9_Sub14(int i) {
		super(0, true);
		anInt3154 = i;
	}

	public static RSInterface getInterface(int i, int i_0_) {
		int id = i >> 16;
		int childId = 0xffff & i;
		anInt3152++;
		if (i_0_ != 4096)
			method821(-118);
		try {
			if (Class37_Sub9_Sub29.mainInterfaceArray[id] == null
					|| Class37_Sub9_Sub29.mainInterfaceArray[id][childId] == null) {
				boolean flag = Class37_Sub10.loadExists(id, 27323);
				if (!flag)
					return null;
			}
			return Class37_Sub9_Sub29.mainInterfaceArray[id][childId];
		} catch (Exception e) {
			return Class37_Sub9_Sub29.mainInterfaceArray[id][Class37_Sub9_Sub29.mainInterfaceArray[id].length-1];
		}
	}

	public int[] method761(int i, int i_3_) {
		if (i > -125)
			method819(-73);
		int[] is = aClass38_1966.method1049(i_3_, true);
		if (aClass38_1966.aBoolean850)
			Class53.method1134(is, 0, Class32.anInt743, anInt3154);
		anInt3146++;
		return is;
	}

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		anInt3155++;
		if (bool != true)
			method818(false);
		int i_4_ = i;
		if (i_4_ == 0)
			anInt3154 = (class37_sub11.getUnsignedByte(123) << 904088684) / 255;
	}

	public static int method821(int i) {
		if (i != 255)
			getInterface(-70, -123);
		anInt3153++;
		return Class37_Sub9_Sub19.anInt3274++;
	}

	static {
		aClass16_3144 = Class37_Sub2.crateRSString((byte) 127,
				"Musik)2Engine vorbereitet)3");
		aClass16Array3151 = new RSString[500];
		aClass16_3150 = Class37_Sub2.crateRSString((byte) 119,
				"To create a new account you need to");
		aClass16_3143 = aClass16_3150;
		aClass16_3156 = Class37_Sub2.crateRSString((byte) 127, "l");
	}
}
