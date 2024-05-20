package com.ontrack.model;

import java.util.Date;
import java.util.List;

public class Task {
    private String taskId;
    private String title;
    private Date submissionDate;
    private String feedbackStatus;
    private List<String> chatMessages;

    // Constructors
    public Task() {}

    public Task(String taskId, String title, Date submissionDate, String feedbackStatus, List<String> chatMessages) {
        this.taskId = taskId;
        this.title = title;
        this.submissionDate = submissionDate;
        this.feedbackStatus = feedbackStatus;
        this.chatMessages = chatMessages;
    }

    // Getters and Setters
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(String feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }

    public List<String> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<String> chatMessages) {
        this.chatMessages = chatMessages;
    }
}
