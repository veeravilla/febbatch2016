package com.test.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class QueueSenderApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);
		
		Connection connection = connectionFactory.createConnection();
		
		connection.start();
		
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//Queue
		Destination queue = session.createQueue("requestQ");
		
		//Queue Sender
		MessageProducer messageProducer = session.createProducer(queue);
		
		for(int i=0 ; i<=20 ;i++)
		{
			TextMessage message = session.createTextMessage(" App Message  No  ::::: " + i);
			messageProducer.send(message);
			System.out.println(message.getJMSMessageID());
			
			/*MapMessage mapMessage = session.createMapMessage();
			mapMessage.setIntProperty("AccountID", i+1000);
			mapMessage.setStringProperty("Name", "Emloyee"+i);*/
			
		//	messageProducer.send(mapMessage);
			
		}
		
		connection.close();

	}

}


