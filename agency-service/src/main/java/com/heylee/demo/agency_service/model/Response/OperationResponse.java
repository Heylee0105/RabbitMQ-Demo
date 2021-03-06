package com.heylee.demo.agency_service.model.Response;

import lombok.Data;

@Data
public class OperationResponse {
    public enum ResponseStatusEnum {SUCCESS, ERROR, WARNING, NO_ACCESS}

    private ResponseStatusEnum operationStatus;
    private String operationMessage;

    public ResponseStatusEnum getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(ResponseStatusEnum operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getOperationMessage() {
        return operationMessage;
    }

    public void setOperationMessage(String operationMessage) {
        this.operationMessage = operationMessage;
    }
}
