package cld_intro_java;

import com.cloudinary.Cloudinary;

public class Main {

	public static void main(String[] args) throws Exception {
		Cloudinary cloudinary = new Cloudinary(System.getenv("CLOUDINARY_URL"));
		cloudinary.config.secure = true;
		System.out.println(cloudinary.config.cloudName);

		 Upload.runner(cloudinary);

		// CloudinaryUtils.runner(cloudinary);

		// AutouploadFetch.runner(cloudinary);

		// Manage.runner(cloudinary);

		// UploadForTransformations.runner(cloudinary);

		// OptimizeTransformations.runner(cloudinary);

		// AestheticsTransformations.runner(cloudinary);

		// Presets.runner(cloudinary);

		// NamedTransformations.runner(cloudinary);
	}
}
