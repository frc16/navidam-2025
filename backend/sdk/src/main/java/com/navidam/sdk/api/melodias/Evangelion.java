package com.navidam.sdk.api.melodias;

import com.navidam.sdk.internal.melodia.*;

public class Evangelion {

	public static Melodia crear() {
		
	        return new Melodia("Evangelion")
	            .instrumento(Instrumento.FLAUTA_DULCE)
	            .tempo(120)
	            .nota(Nota.SOL, Figura.NEGRA)
	            .nota(Nota.SOL, Figura.NEGRA)
	            .nota(Nota.LA, Figura.NEGRA)
	            .nota(Nota.SOL, Figura.BLANCA)
	        	.nota(Nota.RE, Figura.NEGRA)
	        	.nota(Nota.MI, Figura.NEGRA)
	        	.nota(Nota.FA, Figura.NEGRA)
	        	.nota(Nota.MI, Figura.BLANCA)
	        	.nota(Nota.LA, Figura.NEGRA)
	        	.nota(Nota.LA, Figura.NEGRA)
	        	.nota(Nota.SOL, Figura.NEGRA)
	        	.nota(Nota.FA, Figura.BLANCA);
	}
}
