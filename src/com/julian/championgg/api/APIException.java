package com.julian.championgg.api;
/* Coded by Julian, 11/15/2015, 11:05 PM */

public class APIException extends Exception {
    private final int errorCode;

    public APIException(final int errorCode) {
        super(getMessage(errorCode));
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public static String getMessage(int errorCode){
        switch (errorCode) {
            case 400:
                return "Bad request";
            case 403:
                return "Forbidden";
            case 404:
                return "Requested data not found";
            case 401:
                return "Unauthorized";
            case 429:
                return "Rate limit exceeded";
            case 500:
                return "Internal server error";
            case 503:
                return "Service unavailable";
            case 600:
                return "Failed to parse";
            default:
                return "Error: Unknown";
        }
    }
}
