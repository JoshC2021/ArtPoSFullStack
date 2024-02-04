package JavaAngular.PointofSale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaAngular.PointofSale.exception.UserNotFoundByException;
import JavaAngular.PointofSale.model.Picture;
import JavaAngular.PointofSale.repo.PictureRepo;

@Service
public class PictureService {
	public final PictureRepo picRepo;
	
	
	@Autowired
	public PictureService(PictureRepo picRepo)
	{
		this.picRepo = picRepo;
	}
	
	public Picture addPicture(Picture pic)
	{
		return picRepo.save(pic);
	}
	
	public List<Picture> findAllPictures()
	{
		return picRepo.findAll();
	}
	
	public Picture updatePicture(Picture pic)
	{
		return picRepo.save(pic);
	}
	
	public Picture findPictureById(Long id)
	{
		return picRepo.findPictureById(id)
				.orElseThrow(() -> new UserNotFoundByException("User by id " + id + " was not found"));
	}
	
	public void deletePicture(Long id)
	{
		picRepo.deletePictureById(id);
	}
	
}
