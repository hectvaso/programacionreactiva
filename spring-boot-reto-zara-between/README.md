# Reto proceso de selección Between - Zara
Este proyecto tiene como propósito dar solición al reto para ingresar al cliente Zara por medio de la empresa Between

## Descripción del reto
En la base de datos de comercio electrónico de la compañía disponemos de la tabla PRICES que refleja el precio final (pvp) y la tarifa que aplica a un  producto de una cadena entre unas fechas determinadas. A continuación se muestra un ejemplo de la tabla con los campos relevantes:
. <br/>


Campos: 

 

BRAND_ID: foreign key de la cadena del grupo (1 = ZARA).

START_DATE , END_DATE: rango de fechas en el que aplica el precio tarifa indicado.

PRICE_LIST: Identificador de la tarifa de precios aplicable.

PRODUCT_ID: Identificador código de producto.

PRIORITY: Desambiguador de aplicación de precios. Si dos tarifas coinciden en un rago de fechas se aplica la de mayor prioridad (mayor valor numérico).

PRICE: precio final de venta.

CURR: iso de la moneda.
.<br/> 

Se pide:Construir una aplicación/servicio en SpringBoot que provea una end point rest de consulta  tal que:
        Acepte como parámetros de entrada: fecha de aplicación, identificador de producto, identificador de cadena.
        Devuelva como datos de salida: identificador de producto, identificador de cadena, tarifa a aplicar, fechas 
		de aplicación y precio final a aplicar.
. <br/>


HTTP Operación | End Points | Propósito
------------ | ------------- | --------------|
**POST** | localhost:8080/getPrice | consulta el precio de un producto dado un rango de fechas


Se debe desplegar el servicio y la data de ejemplo para probarlo sería el siguiente:



 **REQUEST **<br/>

``````
		{  
   "data":[  
      {  
         "header":{  
            "id":"12345",
            "type":"TestGiraffeRefrigerator"
         },
        "product":{
            "productId": 35455,
        "startDate": "2020-12-31 23:59:59",
        "endDate": "2020-06-14 00:00:00",
        "brandId": 1
        }}
   ]
}


		
``````

Deberia retornar : 

 **RESPONSE **<br/>

``````
	{
    "data": [
        {
            "header": null,
            "response": {
                "productId": 35455,
                "brandId": 1,
                "price": 35.5,
                "startDate": "2020-06-14T05:00:00.000+00:00",
                "endDate": "2021-01-01T04:59:59.000+00:00",
                "rateIdentifier": 1
            }
        }
    ]
}

		
``````



