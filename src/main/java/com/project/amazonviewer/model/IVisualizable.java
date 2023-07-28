package com.project.amazonviewer.model;

import java.util.Date;


public interface IVisualizable {

    /**
     * Este metodo captura el tiempo exacto de visualizacion.
     *
     * @param dateI es un objeto de tipo {@code Date} con el tiempo de inicio exacto.
     * @return Devuelve la fecha y hora capturada
     * */
    Date startToSee(Date dateI);

    /**
     * Este metodo captura el tiempo exacto de inicio y final de visualizacion.
     *
     * @param dateI es un objeto de tipo {@code Date} con el tiempo de inicio exacto.
     * @param dateF es un objeto de tipo {@code Date} con el tiempo final exacto.
     * */
    void stopToSee(Date dateI, Date dateF);
}
