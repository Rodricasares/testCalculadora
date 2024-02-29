Introducción
Este repositorio contiene pruebas unitarias para la clase Calculadora utilizando JUnit. La clase Calculadora es responsable de realizar operaciones matemáticas, como la suma y encontrar el menor de dos números.

Resumen de Pruebas
Test: testCalcularSuma
Verifica que el método calcularSuma calcule correctamente la suma de dos números.
Resultado Esperado: El resultado debe ser igual a la suma de 3 y 5, que es 8.

Test: testCalcularMenor1
Verifica que el método calcularMenor identifique correctamente el menor de dos números (3 y 5).
Resultado Esperado: El resultado debe ser igual a 3.

Test: testCalcularMenor2
Verifica que el método calcularMenor identifique correctamente el menor de dos números (5 y 3).
Resultado Esperado: El resultado debe ser igual a 3.

Test: resultadoMenorQ
Verifica que el resultado del método calcularSuma sea mayor que 0.
Resultado Esperado: El resultado de la suma de 3 y 5 debe ser mayor que 0.

Test: resultadoNoEsNulo
Verifica que el resultado del método calcularSuma no sea nulo.
Resultado Esperado: El resultado de la suma de 2 y 5 no debe ser nulo.

Test: resultadoVacio
Verifica que el resultado del método calcularSuma sea mayor que 0 y comprueba que isEmpty sea falso.
Resultado Esperado: El resultado de la suma de 0 y 1 debe ser mayor que 0, y isEmpty debe ser falso.

Test: resultadoVacio2
Verifica que el resultado del método calcularMenor sea mayor que 0 y comprueba que isEmpty sea falso.
Resultado Esperado: El resultado de encontrar el menor entre 5 y 1 debe ser mayor que 0, y isEmpty debe ser falso.

Test: valoresDouble
Verifica que el resultado del método calcularSuma tenga la misma referencia para los valores esperados y reales.
Resultado Esperado: Los valores esperados y reales deben ser el mismo objeto Double.

Test: valoresDouble2
Verifica que el resultado del método calcularMenor tenga la misma referencia para los valores esperados y reales.
Resultado Esperado: Los valores esperados y reales deben ser el mismo objeto Double.

Test: valorIgual
Verifica que el resultado del método calcularSuma sea igual al valor esperado.
Resultado Esperado: El resultado de la suma de 3 y 2 debe ser igual a 5.

Test: valorIgual2
Verifica que el resultado del método calcularMenor sea igual al valor esperado (5).
Resultado Esperado: El resultado de encontrar el menor entre 7 y 5 debe ser igual a 5.
