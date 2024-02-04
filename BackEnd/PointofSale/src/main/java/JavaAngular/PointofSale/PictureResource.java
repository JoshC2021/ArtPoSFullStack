package JavaAngular.PointofSale;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaAngular.PointofSale.model.Picture;
import JavaAngular.PointofSale.service.PictureService;

@RestController
@RequestMapping("/picture")
public class PictureResource {
	

	private final PictureService picService;
	
	public PictureResource(PictureService picService) {
		this.picService = picService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Picture>> getAllPictures () {
		List<Picture> pictures = picService.findAllPictures();
		return new ResponseEntity<>(pictures, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Picture> getPictureById (@PathVariable("id") Long id) {
		Picture picture = picService.findPictureById(id);
		return new ResponseEntity<>(picture, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Picture> addPicture(@RequestBody Picture picture) {
		Picture newPicture = picService.addPicture(picture);
		return new ResponseEntity<>(newPicture, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Picture> updatePicture(@RequestBody Picture picture) {
		Picture updatedPicture = picService.updatePicture(picture);
		return new ResponseEntity<>(updatedPicture, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Long> deletePicture(@PathVariable("id") Long id) {
		picService.deletePicture(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
}
