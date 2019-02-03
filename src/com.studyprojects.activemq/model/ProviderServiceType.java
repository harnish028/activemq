package com.studyprojects.activemq.model;

public enum ProviderServiceType {
    DEFAULT("default"),
    IPM("ipm");

    private String serviceTypeName;

    ProviderServiceType(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }
}
