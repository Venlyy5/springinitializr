package com.example.springinitializr;


import com.example.springinitializr.config.SMSProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class ApplicationRunner implements org.springframework.boot.ApplicationRunner {

	@Resource
	SMSProperties smsProperties;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("CronSMS:	"+ smsProperties.getCronSMS());
		System.out.println("CronPin:	"+ smsProperties.getCronPin());
		System.out.println("Phones:		"+ smsProperties.getPhones());
	}
}
