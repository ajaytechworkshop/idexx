package com.idexx.assesment.model;

import java.util.Arrays;

public class VolumeInfo
{
	private String title;
	private String[] authors;
	private String publisher;
	private String publishedDate;
	private String description;
	private String pageCount;
	private String printType;
	private String[] categories;
	private String averageRating;
	private String ratingCount;
	private String language;
	private String previewLink;
	private String infoLink;
	
	public String getPublisher()
	{
		return publisher;
	}
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	public String getPublishedDate()
	{
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate)
	{
		this.publishedDate = publishedDate;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public String getPageCount()
	{
		return pageCount;
	}
	public void setPageCount(String pageCount)
	{
		this.pageCount = pageCount;
	}
	public String getPrintType()
	{
		return printType;
	}
	public void setPrintType(String printType)
	{
		this.printType = printType;
	}
	public String[] getCategories()
	{
		return categories;
	}
	public void setCategories(String[] categories)
	{
		this.categories = categories;
	}
	public String getAverageRating()
	{
		return averageRating;
	}
	public void setAverageRating(String averageRating)
	{
		this.averageRating = averageRating;
	}
	public String getRatingCount()
	{
		return ratingCount;
	}
	public void setRatingCount(String ratingCount)
	{
		this.ratingCount = ratingCount;
	}
	public String getLanguage()
	{
		return language;
	}
	public void setLanguage(String language)
	{
		this.language = language;
	}
	public String getPreviewLink()
	{
		return previewLink;
	}
	public void setPreviewLink(String previewLink)
	{
		this.previewLink = previewLink;
	}
	public String getInfoLink()
	{
		return infoLink;
	}
	public void setInfoLink(String infoLink)
	{
		this.infoLink = infoLink;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String[] getAuthors()
	{
		return authors;
	}
	public void setAuthors(String[] authors)
	{
		this.authors = authors;
	}
	@Override
	public String toString()
	{
		return "VolumeInfo [title=" + title + ", authors=" + Arrays.toString(authors) + ", publisher=" + publisher
				+ ", publishedDate=" + publishedDate + ", description=" + description + ", pageCount=" + pageCount
				+ ", printType=" + printType + ", categories=" + Arrays.toString(categories) + ", language=" + language
				+ ", previewLink=" + previewLink + ", infoLink=" + infoLink + "]";
	}
}
