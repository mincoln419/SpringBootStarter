package com.main;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class SampleListenser implements ApplicationListener<ApplicationStartingEvent> {
	//application context 발생전에 생기는 이벤트여서.. 리스너가 동작되지 않는다. 근데 왜??있는거지 -> 최초 application 실행시에 직접 등록시켜야함

	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println("==========================");
		System.out.println("Application is Starting");
		System.out.println("==========================");
		
	}

}
