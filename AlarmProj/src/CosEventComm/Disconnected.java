package CosEventComm;


/**
* CosEventComm/Disconnected.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventComm.idl
* 2009年8月26日 星期三 上午10时45分55秒 CST
*/

public final class Disconnected extends org.omg.CORBA.UserException
{

  public Disconnected ()
  {
    super(DisconnectedHelper.id());
  } // ctor


  public Disconnected (String $reason)
  {
    super(DisconnectedHelper.id() + "  " + $reason);
  } // ctor

} // class Disconnected
