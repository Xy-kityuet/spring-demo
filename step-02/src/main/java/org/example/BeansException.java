package org.example;

/**
 * @author : YeHaiD
 * @Date 2023-05-08 11:30
 * @Description:
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }
    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
