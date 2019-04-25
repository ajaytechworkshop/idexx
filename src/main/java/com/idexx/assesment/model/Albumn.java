package com.idexx.assesment.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Albumn
{
	private String resultCount;
	private List<Result> results;
	
	public String getResultCount()
	{
		return resultCount;
	}
	public void setResultCount(String resultCount)
	{
		this.resultCount = resultCount;
	}
	public List<Result> getResults()
	{
		return results;
	}
	public void setResults(List<Result> results)
	{
		this.results = results;
	}
	
	@Override
	public String toString()
	{
		return "Albumn [resultCount=" + resultCount + ", results=" + results + "]";
	}
	
	
}
