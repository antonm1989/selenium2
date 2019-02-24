package com.it.emails;

public class Email {
    public String toAddress;
    public String subject;
    public String body;
    public String fromName;
    public String senderInfo;

    public Email(String toAddress, String subject, String body, String fromName,
                 String senderInfo) {
        this.toAddress = toAddress;
        this.subject = subject;
        this.body = body;
        this.fromName = fromName;
        this.senderInfo=senderInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (toAddress != null ? !toAddress.equals(email.toAddress) : email.toAddress != null) return false;
        if (subject != null ? !subject.equals(email.subject) : email.subject != null) return false;
        if (body != null ? !body.equals(email.body) : email.body != null) return false;
        if (fromName != null ? !fromName.equals(email.fromName) : email.fromName != null) return false;
        return senderInfo != null ? senderInfo.equals(email.senderInfo) : email.senderInfo == null;
    }

    @Override
    public int hashCode() {
        int result = toAddress != null ? toAddress.hashCode() : 0;
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (fromName != null ? fromName.hashCode() : 0);
        result = 31 * result + (senderInfo != null ? senderInfo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Email{" +
                "toAddress='" + toAddress + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", fromName='" + fromName + '\'' +
                ", senderInfo='" + senderInfo + '\'' +
                '}';
    }
}
