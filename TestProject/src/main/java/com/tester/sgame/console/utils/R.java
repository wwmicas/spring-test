/*
package com.tester.sgame.console.utils;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class R {

    private Integer state;
    private String message;

    public static R ok() {
        return new R().setState(State.OK);
    }

    public static R failure(Integer state, String message) {
        return new R().setState(state).setMessage(message);
    }

    public static R failure(Integer state, Throwable e) {
        return failure(state, e.getMessage());
    }

    public static interface State {
        int OK = 0;
        int ERR_INVITE_CODE = 4001;
        int ERR_CLASS_DISABLED = 4002;
        int ERR_PHONE_DUPLICATE = 4003;
        int ERR_INSERT = 4004;
        int ERR_UNKNOWN = 9999;
    }

}
*/
