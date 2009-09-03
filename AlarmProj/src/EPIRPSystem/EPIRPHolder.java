package EPIRPSystem;

/**
* EPIRPSystem/EPIRPHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/


/*
  */
public final class EPIRPHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.EPIRP value = null;

  public EPIRPHolder ()
  {
  }

  public EPIRPHolder (EPIRPSystem.EPIRP initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.EPIRPHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.EPIRPHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.EPIRPHelper.type ();
  }

}