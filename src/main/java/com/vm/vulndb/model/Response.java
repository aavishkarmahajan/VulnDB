package com.vm.vulndb.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {
    private String version;
    private String format;
    private String status;
    private String lang;
    private String monoblock;
    private String items;
    private String consumption;
    private String remaining;
    private String querylimit;
    private String querylimitmax;
    private String timestamp;
    private String rtt;
    private String etag;
}
