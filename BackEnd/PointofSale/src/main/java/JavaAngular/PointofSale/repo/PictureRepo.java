package JavaAngular.PointofSale.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaAngular.PointofSale.model.Picture;
import jakarta.transaction.Transactional;

public interface PictureRepo extends JpaRepository<Picture,Long> {

	@Transactional
	void deletePictureById(Long id);

	Optional<Picture> findPictureById(Long id);
}
