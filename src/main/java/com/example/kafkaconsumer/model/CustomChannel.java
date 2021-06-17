package com.example.kafkaconsumer.model;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface CustomChannel {
	
	String INPUT = "inputMessages";
	String OUTPUT = "outputMessages";
	
	@Input(INPUT)
	SubscribableChannel inputMessages();
	
	@Output(OUTPUT)
	MessageChannel outputMessages();

}
