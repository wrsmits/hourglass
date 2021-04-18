package com.semester2;

import com.semester2.models.Task;
import com.semester2.enumerations.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ContactTest {

    @Test
    public void createRFC() {
        Task task = new Task("A000001", "Tests schrijven en uitvoeren", true, CallStatus.OPEN, CallType.RFC, 0);
    }

    @Test
    public void createBug() {
        Task task = new Task("A000001", "Tests werken niet naar verwachting.", true, CallStatus.OPEN, CallType.BUG, 0);
    }

    @Test
    public void closeTaskTest() {
        Task task = Mockito.mock(Task.class);
        //Task will usually be given as a parameter in the method
        task.setCallStatus(CallStatus.CLOSED);

    }

    @Test
    public void changeTaskTest() {
        //Task will usually be given as a parameter in the method
        Task task = Mockito.mock(Task.class);
        //Change the Description
        task.setDescription("Test is written and excecuted");
        //Change the Status to busy
        task.setCallStatus(CallStatus.BUSY);
        //Change the CallType to bug
        task.setCallType(CallType.BUG);
    }

}
