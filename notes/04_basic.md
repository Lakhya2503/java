# Java Operators Reference

## 1. Arithmetic Operators
| Operator | Name        | Example          | Result (a=10, b=3) | Description                  |
|----------|-------------|------------------|--------------------|------------------------------|
| `+`      | Addition    | `a + b`          | 13                 | Adds two values              |
| `-`      | Subtraction | `a - b`          | 7                  | Subtracts right from left    |
| `*`      | Multiply    | `a * b`          | 30                 | Multiplies values            |
| `/`      | Division    | `a / b`          | 3                  | Integer division             |
|          |             | `(double)a / b`  | 3.333...           | Floating-point division      |
| `%`      | Modulus     | `a % b`          | 1                  | Remainder after division     |

## 2. Assignment Operators
| Operator | Example    | Equivalent | Result (x=5) |   Description                  |
|----------|------------|------------|--------------|------------------------------|
| `=`      | `x = 3`    | `x = 3`    | 3            | Simple assignment            |
| `+=`     | `x += 2`   | `x = x+2`  | 7            | Add and assign               |
| `-=`     | `x -= 1`   | `x = x-1`  | 4            | Subtract and assign          |
| `*=`     | `x *= 3`   | `x = x*3`  | 15           | Multiply and assign          |
| `/=`     | `x /= 2`   | `x = x/2`  | 2            | Divide and assign            |
| `%=`     | `x %= 2`   | `x = x%2`  | 1            | Modulus and assign           |

## 3. Relational Operators
| Operator | Name               | Example    | Result (y=7, z=4) | Description                  |
|----------|--------------------|------------|-------------------|------------------------------|
| `==`     | Equal to           | `y == z`   | false             | Checks equality              |
| `!=`     | Not equal          | `y != z`   | true              | Checks inequality            |
| `>`      | Greater than       | `y > z`    | true              | Left > Right                 |
| `<`      | Less than          | `y < z`    | false             | Left < Right                 |
| `>=`     | Greater or equal   | `y >= z`   | true              | Left ≥ Right                 |
| `<=`     | Less or equal      | `y <= z`   | false             | Left ≤ Right                 |

## 4. Logical Operators
| Operator | Name   | Example          | Result (t=true, f=false) | Description                  |
|----------|--------|------------------|--------------------------|------------------------------|
| `&&`     | AND    | `t && f`         | false                    | Both must be true            |
| `\|\|`   | OR     | `t \|\| f`       | true                     | Either must be true          |
| `!`      | NOT    | `!t`             | false                    | Inverts the boolean          |

## 5. Unary Operators
| Operator | Name          | Example    | Result (n=5) | Description                  |
|----------|---------------|------------|--------------|------------------------------|
| `+`      | Positive      | `+n`       | 5            | Explicit positive            |
| `-`      | Negative      | `-n`       | -5           | Negates the value            |
| `++`     | Pre-increment | `++n`      | 6            | Increments before use        |
| `++`     | Post-increment| `n++`      | 5 (then 6)   | Increments after use         |
| `--`     | Pre-decrement | `--n`      | 4            | Decrements before use        |
| `--`     | Post-decrement| `n--`      | 5 (then 4)   | Decrements after use         |

## 6. Bitwise Operators
| Operator | Name          | Example    | Result (a=5=0101, b=3=0011) | Description                  |
|----------|---------------|------------|-----------------------------|------------------------------|
| `&`      | AND           | `a & b`    | 1 (0001)                    | Bitwise AND                  |
| `\|`     | OR            | `a \| b`   | 7 (0111)                    | Bitwise OR                   |
| `^`      | XOR           | `a ^ b`    | 6 (0110)                    | Bitwise exclusive OR         |
| `~`      | Complement    | `~a`       | -6 (inverts all bits)       | Bitwise NOT                  |
| `<<`     | Left shift    | `a << 1`   | 10 (1010)                   | Shift bits left              |
| `>>`     | Right shift   | `a >> 1`   | 2 (0010)                    | Shift bits right             |
| `>>>`    | Unsigned right shift | `a >>> 1` | 2 (0010)       | Shift right (no sign bit)    |

## 7. Ternary Operator
- A ternary operator evaluates the test condition and executes a block of code based on the result of the condition.
- The ternary operator can be used to replace certain types of if...else statements.

| Operator | Example                  | Result (age=20) | Description                  |
|----------|--------------------------|-----------------|------------------------------|
| `?:`     | `age >= 18 ? "Adult" : "Child"` | "Adult" | If true then first, else second |



## 8. Operator Precedence
| Precedence | Operators                     | Description                  |
|------------|-------------------------------|------------------------------|
| Highest    | `()`, `[]`, `.`, `++`, `--`   | Parentheses, array access    |
|            | `!`, `~`, `+`, `-`, `++`, `--`| Unary operators              |
|            | `*`, `/`, `%`                 | Multiplication/division      |
|            | `+`, `-`                      | Addition/subtraction         |
|            | `<<`, `>>`, `>>>`             | Bit shifting                 |
|            | `<`, `<=`, `>`, `>=`          | Relational                   |
|            | `==`, `!=`                    | Equality                     |
|            | `&`, `^`, `\|`                | Bitwise AND/XOR/OR           |
|            | `&&`, `\|\|`                  | Logical AND/OR               |
| Lowest     | `?:`, `=`                     | Ternary, assignment          |



