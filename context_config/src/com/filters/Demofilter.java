package com.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


//@WebFilter("/Demofilter")
public class Demofilter implements Filter {


	@Override
	public void destroy() {
		
		
		
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		chain.doFilter(request, response);
		
		
		System.out.println("filter is invoked");
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("filter initialized");
		
		
	}

}
