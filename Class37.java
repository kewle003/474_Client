/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37
{
    public static int anInt810;
    public static int anInt811;
    public static int anInt812;
    public static int[][] anIntArrayArray813 = new int[5][5000];
    public Class37 aClass37_814;
    public static int anInt815 = 20;
    public static int anInt816;
    public static int anInt817;
    public long aLong818;
    public static int anInt819;
    public static int anInt820 = 0;
    public Class37 aClass37_821;
    public static int anInt822;
    public static int anInt823;
    
    public void method322(boolean bool) {
	anInt812++;
	if (aClass37_821 != null) {
	    aClass37_821.aClass37_814 = aClass37_814;
	    aClass37_814.aClass37_821 = aClass37_821;
	    if (bool != false)
		method327(-9);
	    aClass37_821 = null;
	    aClass37_814 = null;
	}
    }
    
    public boolean method323(int i) {
	anInt822++;
	if (aClass37_821 == null)
	    return false;
	if (i != 105)
	    method325(-27, -51, -128, -32);
	return true;
    }
    
    public static void method324
	(int i, int i_0_,
	 Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2, int i_1_) {
	if (i_1_ != 0)
	    anInt820 = 19;
	if (((class37_sub4_sub7_sub1_sub2.anInt3655 ^ 0xffffffff)
	     == (i_0_ ^ 0xffffffff))
	    && (i_0_ ^ 0xffffffff) != 0) {
	    int i_2_ = Class37_Sub9_Sub22.method861(-54, i_0_).anInt2760;
	    if ((i_2_ ^ 0xffffffff) == -2) {
		class37_sub4_sub7_sub1_sub2.anInt3659 = 0;
		class37_sub4_sub7_sub1_sub2.anInt3689 = i;
		class37_sub4_sub7_sub1_sub2.anInt3680 = 0;
		class37_sub4_sub7_sub1_sub2.anInt3677 = 0;
	    }
	    if ((i_2_ ^ 0xffffffff) == -3)
		class37_sub4_sub7_sub1_sub2.anInt3659 = 0;
	} else if ((i_0_ ^ 0xffffffff) == 0
		   || (class37_sub4_sub7_sub1_sub2.anInt3655 ^ 0xffffffff) == 0
		   || (((Class37_Sub9_Sub22.method861(i_1_ ^ ~0x5, i_0_)
			 .anInt2762)
			^ 0xffffffff)
		       <= ((Class37_Sub9_Sub22.method861
			    (-48, class37_sub4_sub7_sub1_sub2.anInt3655)
			    .anInt2762)
			   ^ 0xffffffff))) {
	    class37_sub4_sub7_sub1_sub2.anInt3680 = 0;
	    class37_sub4_sub7_sub1_sub2.anInt3640
		= class37_sub4_sub7_sub1_sub2.anInt3645;
	    class37_sub4_sub7_sub1_sub2.anInt3677 = 0;
	    class37_sub4_sub7_sub1_sub2.anInt3689 = i;
	    class37_sub4_sub7_sub1_sub2.anInt3655 = i_0_;
	    class37_sub4_sub7_sub1_sub2.anInt3659 = 0;
	}
	anInt817++;
    }
    
    public static int method325(int i, int i_3_, int i_4_, int i_5_) {
	i_4_ &= 0x3;
	anInt819++;
	if (i_4_ == 0)
	    return i;
	if (i_4_ == 1)
	    return i_5_;
	if (i_4_ == 2)
	    return -i + 7;
	if (i_3_ != 104)
	    anIntArrayArray813 = null;
	return -i_5_ + 7;
    }
    
    public static void method326(boolean bool) {
	Class37_Sub9_Sub1.anIntArrayArrayArray2924 = new int[4][105][105];
	Class37_Sub4_Sub17.anIntArray2872 = new int[104];
	Class81.anIntArray1510 = new int[104];
	Class15.aByteArrayArrayArray283 = new byte[4][104][104];
	if (bool != true)
	    method324(-62, 36, null, 38);
	Class37_Sub9_Sub26.aByteArrayArrayArray3391 = new byte[4][105][105];
	Class84.aByteArrayArrayArray1526 = new byte[4][104][104];
	Class37_Sub9_Sub12.anIntArray3113 = new int[104];
	Class42.anInt944 = 99;
	Class52_Sub1.aByteArrayArrayArray2306 = new byte[4][104][104];
	Class37_Sub3_Sub3.aByteArrayArrayArray2391 = new byte[4][104][104];
	anInt810++;
	Class55.anIntArray1064 = new int[104];
	Class68.anIntArrayArray1329 = new int[105][105];
	Class10.anIntArray196 = new int[104];
    }
    
    public static void method327(int i) {
	if (i != -23867)
	    anInt820 = 15;
	anIntArrayArray813 = null;
    }
}
