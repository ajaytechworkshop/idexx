package com.idexx.assesment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.idexx.assesment.model.Albumn;
import com.idexx.assesment.model.Book;
import com.idexx.assesment.repository.SearchRepository;

@Component
public class SearchService
{
	@Autowired
	private SearchRepository searchRepository;
	
	/** The method searches for the albumns from the Apple iStore */
	public Albumn getAlbumnsFromItunes(String searchTerm,String resultSetSize) throws Exception
	{
		return searchRepository.getAlbumnsFromItunes(searchTerm,resultSetSize);
	}
	
	/** The method searches for the books from the Google Book Store */
	public Book getBooksFromGBooks(String searchTerm,String resultSetSize) throws Exception
	{
		return searchRepository.getBooksFromGBooks(searchTerm,resultSetSize);
	}
}
