package cld_intro_java;


import com.cloudinary.Cloudinary;

public class Main {

	public static void main(String[] args) throws Exception {
		Cloudinary cloudinary = new Cloudinary(System.getenv("CLOUDINARY_URL"));
		System.out.println(cloudinary.config.cloudName);
		
		Upload.runner(cloudinary);
		

	}

}