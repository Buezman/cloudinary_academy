package cld_intro_java;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@SuppressWarnings("unused")
public class Upload {

	public static void runner(Cloudinary cloudinary) {
		try {
			// Use an empty map for no options

			// upload an image with no options
			 CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg", ObjectUtils.emptyMap()));

			// upload a video
			// CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/earth.mp4", 
			// 		ObjectUtils.asMap("resource_type", "video")));

			// CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/earth.mp4", 
			// ObjectUtils.asMap("resource_type", "auto")));

			// upload a raw file
			// CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/BLKCHCRY.TTF", 
			// 		ObjectUtils.asMap("resource_type", "raw")));

			// upload an image with public_id
			// CourseUtils
			// 		.jsonPrint(cloudinary.uploader().upload("./assets/dog.jpg", ObjectUtils.asMap("public_id", "dog")));

			// upload a video with public_id
			// CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/earth.mp4",
			// 		ObjectUtils.asMap("resource_type", "video", "public_id", "earth")));

			// With use_filename and not unique filename - the public id will be the
			// filename
			// CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg",
			// 		ObjectUtils.asMap("use_filename", true, "unique_filename", false)));

			// Upload image to a folder using public id
			// CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg",
			// 		ObjectUtils.asMap("public_id", "food/my_favorite/cheesecake")));

			// Upload image to a folder using folder
			// CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/dog.jpg", 
			// 		ObjectUtils.asMap("folder", "pets/my_favorite")));

			// Upload a remote asset
			// CourseUtils.jsonPrint(cloudinary.uploader().upload("https://cloudinary-training.github.io/cld-intro-java/assets/chick.jpg", 
			// 		ObjectUtils.emptyMap()));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
