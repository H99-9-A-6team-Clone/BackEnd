package com.sparta.clone.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;



@Data
@AllArgsConstructor
public class ResponseDto<T> {
    private boolean success;
    private T data;
    private Error error;

    public static <T> ResponseDto<T> success(T data) {

        return new ResponseDto<>(true, data, null);
    }
    public static <T> ResponseDto<T> fail(Integer httpStatus, String message, String detail){
        return new ResponseDto<>(false, null, new Error(httpStatus, message, detail));
    }

    @Data
    @AllArgsConstructor
    static class Error{
        private Integer httpStatus;
        private String message;
        private String detail;
    }
}
