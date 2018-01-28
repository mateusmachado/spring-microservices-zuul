package com.cloud;

public class ZuulFilter extends com.netflix.zuul.ZuulFilter {

	@Override
	public Object run() {
		System.out.println("This request has passed through the custom Zuul Filter..");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
