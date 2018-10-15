package course.api.torrent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import course.api.torrent.Torrent;

@RestController
public class AddNewTorrent {
	
	@RequestMapping("/addTorrent")
	public Torrent addTorrent(@RequestParam(value ="name", defaultValue = "defaulty") String name) {
		return new Torrent(name, 1, "jsfskdfh");
	}
}
