package CosNotifyComm;


/**
* CosNotifyComm/NotifyPublishOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/

public interface NotifyPublishOperations 
{
  void offer_change (CosNotification.EventType[] added, CosNotification.EventType[] removed) throws CosNotifyComm.InvalidEventType;
} // interface NotifyPublishOperations
