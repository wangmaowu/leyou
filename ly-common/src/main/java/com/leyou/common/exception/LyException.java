package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author the one
 * @create 2019-01-18 18:39
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LyException extends RuntimeException {

    public ExceptionEnum exceptionEnum;

}
