package com.navidam.sdk.api.meme;

import com.navidam.sdk.internal.meme.*;

public class Meme {

		String url = Memegen.of(
			    MemeTemplate.CAPTAIN_AMERICA.id(),
			    "Yo",
			    "Vacaciones de Navidad",
			    "Exámenes en enero"
			).width(800).url();
	public static void main(String[] args) {
		String url = Memegen.of(MemeTemplate.GRU.id(), "Feliz navidad", "y que apruebes todas", "o si no...",
				"nos vemos el curso que viene").width(800).url();

		System.out.println(url);

	}
}
