package com.idexx.assesment.repository;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.idexx.assesment.config.AppConfig;
import com.idexx.assesment.model.Albumn;
import com.idexx.assesment.model.Book;

@Component
public class SearchRepository
{
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private AppConfig appConfig;

	private Logger log = LoggerFactory.getLogger(SearchRepository.class);
	
	/** Get the details of the Albumns querying the iTunes service 
	  */
	public Albumn getAlbumnsFromItunes(String searchTerm,String resultSetSize) throws Exception
	{
		log.info("Getting Albumns from Itunes {}..",searchTerm);
		
		//Querying the iTunes store for the incoming search text
		String result = restTemplate.getForObject(appConfig.getiTunesBaseUrl().concat("term=").concat(searchTerm).concat("&limit=").concat(resultSetSize), String.class);
		
		//Convert the response type application/javascrupt to POJO
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Albumn albumn = mapper.readValue(result,Albumn.class); 
		
		//Sort the Albumns based on the track name
		albumn.setResults(albumn.getResults().stream().sorted((r1,r2) -> r1.getTrackName().compareTo(r2.getTrackName())).collect(Collectors.toList()));
		
		log.info("Albumn response..."+albumn.toString());
		return albumn;
	}
	
	/** Get the details of the Books querying the google books service 
	 */
	public Book getBooksFromGBooks(String searchTerm,String resultSetSize)
	{
		
		log.info("Getting Books from Google Books {}..",searchTerm);
		
		//Querying g books rest api
		Book book = restTemplate.getForObject(appConfig.getgBooksBaseUrl().concat("q=").concat(searchTerm).concat("&maxResults=").concat(resultSetSize), Book.class);
		
		//Sort the books in the alphabetical order
		book.setItems(book.getItems().stream().sorted((b1,b2) -> b1.getVolumeInfo().getTitle().compareTo(b2.getVolumeInfo().getTitle())).collect(Collectors.toList()));
		
		log.info("Result...."+book.toString());
		return book;
	}
	
}
