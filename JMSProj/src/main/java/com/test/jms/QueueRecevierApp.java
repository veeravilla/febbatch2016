package com.test.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class QueueRecevierApp {

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
		
		//Queue Recevier
		MessageConsumer messageConsumer = session.createConsumer(queue);
		
		messageConsumer.setMessageListener(new JMSListener());
		
			
		/*Message message = messageConsumer.receive();
		
		while(message != null){
			
			if( message instanceof TextMessage){
				TextMessage textMessage = (TextMessage) message;
				System.out.println(" Consume the Msg :::  " + textMessage.getText());
			}else if(message instanceof MapMessage){
				MapMessage mapMessage = (MapMessage) message;
				System.out.println(" Map Message :::: " + mapMessage);
			}else
				System.out.println("Unsupported MSg Formatted.");
			
			message = messageConsumer.receive();
		}*/
		
		
		
		//connection.close();

	}

}


