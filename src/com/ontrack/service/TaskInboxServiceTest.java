package com.ontrack.service;

import com.ontrack.model.Task;
import org.junit.jupiter.api.Test;
import java.util.List;

public class TaskInboxServiceTest {

    @Test
    public void testGetTaskInboxWithValidStudentId() {
        TaskInboxService service = new TaskInboxService();
        List<Task> tasks = service.getTaskInbox("12345");
        
        assertEquals(2, tasks.size());
        
        Task task1 = tasks.get(0);
        assertEquals("task1", task1.getTaskId());
        assertEquals("Math Homework", task1.getTitle());
        assertEquals("Pending", task1.getFeedbackStatus());
        assertEquals(2, task1.getChatMessages().size());
        
        Task task2 = tasks.get(1);
        assertEquals("task2", task2.getTaskId());
        assertEquals("Science Project", task2.getTitle());
        assertEquals("Reviewed", task2.getFeedbackStatus());
        assertEquals(2, task2.getChatMessages().size());
    }

    private void assertEquals(int i, int size) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(String string, String taskId) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testGetTaskInboxWithInvalidStudentId() {
        TaskInboxService service = new TaskInboxService();
        List<Task> tasks = service.getTaskInbox("invalid");
        
        assertTrue(tasks.isEmpty());
    }

    private void assertTrue(boolean empty) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testGetTaskInboxWithNoTasks() {
        TaskInboxService service = new TaskInboxService();
        List<Task> tasks = service.getTaskInbox("empty");
        
        assertTrue(tasks.isEmpty());
    }
}
