package com.vm.vulndb.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseData {
    private Entry entry;
    private Vulnerability vulnerability;
    private Advisory advisory;
    private Source source;
}
