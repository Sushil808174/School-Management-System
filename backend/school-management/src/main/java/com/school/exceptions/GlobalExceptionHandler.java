package com.school.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentException.class)
    public ResponseEntity<ErrorDetails> StudentExceptionHandler(StudentException ex, WebRequest req){
        ErrorDetails err = new ErrorDetails();
        err.setTimeStamp(LocalDateTime.now());
        err.setMessage(ex.getMessage());
        err.setDescription(req.getDescription(false));
        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(TeacherException.class)
    public ResponseEntity<ErrorDetails> teacherExceptionHandler(TeacherException ex, WebRequest req){
        ErrorDetails err = new ErrorDetails();
        err.setTimeStamp(LocalDateTime.now());
        err.setMessage(ex.getMessage());
        err.setDescription(req.getDescription(false));
        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(DepartmentException.class)
    public ResponseEntity<ErrorDetails> departmentExceptionHandler(DepartmentException ex, WebRequest req){
        ErrorDetails err = new ErrorDetails();
        err.setTimeStamp(LocalDateTime.now());
        err.setMessage(ex.getMessage());
        err.setDescription(req.getDescription(false));
        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(ClassesException.class)
    public ResponseEntity<ErrorDetails> classesExceptionHandler(ClassesException ex, WebRequest req){
        ErrorDetails err = new ErrorDetails();
        err.setTimeStamp(LocalDateTime.now());
        err.setMessage(ex.getMessage());
        err.setDescription(req.getDescription(false));
        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(RoomException.class)
    public ResponseEntity<ErrorDetails> roomExceptionHandler(RoomException ex, WebRequest req){
        ErrorDetails err = new ErrorDetails();
        err.setTimeStamp(LocalDateTime.now());
        err.setMessage(ex.getMessage());
        err.setDescription(req.getDescription(false));
        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(ScheduleException.class)
    public ResponseEntity<ErrorDetails> scheduleTimeExceptionHandler(ScheduleException ex, WebRequest req){
        ErrorDetails err = new ErrorDetails();
        err.setTimeStamp(LocalDateTime.now());
        err.setMessage(ex.getMessage());
        err.setDescription(req.getDescription(false));
        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(SubjectException.class)
    public ResponseEntity<ErrorDetails> subjectExceptionHandler(SubjectException ex, WebRequest req){
        ErrorDetails err = new ErrorDetails();
        err.setTimeStamp(LocalDateTime.now());
        err.setMessage(ex.getMessage());
        err.setDescription(req.getDescription(false));
        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> gereralExceptionHandler(Exception ex , WebRequest req){
        ErrorDetails err= new ErrorDetails();
        err.setTimeStamp(LocalDateTime.now());
        err.setMessage(ex.getLocalizedMessage());
        err.setDescription(req.getDescription(false));
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ErrorDetails> notFoundExceptionHandler(NoHandlerFoundException ex ,WebRequest req){
        ErrorDetails err= new ErrorDetails();
        err.setTimeStamp(LocalDateTime.now());
        err.setMessage(ex.getLocalizedMessage());
        err.setDescription(req.getDescription(false));
        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDetails> NotValidExceptionHandler(MethodArgumentNotValidException ex){
        ErrorDetails err= new ErrorDetails();
        err.setTimeStamp(LocalDateTime.now());
        err.setMessage(ex.getLocalizedMessage());
        err.setDescription(ex.getBindingResult().getFieldError().getDefaultMessage());
        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }
}
