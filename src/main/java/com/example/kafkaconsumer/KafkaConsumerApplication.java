package com.example.kafkaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import com.example.kafkaconsumer.model.Book;
import com.example.kafkaconsumer.model.CustomChannel;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@EnableBinding(Sink.class)
//@EnableBinding(CustomChannel.class)
public class KafkaConsumerApplication {
	
//	@Autowired
//    private	CustomChannel channel;
	
	
	 @StreamListener("input")
	//@StreamListener(value = CustomChannel.INPUT )
	 public void publishMessage(Book book) {
	 log.info("Published Message "+book); }
	 

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

}
