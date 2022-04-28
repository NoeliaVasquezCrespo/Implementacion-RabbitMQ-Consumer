package com.example.consumer;

import com.example.consumer.dto.StudentDto;
import com.example.consumer.dto.SubjectDto;
import com.example.consumer.dto.TeacherDto;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {
    
    @RabbitListener(queues = "queue.Student")
    public void listener(StudentDto messageDto) {
        System.out.println(messageDto);
    }

    @RabbitListener(queues = "queue.Subject")
    public void listener(SubjectDto messageDto) {
        System.out.println(messageDto);
    }


    @RabbitListener(queues = "queue.Teacher")
    public void listener(TeacherDto messageDto) {
        System.out.println(messageDto);
    }


    @RabbitListener(queues = "queue.all")
    public void receiveStudent(StudentDto messageDto) {
        System.out.println(messageDto);
    }

    @RabbitListener(queues = "queue.all")
    public void receiveSubject(SubjectDto messageDto) {
        System.out.println(messageDto);
    }

    @RabbitListener(queues = "queue.all")
    public void receiveTeacher(TeacherDto messageDto) {
        System.out.println(messageDto);
    }

    
}
