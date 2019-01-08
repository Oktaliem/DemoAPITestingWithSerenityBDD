package com.restapi.github.model;

public class PaymentRequestModel {
    // getter setter shortcut in intellij for windows : Alt+Insert
    private String transaction_id = "";
    private String original_currency_code = "";
    private String original_amount = "";
    private String exchange_rate = "";
    private String final_currency_code = "";
    private String final_amount = "";

    public String getTransaction_id() {
        return transaction_id;
    }

    public PaymentRequestModel setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
        return this;
    }

    public String getOriginal_currency_code() {
        return original_currency_code;
    }

    public PaymentRequestModel setOriginal_currency_code(String original_currency_code) {
        this.original_currency_code = original_currency_code;
        return this;
    }

    public String getOriginal_amount() {
        return original_amount;
    }

    public PaymentRequestModel setOriginal_amount(String original_amount) {
        this.original_amount = original_amount;
        return this;
    }

    public String getExchange_rate() {
        return exchange_rate;
    }

    public PaymentRequestModel setExchange_rate(String exchange_rate) {
        this.exchange_rate = exchange_rate;
        return this;
    }

    public String getFinal_currency_code() {
        return final_currency_code;
    }

    public PaymentRequestModel setFinal_currency_code(String final_currency_code) {
        this.final_currency_code = final_currency_code;
        return this;
    }

    public String getFinal_amount() {
        return final_amount;
    }

    public PaymentRequestModel setFinal_amount(String final_amount) {
        this.final_amount = final_amount;
        return this;
    }
}
