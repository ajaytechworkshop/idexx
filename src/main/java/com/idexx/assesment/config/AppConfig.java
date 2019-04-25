package com.idexx.assesment.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(value="appconfig")
public class AppConfig
{
	private String resultSize;
	private String iTunesBaseUrl;
	private String gBooksBaseUrl;
	
	public String getResultSize()
	{
		return resultSize;
	}
	public void setResultSize(String resultSize)
	{
		this.resultSize = resultSize;
	}
	public String getiTunesBaseUrl()
	{
		return iTunesBaseUrl;
	}
	public void setiTunesBaseUrl(String iTunesBaseUrl)
	{
		this.iTunesBaseUrl = iTunesBaseUrl;
	}
	public String getgBooksBaseUrl()
	{
		return gBooksBaseUrl;
	}
	public void setgBooksBaseUrl(String gBooksBaseUrl)
	{
		this.gBooksBaseUrl = gBooksBaseUrl;
	}
	
	
	
}
