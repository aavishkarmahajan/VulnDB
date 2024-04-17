package com.vm.vulndb.dto;

import com.vm.vulndb.model.Advisory;
import com.vm.vulndb.model.Entry;
import com.vm.vulndb.model.Source;
import com.vm.vulndb.model.Vulnerability;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseDataResponseDTO {
    private Entry entry;
    private Vulnerability vulnerability;
    private Advisory advisory;
    private Source source;
}
