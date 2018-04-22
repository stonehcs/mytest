package com.cunsen.demo.mapper;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	
	private static final SimpleDateFormat dateFormate  = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 1000)
	public void printcurrenttime(){
		System.out.println("time is :"+dateFormate.format(new Date()));
	}
}
