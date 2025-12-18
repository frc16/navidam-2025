package com.navidam.sdk.api;

import com.navidam.sdk.api.melodias.Evangelion;
import com.navidam.sdk.api.melodias.JingleBell;
import com.navidam.sdk.api.plantilla.PlantillaRoja;
import com.navidam.sdk.internal.html.Plantilla;
import com.navidam.sdk.internal.melodia.Melodia;

import java.util.List;

public class NaviDAMAPI {

    private static NaviDAMAPI instace;

    public static NaviDAMAPI getInstance() {
        if (instace == null) {
            instace = new NaviDAMAPI();
        }
        return instace;
    }

    public List<Melodia> listadoMelodias() {
        return List.of(
                // LaVacaLola.crear()
        		Evangelion.crear(),
        		JingleBell.crear()
        );
    }

    public List<Plantilla> listadoPlantillas() {
        return List.of(
                // new Plantilla("demo").path("demo.html")
        		PlantillaRoja.crear(),
        		new Plantilla ("PlantillaRoja").path("PlantillaRoja.html")
        );
    }
}
