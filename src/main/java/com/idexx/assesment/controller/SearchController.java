package com.idexx.assesment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idexx.assesment.model.Albumn;
import com.idexx.assesment.model.Book;
import com.idexx.assesment.service.SearchService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class SearchController
{
	@Autowired
	private SearchService searchService;

	private static final Logger log = LoggerFactory.getLogger(SearchController.class);
	
	@GetMapping
	public String get()
	{
		return "IDEXX Assesment app";
	}
	
	@GetMapping("/api/search/albumns")
	@ApiOperation(value="Responds with the albumns for the incoming search text from iTunes store")
	@ApiResponses(value= {
	@ApiResponse(code=200,message="Records retrieved successfully"),
	@ApiResponse(code=404,message="No records retrieved"),
	@ApiResponse(code=500,message="Internal Server error")})
	public Albumn getAlbumns(@ApiParam(name="q",value="The input string to search") @RequestParam(name="q") String searchTerm,
			@ApiParam(name="count",value="The szie of the resultset",defaultValue="5") @RequestParam(name="count",defaultValue="5") String count) throws Exception
	{
		return searchService.getAlbumnsFromItunes(searchTerm,count);
	}
	
	@GetMapping("/api/search/books")
	@ApiOperation(value="Responds with the books for the incoming search text from google books store")
	@ApiResponses(value= {
	@ApiResponse(code=200,message="Records retrieved successfully"),
	@ApiResponse(code=404,message="No records retrieved"),
	@ApiResponse(code=500,message="Internal Server error")})
	public Book getBooks(@ApiParam(name="q",value="The input string to search") @RequestParam(name="q") String searchTerm,
			@ApiParam(name="count",value="The szie of the resultset",defaultValue="5") @RequestParam(name="count",defaultValue="5") String count) throws Exception
	{
		return searchService.getBooksFromGBooks(searchTerm,count);
	}
}
