package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HolomanRunner implements ApplicationRunner{

	@Autowired
	MerProperties mer;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println(mer.getName());
		System.out.println(mer.getAge());
		System.out.println(mer.getFullName());
		System.out.println(mer.getSessionTimeout());
	}
}
