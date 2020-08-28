package com.liujia.entity;


import lombok.Data;

@Data
public class ChaOrder {

    private String uuid;

    private String startChargeSeq;

    private String sysOrderNo;

    public ChaOrder(){

    }
    public ChaOrder(String uuid, String startChargeSeq, String sysOrderNo){
        this.uuid = uuid;
        this.startChargeSeq = startChargeSeq;
        this.sysOrderNo = sysOrderNo;
    }
}
