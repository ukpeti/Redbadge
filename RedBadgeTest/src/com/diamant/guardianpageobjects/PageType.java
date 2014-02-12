package com.diamant.guardianpageobjects;

public enum PageType {

	REPORT(
			"http://ocl-dev.swissbank.com:8280/ocl-webapp/reports/viewreportdefinitions.do"), 
	AMENDMENTS(
			"http://ocl-dev.swissbank.com:8280/ocl-webapp/adjustments/list.do");

	private String url;

	private PageType(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

}
