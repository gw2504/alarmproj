package CosNotifyComm;


/**
* CosNotifyComm/NotifyPublishOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/

public interface NotifyPublishOperations 
{
  void offer_change (CosNotification.EventType[] added, CosNotification.EventType[] removed) throws CosNotifyComm.InvalidEventType;
} // interface NotifyPublishOperations