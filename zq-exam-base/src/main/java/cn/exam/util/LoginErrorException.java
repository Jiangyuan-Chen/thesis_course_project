package cn.exam.util;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;


/**
 * @author chenjiangyuan
 */
@Component
@ControllerAdvice
@NoArgsConstructor
public class LoginErrorException extends RuntimeException{


	private static final long serialVersionUID = 1619608851116846459L;

	private String errorCode;
    private String errorMsg;

    public LoginErrorException(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

}
