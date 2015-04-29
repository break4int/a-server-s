package co.kr.abiyo.api.common;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import co.kr.abiyo.dao.DeviceDAO;
import co.kr.abiyo.vo.DeviceVO;

public class AuthenticationFilter extends OncePerRequestFilter {
	@Autowired
	DeviceDAO				deviceDAO;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		response.addHeader("X-Server-Type", "spring");
		
		
		chain.doFilter(request, response);
	}
	
	
	
	

}
