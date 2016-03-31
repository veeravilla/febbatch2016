/**
 * 
 */
package com.jms.example;

import javax.jms.Message;
import javax.jms.MessageConsumer;
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
public class JMSQueueRecevier {

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
		MessageConsumer queueReceiver = queueSession.createConsumer(queue);
		
		Message message = queueReceiver.receive();
		while(message != null){
			if(message instanceof TextMessage){
				System.out.println("TestMessage :  " + message);
			}
		}
		
		
		
	}


}
