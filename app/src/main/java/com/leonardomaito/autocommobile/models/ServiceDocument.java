package com.leonardomaito.autocommobile.models;

import com.google.firebase.firestore.PropertyName;

public class ServiceDocument {

    public ServiceOrder serviceOrder;

    public ServiceDocument() {
    }

    public ServiceDocument(ServiceOrder serviceOrder) {
        this.serviceOrder = serviceOrder;
    }

    @PropertyName("serviceOrder")
    public  ServiceOrder getServiceOrder() {
        return serviceOrder;
    }

    @PropertyName("id")
    public Integer getId() {
        return serviceOrder.getId();
    }

    @PropertyName("serviceOrder")
    public void setServiceOrder(ServiceOrder serviceOrder) {
        this.serviceOrder = serviceOrder;
    }

}

