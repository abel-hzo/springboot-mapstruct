package com.abelhzo.mapstruct.dtos;

/**
 * @author: Abel HZO
 * @project: springboot-mapstruct
 * @file: TaxDTO.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Viernes 30 Junio 2023, 11:35:24.
 * @description: El presente archivo TaxDTO.java fue creado por Abel HZO.
 */
public class TaxDTO {

	private Long idProduct;
	private String iva;
	private String priceWithTax; // = (price * .16) + price

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getIva() {
		return iva;
	}

	public void setIva(String iva) {
		this.iva = iva;
	}

	public String getPriceWithTax() {
		return priceWithTax;
	}

	public void setPriceWithTax(String priceWithTax) {
		this.priceWithTax = priceWithTax;
	}

	@Override
	public String toString() {
		return "TaxDTO [idProduct=" + idProduct + ", iva=" + iva + ", priceWithTax=" + priceWithTax + "]";
	}

}
