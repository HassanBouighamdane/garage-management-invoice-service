//package com.exemple.garagemanagementinvoiceservice.controllers;
//
//import jakarta.servlet.*;
//import jakarta.servlet.http.HttpServletResponse;import org.springframework.stereotype.Component;
//
//
//import java.util.Arrays;
//import java.util.List;
//
//import java.io.IOException;
//
//@Component
//public class CORSConfig implements Filter {
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException, IOException {
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE, PATCH");
//        response.setHeader("Access-Control-Max-Age", "3600");
//        response.setHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept");
//        response.setHeader("Access-Control-Expose-Headers", "Location");
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
