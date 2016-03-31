package com.test.jms;

import java.util.Enumeration;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.QueueBrowser;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class JMSBrowser {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
				ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);
				
				Connection connection = connectionFactory.createConnection();
				
				connection.start();
				
				Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
				
				//Queue
				Queue queue = session.createQueue("requestQ");
				
				QueueBrowser browser = session.createBrowser(queue);
				
				Enumeration enumeration = browser.getEnumeration();
				
				while(enumeration.hasMoreElements()){
					TextMessage message =(TextMessage) enumeration.nextElement(); 
					System.out.println(" From Q Browser Msg :::  " + message.getText());
				}

	}

}
