package cld_intro_java;

import java.util.Map;

import com.google.gson.GsonBuilder;

public class CourseUtils {
	public static void jsonPrint(Map<?,?> result) {
		System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(result));
	}

}
