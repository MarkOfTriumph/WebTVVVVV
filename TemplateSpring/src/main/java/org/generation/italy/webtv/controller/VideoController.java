package org.generation.italy.webtv.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.generation.italy.webtv.model.Video;
import org.generation.italy.webtv.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/videos")
public class VideoController {
	
	@Autowired
	VideoRepository videoRepository;

	List<Video> listaVideoHomeUtente = new ArrayList<>();

	public VideoController() {
	}

	@GetMapping("/elenco")
	public String getAll(Model model) {


		listaVideoHomeUtente = videoRepository.findAll();
		model.addAttribute("elenco", listaVideoHomeUtente);
		return "/videos/elenco";
	}
	
	
	@GetMapping("/dettaglio/{titolo}")
public String dettaglioVideo(Model model, @PathVariable String titolo) {
		
		Optional<Video> optVideo=videoRepository.findByTitoloIgnoreCase(titolo);
		if (optVideo.isPresent())		
		{
			Video v= optVideo.get();
			
			model.addAttribute("video",v);
			return "videos/dettaglio"; 		
		}
		else
			return "nontrovato";
	}
	

}
