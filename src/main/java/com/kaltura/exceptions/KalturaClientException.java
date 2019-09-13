package com.kaltura.exceptions;

public class KalturaClientException extends RuntimeException {

    public KalturaClientException(String message) {
        super(message);
    }

    public KalturaClientException(String message, Exception e) {
        super(message, e);
    }
}