package com.navidam.sdk.api.meme;

import com.navidam.sdk.internal.meme.*;

public class Meme {

	public static void main(String[] args) {
		String url = Memegen.of(MemeTemplate.GRU.id(), "Feliz navidad", "y que apruebes todas", "o si no...",
				"nos vemos el curso que viene").width(800).url();

		System.out.println(url);

	}
}
