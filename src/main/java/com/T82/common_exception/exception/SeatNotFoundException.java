package com.T82.common_exception.exception;

public class SeatNotFoundException extends IllegalArgumentException{
    public SeatNotFoundException() {
        super("NOT FOUND SEAT");
    }
}
