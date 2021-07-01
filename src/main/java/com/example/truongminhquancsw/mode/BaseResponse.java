package com.example.truongminhquancsw.mode;

public class BaseResponse<T> {
    public int status = 1;
    public String message = "success";
    public T data;
}
