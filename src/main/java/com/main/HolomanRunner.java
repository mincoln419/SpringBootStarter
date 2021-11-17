package com.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HolomanRunner implements ApplicationRunner{

	private Logger log = LoggerFactory.getLogger(HolomanRunner.class); 
	
	@Autowired
	private String hello; 
	
	@Autowired
	private MerProperties mer;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		log.debug("===========================");
		log.debug(hello);
		log.debug(mer.getName());
		log.debug(mer.getFullName());
		log.debug("===========================");
	}
}
