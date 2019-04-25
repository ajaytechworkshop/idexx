package com.idexx.assesment.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Result
{
	private String wrapperType;
	private String kind;
	private String artistId;
	private String collectionId;
	private String trackId;
	private String artistName;
	private String collectionName;
	private String trackName;
	private String collectionCensoredName;
	private String trackCensoredName;
	private String artistViewUrl;
	private String collectionViewUrl;
	private String trackViewUrl;
	private String collectionPrice;
	private String trackPrice;
	private String collectionExplicitness;
	private String discCount;
	private String discNumber;
	private String trackCount;
	private String trackNumber;
	private String country;
	private String currency;
	private String primaryGenreName;
	private String previewUrl;
	public String getWrapperType()
	{
		return wrapperType;
	}
	public void setWrapperType(String wrapperType)
	{
		this.wrapperType = wrapperType;
	}
	public String getKind()
	{
		return kind;
	}
	public void setKind(String kind)
	{
		this.kind = kind;
	}
	public String getArtistId()
	{
		return artistId;
	}
	public void setArtistId(String artistId)
	{
		this.artistId = artistId;
	}
	public String getCollectionId()
	{
		return collectionId;
	}
	public void setCollectionId(String collectionId)
	{
		this.collectionId = collectionId;
	}
	public String getTrackId()
	{
		return trackId;
	}
	public void setTrackId(String trackId)
	{
		this.trackId = trackId;
	}
	public String getArtistName()
	{
		return artistName;
	}
	public void setArtistName(String artistName)
	{
		this.artistName = artistName;
	}
	public String getCollectionName()
	{
		return collectionName;
	}
	public void setCollectionName(String collectionName)
	{
		this.collectionName = collectionName;
	}
	public String getTrackName()
	{
		return trackName;
	}
	public void setTrackName(String trackName)
	{
		this.trackName = trackName;
	}
	public String getCollectionCensoredName()
	{
		return collectionCensoredName;
	}
	public void setCollectionCensoredName(String collectionCensoredName)
	{
		this.collectionCensoredName = collectionCensoredName;
	}
	public String getTrackCensoredName()
	{
		return trackCensoredName;
	}
	public void setTrackCensoredName(String trackCensoredName)
	{
		this.trackCensoredName = trackCensoredName;
	}
	public String getArtistViewUrl()
	{
		return artistViewUrl;
	}
	public void setArtistViewUrl(String artistViewUrl)
	{
		this.artistViewUrl = artistViewUrl;
	}
	public String getCollectionViewUrl()
	{
		return collectionViewUrl;
	}
	public void setCollectionViewUrl(String collectionViewUrl)
	{
		this.collectionViewUrl = collectionViewUrl;
	}
	public String getTrackViewUrl()
	{
		return trackViewUrl;
	}
	public void setTrackViewUrl(String trackViewUrl)
	{
		this.trackViewUrl = trackViewUrl;
	}
	public String getCollectionPrice()
	{
		return collectionPrice;
	}
	public void setCollectionPrice(String collectionPrice)
	{
		this.collectionPrice = collectionPrice;
	}
	public String getTrackPrice()
	{
		return trackPrice;
	}
	public void setTrackPrice(String trackPrice)
	{
		this.trackPrice = trackPrice;
	}
	public String getCollectionExplicitness()
	{
		return collectionExplicitness;
	}
	public void setCollectionExplicitness(String collectionExplicitness)
	{
		this.collectionExplicitness = collectionExplicitness;
	}
	public String getDiscCount()
	{
		return discCount;
	}
	public void setDiscCount(String discCount)
	{
		this.discCount = discCount;
	}
	public String getDiscNumber()
	{
		return discNumber;
	}
	public void setDiscNumber(String discNumber)
	{
		this.discNumber = discNumber;
	}
	public String getTrackCount()
	{
		return trackCount;
	}
	public void setTrackCount(String trackCount)
	{
		this.trackCount = trackCount;
	}
	public String getTrackNumber()
	{
		return trackNumber;
	}
	public void setTrackNumber(String trackNumber)
	{
		this.trackNumber = trackNumber;
	}
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public String getCurrency()
	{
		return currency;
	}
	public void setCurrency(String currency)
	{
		this.currency = currency;
	}
	public String getPrimaryGenreName()
	{
		return primaryGenreName;
	}
	public void setPrimaryGenreName(String primaryGenreName)
	{
		this.primaryGenreName = primaryGenreName;
	}
	public String getPreviewUrl()
	{
		return previewUrl;
	}
	public void setPreviewUrl(String previewUrl)
	{
		this.previewUrl = previewUrl;
	}
	
	@Override
	public String toString()
	{
		return "Result [kind=" + kind + ", artistId=" + artistId + ", collectionId=" + collectionId + ", trackId="
				+ trackId + ", artistName=" + artistName + ", collectionName=" + collectionName + ", trackName="
				+ trackName + ", collectionCensoredName=" + collectionCensoredName + ", trackCensoredName="
				+ trackCensoredName + ", artistViewUrl=" + artistViewUrl + ", collectionViewUrl=" + collectionViewUrl
				+ ", collectionPrice=" + collectionPrice + ", trackPrice=" + trackPrice + ", country=" + country
				+ ", currency=" + currency + "]";
	}
}
