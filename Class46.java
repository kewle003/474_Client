import java.util.HashMap;
import java.util.Map;

/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class46 {
	public static int anInt979;
	public static int anInt980;
	public static int anInt981;
	public static int anInt982;
	public static int anInt983;
	public static int anInt984;
	public static RSString aClass16_985 = (Class37_Sub2.crateRSString(
			(byte) 118, "Bitte wenden Sie sich an den Kundendienst)3"));
	public static int anInt986;
	public static Class37_Sub4_Sub9_Sub1 aClass37_Sub4_Sub9_Sub1_987;
	public static int[] anIntArray988 = new int[50];
	public static int anInt989;

	public static void method1102(RSInterface rSInterface, int i) {
		if (i != 10)
			loadItem(-26, (byte) -88);
		anInt979++;
		int i_0_ = rSInterface.anInt376;
		if (i_0_ == 324) {
			if ((Class37_Sub9_Sub8.anInt3063 ^ 0xffffffff) == 0) {
				Class37_Sub3_Sub1.anInt2321 = rSInterface.anInt400;
				Class37_Sub9_Sub8.anInt3063 = rSInterface.anInt385;
			}
			if (Class57.aClass29_1098.aBoolean700)
				rSInterface.anInt385 = Class37_Sub9_Sub8.anInt3063;
			else
				rSInterface.anInt385 = Class37_Sub3_Sub1.anInt2321;
		} else if (i_0_ == 325) {
			if (Class37_Sub9_Sub8.anInt3063 == -1) {
				Class37_Sub9_Sub8.anInt3063 = rSInterface.anInt385;
				Class37_Sub3_Sub1.anInt2321 = rSInterface.anInt400;
			}
			if (Class57.aClass29_1098.aBoolean700)
				rSInterface.anInt385 = Class37_Sub3_Sub1.anInt2321;
			else
				rSInterface.anInt385 = Class37_Sub9_Sub8.anInt3063;
		} else if ((i_0_ ^ 0xffffffff) == -328) {
			rSInterface.anInt319 = 150;
			rSInterface.anInt405 = (0x7ff & (int) (Math
					.sin((double) Class37_Sub7.anInt1898 / 40.0) * 256.0));
			rSInterface.anInt408 = 5;
			rSInterface.anInt369 = 0;
		} else if ((i_0_ ^ 0xffffffff) == -329) {
			rSInterface.anInt319 = 150;
			rSInterface.anInt405 = (int) (Math
					.sin((double) Class37_Sub7.anInt1898 / 40.0) * 256.0) & 0x7ff;
			rSInterface.anInt408 = 5;
			rSInterface.anInt369 = 1;
		}
	}

	public static void method1103(boolean bool) {
		aClass37_Sub4_Sub9_Sub1_987 = null;
		aClass16_985 = null;
		anIntArray988 = null;
		if (bool != false)
			aClass37_Sub4_Sub9_Sub1_987 = null;
	}

	public static Class37_Sub4_Sub9_Sub1[] method1104(Class15 class15,
			RSString rSString, int i, RSString class16_1_) {
		try {
			int i_2_ = class15.method123((byte) 32, class16_1_);
			anInt982++;
			if (i != 999999999)
				return null;
			int i_3_ = class15.method128(rSString, -123, i_2_);
			return Class15_Sub1.method140(i_2_, i_3_, (byte) 0, class15);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("na.D("
					+ (class15 != null ? "{...}" : "null") + ','
					+ (rSString != null ? "{...}" : "null") + ',' + i + ','
					+ (class16_1_ != null ? "{...}" : "null") + ')'));
		}
	}

	public static RSString method1105(int i, byte i_4_) {
		anInt984++;
		if (i_4_ > -114)
			loadItem(70, (byte) -14);
		if (i < 999999999)
			return Class37_Sub9_Sub24.method870(i, (byte) -114);
		return Class37_Sub9_Sub13.aClass16_3129;
	}

	public static boolean method1106(int i) {
		anInt986++;
		synchronized (Class37_Sub9_Sub13.aClass21_3126) {
			if (Class37_Sub9_Sub21.anInt3314 == Class37.anInt820)
				return false;
			if (i != 0)
				return false;
			Class37_Sub4_Sub3.anInt2560 = Class86.anIntArray1577[Class37_Sub9_Sub21.anInt3314];
			Class88.anInt1600 = (Class37_Sub9_Sub31.anIntArray3485[Class37_Sub9_Sub21.anInt3314]);
			Class37_Sub9_Sub21.anInt3314 = 0x7f & Class37_Sub9_Sub21.anInt3314
					- -1;
			return true;
		}
	}

	public static int method1107(byte[] is, byte i, int i_5_) {
		int i_6_ = -75 % ((i - -40) / 53);
		anInt983++;
		return Class85.method1319(is, 0, i_5_, 448779536);
	}
	static int count = 0;
	static boolean dumped = true;
	static Map<Integer, RSItem> items = new HashMap<Integer, RSItem>();
	public static RSItem loadItem(int itemId, byte i_7_) {
		RSItem rsItem = ((RSItem) Class37_Sub9_Sub3.aClass65_2940.method1181((byte) 16, (long) itemId));
		anInt981++;
		if (i_7_ <= 76)
			return null;
		if (rsItem != null)
			return rsItem;
		byte[] is = Class37_Sub9_Sub11.aClass15_3099.method131(itemId, 10, 1);
		rsItem = new RSItem();
		rsItem.itemId = itemId;
		if (is != null)
			rsItem.forId(2000, new ByteVector(is));
		rsItem.method452((byte) 118);
		if ((rsItem.certTemplateID ^ 0xffffffff) != 0)
			rsItem.toNote(loadItem(rsItem.certTemplateID,
					(byte) 127), loadItem(rsItem.certID,
					(byte) 101), (byte) 117);
		if (!Class37_Sub4_Sub10.freeWorld && rsItem.membersObject) {
			rsItem.aBoolean2421 = false;
			rsItem.team = 0;
			rsItem.groundActions = null;
			rsItem.actions = null;
			rsItem.itemName = Class37_Sub18.membersObjectString;
		}
		Class37_Sub9_Sub3.aClass65_2940.method1179((long) itemId, -4,
				rsItem);
		return rsItem;
	}
}
