package com.cloud.datastaxtodobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;

//@SpringBootApplication(exclude = {
//		CassandraAutoConfiguration.class,
//		CassandraDataAutoConfiguration.class
//})
@SpringBootApplication
public class DatastaxTodobackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatastaxTodobackendApplication.class, args);
	}

}
