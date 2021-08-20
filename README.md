# LiferayExercise

Ejercicio propuesto para la Evaluación de la empresa Liferay. 

Autor: Sergio Jiménez del Coso.

Respuestas del Ejercicio:

1. Véase en el código propuesto del Proyecto LiferayLevel0.

2. Para testear esta aplicación podemos utilizar una serie de tests unitarios. Para la realización de este tipo de tests, podemos emplear tanto el método de caja blanca y de caja negra:

    a) Para los tests de caja blanca, en cada uno de los métodos derivados de *calculateTotalPrice()* podemos definir una serie de productos que tendrá nuestro artículo y así crear diferentes casos de tests: si el valor del precio final no redondea a 0.05 tanto si contiene un impuesto del 5% o del 10%, si el valor del precio no redondea a las centenas, si el producto es importado y no pertenece al grupo de libros, comida y productos famaceúticos aplicando el impuesto del 10%, etc. Para ello, tedremos que establecer diferentes tipos de barreras en el método de *calculateTotalPrice()* y comprobar cada una de las condiciones dependiendo del tipo de producto que se haya creado a través de derivaciones procedentes de esta función como por ejemplo: *calculateTotalPriceWithImportTax()*, *calculateTotalPriceWithImportTaxFailing()*, etc.

    b) Para los tests de caja negra, en este caso podemos definir los diferentes tipos de productos y establecer valores finales para concordar y comprobar si el resultado obtenido es idéntico al esperado.


