package com.vm.vulndb.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Result {
    private ArrayList<List<BaseData>> result;
}
