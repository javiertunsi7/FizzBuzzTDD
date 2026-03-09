# FizzBuzz TDD - Java Kata

Ejercicio de **Test Driven Development (TDD)** en Java usando la kata clásica de FizzBuzz con JUnit 5.

---

## 📋 Descripción

Función que toma enteros positivos y devuelve su representación en cadena, siguiendo estas reglas:

- Si el número es **múltiplo de 3** → devuelve `"Fizz"`
- Si el número es **múltiplo de 5** → devuelve `"Buzz"`
- Si el número es **múltiplo de 3 y de 5** → devuelve `"FizzBuzz"`
- En cualquier otro caso → devuelve el número como cadena

### Ejemplo: números del 1 al 15

```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

---

## 🗂️ Estructura del proyecto

```
FizzBuzzTDD/
├── src/
│   ├── main/java/org/example/
│   │   ├── FizzBuzz/
│   │   │   └── FizzBuzz.java       # Lógica principal
│   │   └── Main.java               # Imprime del 1 al 15
│   └── test/java/fizzbuzz/
│       └── FizzBuzzTest.java       # Tests JUnit 5
├── pom.xml
└── README.md
```

---

## 💻 Código fuente

### `FizzBuzz.java`

```java
package org.example.FizzBuzz;

public class FizzBuzz {
    public String convert(int inputNumber) {
        if (inputNumber % 3 == 0 && inputNumber % 5 == 0) {
            return "FizzBuzz";
        }
        if (inputNumber % 5 == 0) {
            return "Buzz";
        }
        if (inputNumber % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(inputNumber);
    }
}
```

### `Main.java`

```java
package org.example;

import org.example.FizzBuzz.FizzBuzz;

public class Main {
    static void main() {
        for (int index = 1; index <= 15; index++) {
            String result = new FizzBuzz().convert(index);
            System.out.println(result);
        }
    }
}
```

---

## 🧪 Tests

Tests escritos con **JUnit 5** siguiendo la metodología TDD.

### Tests incluidos

| Test | Descripción |
|------|-------------|
| `check_1_to_1` | Número 1 → `"1"` |
| `check_2_to_2` | Número 2 → `"2"` |
| `check_4_to_4` | Número 4 → `"4"` |
| `check_7_to_7` | Número 7 → `"7"` |
| `check_number_to_string` | Paramétrico: números sin múltiplo → su string |
| `check_number_to_buzz` | Paramétrico: múltiplos de 5 → `"Buzz"` |
| `check_number_to_fizzbuzz` | Paramétrico: múltiplos de 3 y 5 → `"FizzBuzz"` |

### `FizzBuzzTest.java`

```java
package fizzbuzz;

import org.example.FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void check_1_to_1() {
        assertEquals("1", new FizzBuzz().convert(1));
    }

    @Test
    public void check_2_to_2() {
        assertEquals("2", new FizzBuzz().convert(2));
    }

    @Test
    public void check_4_to_4() {
        assertEquals("4", new FizzBuzz().convert(4));
    }

    @Test
    public void check_7_to_7() {
        assertEquals("7", new FizzBuzz().convert(7));
    }

    @ParameterizedTest
    @CsvSource({"1, '1'", "2, '2'", "4, '4'", "7, '7'", "8, '8'"})
    void check_number_to_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({"5, 'Buzz'", "10, 'Buzz'", "20, 'Buzz'"})
    void check_number_to_buzz(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({"15, 'FizzBuzz'", "30, 'FizzBuzz'", "45, 'FizzBuzz'"})
    void check_number_to_fizzbuzz(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }
}
```

### Resultado de los tests

> ✅ **Todos los tests pasan correctamente**

```
FizzBuzzTest > check_1_to_1()                          PASSED
FizzBuzzTest > check_2_to_2()                          PASSED
FizzBuzzTest > check_4_to_4()                          PASSED
FizzBuzzTest > check_7_to_7()                          PASSED
FizzBuzzTest > check_number_to_string(int, String)[1]  PASSED
FizzBuzzTest > check_number_to_string(int, String)[2]  PASSED
FizzBuzzTest > check_number_to_string(int, String)[3]  PASSED
FizzBuzzTest > check_number_to_string(int, String)[4]  PASSED
FizzBuzzTest > check_number_to_string(int, String)[5]  PASSED
FizzBuzzTest > check_number_to_buzz(int, String)[1]    PASSED
FizzBuzzTest > check_number_to_buzz(int, String)[2]    PASSED
FizzBuzzTest > check_number_to_buzz(int, String)[3]    PASSED
FizzBuzzTest > check_number_to_fizzbuzz(int, String)[1] PASSED
FizzBuzzTest > check_number_to_fizzbuzz(int, String)[2] PASSED
FizzBuzzTest > check_number_to_fizzbuzz(int, String)[3] PASSED

Tests run: 15, Failures: 0, Errors: 0, Skipped: 0
```

> 📸 *(Añadir aquí la captura de pantalla de IntelliJ con los tests en verde)*
<img width="1077" height="514" alt="image" src="https://github.com/user-attachments/assets/1c0dd431-d22c-4fe0-9bc1-ee3d92916191" />

---

## 🛠️ Tecnologías

- **Java 24**
- **JUnit Jupiter 5.12.2**
- **Maven**

## ▶️ Cómo ejecutar

```bash
# Compilar y ejecutar tests
mvn test

# Compilar el proyecto
mvn compile
```
