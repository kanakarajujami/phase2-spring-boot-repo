package com.nt.service;

public interface TransportMode {

	public void startTransport();
	public void stopTransport();
	double calculateFare(Integer distance);
}
