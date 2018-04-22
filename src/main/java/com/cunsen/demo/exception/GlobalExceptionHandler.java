package com.cunsen.demo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	public static final String DEFAULT_ERROR_VIEW = "error";
	
	@ExceptionHandler(value=Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception e ) throws Exception{
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.addObject("url", req.getRequestURL());
		mav.setViewName(DEFAULT_ERROR_VIEW);
		return mav;
	}
//	@ExceptionHandler(value=MyException.class)
//	@ResponseBody
//	public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req,MyException e){
//		
//		ErrorInfo<String> ei = new ErrorInfo<String>();
//		ei.setMessage(e.getMessage());
//		ei.setCode(ErrorInfo.ERROR);
//		ei.setData("get some data");
//		ei.setUrl(req.getRequestURL().toString());
//		
//		return ei;
//	}
}
