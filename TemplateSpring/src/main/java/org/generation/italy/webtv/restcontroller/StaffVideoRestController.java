package org.generation.italy.webtv.restcontroller;

import org.generation.italy.webtv.repository.StaffVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/...")
public class StaffVideoRestController {
	
	@Autowired
	StaffVideoRepository staffVideoRepository;
	
}
