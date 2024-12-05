package com.example.demo.dto;

public class PaymentReqDto {

    private String name;
    private Integer amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentReqDto{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
