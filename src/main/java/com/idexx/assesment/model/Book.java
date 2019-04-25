package com.idexx.assesment.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Book
{
	private String kind;
	private String totalItems;
	public String getKind()
	{
		return kind;
	}

	public void setKind(String kind)
	{
		this.kind = kind;
	}

	public String getTotalItems()
	{
		return totalItems;
	}

	public void setTotalItems(String totalItems)
	{
		this.totalItems = totalItems;
	}

	public List<Item> getItems()
	{
		return items;
	}

	public void setItems(List<Item> items)
	{
		this.items = items;
	}

	private List<Item> items;
	@Override
	public String toString()
	{
		return "Book [kind=" + kind + ", totalItems=" + totalItems + ", items=" + items + "]";
	}
	
}
