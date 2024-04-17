package com.vm.vulndb.dto;

import com.vm.vulndb.model.Request;
import com.vm.vulndb.model.Response;
import com.vm.vulndb.model.Result;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AllDataResponseDTO {
    private Response response;
    private Request request;
    private Result result;
}
