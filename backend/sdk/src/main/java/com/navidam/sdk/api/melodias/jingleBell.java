package com.navidam.sdk.api.melodias;
import com.navidam.sdk.internal.melodia.*;
public class jingleBell {


		public static Melodia crear() {
			
			return new Melodia("Jingle Bell")
				.instrumento(Instrumento.PIANO_ACUSTICO)
				.tempo(131)
				.nota(Nota.SOL, Figura.NEGRA)
				.nota(Nota.DO, Figura.NEGRA)
				.nota(Nota.SI, Figura.NEGRA)
				.nota(Nota.DO, Figura.NEGRA)
				.nota(Nota.LA, Figura.NEGRA)
				.nota(Nota.LA, Figura.NEGRA)
				.nota(Nota.RE, Figura.NEGRA)
				.nota(Nota.DO, Figura.NEGRA)
				.nota(Nota.LA, Figura.NEGRA)
				.nota(Nota.LA, Figura.NEGRA)
				.nota(Nota.SOL, Figura.NEGRA)
				.nota(Nota.DO, Figura.NEGRA)
				.nota(Nota.SI, Figura.NEGRA)
				.nota(Nota.DO, Figura.NEGRA)
				.nota(Nota.LA, Figura.NEGRA)
				.nota(Nota.FA, Figura.NEGRA)
				.nota(Nota.SOL, Figura.NEGRA)
				.nota(Nota.LA, Figura.NEGRA)
				.nota(Nota.SOL, Figura.NEGRA)
				.nota(Nota.SOL, Figura.NEGRA)
				.nota(Nota.SOL, Figura.NEGRA)
				.nota(Nota.FA, Figura.NEGRA)
				.nota(Nota.MI, Figura.NEGRA);		
		}
		
		public static void Main(String[] args) throws Exception{
			Melodia m = jingleBell.crear();
					
			m.escuchar();
		}
}
