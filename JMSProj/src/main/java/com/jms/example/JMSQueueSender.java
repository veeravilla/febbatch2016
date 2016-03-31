/**
 * 
 */
package com.jms.example;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.TextMessage;

import com.test.jms.ServiceLocator;


/**
 * @author Veeru
 *
 */
public class JMSQueueSender {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws Exception{

		//Get Connection Factory
		QueueConnectionFactory queueConnectionFactory =   (QueueConnectionFactory) ServiceLocator.getService("jndi/jms/queue/factory");
		
		//Queue Connection
		QueueConnection queueConnection = queueConnectionFactory.createQueueConnection();
		
		//Queue Session
		QueueSession queueSession =  queueConnection.createQueueSession(true, 1);
		
		//Queue From Context
		Queue queue = (Queue)ServiceLocator.getService("jndi/jms/queue/requestQ");
		
		queueConnection.start();
		
		//QueueSender
		javax.jms.QueueSender queueSender = queueSession.createSender(queue);
		
		//Create a Message
		TextMessage textMessage = queueSession.createTextMessage("Sample to Message for JMS Queue");
		
		//Send the Message
		queueSender.send(textMessage);
		
		queueConnection.close();
		
		System.out.println("Message Sent ::::  " + textMessage);
	}


}
