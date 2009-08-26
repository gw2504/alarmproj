package CosNotifyComm;


/**
* CosNotifyComm/PushConsumerHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/


// NotifySubscribe
abstract public class PushConsumerHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyComm/PushConsumer:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyComm.PushConsumer that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyComm.PushConsumer extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotifyComm.PushConsumerHelper.id (), "PushConsumer");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyComm.PushConsumer read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_PushConsumerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyComm.PushConsumer value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotifyComm.PushConsumer narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.PushConsumer)
      return (CosNotifyComm.PushConsumer)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._PushConsumerStub stub = new CosNotifyComm._PushConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotifyComm.PushConsumer unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyComm.PushConsumer)
      return (CosNotifyComm.PushConsumer)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyComm._PushConsumerStub stub = new CosNotifyComm._PushConsumerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
