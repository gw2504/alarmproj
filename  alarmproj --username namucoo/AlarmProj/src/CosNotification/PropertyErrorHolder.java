package CosNotification;

/**
* CosNotification/PropertyErrorHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class PropertyErrorHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.PropertyError value = null;

  public PropertyErrorHolder ()
  {
  }

  public PropertyErrorHolder (CosNotification.PropertyError initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.PropertyErrorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.PropertyErrorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.PropertyErrorHelper.type ();
  }

}