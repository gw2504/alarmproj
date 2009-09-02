package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/NotificationTypePOA.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   This block identifies the notification types defined by this
   Alarm IRP version.
   */
public abstract class NotificationTypePOA extends org.omg.PortableServer.Servant
 implements AlarmIRPConstDefs.NotificationTypeOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/AlarmIRPConstDefs/NotificationType:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public NotificationType _this() 
  {
    return NotificationTypeHelper.narrow(
    super._this_object());
  }

  public NotificationType _this(org.omg.CORBA.ORB orb) 
  {
    return NotificationTypeHelper.narrow(
    super._this_object(orb));
  }


} // class NotificationTypePOA