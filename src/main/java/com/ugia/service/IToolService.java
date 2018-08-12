package com.ugia.service;

import com.ugia.common.ServerResponse;
import com.ugia.pojo.ShuDu;

public interface IToolService {
    ServerResponse<Integer[][]> shuDuCalculate(ShuDu shuDu);

    ServerResponse<String> encode(String origin, String algorithm);

    ServerResponse<String> UUID();
}