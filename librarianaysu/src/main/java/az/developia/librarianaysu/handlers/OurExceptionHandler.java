package az.developia.librarianaysu.handlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import az.developia.librarianaysu.exception.OurException;
import az.developia.librarianaysu.models.MyFE;
import az.developia.librarianaysu.response.ErrorResponse;

@RestControllerAdvice
public class OurExceptionHandler {

	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ErrorResponse handleException(OurException exc) {
		ErrorResponse resp = new ErrorResponse();
		resp.setMessage(exc.getMessage());
		BindingResult br = exc.getBr();
		List<FieldError> fieldErrors = br.getFieldErrors();
		List<MyFE> errors = new ArrayList<MyFE>();
		for (FieldError e : fieldErrors) {
			MyFE myFE = new MyFE();
			myFE.setField(e.getField());
			myFE.setMessage(e.getDefaultMessage());
			errors.add(myFE);
		}
		resp.setFieldErrors(errors);
		return resp;
	}
}
