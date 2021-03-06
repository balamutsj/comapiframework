package ApiData;

import java.util.HashMap;

public class ApiTestData {
    private String body;
    private HashMap responseHeaders;
    private String responseBody;
    private String token;
    private int statusCode;
    private String emailSubject;
    private boolean emailStatusIsRead;
    private String emailId;

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public boolean isEmailStatusIsRead() {
        return emailStatusIsRead;
    }

    public void setEmailStatusIsRead(boolean emailStatusIsRead) {
        this.emailStatusIsRead = emailStatusIsRead;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public HashMap getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(HashMap responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
