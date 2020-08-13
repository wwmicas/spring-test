/*
package com.tester.sgame.console.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public R handleException(Throwable e) {
        if (e instanceof InviteCodeException) {
            return R.failure(12, e);
        } else if (e instanceof ClassDisabledException) {
            return R.failure(13, e);
        } else if (e instanceof PhoneDuplicateException) {
            return R.failure(14, e);
        } else if (e instanceof InsertException) {
            return R.failure(15, e);
        } else {
            return R.failure(9999, e);
        }
    }

}
*/
