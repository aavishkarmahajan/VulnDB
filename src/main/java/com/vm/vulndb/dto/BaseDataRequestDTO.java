package com.vm.vulndb.dto;

import com.vm.vulndb.model.Advisory;
import com.vm.vulndb.model.Entry;
import com.vm.vulndb.model.Source;
import com.vm.vulndb.model.Vulnerability;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseDataRequestDTO {
    private String apikey;
    private int recent;
}
