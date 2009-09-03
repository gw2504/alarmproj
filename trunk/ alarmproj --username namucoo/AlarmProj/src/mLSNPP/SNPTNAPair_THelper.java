package mLSNPP;


/**
* mLSNPP/SNPTNAPair_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/

abstract public class SNPTNAPair_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/mLSNPP/SNPTNAPair_T:1.0";

  public static void insert (org.omg.CORBA.Any a, mLSNPP.SNPTNAPair_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static mLSNPP.SNPTNAPair_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "SNPId",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (mLSNPP.TNAName_THelper.id (), "TNAName_T", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "tNAName",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (mLSNPP.SNPTNAPair_THelper.id (), "SNPTNAPair_T", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static mLSNPP.SNPTNAPair_T read (org.omg.CORBA.portable.InputStream istream)
  {
    mLSNPP.SNPTNAPair_T value = new mLSNPP.SNPTNAPair_T ();
    value.SNPId = istream.read_string ();
    value.tNAName = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, mLSNPP.SNPTNAPair_T value)
  {
    ostream.write_string (value.SNPId);
    ostream.write_string (value.tNAName);
  }

}
