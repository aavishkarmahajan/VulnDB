package com.vm.vulndb.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request {
    private String timestamp;
    private String apikey;
    private String userid;
    private String details;
    private String sort;
    private String cti;
    private String type;
    private String value;
}
