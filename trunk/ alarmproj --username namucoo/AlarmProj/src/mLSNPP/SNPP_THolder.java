package mLSNPP;

/**
* mLSNPP/SNPP_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/

public final class SNPP_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.SNPP_T value = null;

  public SNPP_THolder ()
  {
  }

  public SNPP_THolder (mLSNPP.SNPP_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.SNPP_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.SNPP_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.SNPP_THelper.type ();
  }

}