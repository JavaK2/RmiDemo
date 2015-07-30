package com.vaani.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.vaani.rmi.common.Calculator;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {


	/**
	 * Constructor throws RemoteException because the class UnicastRemoteObject
	 * 
	 * @throws RemoteException
	 */
	protected CalculatorImpl() throws RemoteException {
		
	}

	@Override
	public int add(int x, int y) {
		return x + y;
	}

}
