package com.test.jms;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

public class ServiceLocator {
	
	public static Object getService(String jndiName){
		try{
			Context context = getInitialContext();
			return context.lookup(jndiName);
		}catch(Exception e){
			System.out.println(" Unable to get the Service from WL Server" + jndiName);
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static Context getInitialContext(){
		try{
			Hashtable env = new Hashtable();
			env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			env.put(Context.PROVIDER_URL,"t3://localhost:7001");
			env.put(Context.SECURITY_PRINCIPAL,"weblogic");
			env.put(Context.SECURITY_CREDENTIALS,"admin1234");
			Context ctx = new InitialContext(env);
			return ctx;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
