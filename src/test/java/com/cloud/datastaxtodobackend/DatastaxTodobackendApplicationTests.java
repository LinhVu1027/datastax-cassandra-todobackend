package com.cloud.datastaxtodobackend;

import com.cloud.datastaxtodobackend.todo.TodoEntity;
import com.cloud.datastaxtodobackend.todo.TodoRepositoryCassandra;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DatastaxTodobackendApplicationTests {


	@Autowired
	private TodoRepositoryCassandra repo;

	@Test
	void shoud_save_task_when_save() {
		// Given
		TodoEntity te = new TodoEntity("Sample task1", 1);
		// When
		repo.save(te);
		// then
		Assertions.assertTrue(repo.existsById(te.getUid()));
	}

}
