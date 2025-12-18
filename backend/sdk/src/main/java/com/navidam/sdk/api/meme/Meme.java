package com.navidam.sdk.api.meme;

import com.navidam.sdk.internal.meme.*;

public class Meme {

	String url = Memegen.ofLines(
		    MemeTemplate.GRU.id(),
		    "Cuando crees",
		    "que ya has terminado",
		    "pero el profesor dice",
		    "entrega por Git"
		).width(800).url();

}
