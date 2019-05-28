package com.proyecto.gestionDocumental.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class DocumentosDto implements Serializable {

	private Integer id_documento;

	private Integer id_centroEducativo;

	private Integer id_empresa;

	private Integer num_concierto;

	private Date fecha_firma;

	private String ruta_documento;

	public DocumentosDto() {

	}

	public DocumentosDto(Integer id_centroEducativo, Integer id_empresa, Integer num_concierto, Date fecha_firma,
			String ruta_documento) {
		this.id_centroEducativo = id_centroEducativo;
		this.id_empresa = id_empresa;
		this.num_concierto = num_concierto;
		this.fecha_firma = fecha_firma;
		this.ruta_documento = ruta_documento;
	}

	public Integer getIdDocumento() {
		return id_documento;
	}

	public Integer getIdCentroEducativo() {
		return id_centroEducativo;
	}

	public void setIdCentroEducativo(Integer id_centroEducativo) {
		this.id_centroEducativo = id_centroEducativo;
	}

	public Integer getIdEmpresa() {
		return id_empresa;
	}

	public void setIdEmpresa(Integer id_empresa) {
		this.id_empresa = id_empresa;
	}

	public Integer getNumConcierto() {
		return num_concierto;
	}

	public void setNumConcierto(Integer num_concierto) {
		this.num_concierto = num_concierto;
	}

	public Date getFechaFirma() {
		return fecha_firma;
	}

	public void setFechaFirma(Date fecha_firma) {
		this.fecha_firma = fecha_firma;
	}

	public String getRuta() {
		return ruta_documento;
	}

	public void setRuta(String ruta) {
		this.ruta_documento = ruta;
	}

}
