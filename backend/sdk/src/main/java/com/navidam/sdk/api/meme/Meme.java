package com.navidam.sdk.api.meme;

import com.navidam.sdk.internal.meme.*;

public class Meme {

		String url = Memegen.of(
			    MemeTemplate.CAPTAIN_AMERICA.id(),
			    "Yo",
			    "Vacaciones de Navidad",
			    "Exámenes en enero"
			).width(800).url();
}
