package com.hawkeye.core;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

public class HawkeyeResponse<T> {
    private boolean success;
    private String message;
    private T payload;
    private String requestId;
    
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime timestamp;
    
    public HawkeyeResponse(boolean success, String message, T payload) {
        this.success = success;
        this.message = message;
        this.payload = payload;
        this.timestamp = LocalDateTime.now();
        this.requestId = generateRequestId();
    }
    
    public static <T> HawkeyeResponse<T> success(T payload) {
        return new HawkeyeResponse<>(true, "Operation completed successfully", payload);
    }
    
    public static <T> HawkeyeResponse<T> error(String message) {
        return new HawkeyeResponse<>(false, message, null);
    }
    
    private String generateRequestId() {
        return "HWK-" + System.currentTimeMillis();
    }
    
    // Getters and setters...
    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public T getPayload() { return payload; }
    public void setPayload(T payload) { this.payload = payload; }
    public String getRequestId() { return requestId; }
    public void setRequestId(String requestId) { this.requestId = requestId; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
