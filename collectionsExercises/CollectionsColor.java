package com.fdmgroup.collectionsExercises;

import java.awt.Color;
import java.util.HashMap;

public class CollectionsColor {

	HashMap<String, Color> ddHashmap = new HashMap<String, Color>();

	public void addColor() {

		ddHashmap.put("red", Color.red);
		ddHashmap.put("green", Color.green);
		ddHashmap.put("blue", Color.blue);
		ddHashmap.put("white", Color.white);

	}

	public HashMap<String, Color> getAllColors() {
		return ddHashmap;
	}

	public Color findColor(String color) {
		Color value = ddHashmap.get(color);
		return value;
	}

	public static void main(String[] args) {

		CollectionsColor myColor = new CollectionsColor();
		myColor.addColor();
		HashMap<String, Color> mymycolor = myColor.getAllColors();
		System.out.println("All:" + mymycolor);
		System.out.println("Blue:" + myColor.findColor("blue"));

	}

}
