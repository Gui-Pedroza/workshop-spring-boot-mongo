package com.pedroza.workshopmongo.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedroza.workshopmongo.domain.Post;
import com.pedroza.workshopmongo.repository.PostRepository;
import com.pedroza.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;	
	
	public Post findById(String id) {
		Optional<Post> post = postRepository.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text) {
		return postRepository.findByTitle(text);
	}
	
	public List<Post> searchByWord(String text, LocalDate minDate, LocalDate maxDate) {
		maxDate = maxDate.plusDays(1);
		return postRepository.searchByWord(text, minDate, maxDate);
	}
	
	
	 
	
}
