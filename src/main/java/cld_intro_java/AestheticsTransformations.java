package cld_intro_java;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;
import com.cloudinary.transformation.Layer;
import com.cloudinary.transformation.TextLayer;

public class AestheticsTransformations {
	
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void runner(Cloudinary cloudinary) {
		try {

			// Radius rounded corners and transparent background
		    // System.out
			//  		.println(cloudinary.url().transformation(new Transformation().width(300).height(300).crop("thumb")
			// 				.gravity("auto").fetchFormat("auto").quality("auto").radius("max"))
			// 				.generate("dog"));

			// Borders '10px_solid_rgb:bde4fb'
			// System.out
			// 	.println(cloudinary.url()
			// 		.transformation(new Transformation().border("10px_solid_rgb:E30B5D").width(400).height(400)
			// 		.crop("fill").gravity("auto").fetchFormat("auto").quality("auto").radius("max"))
			// 		.generate("blackberry"));

			// resize to a square and pad
			// change AR to a square
			// System.out
			// 		.println(cloudinary.url()
			// 				.transformation(new Transformation().width(300).height(300).crop("pad")
			// 				.fetchFormat("auto").quality("auto").background("red"))
			// 				.generate("face"));

			// Effects and Filters
			// color tint
			// System.out.println(cloudinary.url()
			// 		.transformation(new Transformation().width(300).height(300).crop("thumb").gravity("face")
			// 		.fetchFormat("auto").quality("auto").radius("max").effect("tint:40:magenta"))
			// 		.generate("face"));

			// Duotone: chained transformation grayscale + tint, each effect needs its own
			// layer
			// System.out.println(cloudinary.url()
			// 		.transformation(new Transformation().width(300).height(300).crop("thumb").gravity("face")
			// 		.radius("max").effect("grayscale").chain().effect("tint:40:magenta").chain()
			// 		.fetchFormat("auto").quality("auto"))
			// 		.generate("face"));

			// Improve color, contrast, lightness
			// System.out.println(cloudinary.url()
			// 		.transformation(new Transformation()
			// 		.effect("improve:outdoor"))
			// 		.generate("eagle-fish.jpg"));

			// Art Filters
			// Cartoonify
			// System.out
			// 		.println(cloudinary
			// 				.url().transformation(new Transformation().width(800).height(600).crop("fill")
			// 				.gravity("auto").fetchFormat("auto").quality("auto").effect("cartoonify"))
			// 				.generate("eagle-fish.jpg"));

			// Outline effect for transparent images
			// System.out.println(cloudinary.url().transformation(
			// 		new Transformation().width(300).crop("scale").effect("outline:15").color("orange")
			// 		.quality("auto").fetchFormat("auto"))
			// 		.generate("grapes.png"));

			// Overlay
			// Text over image
			// System.out.println(cloudinary.url()
			// 		.transformation(new Transformation().width(300).height(300).crop("thumb").chain()
			// 		.overlay(new TextLayer().fontFamily("Arial").text("Tutoring").fontSize(30))
			// 		.background("white").color("blue").gravity("north_west").x(10).y(10))
			// 		.generate("faces.jpg"));

			// Image over image
			// System.out.println(cloudinary.url()
			// 		.transformation(new Transformation().width(300).height(300).crop("thumb").chain()
			// 		.overlay(new Layer().publicId("logo")).height("50").gravity("south_west").x(10).y(10))
			// 		.generate("faces.jpg"));

			// Text over video
			// System.out.println(cloudinary.url().resourceType("video")
			// 		.transformation(new Transformation().width(300).crop("scale").chain()
			// 		.overlay(new TextLayer().fontFamily("Arial").text("Earth").fontSize(30)).background("white")
			// 		.color("blue").gravity("north_west").x(10).y(10))
			// 		.generate("earth.mp4"));

			// Image over video
			// System.out.println(cloudinary.url().resourceType("video")
			// 		.transformation(new Transformation().width(400).crop("scale").chain()
			// 		.overlay(new Layer().publicId("logo")).height("50").gravity("north_west").x(10).y(10))
			// 		.generate("earth.mp4"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
