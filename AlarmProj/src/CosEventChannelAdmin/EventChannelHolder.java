package CosEventChannelAdmin;

/**
* CosEventChannelAdmin/EventChannelHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��8��26�� ������ ����10ʱ45��20�� CST
*/

public final class EventChannelHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventChannelAdmin.EventChannel value = null;

  public EventChannelHolder ()
  {
  }

  public EventChannelHolder (CosEventChannelAdmin.EventChannel initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventChannelAdmin.EventChannelHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventChannelAdmin.EventChannelHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventChannelAdmin.EventChannelHelper.type ();
  }

}