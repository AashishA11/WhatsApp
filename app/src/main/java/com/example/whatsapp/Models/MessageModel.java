package com.example.whatsapp.Models;

public class MessageModel {

    String uId,messsage,messageId;
    Long timestamp;

    public MessageModel(){

    }

    public MessageModel(String uId, String messsage, Long timestamp) {
        this.uId = uId;
        this.messsage = messsage;
        this.timestamp = timestamp;
    }

    public MessageModel(String uId, String messsage) {
        this.uId = uId;
        this.messsage = messsage;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
